package X;

/* JADX INFO: renamed from: X.0owl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1492690owl {
    TTRESUME(-2),
    TTHardCode(-1),
    TTCACHE(0),
    TTSERVER(1),
    TTERROR(2),
    TTPOLL(3),
    TTTNC(4),
    PORTRETRY(7),
    TTREGION(10),
    TTCRONET(20),
    TTCRONETFAILED(30);

    public final int mValue;

    public static EnumC1492690owl valueOf(String str) {
        return (EnumC1492690owl) C08FF.LIZ(EnumC1492690owl.class, str);
    }

    EnumC1492690owl(int i) {
        this.mValue = i;
    }
}
