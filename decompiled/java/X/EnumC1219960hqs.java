package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1219960hqs {
    public static final EnumC1219960hqs BUYER;
    public static final EnumC1219960hqs CAMPUS;
    public static final C1219970hqt Companion;
    public static final EnumC1219960hqs EVERYONE;
    public static final EnumC1219960hqs FOLLOWERS;
    public static final EnumC1219960hqs LIVE;
    public static final /* synthetic */ EnumC1219960hqs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1219960hqs SUBSCRIPTION;
    public static final EnumC1219960hqs UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1219960hqs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1219960hqs enumC1219960hqs = new EnumC1219960hqs("UNKNOWN", 0, 0);
        UNKNOWN = enumC1219960hqs;
        EnumC1219960hqs enumC1219960hqs2 = new EnumC1219960hqs("SUBSCRIPTION", 1, 1);
        SUBSCRIPTION = enumC1219960hqs2;
        EnumC1219960hqs enumC1219960hqs3 = new EnumC1219960hqs("LIVE", 2, 2);
        LIVE = enumC1219960hqs3;
        EnumC1219960hqs enumC1219960hqs4 = new EnumC1219960hqs("FOLLOWERS", 3, 3);
        FOLLOWERS = enumC1219960hqs4;
        EnumC1219960hqs enumC1219960hqs5 = new EnumC1219960hqs("CAMPUS", 4, 4);
        CAMPUS = enumC1219960hqs5;
        EnumC1219960hqs enumC1219960hqs6 = new EnumC1219960hqs("EVERYONE", 5, 5);
        EVERYONE = enumC1219960hqs6;
        EnumC1219960hqs enumC1219960hqs7 = new EnumC1219960hqs("BUYER", 6, 6);
        BUYER = enumC1219960hqs7;
        EnumC1219960hqs[] enumC1219960hqsArr = {enumC1219960hqs, enumC1219960hqs2, enumC1219960hqs3, enumC1219960hqs4, enumC1219960hqs5, enumC1219960hqs6, enumC1219960hqs7};
        LLILLJJLI = enumC1219960hqsArr;
        LLILLL = new C2254308sP(enumC1219960hqsArr);
        Companion = new C1219970hqt();
    }

    public static EnumC1219960hqs[] values() {
        return (EnumC1219960hqs[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1219960hqs valueOf(String str) {
        return (EnumC1219960hqs) C08FF.LIZ(EnumC1219960hqs.class, str);
    }

    public EnumC1219960hqs(String str, int i, int i2) {
        this.LL = i2;
    }
}
