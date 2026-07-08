package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1577000r8k {
    public static final C1577020r8m Companion;
    public static final EnumC1577000r8k DRAMA_CENTER;
    public static final EnumC1577000r8k DRAMA_FEED;
    public static final EnumC1577000r8k FYP;
    public static final /* synthetic */ EnumC1577000r8k[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1577000r8k UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1577000r8k> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0r8m] */
    static {
        EnumC1577000r8k enumC1577000r8k = new EnumC1577000r8k("UNKNOWN", 0, 0);
        UNKNOWN = enumC1577000r8k;
        EnumC1577000r8k enumC1577000r8k2 = new EnumC1577000r8k("DRAMA_CENTER", 1, 1);
        DRAMA_CENTER = enumC1577000r8k2;
        EnumC1577000r8k enumC1577000r8k3 = new EnumC1577000r8k("DRAMA_FEED", 2, 2);
        DRAMA_FEED = enumC1577000r8k3;
        EnumC1577000r8k enumC1577000r8k4 = new EnumC1577000r8k("FYP", 3, 3);
        FYP = enumC1577000r8k4;
        EnumC1577000r8k[] enumC1577000r8kArr = {enumC1577000r8k, enumC1577000r8k2, enumC1577000r8k3, enumC1577000r8k4};
        LLILLJJLI = enumC1577000r8kArr;
        LLILLL = new C2254308sP(enumC1577000r8kArr);
        Companion = new Object() { // from class: X.0r8m
        };
    }

    public static EnumC1577000r8k[] values() {
        return (EnumC1577000r8k[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1577000r8k valueOf(String str) {
        return (EnumC1577000r8k) C08FF.LIZ(EnumC1577000r8k.class, str);
    }

    public EnumC1577000r8k(String str, int i, int i2) {
        this.LL = i2;
    }
}
