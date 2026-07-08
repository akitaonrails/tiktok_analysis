package X;

/* JADX INFO: renamed from: X.0og1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1482310og1 {
    VOD("vod"),
    LIVE("live");

    public final String LL;

    public String getValue() {
        return this.LL;
    }

    public static EnumC1482310og1 valueOf(String str) {
        return (EnumC1482310og1) C08FF.LIZ(EnumC1482310og1.class, str);
    }

    EnumC1482310og1(String str) {
        this.LL = str;
    }
}
