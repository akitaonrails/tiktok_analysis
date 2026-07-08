package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1412640mre {
    public static final EnumC1412640mre AIGT;
    public static final EnumC1412640mre AI_ALIVE_TEMPLATE;
    public static final EnumC1412640mre ALGORITHM_TEMPLATE;
    public static final EnumC1412640mre AUTOCUT_TEMPLATE;
    public static final EnumC1412640mre AUTO_PICK_TEMPLATE;
    public static final EnumC1412640mre CUT_SAME;
    public static final EnumC1412640mre DESIGNER_FIXED_TEMPLATE;
    public static final /* synthetic */ EnumC1412640mre[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1412640mre LYRICS_RULE_TEMPLATE;
    public static final EnumC1412640mre MV_TEMPLATE;
    public static final EnumC1412640mre PHOTO_MODE_NONE;
    public static final EnumC1412640mre PHOTO_MODE_SLIDESHOW;
    public static final EnumC1412640mre PHOTO_MODE_TEMPLATE;
    public static final EnumC1412640mre PUGC_TEMPLATE;
    public static final EnumC1412640mre SGT;
    public static final EnumC1412640mre SOUND_SYNC_TEMPLATE;
    public static final EnumC1412640mre UGC_TEMPLATE;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<EnumC1412640mre> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1412640mre enumC1412640mre = new EnumC1412640mre("PHOTO_MODE_NONE", 0, 0);
        PHOTO_MODE_NONE = enumC1412640mre;
        EnumC1412640mre enumC1412640mre2 = new EnumC1412640mre("PHOTO_MODE_SLIDESHOW", 1, -1);
        PHOTO_MODE_SLIDESHOW = enumC1412640mre2;
        EnumC1412640mre enumC1412640mre3 = new EnumC1412640mre("MV_TEMPLATE", 2, 1);
        MV_TEMPLATE = enumC1412640mre3;
        EnumC1412640mre enumC1412640mre4 = new EnumC1412640mre("CUT_SAME", 3, 2);
        CUT_SAME = enumC1412640mre4;
        EnumC1412640mre enumC1412640mre5 = new EnumC1412640mre("UGC_TEMPLATE", 4, 3);
        UGC_TEMPLATE = enumC1412640mre5;
        EnumC1412640mre enumC1412640mre6 = new EnumC1412640mre("AUTOCUT_TEMPLATE", 5, 4);
        AUTOCUT_TEMPLATE = enumC1412640mre6;
        EnumC1412640mre enumC1412640mre7 = new EnumC1412640mre("DESIGNER_FIXED_TEMPLATE", 6, 5);
        DESIGNER_FIXED_TEMPLATE = enumC1412640mre7;
        EnumC1412640mre enumC1412640mre8 = new EnumC1412640mre("ALGORITHM_TEMPLATE", 7, 6);
        ALGORITHM_TEMPLATE = enumC1412640mre8;
        EnumC1412640mre enumC1412640mre9 = new EnumC1412640mre("SOUND_SYNC_TEMPLATE", 8, 7);
        SOUND_SYNC_TEMPLATE = enumC1412640mre9;
        EnumC1412640mre enumC1412640mre10 = new EnumC1412640mre("PUGC_TEMPLATE", 9, 8);
        PUGC_TEMPLATE = enumC1412640mre10;
        EnumC1412640mre enumC1412640mre11 = new EnumC1412640mre("PHOTO_MODE_TEMPLATE", 10, 9);
        PHOTO_MODE_TEMPLATE = enumC1412640mre11;
        EnumC1412640mre enumC1412640mre12 = new EnumC1412640mre("AI_ALIVE_TEMPLATE", 11, 15);
        AI_ALIVE_TEMPLATE = enumC1412640mre12;
        EnumC1412640mre enumC1412640mre13 = new EnumC1412640mre("AIGT", 12, 14);
        AIGT = enumC1412640mre13;
        EnumC1412640mre enumC1412640mre14 = new EnumC1412640mre("AUTO_PICK_TEMPLATE", 13, 16);
        AUTO_PICK_TEMPLATE = enumC1412640mre14;
        EnumC1412640mre enumC1412640mre15 = new EnumC1412640mre("LYRICS_RULE_TEMPLATE", 14, 17);
        LYRICS_RULE_TEMPLATE = enumC1412640mre15;
        EnumC1412640mre enumC1412640mre16 = new EnumC1412640mre("SGT", 15, 18);
        SGT = enumC1412640mre16;
        EnumC1412640mre[] enumC1412640mreArr = {enumC1412640mre, enumC1412640mre2, enumC1412640mre3, enumC1412640mre4, enumC1412640mre5, enumC1412640mre6, enumC1412640mre7, enumC1412640mre8, enumC1412640mre9, enumC1412640mre10, enumC1412640mre11, enumC1412640mre12, enumC1412640mre13, enumC1412640mre14, enumC1412640mre15, enumC1412640mre16};
        LLILLJJLI = enumC1412640mreArr;
        LLILLL = new C2254308sP(enumC1412640mreArr);
    }

    public static EnumC1412640mre[] values() {
        return (EnumC1412640mre[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1412640mre valueOf(String str) {
        return (EnumC1412640mre) C08FF.LIZ(EnumC1412640mre.class, str);
    }

    public EnumC1412640mre(String str, int i, int i2) {
        this.LL = i2;
    }
}
