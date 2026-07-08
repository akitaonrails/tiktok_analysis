package X;

/* JADX INFO: renamed from: X.0ahg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC945180ahg {
    ASPECT_RATIO_2_1("2:1"),
    ASPECT_RATIO_16_9("16:9");

    public final String LL;

    public String getValue() {
        return this.LL;
    }

    public static EnumC945180ahg valueOf(String str) {
        return (EnumC945180ahg) C08FF.LIZ(EnumC945180ahg.class, str);
    }

    EnumC945180ahg(String str) {
        this.LL = str;
    }
}
