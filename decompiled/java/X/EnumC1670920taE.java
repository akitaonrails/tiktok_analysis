package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0taE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1670920taE {
    public static final EnumC1670920taE EMPTY;
    public static final EnumC1670920taE ERROR;
    public static final /* synthetic */ EnumC1670920taE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1670920taE LOADING;
    public static final EnumC1670920taE NULL;

    public static InterfaceC2044707zh<EnumC1670920taE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1670920taE enumC1670920taE = new EnumC1670920taE("NULL", 0);
        NULL = enumC1670920taE;
        EnumC1670920taE enumC1670920taE2 = new EnumC1670920taE("LOADING", 1);
        LOADING = enumC1670920taE2;
        EnumC1670920taE enumC1670920taE3 = new EnumC1670920taE("ERROR", 2);
        ERROR = enumC1670920taE3;
        EnumC1670920taE enumC1670920taE4 = new EnumC1670920taE("EMPTY", 3);
        EMPTY = enumC1670920taE4;
        EnumC1670920taE[] enumC1670920taEArr = {enumC1670920taE, enumC1670920taE2, enumC1670920taE3, enumC1670920taE4};
        LL = enumC1670920taEArr;
        LLILLJJLI = new C2254308sP(enumC1670920taEArr);
    }

    public static EnumC1670920taE[] values() {
        return (EnumC1670920taE[]) LL.clone();
    }

    public static EnumC1670920taE valueOf(String str) {
        return (EnumC1670920taE) C08FF.LIZ(EnumC1670920taE.class, str);
    }

    public EnumC1670920taE(String str, int i) {
    }
}
