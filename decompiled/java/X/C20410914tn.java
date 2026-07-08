package X;

import Y.AfS165S0200000_31;
import Y.AfS200S0100000_31;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.14tn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20410914tn {
    public static final void LIZ(ImageView imageView, C20345714jH c20345714jH) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateImageForScreenShot screenShotLottieInfo:");
        sbLIZ.append(c20345714jH);
        C20441214yg.LIZIZ("LottieAnimationView", C2188811AlT.LIZIZ(sbLIZ));
        if (c20345714jH == null) {
            imageView.setImageResource(0);
            C20441214yg.LIZIZ("LottieAnimationView", "updateImageForScreenShot return as screenShotLottieInfo is null");
            return;
        }
        int i = C20439014yK.LIZ[c20345714jH.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Integer numLJIIJJI = C2095008Iq.LJIIJJI(c20345714jH.LIZIZ);
                        if (numLJIIJJI != null) {
                            imageView.setImageResource(C20736316Cj.LJ(numLJIIJJI.intValue(), imageView.getContext()));
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("not support url type yet!");
                }
                Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(c20345714jH.LIZIZ);
                if (numLJIIJJI2 == null) {
                    return;
                }
                imageView.setImageResource(numLJIIJJI2.intValue());
                return;
            }
            throw new IllegalArgumentException("not support url type yet!");
        }
        C11NZ.LJIJJLI(new C534980KyW(c20345714jH.LIZIZ)).LJIILIIL(new C0UO0()).LJJLL(new AfS165S0200000_31(imageView, c20345714jH, 12), new AfS200S0100000_31(c20345714jH, 29));
    }
}
