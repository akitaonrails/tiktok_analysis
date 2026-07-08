package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wB1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1770610wB1 {
    public static final EnumC1770610wB1 DATA_INVALID;
    public static final EnumC1770610wB1 DATA_NOT_FOUND;
    public static final EnumC1770610wB1 DATA_VALID;
    public static final /* synthetic */ EnumC1770610wB1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1770610wB1 REQUESTING;
    public static final EnumC1770610wB1 REQUEST_FAIL;

    public static InterfaceC2044707zh<EnumC1770610wB1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1770610wB1 enumC1770610wB1 = new EnumC1770610wB1("REQUESTING", 0);
        REQUESTING = enumC1770610wB1;
        EnumC1770610wB1 enumC1770610wB12 = new EnumC1770610wB1("REQUEST_FAIL", 1);
        REQUEST_FAIL = enumC1770610wB12;
        EnumC1770610wB1 enumC1770610wB13 = new EnumC1770610wB1("DATA_NOT_FOUND", 2);
        DATA_NOT_FOUND = enumC1770610wB13;
        EnumC1770610wB1 enumC1770610wB14 = new EnumC1770610wB1("DATA_INVALID", 3);
        DATA_INVALID = enumC1770610wB14;
        EnumC1770610wB1 enumC1770610wB15 = new EnumC1770610wB1("DATA_VALID", 4);
        DATA_VALID = enumC1770610wB15;
        EnumC1770610wB1[] enumC1770610wB1Arr = {enumC1770610wB1, enumC1770610wB12, enumC1770610wB13, enumC1770610wB14, enumC1770610wB15};
        LL = enumC1770610wB1Arr;
        LLILLJJLI = new C2254308sP(enumC1770610wB1Arr);
    }

    public static EnumC1770610wB1[] values() {
        return (EnumC1770610wB1[]) LL.clone();
    }

    public static EnumC1770610wB1 valueOf(String str) {
        return (EnumC1770610wB1) C08FF.LIZ(EnumC1770610wB1.class, str);
    }

    public EnumC1770610wB1(String str, int i) {
    }
}
