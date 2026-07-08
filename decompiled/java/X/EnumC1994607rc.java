package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1994607rc {
    public static final EnumC1994607rc FL2VIDEO;
    public static final EnumC1994607rc IMAGE2IMAGE;
    public static final EnumC1994607rc IMAGE2TEXT;
    public static final EnumC1994607rc IMAGE2VIDEO;
    public static final /* synthetic */ EnumC1994607rc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1994607rc TEXT_IMAGE2IMAGE;
    public static final EnumC1994607rc UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1994607rc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1994607rc enumC1994607rc = new EnumC1994607rc("UNKNOWN", 0, 0);
        UNKNOWN = enumC1994607rc;
        EnumC1994607rc enumC1994607rc2 = new EnumC1994607rc("IMAGE2VIDEO", 1, 1);
        IMAGE2VIDEO = enumC1994607rc2;
        EnumC1994607rc enumC1994607rc3 = new EnumC1994607rc("TEXT_IMAGE2IMAGE", 2, 2);
        TEXT_IMAGE2IMAGE = enumC1994607rc3;
        EnumC1994607rc enumC1994607rc4 = new EnumC1994607rc("IMAGE2IMAGE", 3, 3);
        IMAGE2IMAGE = enumC1994607rc4;
        EnumC1994607rc enumC1994607rc5 = new EnumC1994607rc("IMAGE2TEXT", 4, 4);
        IMAGE2TEXT = enumC1994607rc5;
        EnumC1994607rc enumC1994607rc6 = new EnumC1994607rc("FL2VIDEO", 5, 5);
        FL2VIDEO = enumC1994607rc6;
        EnumC1994607rc[] enumC1994607rcArr = {enumC1994607rc, enumC1994607rc2, enumC1994607rc3, enumC1994607rc4, enumC1994607rc5, enumC1994607rc6};
        LLILLJJLI = enumC1994607rcArr;
        LLILLL = new C2254308sP(enumC1994607rcArr);
    }

    public static EnumC1994607rc[] values() {
        return (EnumC1994607rc[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1994607rc valueOf(String str) {
        return (EnumC1994607rc) C08FF.LIZ(EnumC1994607rc.class, str);
    }

    public EnumC1994607rc(String str, int i, int i2) {
        this.LL = i2;
    }
}
