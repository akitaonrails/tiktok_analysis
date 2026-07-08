package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1409650mmp {
    public static final C1409670mmr Companion;
    public static final EnumC1409650mmp EDIT_BOTTOM;
    public static final /* synthetic */ EnumC1409650mmp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1409650mmp TEXT_STICKER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1409650mmp> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0mmr] */
    static {
        EnumC1409650mmp enumC1409650mmp = new EnumC1409650mmp("EDIT_BOTTOM", 0, "edit_page_bottom");
        EDIT_BOTTOM = enumC1409650mmp;
        EnumC1409650mmp enumC1409650mmp2 = new EnumC1409650mmp("TEXT_STICKER", 1, "text_sticker");
        TEXT_STICKER = enumC1409650mmp2;
        EnumC1409650mmp[] enumC1409650mmpArr = {enumC1409650mmp, enumC1409650mmp2};
        LLILLJJLI = enumC1409650mmpArr;
        LLILLL = new C2254308sP(enumC1409650mmpArr);
        Companion = new Object() { // from class: X.0mmr
        };
    }

    public static EnumC1409650mmp[] values() {
        return (EnumC1409650mmp[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1409650mmp valueOf(String str) {
        return (EnumC1409650mmp) C08FF.LIZ(EnumC1409650mmp.class, str);
    }

    public EnumC1409650mmp(String str, int i, String str2) {
        this.LL = str2;
    }
}
