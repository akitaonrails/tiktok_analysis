package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01v9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC487701v9 {
    public static final EnumC487701v9 CREATE_ERROR;
    public static final EnumC487701v9 IM;
    public static final EnumC487701v9 LIVE_END;
    public static final /* synthetic */ EnumC487701v9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC487701v9 MG_END;
    public static final EnumC487701v9 REMOVE_BY_USER;

    public static InterfaceC2044707zh<EnumC487701v9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC487701v9 enumC487701v9 = new EnumC487701v9("IM", 0);
        IM = enumC487701v9;
        EnumC487701v9 enumC487701v92 = new EnumC487701v9("LIVE_END", 1);
        LIVE_END = enumC487701v92;
        EnumC487701v9 enumC487701v93 = new EnumC487701v9("REMOVE_BY_USER", 2);
        REMOVE_BY_USER = enumC487701v93;
        EnumC487701v9 enumC487701v94 = new EnumC487701v9("CREATE_ERROR", 3);
        CREATE_ERROR = enumC487701v94;
        EnumC487701v9 enumC487701v95 = new EnumC487701v9("MG_END", 4);
        MG_END = enumC487701v95;
        EnumC487701v9[] enumC487701v9Arr = {enumC487701v9, enumC487701v92, enumC487701v93, enumC487701v94, enumC487701v95};
        LL = enumC487701v9Arr;
        LLILLJJLI = new C2254308sP(enumC487701v9Arr);
    }

    public static EnumC487701v9[] values() {
        return (EnumC487701v9[]) LL.clone();
    }

    public static EnumC487701v9 valueOf(String str) {
        return (EnumC487701v9) C08FF.LIZ(EnumC487701v9.class, str);
    }

    public EnumC487701v9(String str, int i) {
    }
}
