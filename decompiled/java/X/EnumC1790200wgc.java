package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wgc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1790200wgc {
    public static final EnumC1790200wgc AMAZON;
    public static final C1790190wgb Companion;
    public static final EnumC1790200wgc GOOGLE;
    public static final /* synthetic */ EnumC1790200wgc[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1790200wgc UNKNOWN;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1790200wgc> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1790200wgc enumC1790200wgc = new EnumC1790200wgc("UNKNOWN", 0, "", 0);
        UNKNOWN = enumC1790200wgc;
        EnumC1790200wgc enumC1790200wgc2 = new EnumC1790200wgc("GOOGLE", 1, "GP", 52);
        GOOGLE = enumC1790200wgc2;
        EnumC1790200wgc enumC1790200wgc3 = new EnumC1790200wgc("AMAZON", 2, "amazon", 53);
        AMAZON = enumC1790200wgc3;
        EnumC1790200wgc[] enumC1790200wgcArr = {enumC1790200wgc, enumC1790200wgc2, enumC1790200wgc3};
        LLILLL = enumC1790200wgcArr;
        LLILZ = new C2254308sP(enumC1790200wgcArr);
        Companion = new C1790190wgb();
    }

    public static EnumC1790200wgc[] values() {
        return (EnumC1790200wgc[]) LLILLL.clone();
    }

    public final String getMethodName() {
        return this.LL;
    }

    public final int getValue() {
        return this.LLILLJJLI;
    }

    public static EnumC1790200wgc valueOf(String str) {
        return (EnumC1790200wgc) C08FF.LIZ(EnumC1790200wgc.class, str);
    }

    public EnumC1790200wgc(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
