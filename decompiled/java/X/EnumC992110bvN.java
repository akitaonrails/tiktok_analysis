package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992110bvN {
    public static final EnumC992110bvN DASH;
    public static final EnumC992110bvN GAP;
    public static final /* synthetic */ EnumC992110bvN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC992110bvN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992110bvN enumC992110bvN = new EnumC992110bvN("DASH", 0);
        DASH = enumC992110bvN;
        EnumC992110bvN enumC992110bvN2 = new EnumC992110bvN("GAP", 1);
        GAP = enumC992110bvN2;
        EnumC992110bvN[] enumC992110bvNArr = {enumC992110bvN, enumC992110bvN2};
        LL = enumC992110bvNArr;
        LLILLJJLI = new C2254308sP(enumC992110bvNArr);
    }

    public static EnumC992110bvN[] values() {
        return (EnumC992110bvN[]) LL.clone();
    }

    public static EnumC992110bvN valueOf(String str) {
        return (EnumC992110bvN) C08FF.LIZ(EnumC992110bvN.class, str);
    }

    public EnumC992110bvN(String str, int i) {
    }
}
