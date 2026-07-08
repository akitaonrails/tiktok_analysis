package X;

/* JADX INFO: renamed from: X.0a03, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918130a03 {
    public static final EnumC919170a1j LIZ(Integer num) {
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_1V1;
        int type = enumC919170a1j.getType();
        if (num != null && num.intValue() == type) {
            return enumC919170a1j;
        }
        EnumC919170a1j enumC919170a1j2 = EnumC919170a1j.MATCH_TYPE_2V2;
        int type2 = enumC919170a1j2.getType();
        if (num != null && num.intValue() == type2) {
            return enumC919170a1j2;
        }
        EnumC919170a1j enumC919170a1j3 = EnumC919170a1j.MATCH_TYPE_INDIVIDUAL;
        int type3 = enumC919170a1j3.getType();
        if (num != null && num.intValue() == type3) {
            return enumC919170a1j3;
        }
        EnumC919170a1j enumC919170a1j4 = EnumC919170a1j.MATCH_TYPE_1VN;
        int type4 = enumC919170a1j4.getType();
        if (num != null && num.intValue() == type4) {
            return enumC919170a1j4;
        }
        EnumC919170a1j enumC919170a1j5 = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE;
        int type5 = enumC919170a1j5.getType();
        if (num != null && num.intValue() == type5) {
            return enumC919170a1j5;
        }
        EnumC919170a1j enumC919170a1j6 = EnumC919170a1j.MATCH_TYPE_CATCH_BEANS;
        int type6 = enumC919170a1j6.getType();
        if (num != null && num.intValue() == type6) {
            return enumC919170a1j6;
        }
        return EnumC919170a1j.UNKNOWN;
    }
}
