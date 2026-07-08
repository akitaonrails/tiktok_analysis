package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1839020xxM implements InterfaceC593520NPq<String> {
    public static final /* synthetic */ EnumC1839020xxM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1839020xxM NEW_UI_2_MUSIC_LIST_SHEET;
    public static final EnumC1839020xxM NEW_UI_2_MV_LIST_SHEET;
    public static final EnumC1839020xxM NONE;
    public static final EnumC1839020xxM RECOMMEND_MUSIC_LIST;
    public static final EnumC1839020xxM TEXT_ONLY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1839020xxM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1839020xxM enumC1839020xxM = new EnumC1839020xxM("NONE", 0, "");
        NONE = enumC1839020xxM;
        EnumC1839020xxM enumC1839020xxM2 = new EnumC1839020xxM("TEXT_ONLY", 1, "");
        TEXT_ONLY = enumC1839020xxM2;
        EnumC1839020xxM enumC1839020xxM3 = new EnumC1839020xxM("RECOMMEND_MUSIC_LIST", 2, "1.0");
        RECOMMEND_MUSIC_LIST = enumC1839020xxM3;
        EnumC1839020xxM enumC1839020xxM4 = new EnumC1839020xxM("NEW_UI_2_MV_LIST_SHEET", 3, "2.0_V1");
        NEW_UI_2_MV_LIST_SHEET = enumC1839020xxM4;
        EnumC1839020xxM enumC1839020xxM5 = new EnumC1839020xxM("NEW_UI_2_MUSIC_LIST_SHEET", 4, "2.0_V2");
        NEW_UI_2_MUSIC_LIST_SHEET = enumC1839020xxM5;
        EnumC1839020xxM[] enumC1839020xxMArr = {enumC1839020xxM, enumC1839020xxM2, enumC1839020xxM3, enumC1839020xxM4, enumC1839020xxM5};
        LLILLJJLI = enumC1839020xxMArr;
        LLILLL = new C2254308sP(enumC1839020xxMArr);
    }

    public static EnumC1839020xxM[] values() {
        return (EnumC1839020xxM[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static EnumC1839020xxM valueOf(String str) {
        return (EnumC1839020xxM) C08FF.LIZ(EnumC1839020xxM.class, str);
    }

    public EnumC1839020xxM(String str, int i, String str2) {
        this.LL = str2;
    }
}
