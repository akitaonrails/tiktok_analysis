package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Myv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586190Myv {
    public static final EnumC586190Myv BUSINESS_BLOCK;
    public static final EnumC586190Myv DEPENDENCIES_NOT_READY;
    public static final /* synthetic */ EnumC586190Myv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC586190Myv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586190Myv enumC586190Myv = new EnumC586190Myv("BUSINESS_BLOCK", 0, "panel_blocked");
        BUSINESS_BLOCK = enumC586190Myv;
        EnumC586190Myv enumC586190Myv2 = new EnumC586190Myv("DEPENDENCIES_NOT_READY", 1, "dependencies_not_ready");
        DEPENDENCIES_NOT_READY = enumC586190Myv2;
        EnumC586190Myv[] enumC586190MyvArr = {enumC586190Myv, enumC586190Myv2};
        LLILLJJLI = enumC586190MyvArr;
        LLILLL = new C2254308sP(enumC586190MyvArr);
    }

    public static EnumC586190Myv[] values() {
        return (EnumC586190Myv[]) LLILLJJLI.clone();
    }

    public final String getFailReason() {
        return this.LL;
    }

    public static EnumC586190Myv valueOf(String str) {
        return (EnumC586190Myv) C08FF.LIZ(EnumC586190Myv.class, str);
    }

    public EnumC586190Myv(String str, int i, String str2) {
        this.LL = str2;
    }
}
