package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1986407qI {
    public static final EnumC1986407qI IMAGE;
    public static final /* synthetic */ EnumC1986407qI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1986407qI TEXT;

    public static InterfaceC2044707zh<EnumC1986407qI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1986407qI enumC1986407qI = new EnumC1986407qI("TEXT", 0);
        TEXT = enumC1986407qI;
        EnumC1986407qI enumC1986407qI2 = new EnumC1986407qI("IMAGE", 1);
        IMAGE = enumC1986407qI2;
        EnumC1986407qI[] enumC1986407qIArr = {enumC1986407qI, enumC1986407qI2};
        LL = enumC1986407qIArr;
        LLILLJJLI = new C2254308sP(enumC1986407qIArr);
    }

    public static EnumC1986407qI[] values() {
        return (EnumC1986407qI[]) LL.clone();
    }

    public static EnumC1986407qI valueOf(String str) {
        return (EnumC1986407qI) C08FF.LIZ(EnumC1986407qI.class, str);
    }

    public EnumC1986407qI(String str, int i) {
    }
}
