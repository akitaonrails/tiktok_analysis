package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Pair;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444600Hc2 {
    public static final C1722300uv6 LIZ(Context context, C1749280vcc c1749280vcc, C444630Hc5 c444630Hc5) {
        String string;
        String string2;
        Integer num;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        int i = C444610Hc3.LIZ[c444630Hc5.LIZ.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (c1749280vcc != null) {
                        c1749280vcc.setLayoutVariant(2);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else if (c1749280vcc != null) {
                c1749280vcc.setLayoutVariant(0);
            }
        } else if (c1749280vcc != null) {
            c1749280vcc.setLayoutVariant(1);
        }
        Float f = c444630Hc5.LIZ.LIZIZ;
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (c1749280vcc != null) {
                c1749280vcc.setTopMargin(fFloatValue);
            }
        }
        Float f2 = c444630Hc5.LIZ.LIZJ;
        if (f2 != null) {
            float fFloatValue2 = f2.floatValue();
            if (c1749280vcc != null) {
                c1749280vcc.setButtonTopMargin(fFloatValue2);
            }
        }
        C444550Hbx c444550Hbx = c444630Hc5.LIZIZ;
        if (c444550Hbx != null && Intrinsics.LJFF(c444550Hbx.LIZ, Boolean.TRUE) && (num = c444550Hbx.LIZIZ) != null) {
            if (c1749280vcc != null) {
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = num.intValue();
                Drawable drawableLIZ = c0hti.LIZ(c1749280vcc.getContext());
                c1722300uv6.LIZJ = 2;
                c1722300uv6.LIZ = drawableLIZ;
            }
            Pair<Integer, Integer> pair = c444550Hbx.LIZJ;
            if (pair != null) {
                int iIntValue = pair.getFirst().intValue();
                int iIntValue2 = pair.getSecond().intValue();
                c1722300uv6.LIZLLL = iIntValue;
                c1722300uv6.LJ = iIntValue2;
            }
        }
        Integer num2 = c444630Hc5.LIZJ;
        if (num2 != null) {
            int iIntValue3 = num2.intValue();
            if (context != null && (string2 = context.getString(iIntValue3)) != null) {
                c1722300uv6.LJI = string2;
            }
        }
        Integer num3 = c444630Hc5.LIZLLL;
        if (num3 != null) {
            int iIntValue4 = num3.intValue();
            if (context != null && (string = context.getString(iIntValue4)) != null) {
                c1722300uv6.LJIIIIZZ = string;
            }
        }
        C444560Hby c444560Hby = c444630Hc5.LJ;
        if (c444560Hby != null) {
            if (C444610Hc3.LIZIZ[c444560Hby.LIZ.ordinal()] != 1 && c1749280vcc != null) {
                c1722300uv6.LJIIIZ = new AwS215S0300000_6(c444560Hby, c444630Hc5.LIZ.LIZ, c1749280vcc.getContext(), 24);
            }
        }
        return c1722300uv6;
    }
}
