package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1741130vPT {
    public static final EnumC1741130vPT CLOSE;
    public static final /* synthetic */ EnumC1741130vPT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1741130vPT NON;
    public static final EnumC1741130vPT OPEN_FAIL;
    public static final EnumC1741130vPT OPEN_START;
    public static final EnumC1741130vPT OPEN_SUCCESS;

    public static InterfaceC2044707zh<EnumC1741130vPT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1741130vPT enumC1741130vPT = new EnumC1741130vPT("NON", 0);
        NON = enumC1741130vPT;
        EnumC1741130vPT enumC1741130vPT2 = new EnumC1741130vPT("OPEN_START", 1);
        OPEN_START = enumC1741130vPT2;
        EnumC1741130vPT enumC1741130vPT3 = new EnumC1741130vPT("OPEN_SUCCESS", 2);
        OPEN_SUCCESS = enumC1741130vPT3;
        EnumC1741130vPT enumC1741130vPT4 = new EnumC1741130vPT("OPEN_FAIL", 3);
        OPEN_FAIL = enumC1741130vPT4;
        EnumC1741130vPT enumC1741130vPT5 = new EnumC1741130vPT("CLOSE", 4);
        CLOSE = enumC1741130vPT5;
        EnumC1741130vPT[] enumC1741130vPTArr = {enumC1741130vPT, enumC1741130vPT2, enumC1741130vPT3, enumC1741130vPT4, enumC1741130vPT5};
        LL = enumC1741130vPTArr;
        LLILLJJLI = new C2254308sP(enumC1741130vPTArr);
    }

    public static EnumC1741130vPT[] values() {
        return (EnumC1741130vPT[]) LL.clone();
    }

    public static EnumC1741130vPT valueOf(String str) {
        return (EnumC1741130vPT) C08FF.LIZ(EnumC1741130vPT.class, str);
    }

    public EnumC1741130vPT(String str, int i) {
    }
}
