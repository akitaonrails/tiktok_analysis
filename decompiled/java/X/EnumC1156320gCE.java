package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gCE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1156320gCE {
    public static final /* synthetic */ EnumC1156320gCE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1156320gCE POI_REVIEW_SUMMARY_DISPLAY_TYPE_UNKNOWN;
    public static final EnumC1156320gCE POI_REVIEW_SUMMARY_DISPLAY_TYPE_WITH_STAR;
    public static final EnumC1156320gCE POI_REVIEW_SUMMARY_DISPLAY_TYPE_WITH_TOTAL_SCORE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1156320gCE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1156320gCE enumC1156320gCE = new EnumC1156320gCE("POI_REVIEW_SUMMARY_DISPLAY_TYPE_UNKNOWN", 0, 1);
        POI_REVIEW_SUMMARY_DISPLAY_TYPE_UNKNOWN = enumC1156320gCE;
        EnumC1156320gCE enumC1156320gCE2 = new EnumC1156320gCE("POI_REVIEW_SUMMARY_DISPLAY_TYPE_WITH_STAR", 1, 2);
        POI_REVIEW_SUMMARY_DISPLAY_TYPE_WITH_STAR = enumC1156320gCE2;
        EnumC1156320gCE enumC1156320gCE3 = new EnumC1156320gCE("POI_REVIEW_SUMMARY_DISPLAY_TYPE_WITH_TOTAL_SCORE", 2, 3);
        POI_REVIEW_SUMMARY_DISPLAY_TYPE_WITH_TOTAL_SCORE = enumC1156320gCE3;
        EnumC1156320gCE[] enumC1156320gCEArr = {enumC1156320gCE, enumC1156320gCE2, enumC1156320gCE3};
        LLILLJJLI = enumC1156320gCEArr;
        LLILLL = new C2254308sP(enumC1156320gCEArr);
    }

    public static EnumC1156320gCE[] values() {
        return (EnumC1156320gCE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1156320gCE valueOf(String str) {
        return (EnumC1156320gCE) C08FF.LIZ(EnumC1156320gCE.class, str);
    }

    public EnumC1156320gCE(String str, int i, int i2) {
        this.LL = i2;
    }
}
