package X;

import android.app.Activity;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0LeJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547930LeJ {
    public static final String LIZ(int i, Object... objArr) {
        C547860LeC.LIZ.getClass();
        return C547860LeC.LJI().LIZLLL(C0LOK.LIZ, i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void LIZIZ(Activity activity, int i, Object... objArr) {
        String strLIZ;
        if (activity != null && (strLIZ = LIZ(i, Arrays.copyOf(objArr, objArr.length))) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(strLIZ);
            c1389890mGx.LJIIJJI();
        }
    }
}
