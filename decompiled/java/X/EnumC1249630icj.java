package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0icj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1249630icj {
    public static final EnumC1249630icj ACTIVE;
    public static final EnumC1249630icj CANCEL;
    public static final EnumC1249630icj EMPTY;
    public static final EnumC1249630icj EXIT;
    public static final EnumC1249630icj FAIL;
    public static final /* synthetic */ EnumC1249630icj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1249630icj LOADING;
    public static final EnumC1249630icj SUCCESS;

    public static InterfaceC2044707zh<EnumC1249630icj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1249630icj enumC1249630icj = new EnumC1249630icj("SUCCESS", 0);
        SUCCESS = enumC1249630icj;
        EnumC1249630icj enumC1249630icj2 = new EnumC1249630icj("FAIL", 1);
        FAIL = enumC1249630icj2;
        EnumC1249630icj enumC1249630icj3 = new EnumC1249630icj("EMPTY", 2);
        EMPTY = enumC1249630icj3;
        EnumC1249630icj enumC1249630icj4 = new EnumC1249630icj("LOADING", 3);
        LOADING = enumC1249630icj4;
        EnumC1249630icj enumC1249630icj5 = new EnumC1249630icj("CANCEL", 4);
        CANCEL = enumC1249630icj5;
        EnumC1249630icj enumC1249630icj6 = new EnumC1249630icj("ACTIVE", 5);
        ACTIVE = enumC1249630icj6;
        EnumC1249630icj enumC1249630icj7 = new EnumC1249630icj("EXIT", 6);
        EXIT = enumC1249630icj7;
        EnumC1249630icj[] enumC1249630icjArr = {enumC1249630icj, enumC1249630icj2, enumC1249630icj3, enumC1249630icj4, enumC1249630icj5, enumC1249630icj6, enumC1249630icj7};
        LL = enumC1249630icjArr;
        LLILLJJLI = new C2254308sP(enumC1249630icjArr);
    }

    public static EnumC1249630icj[] values() {
        return (EnumC1249630icj[]) LL.clone();
    }

    public static EnumC1249630icj valueOf(String str) {
        return (EnumC1249630icj) C08FF.LIZ(EnumC1249630icj.class, str);
    }

    public EnumC1249630icj(String str, int i) {
    }
}
