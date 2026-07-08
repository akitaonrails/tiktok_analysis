package X;

/* JADX INFO: renamed from: X.0iYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247060iYa {
    public static EnumC1247030iYX LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return EnumC1247030iYX.USERNAME;
            }
            if (num.intValue() == 2) {
                return EnumC1247030iYX.NICKNAME;
            }
            if (num.intValue() == 3) {
                return EnumC1247030iYX.ALIAS;
            }
        }
        return EnumC1247030iYX.DEFAULT;
    }
}
