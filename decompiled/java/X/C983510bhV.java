package X;

/* JADX INFO: renamed from: X.0bhV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983510bhV {
    public static EnumC982740bgG LIZ(Integer num) {
        EnumC982740bgG enumC982740bgG = EnumC982740bgG.NORMAL;
        int type = enumC982740bgG.getType();
        if (num == null || num.intValue() != type) {
            EnumC982740bgG enumC982740bgG2 = EnumC982740bgG.REMATCH;
            int type2 = enumC982740bgG2.getType();
            if (num != null && num.intValue() == type2) {
                return enumC982740bgG2;
            }
            EnumC982740bgG enumC982740bgG3 = EnumC982740bgG.REMATCH_RECOMMEND;
            int type3 = enumC982740bgG3.getType();
            if (num != null && num.intValue() == type3) {
                return enumC982740bgG3;
            }
        }
        return enumC982740bgG;
    }
}
