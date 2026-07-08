package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1201990hNt {
    public static final /* synthetic */ EnumC1201990hNt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1201990hNt NEARBY;
    public static final EnumC1201990hNt POI_DETAIL;
    public static final EnumC1201990hNt REVIEW_BANNER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1201990hNt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1201990hNt enumC1201990hNt = new EnumC1201990hNt("NEARBY", 0, "nearby");
        NEARBY = enumC1201990hNt;
        EnumC1201990hNt enumC1201990hNt2 = new EnumC1201990hNt("POI_DETAIL", 1, "poi_detail");
        POI_DETAIL = enumC1201990hNt2;
        EnumC1201990hNt enumC1201990hNt3 = new EnumC1201990hNt("REVIEW_BANNER", 2, "review_banner");
        REVIEW_BANNER = enumC1201990hNt3;
        EnumC1201990hNt[] enumC1201990hNtArr = {enumC1201990hNt, enumC1201990hNt2, enumC1201990hNt3};
        LLILLJJLI = enumC1201990hNtArr;
        LLILLL = new C2254308sP(enumC1201990hNtArr);
    }

    public static EnumC1201990hNt[] values() {
        return (EnumC1201990hNt[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC1201990hNt valueOf(String str) {
        return (EnumC1201990hNt) C08FF.LIZ(EnumC1201990hNt.class, str);
    }

    public EnumC1201990hNt(String str, int i, String str2) {
        this.LL = str2;
    }
}
