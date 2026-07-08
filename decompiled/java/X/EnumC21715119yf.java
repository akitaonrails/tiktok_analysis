package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21715119yf {
    public static final EnumC21715119yf BLOCK;
    public static final EnumC21715119yf LARGE;
    public static final /* synthetic */ EnumC21715119yf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21715119yf SMALL;

    public static InterfaceC2044707zh<EnumC21715119yf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21715119yf enumC21715119yf = new EnumC21715119yf("SMALL", 0);
        SMALL = enumC21715119yf;
        EnumC21715119yf enumC21715119yf2 = new EnumC21715119yf("LARGE", 1);
        LARGE = enumC21715119yf2;
        EnumC21715119yf enumC21715119yf3 = new EnumC21715119yf("BLOCK", 2);
        BLOCK = enumC21715119yf3;
        EnumC21715119yf[] enumC21715119yfArr = {enumC21715119yf, enumC21715119yf2, enumC21715119yf3};
        LL = enumC21715119yfArr;
        LLILLJJLI = new C2254308sP(enumC21715119yfArr);
    }

    public static EnumC21715119yf[] values() {
        return (EnumC21715119yf[]) LL.clone();
    }

    public static EnumC21715119yf valueOf(String str) {
        return (EnumC21715119yf) C08FF.LIZ(EnumC21715119yf.class, str);
    }

    public EnumC21715119yf(String str, int i) {
    }
}
