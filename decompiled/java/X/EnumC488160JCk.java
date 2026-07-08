package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC488160JCk {
    public static final EnumC488160JCk ERROR;
    public static final /* synthetic */ EnumC488160JCk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC488160JCk LOADING;
    public static final EnumC488160JCk SUCCESS;

    public static InterfaceC2044707zh<EnumC488160JCk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC488160JCk enumC488160JCk = new EnumC488160JCk("LOADING", 0);
        LOADING = enumC488160JCk;
        EnumC488160JCk enumC488160JCk2 = new EnumC488160JCk("ERROR", 1);
        ERROR = enumC488160JCk2;
        EnumC488160JCk enumC488160JCk3 = new EnumC488160JCk("SUCCESS", 2);
        SUCCESS = enumC488160JCk3;
        EnumC488160JCk[] enumC488160JCkArr = {enumC488160JCk, enumC488160JCk2, enumC488160JCk3};
        LL = enumC488160JCkArr;
        LLILLJJLI = new C2254308sP(enumC488160JCkArr);
    }

    public static EnumC488160JCk[] values() {
        return (EnumC488160JCk[]) LL.clone();
    }

    public static EnumC488160JCk valueOf(String str) {
        return (EnumC488160JCk) C08FF.LIZ(EnumC488160JCk.class, str);
    }

    public EnumC488160JCk(String str, int i) {
    }
}
