package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1166620gSq {
    public static final EnumC1166620gSq HEADER;
    public static final EnumC1166620gSq HOME;
    public static final /* synthetic */ EnumC1166620gSq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1166620gSq PRODUCT;
    public static final EnumC1166620gSq REVIEW;
    public static final EnumC1166620gSq UNKNOWN;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1166620gSq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1166620gSq enumC1166620gSq = new EnumC1166620gSq("UNKNOWN", 0, -1L);
        UNKNOWN = enumC1166620gSq;
        EnumC1166620gSq enumC1166620gSq2 = new EnumC1166620gSq("HEADER", 1, 0L);
        HEADER = enumC1166620gSq2;
        EnumC1166620gSq enumC1166620gSq3 = new EnumC1166620gSq("HOME", 2, 1L);
        HOME = enumC1166620gSq3;
        EnumC1166620gSq enumC1166620gSq4 = new EnumC1166620gSq("PRODUCT", 3, 2L);
        PRODUCT = enumC1166620gSq4;
        EnumC1166620gSq enumC1166620gSq5 = new EnumC1166620gSq("REVIEW", 4, 5L);
        REVIEW = enumC1166620gSq5;
        EnumC1166620gSq[] enumC1166620gSqArr = {enumC1166620gSq, enumC1166620gSq2, enumC1166620gSq3, enumC1166620gSq4, enumC1166620gSq5};
        LLILLJJLI = enumC1166620gSqArr;
        LLILLL = new C2254308sP(enumC1166620gSqArr);
    }

    public static EnumC1166620gSq[] values() {
        return (EnumC1166620gSq[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC1166620gSq valueOf(String str) {
        return (EnumC1166620gSq) C08FF.LIZ(EnumC1166620gSq.class, str);
    }

    public EnumC1166620gSq(String str, int i, long j) {
        this.LL = j;
    }
}
