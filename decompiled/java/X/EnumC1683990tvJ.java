package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1683990tvJ {
    public static final EnumC1683990tvJ Both;
    public static final EnumC1683990tvJ Horizontal;
    public static final /* synthetic */ EnumC1683990tvJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1683990tvJ Vertical;

    public static InterfaceC2044707zh<EnumC1683990tvJ> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1683990tvJ valueOf(String str) {
        return (EnumC1683990tvJ) C08FF.LIZ(EnumC1683990tvJ.class, str);
    }

    public static EnumC1683990tvJ[] values() {
        return (EnumC1683990tvJ[]) LL.clone();
    }

    static {
        EnumC1683990tvJ enumC1683990tvJ = new EnumC1683990tvJ("Vertical", 0);
        Vertical = enumC1683990tvJ;
        EnumC1683990tvJ enumC1683990tvJ2 = new EnumC1683990tvJ("Horizontal", 1);
        Horizontal = enumC1683990tvJ2;
        EnumC1683990tvJ enumC1683990tvJ3 = new EnumC1683990tvJ("Both", 2);
        Both = enumC1683990tvJ3;
        EnumC1683990tvJ[] enumC1683990tvJArr = {enumC1683990tvJ, enumC1683990tvJ2, enumC1683990tvJ3};
        LL = enumC1683990tvJArr;
        LLILLJJLI = new C2254308sP(enumC1683990tvJArr);
    }

    public EnumC1683990tvJ(String str, int i) {
    }
}
