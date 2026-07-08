package X;

/* JADX INFO: renamed from: X.0fbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public enum EnumC1133850fbz {
    UNKNOWN(0, ""),
    STRING(1, "string"),
    USER(11, "user"),
    GIFT(12, "gift"),
    HEART(13, "heart"),
    PATTERN_REF(14, "pref"),
    IMAGE(15, "image"),
    STRING_REF(16, "sref");

    public final int LL;
    public final String LLILLJJLI;

    public int getPieceType() {
        return this.LL;
    }

    public String getTag() {
        return this.LLILLJJLI;
    }

    public static EnumC1133850fbz valueOf(String str) {
        return (EnumC1133850fbz) C08FF.LIZ(EnumC1133850fbz.class, str);
    }

    EnumC1133850fbz(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
