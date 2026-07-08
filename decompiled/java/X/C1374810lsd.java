package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0lsd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374810lsd {
    public static InterfaceC1369790lkX LIZ(String str, Activity activity, C1377070lwH c1377070lwH, int i) {
        if ((i & 2) != 0) {
            InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
            if (interfaceC1370110ll3 != null) {
                activity = interfaceC1370110ll3.getCurrentActivity();
            } else {
                activity = null;
            }
        }
        if ((i & 4) != 0) {
            c1377070lwH = null;
        }
        if (str == null) {
            return null;
        }
        C1374800lsc c1374800lsc = C1374800lsc.LIZ;
        if (c1377070lwH == null) {
            c1377070lwH = new C1377070lwH(new C1374830lsf(activity), new C1374820lse(activity));
        }
        c1374800lsc.getClass();
        return C1374800lsc.LIZIZ(str, c1377070lwH);
    }
}
