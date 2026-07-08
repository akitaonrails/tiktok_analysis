package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC455750Hu1 {
    public static final EnumC455750Hu1 ERROR;
    public static final /* synthetic */ EnumC455750Hu1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC455750Hu1 LOAD_MORE_LOADING;
    public static final EnumC455750Hu1 LOAD_MORE_SUCCESS;
    public static final EnumC455750Hu1 REFRESH_LOADING;
    public static final EnumC455750Hu1 REFRESH_SUCCESS;

    public static InterfaceC2044707zh<EnumC455750Hu1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC455750Hu1 enumC455750Hu1 = new EnumC455750Hu1("REFRESH_LOADING", 0);
        REFRESH_LOADING = enumC455750Hu1;
        EnumC455750Hu1 enumC455750Hu12 = new EnumC455750Hu1("REFRESH_SUCCESS", 1);
        REFRESH_SUCCESS = enumC455750Hu12;
        EnumC455750Hu1 enumC455750Hu13 = new EnumC455750Hu1("LOAD_MORE_LOADING", 2);
        LOAD_MORE_LOADING = enumC455750Hu13;
        EnumC455750Hu1 enumC455750Hu14 = new EnumC455750Hu1("LOAD_MORE_SUCCESS", 3);
        LOAD_MORE_SUCCESS = enumC455750Hu14;
        EnumC455750Hu1 enumC455750Hu15 = new EnumC455750Hu1("ERROR", 4);
        ERROR = enumC455750Hu15;
        EnumC455750Hu1[] enumC455750Hu1Arr = {enumC455750Hu1, enumC455750Hu12, enumC455750Hu13, enumC455750Hu14, enumC455750Hu15};
        LL = enumC455750Hu1Arr;
        LLILLJJLI = new C2254308sP(enumC455750Hu1Arr);
    }

    public static EnumC455750Hu1[] values() {
        return (EnumC455750Hu1[]) LL.clone();
    }

    public static EnumC455750Hu1 valueOf(String str) {
        return (EnumC455750Hu1) C08FF.LIZ(EnumC455750Hu1.class, str);
    }

    public EnumC455750Hu1(String str, int i) {
    }
}
