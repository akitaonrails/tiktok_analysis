package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0jh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290760jh4 {
    public static final Object LJFF = new Object();
    public final Context LIZ;
    public final String LIZIZ;
    public InterfaceC1291560jiM LIZJ;
    public final Map<String, C1290800jh8> LIZLLL;
    public final boolean LJ;

    public final void LIZIZ() {
        if (this.LJ) {
            return;
        }
        try {
            synchronized (LJFF) {
                try {
                    Iterator<Map.Entry<String, C1290800jh8>> it2 = this.LIZLLL.entrySet().iterator();
                    while (it2.hasNext()) {
                        C1290800jh8 value = it2.next().getValue();
                        Bitmap bitmap = value.LJI;
                        if (bitmap != null) {
                            bitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                            value.LJI = null;
                        }
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
        }
    }

    public final void LIZ(Bitmap bitmap, String str) {
        synchronized (LJFF) {
            try {
                this.LIZLLL.get(str).LJI = bitmap;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1290760jh4(Drawable.Callback callback, String str, InterfaceC1291560jiM interfaceC1291560jiM, Map<String, C1290800jh8> map, boolean z) {
        this.LIZIZ = str;
        this.LJ = z;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('/');
            this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!(callback instanceof View)) {
            this.LIZLLL = new HashMap();
            this.LIZ = null;
        } else {
            this.LIZ = ((View) callback).getContext();
            this.LIZLLL = map;
            this.LIZJ = interfaceC1291560jiM;
        }
    }
}
