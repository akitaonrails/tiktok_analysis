package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0L48, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L48<T> {
    public final String LIZ;
    public final C0L47<T> LIZIZ;
    public final long LIZJ;
    public final C01GW LIZLLL;

    public final DiskLruCache LIZIZ() {
        return (DiskLruCache) this.LIZLLL.getValue();
    }

    public final C0L45<T> LIZ(String str) {
        DiskLruCache.Snapshot snapshot = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            DiskLruCache.Snapshot snapshot2 = LIZIZ().get(MD5Utils.getMD5String(str));
            if (snapshot2 == null) {
                return null;
            }
            try {
                InputStream inputStream = snapshot2.getInputStream(0);
                C0L45<T> c0l45LIZIZ = this.LIZIZ.LIZIZ(inputStream);
                inputStream.close();
                snapshot2.close();
                return c0l45LIZIZ;
            } catch (Throwable th) {
                th = th;
                snapshot = snapshot2;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (snapshot != null) {
                    snapshot.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public C0L48(Context context, String str, C0L46 c0l46) {
        this.LIZ = str;
        this.LIZIZ = c0l46;
        long jLJ = C09N1.LJ(context);
        long j = 52428800;
        if (jLJ <= 52428800) {
            j = 26214400;
            if (jLJ <= 26214400) {
                j = 13107200;
                if (jLJ <= 13107200) {
                    j = 10485760;
                }
            }
        }
        this.LIZJ = j;
        this.LIZLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, (C0L48<Object>) 976));
    }

    public final void LIZJ(String str, C0L45<T> c0l45, Function1<? super Boolean, Unit> function1) {
        OutputStream outputStreamNewOutputStream;
        if (TextUtils.isEmpty(str)) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        DiskLruCache.Editor editorEdit = null;
        try {
            editorEdit = LIZIZ().edit(MD5Utils.getMD5String(str));
            if (editorEdit != null && (outputStreamNewOutputStream = editorEdit.newOutputStream(0)) != null) {
                this.LIZIZ.LIZ(outputStreamNewOutputStream, c0l45);
                outputStreamNewOutputStream.flush();
                outputStreamNewOutputStream.close();
                editorEdit.commit();
                function1.invoke(Boolean.TRUE);
                LIZIZ().flush();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (editorEdit != null) {
                try {
                    editorEdit.abort();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            function1.invoke(Boolean.FALSE);
        }
    }
}
