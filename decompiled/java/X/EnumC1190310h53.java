package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h53, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1190310h53 {
    public static final C1190350h57 Companion;
    public static final /* synthetic */ EnumC1190310h53[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1190310h53 POI_REVIEW_TAB_OTHERS;
    public static final EnumC1190310h53 POI_REVIEW_TAB_TIKTOK;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1190310h53> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1190310h53 enumC1190310h53 = new EnumC1190310h53("POI_REVIEW_TAB_TIKTOK", 0, 1);
        POI_REVIEW_TAB_TIKTOK = enumC1190310h53;
        EnumC1190310h53 enumC1190310h532 = new EnumC1190310h53("POI_REVIEW_TAB_OTHERS", 1, 2);
        POI_REVIEW_TAB_OTHERS = enumC1190310h532;
        EnumC1190310h53[] enumC1190310h53Arr = {enumC1190310h53, enumC1190310h532};
        LLILLJJLI = enumC1190310h53Arr;
        LLILLL = new C2254308sP(enumC1190310h53Arr);
        Companion = new C1190350h57();
    }

    public static EnumC1190310h53[] values() {
        return (EnumC1190310h53[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1190310h53 valueOf(String str) {
        return (EnumC1190310h53) C08FF.LIZ(EnumC1190310h53.class, str);
    }

    public EnumC1190310h53(String str, int i, int i2) {
        this.LL = i2;
    }
}
