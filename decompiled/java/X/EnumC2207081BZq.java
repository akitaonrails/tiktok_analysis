package X;

/* JADX INFO: renamed from: X.1BZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2207081BZq {
    PHONE("phone"),
    PAD("pad"),
    TV("tv"),
    CAR("car"),
    VR("vr"),
    AR("ar"),
    WATCH("watch");

    public final String LL;

    public String getLower() {
        return this.LL;
    }

    public static EnumC2207081BZq valueOf(String str) {
        return (EnumC2207081BZq) C08FF.LIZ(EnumC2207081BZq.class, str);
    }

    EnumC2207081BZq(String str) {
        this.LL = str;
    }
}
