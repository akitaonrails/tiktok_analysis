package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2006707tZ {
    public static final EnumC2006707tZ CCDC_ADD_LOCAL;
    public static final /* synthetic */ EnumC2006707tZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2006707tZ NORMAL;

    public static InterfaceC2044707zh<EnumC2006707tZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2006707tZ enumC2006707tZ = new EnumC2006707tZ("NORMAL", 0);
        NORMAL = enumC2006707tZ;
        EnumC2006707tZ enumC2006707tZ2 = new EnumC2006707tZ("CCDC_ADD_LOCAL", 1);
        CCDC_ADD_LOCAL = enumC2006707tZ2;
        EnumC2006707tZ[] enumC2006707tZArr = {enumC2006707tZ, enumC2006707tZ2};
        LL = enumC2006707tZArr;
        LLILLJJLI = new C2254308sP(enumC2006707tZArr);
    }

    public static EnumC2006707tZ[] values() {
        return (EnumC2006707tZ[]) LL.clone();
    }

    public static EnumC2006707tZ valueOf(String str) {
        return (EnumC2006707tZ) C08FF.LIZ(EnumC2006707tZ.class, str);
    }

    public EnumC2006707tZ(String str, int i) {
    }
}
