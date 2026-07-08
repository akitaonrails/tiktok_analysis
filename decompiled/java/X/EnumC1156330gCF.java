package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gCF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1156330gCF {
    public static final /* synthetic */ EnumC1156330gCF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1156330gCF POI_REVIEW_SORT_TYPE_DEFAULT;
    public static final EnumC1156330gCF POI_REVIEW_SORT_TYPE_RECENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1156330gCF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1156330gCF enumC1156330gCF = new EnumC1156330gCF("POI_REVIEW_SORT_TYPE_DEFAULT", 0, 1);
        POI_REVIEW_SORT_TYPE_DEFAULT = enumC1156330gCF;
        EnumC1156330gCF enumC1156330gCF2 = new EnumC1156330gCF("POI_REVIEW_SORT_TYPE_RECENT", 1, 2);
        POI_REVIEW_SORT_TYPE_RECENT = enumC1156330gCF2;
        EnumC1156330gCF[] enumC1156330gCFArr = {enumC1156330gCF, enumC1156330gCF2};
        LLILLJJLI = enumC1156330gCFArr;
        LLILLL = new C2254308sP(enumC1156330gCFArr);
    }

    public static EnumC1156330gCF[] values() {
        return (EnumC1156330gCF[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1156330gCF valueOf(String str) {
        return (EnumC1156330gCF) C08FF.LIZ(EnumC1156330gCF.class, str);
    }

    public EnumC1156330gCF(String str, int i, int i2) {
        this.LL = i2;
    }
}
