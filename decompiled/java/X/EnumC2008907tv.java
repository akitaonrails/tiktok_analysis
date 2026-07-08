package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2008907tv {
    public static final /* synthetic */ EnumC2008907tv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2008907tv STATUS_LOAD_FAILED;
    public static final EnumC2008907tv STATUS_LOAD_LOADING;
    public static final EnumC2008907tv STATUS_LOAD_SUCCESS;

    public static InterfaceC2044707zh<EnumC2008907tv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2008907tv enumC2008907tv = new EnumC2008907tv("STATUS_LOAD_SUCCESS", 0);
        STATUS_LOAD_SUCCESS = enumC2008907tv;
        EnumC2008907tv enumC2008907tv2 = new EnumC2008907tv("STATUS_LOAD_FAILED", 1);
        STATUS_LOAD_FAILED = enumC2008907tv2;
        EnumC2008907tv enumC2008907tv3 = new EnumC2008907tv("STATUS_LOAD_LOADING", 2);
        STATUS_LOAD_LOADING = enumC2008907tv3;
        EnumC2008907tv[] enumC2008907tvArr = {enumC2008907tv, enumC2008907tv2, enumC2008907tv3};
        LL = enumC2008907tvArr;
        LLILLJJLI = new C2254308sP(enumC2008907tvArr);
    }

    public static EnumC2008907tv[] values() {
        return (EnumC2008907tv[]) LL.clone();
    }

    public static EnumC2008907tv valueOf(String str) {
        return (EnumC2008907tv) C08FF.LIZ(EnumC2008907tv.class, str);
    }

    public EnumC2008907tv(String str, int i) {
    }
}
