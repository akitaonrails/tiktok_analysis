package X;

/* JADX INFO: renamed from: X.0bgc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982960bgc {
    public static EnumC982520bfu LIZ(Integer num) {
        EnumC982520bfu enumC982520bfu = EnumC982520bfu.UNKNOWN;
        int type = enumC982520bfu.getType();
        if (num == null || num.intValue() != type) {
            EnumC982520bfu enumC982520bfu2 = EnumC982520bfu.INITIATE;
            int type2 = enumC982520bfu2.getType();
            if (num != null && num.intValue() == type2) {
                return enumC982520bfu2;
            }
            EnumC982520bfu enumC982520bfu3 = EnumC982520bfu.REPLY;
            int type3 = enumC982520bfu3.getType();
            if (num != null && num.intValue() == type3) {
                return enumC982520bfu3;
            }
            EnumC982520bfu enumC982520bfu4 = EnumC982520bfu.START;
            int type4 = enumC982520bfu4.getType();
            if (num != null && num.intValue() == type4) {
                return enumC982520bfu4;
            }
            EnumC982520bfu enumC982520bfu5 = EnumC982520bfu.SETTLE_START;
            int type5 = enumC982520bfu5.getType();
            if (num != null && num.intValue() == type5) {
                return enumC982520bfu5;
            }
            EnumC982520bfu enumC982520bfu6 = EnumC982520bfu.SETTLE_END;
            int type6 = enumC982520bfu6.getType();
            if (num != null && num.intValue() == type6) {
                return enumC982520bfu6;
            }
            EnumC982520bfu enumC982520bfu7 = EnumC982520bfu.SCORE_CHANGE;
            int type7 = enumC982520bfu7.getType();
            if (num != null && num.intValue() == type7) {
                return enumC982520bfu7;
            }
            EnumC982520bfu enumC982520bfu8 = EnumC982520bfu.FINISH;
            int type8 = enumC982520bfu8.getType();
            if (num != null && num.intValue() == type8) {
                return enumC982520bfu8;
            }
            EnumC982520bfu enumC982520bfu9 = EnumC982520bfu.SWITCH_TURN;
            int type9 = enumC982520bfu9.getType();
            if (num != null && num.intValue() == type9) {
                return enumC982520bfu9;
            }
            EnumC982520bfu enumC982520bfu10 = EnumC982520bfu.BOMB;
            int type10 = enumC982520bfu10.getType();
            if (num != null && num.intValue() == type10) {
                return enumC982520bfu10;
            }
            EnumC982520bfu enumC982520bfu11 = EnumC982520bfu.BEANS_ARTIFACTS;
            int type11 = enumC982520bfu11.getType();
            if (num != null && num.intValue() == type11) {
                return enumC982520bfu11;
            }
            EnumC982520bfu enumC982520bfu12 = EnumC982520bfu.BEANS_AVATAR;
            int type12 = enumC982520bfu12.getType();
            if (num != null && num.intValue() == type12) {
                return enumC982520bfu12;
            }
        }
        return enumC982520bfu;
    }
}
