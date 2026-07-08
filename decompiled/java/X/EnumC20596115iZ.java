package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15iZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20596115iZ {
    public static final EnumC20596115iZ CLEAN_CACHE;
    public static final EnumC20596115iZ CLEAN_CACHE_AND_DOWNLOAD_LITE;
    public static final EnumC20596115iZ CLEAN_CACHE_AND_DRAFT;
    public static final EnumC20596115iZ CLEAN_NONE;
    public static final C20596315ib Companion;
    public static final /* synthetic */ EnumC20596115iZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20596115iZ> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.15ib] */
    static {
        EnumC20596115iZ enumC20596115iZ = new EnumC20596115iZ("CLEAN_NONE", 0, 0);
        CLEAN_NONE = enumC20596115iZ;
        EnumC20596115iZ enumC20596115iZ2 = new EnumC20596115iZ("CLEAN_CACHE", 1, 1);
        CLEAN_CACHE = enumC20596115iZ2;
        EnumC20596115iZ enumC20596115iZ3 = new EnumC20596115iZ("CLEAN_CACHE_AND_DRAFT", 2, 2);
        CLEAN_CACHE_AND_DRAFT = enumC20596115iZ3;
        EnumC20596115iZ enumC20596115iZ4 = new EnumC20596115iZ("CLEAN_CACHE_AND_DOWNLOAD_LITE", 3, 3);
        CLEAN_CACHE_AND_DOWNLOAD_LITE = enumC20596115iZ4;
        EnumC20596115iZ[] enumC20596115iZArr = {enumC20596115iZ, enumC20596115iZ2, enumC20596115iZ3, enumC20596115iZ4};
        LLILLJJLI = enumC20596115iZArr;
        LLILLL = new C2254308sP(enumC20596115iZArr);
        Companion = new Object() { // from class: X.15ib
        };
    }

    public static EnumC20596115iZ[] values() {
        return (EnumC20596115iZ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20596115iZ valueOf(String str) {
        return (EnumC20596115iZ) C08FF.LIZ(EnumC20596115iZ.class, str);
    }

    public EnumC20596115iZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
