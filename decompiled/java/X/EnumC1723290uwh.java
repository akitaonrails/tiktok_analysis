package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uwh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1723290uwh {
    public static final EnumC1723290uwh ERROR;
    public static final /* synthetic */ EnumC1723290uwh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1723290uwh LOADING;
    public static final EnumC1723290uwh SUCCESS;

    public static InterfaceC2044707zh<EnumC1723290uwh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1723290uwh enumC1723290uwh = new EnumC1723290uwh("SUCCESS", 0);
        SUCCESS = enumC1723290uwh;
        EnumC1723290uwh enumC1723290uwh2 = new EnumC1723290uwh("LOADING", 1);
        LOADING = enumC1723290uwh2;
        EnumC1723290uwh enumC1723290uwh3 = new EnumC1723290uwh("ERROR", 2);
        ERROR = enumC1723290uwh3;
        EnumC1723290uwh[] enumC1723290uwhArr = {enumC1723290uwh, enumC1723290uwh2, enumC1723290uwh3};
        LL = enumC1723290uwhArr;
        LLILLJJLI = new C2254308sP(enumC1723290uwhArr);
    }

    public static EnumC1723290uwh[] values() {
        return (EnumC1723290uwh[]) LL.clone();
    }

    public static EnumC1723290uwh valueOf(String str) {
        return (EnumC1723290uwh) C08FF.LIZ(EnumC1723290uwh.class, str);
    }

    public EnumC1723290uwh(String str, int i) {
    }
}
