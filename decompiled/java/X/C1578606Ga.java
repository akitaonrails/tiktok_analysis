package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06Ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1578606Ga {
    public final C06GV LIZ;
    public final AnonymousClass0664 LIZIZ = new AnonymousClass0664();

    public C1578606Ga(C06GV c06gv) {
        this.LIZ = c06gv;
    }

    public final Drawable LIZ(int i, EnumC1578706Gb enumC1578706Gb) {
        String str;
        int iIntValue;
        Pair<Integer, Drawable> pairLJI;
        String strLJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streak_icon_inline_");
        String str2 = "";
        if (enumC1578706Gb == EnumC1578706Gb.ORANGE) {
            str = "active";
        } else if (enumC1578706Gb != EnumC1578706Gb.GREY) {
            str = "";
        } else {
            str = "grey";
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Pair<Integer, Drawable> pairLJI2 = this.LIZ.LIZ.LJI(i, enumC1578706Gb);
        Drawable second = pairLJI2.getSecond();
        int iIntValue2 = 0;
        if (pairLJI2.getFirst().intValue() == 0 && second != null) {
            AnonymousClass0664 anonymousClass0664 = this.LIZIZ;
            String strLJII2 = this.LIZ.LIZ.LJII();
            Integer num = this.LIZ.LIZJ;
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            AnonymousClass0664.LIZIZ(anonymousClass0664, strLJII2, i, strLIZIZ, iIntValue2);
            return second;
        }
        C06GZ c06gz = this.LIZ.LIZIZ;
        if (c06gz != null && (pairLJI = c06gz.LJI(i, enumC1578706Gb)) != null) {
            Drawable second2 = pairLJI.getSecond();
            if (pairLJI.getFirst().intValue() == 0 && second2 != null) {
                AnonymousClass0664 anonymousClass06642 = this.LIZIZ;
                C06GZ c06gz2 = this.LIZ.LIZIZ;
                if (c06gz2 != null && (strLJII = c06gz2.LJII()) != null) {
                    str2 = strLJII;
                }
                AnonymousClass0664.LIZIZ(anonymousClass06642, str2, i, strLIZIZ, pairLJI2.getFirst().intValue());
                return second2;
            }
        }
        AnonymousClass0664 anonymousClass06643 = this.LIZIZ;
        Integer num2 = this.LIZ.LIZJ;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = pairLJI2.getFirst().intValue();
        }
        AnonymousClass0664.LIZIZ(anonymousClass06643, "fail", i, strLIZIZ, iIntValue);
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        Context contextLIZ = C894660Z7w.LIZ();
        if (contextLIZ == null) {
            c0i0b.LIZJ();
            contextLIZ = C894660Z7w.LIZ();
        }
        return new TuxIconDrawable(contextLIZ, R.drawable.c5n);
    }

    public final String LIZIZ(int i, boolean z) {
        String str;
        C06GZ c06gz;
        Pair<Integer, String> pairLIZLLL;
        String strLJII;
        int iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streak_fire_lottie_");
        if (z) {
            str = "continue";
        } else {
            str = "unlock";
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Pair<Integer, String> pairLIZLLL2 = this.LIZ.LIZ.LIZLLL(i, z);
        int iIntValue2 = 0;
        if (pairLIZLLL2.getFirst().intValue() == 0) {
            AnonymousClass0664 anonymousClass0664 = this.LIZIZ;
            String strLJII2 = this.LIZ.LIZ.LJII();
            Integer num = this.LIZ.LIZJ;
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            AnonymousClass0664.LIZIZ(anonymousClass0664, strLJII2, i, strLIZIZ, iIntValue2);
            return pairLIZLLL2.getSecond();
        }
        if ((!C1603906Pt.LIZIZ().enableTuxSmallIcon || i == 0) && (c06gz = this.LIZ.LIZIZ) != null && (pairLIZLLL = c06gz.LIZLLL(i, z)) != null && pairLIZLLL.getFirst().intValue() == 0) {
            AnonymousClass0664 anonymousClass06642 = this.LIZIZ;
            C06GZ c06gz2 = this.LIZ.LIZIZ;
            if (c06gz2 == null || (strLJII = c06gz2.LJII()) == null) {
                strLJII = "";
            }
            AnonymousClass0664.LIZIZ(anonymousClass06642, strLJII, i, strLIZIZ, pairLIZLLL2.getFirst().intValue());
            return pairLIZLLL.getSecond();
        }
        AnonymousClass0664 anonymousClass06643 = this.LIZIZ;
        Integer num2 = this.LIZ.LIZJ;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = pairLIZLLL2.getFirst().intValue();
        }
        AnonymousClass0664.LIZIZ(anonymousClass06643, "fail", i, strLIZIZ, iIntValue);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r15, X.InterfaceC1364105Vn<? super X.C1602706Ph> r16) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1578606Ga.LIZLLL(int, X.05Vn):java.lang.Object");
    }

    public final int LIZJ(int i, EnumC1578706Gb enumC1578706Gb, Context context) {
        String str;
        int iIntValue;
        Pair<Integer, Integer> pairLIZJ;
        String strLJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streak_font_color_");
        String str2 = "";
        if (enumC1578706Gb == EnumC1578706Gb.ORANGE) {
            str = "active";
        } else if (enumC1578706Gb != EnumC1578706Gb.GREY) {
            str = "";
        } else {
            str = "grey";
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Pair<Integer, Integer> pairLIZJ2 = this.LIZ.LIZ.LIZJ(i, enumC1578706Gb, context);
        int iIntValue2 = 0;
        if (pairLIZJ2.getFirst().intValue() == 0) {
            AnonymousClass0664 anonymousClass0664 = this.LIZIZ;
            String strLJII2 = this.LIZ.LIZ.LJII();
            Integer num = this.LIZ.LIZJ;
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            AnonymousClass0664.LIZIZ(anonymousClass0664, strLJII2, i, strLIZIZ, iIntValue2);
            return pairLIZJ2.getSecond().intValue();
        }
        C06GZ c06gz = this.LIZ.LIZIZ;
        if (c06gz != null && (pairLIZJ = c06gz.LIZJ(i, enumC1578706Gb, context)) != null && pairLIZJ.getFirst().intValue() == 0) {
            AnonymousClass0664 anonymousClass06642 = this.LIZIZ;
            C06GZ c06gz2 = this.LIZ.LIZIZ;
            if (c06gz2 != null && (strLJII = c06gz2.LJII()) != null) {
                str2 = strLJII;
            }
            AnonymousClass0664.LIZIZ(anonymousClass06642, str2, i, strLIZIZ, pairLIZJ2.getFirst().intValue());
            return pairLIZJ.getSecond().intValue();
        }
        AnonymousClass0664 anonymousClass06643 = this.LIZIZ;
        Integer num2 = this.LIZ.LIZJ;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = pairLIZJ2.getFirst().intValue();
        }
        AnonymousClass0664.LIZIZ(anonymousClass06643, "fail", i, strLIZIZ, iIntValue);
        return 0;
    }
}
