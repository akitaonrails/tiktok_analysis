package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782530wUF {
    public static final EnumC1782530wUF EXPIRED;
    public static final /* synthetic */ EnumC1782530wUF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782530wUF NOT_SUFFICIENT;
    public static final EnumC1782530wUF SAVE_FAILURE;
    public static final EnumC1782530wUF USE_HOT_CACHE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1782530wUF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782530wUF enumC1782530wUF = new EnumC1782530wUF("USE_HOT_CACHE", 0, 0);
        USE_HOT_CACHE = enumC1782530wUF;
        EnumC1782530wUF enumC1782530wUF2 = new EnumC1782530wUF("EXPIRED", 1, 1);
        EXPIRED = enumC1782530wUF2;
        EnumC1782530wUF enumC1782530wUF3 = new EnumC1782530wUF("NOT_SUFFICIENT", 2, 2);
        NOT_SUFFICIENT = enumC1782530wUF3;
        EnumC1782530wUF enumC1782530wUF4 = new EnumC1782530wUF("SAVE_FAILURE", 3, 3);
        SAVE_FAILURE = enumC1782530wUF4;
        EnumC1782530wUF[] enumC1782530wUFArr = {enumC1782530wUF, enumC1782530wUF2, enumC1782530wUF3, enumC1782530wUF4};
        LLILLJJLI = enumC1782530wUFArr;
        LLILLL = new C2254308sP(enumC1782530wUFArr);
    }

    public static EnumC1782530wUF[] values() {
        return (EnumC1782530wUF[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1782530wUF valueOf(String str) {
        return (EnumC1782530wUF) C08FF.LIZ(EnumC1782530wUF.class, str);
    }

    public EnumC1782530wUF(String str, int i, int i2) {
        this.LL = i2;
    }
}
