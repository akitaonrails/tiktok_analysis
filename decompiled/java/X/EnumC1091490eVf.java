package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1091490eVf {
    public static final EnumC1091490eVf FOCUS;
    public static final /* synthetic */ EnumC1091490eVf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1091490eVf NORMAL;

    public static InterfaceC2044707zh<EnumC1091490eVf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1091490eVf enumC1091490eVf = new EnumC1091490eVf("NORMAL", 0);
        NORMAL = enumC1091490eVf;
        EnumC1091490eVf enumC1091490eVf2 = new EnumC1091490eVf("FOCUS", 1);
        FOCUS = enumC1091490eVf2;
        EnumC1091490eVf[] enumC1091490eVfArr = {enumC1091490eVf, enumC1091490eVf2};
        LL = enumC1091490eVfArr;
        LLILLJJLI = new C2254308sP(enumC1091490eVfArr);
    }

    public static EnumC1091490eVf[] values() {
        return (EnumC1091490eVf[]) LL.clone();
    }

    public static EnumC1091490eVf valueOf(String str) {
        return (EnumC1091490eVf) C08FF.LIZ(EnumC1091490eVf.class, str);
    }

    public EnumC1091490eVf(String str, int i) {
    }
}
