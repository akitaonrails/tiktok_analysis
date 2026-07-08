package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1988707qf {
    public static final EnumC1988707qf LINK_CHECK;
    public static final /* synthetic */ EnumC1988707qf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1988707qf TITLE_CHECK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1988707qf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1988707qf enumC1988707qf = new EnumC1988707qf("TITLE_CHECK", 0, "keyword_check");
        TITLE_CHECK = enumC1988707qf;
        EnumC1988707qf enumC1988707qf2 = new EnumC1988707qf("LINK_CHECK", 1, "url_check");
        LINK_CHECK = enumC1988707qf2;
        EnumC1988707qf[] enumC1988707qfArr = {enumC1988707qf, enumC1988707qf2};
        LLILLJJLI = enumC1988707qfArr;
        LLILLL = new C2254308sP(enumC1988707qfArr);
    }

    public static EnumC1988707qf[] values() {
        return (EnumC1988707qf[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1988707qf valueOf(String str) {
        return (EnumC1988707qf) C08FF.LIZ(EnumC1988707qf.class, str);
    }

    public EnumC1988707qf(String str, int i, String str2) {
        this.LL = str2;
    }
}
