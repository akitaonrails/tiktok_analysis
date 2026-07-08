package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07zO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2042807zO {
    public static final C2042907zP Companion;
    public static final /* synthetic */ EnumC2042807zO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2042807zO SUPERVISED;
    public static final EnumC2042807zO SUPERVISED_APPROVAL_DENIED;
    public static final EnumC2042807zO SUPERVISED_APPROVAL_PENDING;
    public static final EnumC2042807zO UNKNOWN;
    public static final EnumC2042807zO VERIFIED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2042807zO> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.07zP] */
    static {
        EnumC2042807zO enumC2042807zO = new EnumC2042807zO("VERIFIED", 0, 0);
        VERIFIED = enumC2042807zO;
        EnumC2042807zO enumC2042807zO2 = new EnumC2042807zO("SUPERVISED", 1, 1);
        SUPERVISED = enumC2042807zO2;
        EnumC2042807zO enumC2042807zO3 = new EnumC2042807zO("SUPERVISED_APPROVAL_PENDING", 2, 2);
        SUPERVISED_APPROVAL_PENDING = enumC2042807zO3;
        EnumC2042807zO enumC2042807zO4 = new EnumC2042807zO("SUPERVISED_APPROVAL_DENIED", 3, 3);
        SUPERVISED_APPROVAL_DENIED = enumC2042807zO4;
        EnumC2042807zO enumC2042807zO5 = new EnumC2042807zO("UNKNOWN", 4, 4);
        UNKNOWN = enumC2042807zO5;
        EnumC2042807zO[] enumC2042807zOArr = {enumC2042807zO, enumC2042807zO2, enumC2042807zO3, enumC2042807zO4, enumC2042807zO5};
        LLILLJJLI = enumC2042807zOArr;
        LLILLL = new C2254308sP(enumC2042807zOArr);
        Companion = new Object() { // from class: X.07zP
        };
    }

    public static EnumC2042807zO[] values() {
        return (EnumC2042807zO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2042807zO valueOf(String str) {
        return (EnumC2042807zO) C08FF.LIZ(EnumC2042807zO.class, str);
    }

    public EnumC2042807zO(String str, int i, int i2) {
        this.LL = i2;
    }
}
