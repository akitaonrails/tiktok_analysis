package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1063540dma {
    public static final /* synthetic */ EnumC1063540dma[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1063540dma PRIVATE;
    public static final EnumC1063540dma PROTECT;
    public static final EnumC1063540dma PUBLIC;
    public static final EnumC1063540dma SECURE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1063540dma> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1063540dma enumC1063540dma = new EnumC1063540dma("PUBLIC", 0, "public");
        PUBLIC = enumC1063540dma;
        EnumC1063540dma enumC1063540dma2 = new EnumC1063540dma("PROTECT", 1, "protected");
        PROTECT = enumC1063540dma2;
        EnumC1063540dma enumC1063540dma3 = new EnumC1063540dma("PRIVATE", 2, "private");
        PRIVATE = enumC1063540dma3;
        EnumC1063540dma enumC1063540dma4 = new EnumC1063540dma("SECURE", 3, "secure");
        SECURE = enumC1063540dma4;
        EnumC1063540dma[] enumC1063540dmaArr = {enumC1063540dma, enumC1063540dma2, enumC1063540dma3, enumC1063540dma4};
        LLILLJJLI = enumC1063540dmaArr;
        LLILLL = new C2254308sP(enumC1063540dmaArr);
    }

    public static EnumC1063540dma[] values() {
        return (EnumC1063540dma[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1063540dma valueOf(String str) {
        return (EnumC1063540dma) C08FF.LIZ(EnumC1063540dma.class, str);
    }

    public EnumC1063540dma(String str, int i, String str2) {
        this.LL = str2;
    }
}
