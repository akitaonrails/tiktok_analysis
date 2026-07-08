package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1915260zwK {
    public static final EnumC1915260zwK IGNORE;
    public static final /* synthetic */ EnumC1915260zwK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1915260zwK NOT_SHOW;
    public static final EnumC1915260zwK PNS_NULL;
    public static final EnumC1915260zwK SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1915260zwK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1915260zwK enumC1915260zwK = new EnumC1915260zwK("NOT_SHOW", 0, "not_show");
        NOT_SHOW = enumC1915260zwK;
        EnumC1915260zwK enumC1915260zwK2 = new EnumC1915260zwK("SHOW", 1, "show");
        SHOW = enumC1915260zwK2;
        EnumC1915260zwK enumC1915260zwK3 = new EnumC1915260zwK("IGNORE", 2, "ignore");
        IGNORE = enumC1915260zwK3;
        EnumC1915260zwK enumC1915260zwK4 = new EnumC1915260zwK("PNS_NULL", 3, "pns_null");
        PNS_NULL = enumC1915260zwK4;
        EnumC1915260zwK[] enumC1915260zwKArr = {enumC1915260zwK, enumC1915260zwK2, enumC1915260zwK3, enumC1915260zwK4};
        LLILLJJLI = enumC1915260zwKArr;
        LLILLL = new C2254308sP(enumC1915260zwKArr);
    }

    public static EnumC1915260zwK[] values() {
        return (EnumC1915260zwK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1915260zwK valueOf(String str) {
        return (EnumC1915260zwK) C08FF.LIZ(EnumC1915260zwK.class, str);
    }

    public EnumC1915260zwK(String str, int i, String str2) {
        this.LL = str2;
    }
}
