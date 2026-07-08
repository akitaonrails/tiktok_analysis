package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC489910JJd {
    public static final EnumC489910JJd IS_LOADING;
    public static final /* synthetic */ EnumC489910JJd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC489910JJd LOAD_FAIL;
    public static final EnumC489910JJd LOAD_SUCCESS;

    public static InterfaceC2044707zh<EnumC489910JJd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC489910JJd enumC489910JJd = new EnumC489910JJd("IS_LOADING", 0);
        IS_LOADING = enumC489910JJd;
        EnumC489910JJd enumC489910JJd2 = new EnumC489910JJd("LOAD_SUCCESS", 1);
        LOAD_SUCCESS = enumC489910JJd2;
        EnumC489910JJd enumC489910JJd3 = new EnumC489910JJd("LOAD_FAIL", 2);
        LOAD_FAIL = enumC489910JJd3;
        EnumC489910JJd[] enumC489910JJdArr = {enumC489910JJd, enumC489910JJd2, enumC489910JJd3};
        LL = enumC489910JJdArr;
        LLILLJJLI = new C2254308sP(enumC489910JJdArr);
    }

    public static EnumC489910JJd[] values() {
        return (EnumC489910JJd[]) LL.clone();
    }

    public static EnumC489910JJd valueOf(String str) {
        return (EnumC489910JJd) C08FF.LIZ(EnumC489910JJd.class, str);
    }

    public EnumC489910JJd(String str, int i) {
    }
}
