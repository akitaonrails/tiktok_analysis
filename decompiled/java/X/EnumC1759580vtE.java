package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vtE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1759580vtE {
    public static final EnumC1759580vtE BOTTOM;
    public static final /* synthetic */ EnumC1759580vtE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1759580vtE TOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1759580vtE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1759580vtE enumC1759580vtE = new EnumC1759580vtE("TOP", 0, 1);
        TOP = enumC1759580vtE;
        EnumC1759580vtE enumC1759580vtE2 = new EnumC1759580vtE("BOTTOM", 1, 2);
        BOTTOM = enumC1759580vtE2;
        EnumC1759580vtE[] enumC1759580vtEArr = {enumC1759580vtE, enumC1759580vtE2};
        LLILLJJLI = enumC1759580vtEArr;
        LLILLL = new C2254308sP(enumC1759580vtEArr);
    }

    public static EnumC1759580vtE[] values() {
        return (EnumC1759580vtE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1759580vtE valueOf(String str) {
        return (EnumC1759580vtE) C08FF.LIZ(EnumC1759580vtE.class, str);
    }

    public EnumC1759580vtE(String str, int i, int i2) {
        this.LL = i2;
    }
}
