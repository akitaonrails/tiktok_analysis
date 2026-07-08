package X;

/* JADX INFO: renamed from: X.0bSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974280bSc {
    public static EnumC964170bCJ LIZIZ(EnumC974260bSa enumC974260bSa) {
        if (enumC974260bSa != null) {
            switch (C974270bSb.LIZ[enumC974260bSa.ordinal()]) {
            }
            return EnumC964170bCJ.NONE;
        }
        return EnumC964170bCJ.NONE;
    }

    public static EnumC974260bSa LIZ(EnumC962960bAM enumC962960bAM, Integer num) {
        if (enumC962960bAM == EnumC962960bAM.UNKNOWN) {
            return EnumC974260bSa.NONE;
        }
        if (enumC962960bAM == EnumC962960bAM.CATCH_BEANS) {
            if (num != null) {
                if (num.intValue() == 1) {
                    return EnumC974260bSa.NONE;
                }
                if (num.intValue() == 3) {
                    return EnumC974260bSa.START;
                }
                if (num.intValue() == 4) {
                    return EnumC974260bSa.PUNISH;
                }
                if (num.intValue() == 5) {
                    return EnumC974260bSa.FINISH;
                }
            }
            return EnumC974260bSa.NONE;
        }
        if (enumC962960bAM.isCompetitionArch()) {
            if (num != null) {
                if (num.intValue() == 1) {
                    return EnumC974260bSa.NONE;
                }
                if (num.intValue() == 3) {
                    return EnumC974260bSa.START;
                }
                if (num.intValue() == 4) {
                    return EnumC974260bSa.START_FINAL_CALL;
                }
                if (num.intValue() == 5) {
                    return EnumC974260bSa.PUNISH;
                }
                if (num.intValue() == 6) {
                    return EnumC974260bSa.FINISH;
                }
            }
            return EnumC974260bSa.NONE;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                return EnumC974260bSa.NONE;
            }
            if (num.intValue() == 1) {
                return EnumC974260bSa.START;
            }
            if (num.intValue() == 2) {
                return EnumC974260bSa.SETTLE;
            }
            if (num.intValue() == 3) {
                return EnumC974260bSa.PUNISH;
            }
            if (num.intValue() == 4) {
                return EnumC974260bSa.FINISH;
            }
        }
        return EnumC974260bSa.NONE;
    }
}
