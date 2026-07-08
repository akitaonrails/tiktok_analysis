package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0jmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294380jmu {
    public static final Object LJ = new Object();
    public final Context LIZ;
    public final String LIZIZ;
    public InterfaceC1294390jmv LIZJ;
    public final Map<String, C1294320jmo> LIZLLL;

    public final void LIZ(Bitmap bitmap, String str) {
        synchronized (LJ) {
            try {
                this.LIZLLL.get(str).LJFF = bitmap;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1294380jmu(Drawable.Callback callback, String str, InterfaceC1294390jmv interfaceC1294390jmv, Map<String, C1294320jmo> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('/');
            this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            this.LIZIZ = str;
        }
        this.LIZLLL = map;
        this.LIZJ = interfaceC1294390jmv;
        if (!(callback instanceof View)) {
            this.LIZ = null;
        } else {
            this.LIZ = C786410Ut5.N3(((View) callback).getContext());
        }
    }
}
