package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1983707pr {
    public static final /* synthetic */ EnumC1983707pr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1983707pr META_CONTAIN_GCMARK;
    public static final EnumC1983707pr UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1983707pr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1983707pr enumC1983707pr = new EnumC1983707pr("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC1983707pr;
        EnumC1983707pr enumC1983707pr2 = new EnumC1983707pr("META_CONTAIN_GCMARK", 1, "meta_contain_gcmark");
        META_CONTAIN_GCMARK = enumC1983707pr2;
        EnumC1983707pr[] enumC1983707prArr = {enumC1983707pr, enumC1983707pr2};
        LLILLJJLI = enumC1983707prArr;
        LLILLL = new C2254308sP(enumC1983707prArr);
    }

    public static EnumC1983707pr[] values() {
        return (EnumC1983707pr[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1983707pr valueOf(String str) {
        return (EnumC1983707pr) C08FF.LIZ(EnumC1983707pr.class, str);
    }

    public EnumC1983707pr(String str, int i, String str2) {
        this.LL = str2;
    }
}
