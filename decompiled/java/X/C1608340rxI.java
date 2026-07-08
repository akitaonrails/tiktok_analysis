package X;

/* JADX INFO: renamed from: X.0rxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608340rxI {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(int i, EnumC1606080rte enumC1606080rte) {
        Float fValueOf;
        if (enumC1606080rte != null && C1607220rvU.LIZ(enumC1606080rte)) {
            if (C1618440sDa.LIZIZ.LJJIJLIJ().LIZIZ().LIZ.get("blue_state") != null && (fValueOf = Float.valueOf(r0.badgeStrokeWidth)) != null) {
                return fValueOf.floatValue();
            }
            return C1608350rxJ.LIZ(i);
        }
        return C1608350rxJ.LIZ(i);
    }

    public static float LIZIZ(int i, EnumC1606080rte enumC1606080rte) {
        float f;
        Float fValueOf;
        if (enumC1606080rte != null && C1607220rvU.LIZ(enumC1606080rte)) {
            if (C1618440sDa.LIZIZ.LJJIJLIJ().LIZIZ().LIZ.get("blue_state") != null && (fValueOf = Float.valueOf(r0.badgeSize)) != null) {
                return fValueOf.floatValue();
            }
            return C1608400rxO.LIZLLL;
        }
        if (enumC1606080rte == EnumC1606080rte.MY_PROFILE && C2277881EDy.LIZIZ.isHitLeftAlignSmallAvatar()) {
            return C1608400rxO.LJ;
        }
        if (i <= 0) {
            f = 0.0f;
        } else if (C1607220rvU.LIZ(enumC1606080rte) && C294120Bfu.LIZJ()) {
            f = C1608400rxO.LIZJ;
        } else if (i <= C1608430rxR.LJIIIZ) {
            f = C1608400rxO.LIZ;
        } else if (i <= C1608430rxR.LJI) {
            f = C1608400rxO.LIZJ;
        } else if (i <= C1608430rxR.LJ) {
            f = C1608400rxO.LIZLLL;
        } else {
            f = C1608400rxO.LJFF;
        }
        return C19252910Tv.LIZIZ.LIZLLL().LJI().LLIIJLIL(f);
    }
}
