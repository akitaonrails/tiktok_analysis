package X;

import android.view.View;
import com.skydoves.balloon.Balloon;

/* JADX INFO: renamed from: X.0eO2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086760eO2 {
    public static final C1086760eO2 LIZ = new C1086760eO2();

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    }

    public static void LIZ(Balloon balloon, View view, int i, int i2) {
        int i3;
        boolean z = true;
        if (view.getLayoutDirection() == 1) {
            i3 = -i;
        } else {
            i3 = i;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showAlignBottom: xOff=");
        sbLIZ.append(i);
        sbLIZ.append(" adjusted=");
        sbLIZ.append(i3);
        sbLIZ.append(" rtl=");
        if (i3 == i) {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        balloon.LJIILIIL(i3, i2, view);
    }
}
