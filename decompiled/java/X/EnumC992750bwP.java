package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992750bwP {
    public static final C992760bwQ Companion;
    public static final EnumC992750bwP FEED_STATUS_INVITING;
    public static final EnumC992750bwP FEED_STATUS_NOT_ESTABLISHED;
    public static final EnumC992750bwP FEED_STATUS_STARTED;
    public static final EnumC992750bwP FEED_STATUS_UNKNOWN;
    public static final /* synthetic */ EnumC992750bwP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992750bwP> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0bwQ] */
    static {
        EnumC992750bwP enumC992750bwP = new EnumC992750bwP("FEED_STATUS_UNKNOWN", 0, 0);
        FEED_STATUS_UNKNOWN = enumC992750bwP;
        EnumC992750bwP enumC992750bwP2 = new EnumC992750bwP("FEED_STATUS_NOT_ESTABLISHED", 1, 1);
        FEED_STATUS_NOT_ESTABLISHED = enumC992750bwP2;
        EnumC992750bwP enumC992750bwP3 = new EnumC992750bwP("FEED_STATUS_INVITING", 2, 2);
        FEED_STATUS_INVITING = enumC992750bwP3;
        EnumC992750bwP enumC992750bwP4 = new EnumC992750bwP("FEED_STATUS_STARTED", 3, 3);
        FEED_STATUS_STARTED = enumC992750bwP4;
        EnumC992750bwP[] enumC992750bwPArr = {enumC992750bwP, enumC992750bwP2, enumC992750bwP3, enumC992750bwP4};
        LLILLJJLI = enumC992750bwPArr;
        LLILLL = new C2254308sP(enumC992750bwPArr);
        Companion = new Object() { // from class: X.0bwQ
        };
    }

    public static EnumC992750bwP[] values() {
        return (EnumC992750bwP[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992750bwP valueOf(String str) {
        return (EnumC992750bwP) C08FF.LIZ(EnumC992750bwP.class, str);
    }

    public EnumC992750bwP(String str, int i, int i2) {
        this.LL = i2;
    }
}
