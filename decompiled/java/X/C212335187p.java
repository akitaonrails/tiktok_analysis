package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.187p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212335187p {
    public static final C212335187p LIZ = new C212335187p();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(211));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(210));

    public static C212334187o LIZ(Context context, C212337187r c212337187r) {
        float fLIZIZ;
        Integer num;
        Integer numValueOf;
        Integer num2;
        Integer num3;
        Integer numValueOf2;
        int i;
        Integer numValueOf3;
        Integer num4;
        float fLIZIZ2;
        Integer numValueOf4;
        Integer num5;
        LIZJ.getValue().getClass();
        C212334187o c212334187o = new C212334187o(context);
        boolean z = true;
        c212334187o.LLILZIL = true;
        C384050F3z c384050F3z = new C384050F3z();
        C212338187s c212338187s = c212337187r.LJIILIIL;
        int iValueOf = 4;
        if (c212338187s != null) {
            fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(c212338187s.LIZLLL));
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(4);
        }
        c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
        C212338187s c212338187s2 = c212337187r.LJIILIIL;
        String str = null;
        if (c212338187s2 != null) {
            num = c212338187s2.LIZ;
        } else {
            num = null;
        }
        c384050F3z.LIZ = num;
        if (c212338187s2 != null) {
            numValueOf = Integer.valueOf((int) c212338187s2.LIZJ);
        } else {
            numValueOf = null;
        }
        c384050F3z.LIZLLL = numValueOf;
        C212338187s c212338187s3 = c212337187r.LJIILIIL;
        if (c212338187s3 != null) {
            num2 = c212338187s3.LIZIZ;
        } else {
            num2 = null;
        }
        c384050F3z.LJ = num2;
        c212334187o.setBackground(c384050F3z.LIZ(c212334187o.getContext()));
        C212338187s c212338187s4 = c212337187r.LJIIJJI;
        if (c212338187s4 != null) {
            num3 = c212338187s4.LIZ;
        } else {
            num3 = null;
        }
        if (num3 == null) {
            z = false;
        }
        c212334187o.LLILZLL = z;
        if (z) {
            LinearLayout linearLayout = c212334187o.LLILZ;
            C384050F3z c384050F3z2 = new C384050F3z();
            C212338187s c212338187s5 = c212337187r.LJIIJJI;
            if (c212338187s5 != null) {
                num4 = c212338187s5.LIZ;
            } else {
                num4 = null;
            }
            c384050F3z2.LIZ = num4;
            C212338187s c212338187s6 = c212337187r.LJIILIIL;
            if (c212338187s6 != null) {
                fLIZIZ2 = C418440Gaw.LIZIZ(Integer.valueOf(c212338187s6.LIZLLL));
            } else {
                fLIZIZ2 = C418440Gaw.LIZIZ(4);
            }
            c384050F3z2.LJIIIZ = Float.valueOf(fLIZIZ2);
            C212338187s c212338187s7 = c212337187r.LJIILIIL;
            if (c212338187s7 != null) {
                iValueOf = Integer.valueOf(c212338187s7.LIZLLL);
            }
            c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(iValueOf));
            c384050F3z2.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(0));
            c384050F3z2.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(0));
            C212338187s c212338187s8 = c212337187r.LJIILIIL;
            if (c212338187s8 != null) {
                numValueOf4 = Integer.valueOf((int) c212338187s8.LIZJ);
            } else {
                numValueOf4 = null;
            }
            c384050F3z2.LIZLLL = numValueOf4;
            C212338187s c212338187s9 = c212337187r.LJIILIIL;
            if (c212338187s9 != null) {
                num5 = c212338187s9.LIZIZ;
            } else {
                num5 = null;
            }
            c384050F3z2.LJ = num5;
            linearLayout.setBackground(c384050F3z2.LIZ(c212334187o.getContext()));
        }
        c212334187o.setCountDownText(-1L);
        C212339187t c212339187t = c212337187r.LJIIJ;
        if (c212339187t != null) {
            numValueOf2 = Integer.valueOf(c212339187t.LIZJ);
        } else {
            numValueOf2 = null;
        }
        c212334187o.setCountDownTextColor(numValueOf2);
        C212339187t c212339187t2 = c212337187r.LJIIJ;
        int i2 = 81;
        if (c212339187t2 != null) {
            i = c212339187t2.LIZIZ;
        } else {
            i = 81;
        }
        c212334187o.setCountDownTextFont(i);
        C212339187t c212339187t3 = c212337187r.LJIIIIZZ;
        if (c212339187t3 != null) {
            numValueOf3 = Integer.valueOf(c212339187t3.LIZJ);
        } else {
            numValueOf3 = null;
        }
        c212334187o.setPromotionTextColor(numValueOf3);
        C212339187t c212339187t4 = c212337187r.LJIIIIZZ;
        if (c212339187t4 != null) {
            i2 = c212339187t4.LIZIZ;
        }
        c212334187o.setPromotionTextFont(i2);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212337187r.LJ)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212337187r.LJ)));
        if (c212334187o.LLILZLL) {
            c212334187o.setPadding(iLIZIZ, 0, 0, 0);
            c212334187o.LLILZ.setPadding(0, 0, iLIZIZ2, 0);
        } else {
            c212334187o.setPadding(iLIZIZ, 0, iLIZIZ2, 0);
        }
        c212334187o.setPromotionIcon(c212337187r);
        C212339187t c212339187t5 = c212337187r.LJIIIIZZ;
        if (c212339187t5 != null) {
            str = c212339187t5.LIZ;
        }
        c212334187o.setPromotionText(str);
        c212334187o.setIconMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212337187r.LJII))));
        c212334187o.setCountDownMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212337187r.LJII))));
        if (c212337187r.LJIILJJIL > 0) {
            ViewGroup.LayoutParams layoutParams = c212334187o.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212337187r.LJIILJJIL)));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212334187o);
                c212334187o.setLayoutParams(layoutParams);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c212337187r.LJIILJJIL))));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212334187o);
                c212334187o.setLayoutParams(marginLayoutParams);
                return c212334187o;
            }
        }
        return c212334187o;
    }

    public static C212336187q LIZIZ(Context context, C212337187r c212337187r) {
        LIZIZ.getValue().getClass();
        C212336187q c212336187q = new C212336187q(context, null, 0);
        c212336187q.LIZJ(c212337187r);
        return c212336187q;
    }
}
