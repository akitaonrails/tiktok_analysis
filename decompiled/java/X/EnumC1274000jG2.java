package X;

/* JADX INFO: renamed from: X.0jG2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1274000jG2 {
    OK,
    ABNORMAL;

    public static EnumC1274000jG2 fromId(int i) {
        if (i == 0) {
            return OK;
        }
        return ABNORMAL;
    }

    public static EnumC1274000jG2 valueOf(String str) {
        return (EnumC1274000jG2) C08FF.LIZ(EnumC1274000jG2.class, str);
    }
}
