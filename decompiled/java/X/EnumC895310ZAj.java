package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC895310ZAj {
    public static final EnumC895310ZAj COUNT;
    public static final EnumC895310ZAj DOT;
    public static final /* synthetic */ EnumC895310ZAj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC895310ZAj NONE;

    public static InterfaceC2044707zh<EnumC895310ZAj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC895310ZAj enumC895310ZAj = new EnumC895310ZAj("NONE", 0);
        NONE = enumC895310ZAj;
        EnumC895310ZAj enumC895310ZAj2 = new EnumC895310ZAj("COUNT", 1);
        COUNT = enumC895310ZAj2;
        EnumC895310ZAj enumC895310ZAj3 = new EnumC895310ZAj("DOT", 2);
        DOT = enumC895310ZAj3;
        EnumC895310ZAj[] enumC895310ZAjArr = {enumC895310ZAj, enumC895310ZAj2, enumC895310ZAj3};
        LL = enumC895310ZAjArr;
        LLILLJJLI = new C2254308sP(enumC895310ZAjArr);
    }

    public static EnumC895310ZAj[] values() {
        return (EnumC895310ZAj[]) LL.clone();
    }

    public static EnumC895310ZAj valueOf(String str) {
        return (EnumC895310ZAj) C08FF.LIZ(EnumC895310ZAj.class, str);
    }

    public EnumC895310ZAj(String str, int i) {
    }
}
