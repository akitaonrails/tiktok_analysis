package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.089P, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C089P {
    public final Uri LIZ;
    public final String LIZIZ;

    public final Uri LIZIZ() {
        Uri uri = this.LIZ;
        if (uri != null) {
            return uri;
        }
        throw new AssertionError();
    }

    public final Uri LIZ(Context context) {
        if (C089O.LIZIZ == null) {
            synchronized (C089O.class) {
                try {
                    if (C089O.LIZIZ == null) {
                        C089O.LIZIZ = new C089O();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C089O.LIZIZ.LIZ(context, this.LIZIZ);
    }

    public C089P(Context context, String str, int i) {
        Uri uriLIZ;
        this.LIZIZ = str;
        try {
            uriLIZ = UriProtector.parse(str);
            if (uriLIZ.getScheme() == null) {
                uriLIZ = LIZ(context);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            uriLIZ = LIZ(context);
        }
        this.LIZ = uriLIZ;
    }
}
