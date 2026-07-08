package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1538460q8a {
    public static final EnumC1538460q8a FAIL;
    public static final EnumC1538460q8a INIT;
    public static final /* synthetic */ EnumC1538460q8a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1538460q8a LOADING;
    public static final EnumC1538460q8a SUCCESS;

    public static InterfaceC2044707zh<EnumC1538460q8a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1538460q8a enumC1538460q8a = new EnumC1538460q8a("INIT", 0);
        INIT = enumC1538460q8a;
        EnumC1538460q8a enumC1538460q8a2 = new EnumC1538460q8a("LOADING", 1);
        LOADING = enumC1538460q8a2;
        EnumC1538460q8a enumC1538460q8a3 = new EnumC1538460q8a("SUCCESS", 2);
        SUCCESS = enumC1538460q8a3;
        EnumC1538460q8a enumC1538460q8a4 = new EnumC1538460q8a("FAIL", 3);
        FAIL = enumC1538460q8a4;
        EnumC1538460q8a[] enumC1538460q8aArr = {enumC1538460q8a, enumC1538460q8a2, enumC1538460q8a3, enumC1538460q8a4};
        LL = enumC1538460q8aArr;
        LLILLJJLI = new C2254308sP(enumC1538460q8aArr);
    }

    public static EnumC1538460q8a[] values() {
        return (EnumC1538460q8a[]) LL.clone();
    }

    public static EnumC1538460q8a valueOf(String str) {
        return (EnumC1538460q8a) C08FF.LIZ(EnumC1538460q8a.class, str);
    }

    public EnumC1538460q8a(String str, int i) {
    }
}
