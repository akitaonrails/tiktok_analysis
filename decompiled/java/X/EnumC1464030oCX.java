package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oCX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1464030oCX {
    public static final EnumC1464030oCX AME_PUBLISH;
    public static final EnumC1464030oCX AUTO_CUT;
    public static final EnumC1464030oCX COMMENT_IMAGE_EDIT;
    public static final EnumC1464030oCX CUT_SAME;
    public static final C1464020oCW Companion;
    public static final EnumC1464030oCX DEFAULT;
    public static final EnumC1464030oCX DUET;
    public static final /* synthetic */ EnumC1464030oCX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1464030oCX MV_THEME;
    public static final EnumC1464030oCX UGC_TEMPLATE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1464030oCX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1464030oCX enumC1464030oCX = new EnumC1464030oCX(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1464030oCX;
        EnumC1464030oCX enumC1464030oCX2 = new EnumC1464030oCX("MV_THEME", 1, 1);
        MV_THEME = enumC1464030oCX2;
        EnumC1464030oCX enumC1464030oCX3 = new EnumC1464030oCX("DUET", 2, 2);
        DUET = enumC1464030oCX3;
        EnumC1464030oCX enumC1464030oCX4 = new EnumC1464030oCX("CUT_SAME", 3, 3);
        CUT_SAME = enumC1464030oCX4;
        EnumC1464030oCX enumC1464030oCX5 = new EnumC1464030oCX("AUTO_CUT", 4, 4);
        AUTO_CUT = enumC1464030oCX5;
        EnumC1464030oCX enumC1464030oCX6 = new EnumC1464030oCX("UGC_TEMPLATE", 5, 5);
        UGC_TEMPLATE = enumC1464030oCX6;
        EnumC1464030oCX enumC1464030oCX7 = new EnumC1464030oCX("AME_PUBLISH", 6, 6);
        AME_PUBLISH = enumC1464030oCX7;
        EnumC1464030oCX enumC1464030oCX8 = new EnumC1464030oCX("COMMENT_IMAGE_EDIT", 7, 7);
        COMMENT_IMAGE_EDIT = enumC1464030oCX8;
        EnumC1464030oCX[] enumC1464030oCXArr = {enumC1464030oCX, enumC1464030oCX2, enumC1464030oCX3, enumC1464030oCX4, enumC1464030oCX5, enumC1464030oCX6, enumC1464030oCX7, enumC1464030oCX8};
        LLILLJJLI = enumC1464030oCXArr;
        LLILLL = new C2254308sP(enumC1464030oCXArr);
        Companion = new C1464020oCW();
    }

    public static EnumC1464030oCX[] values() {
        return (EnumC1464030oCX[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C1464040oCY.LIZ[ordinal()]) {
            case 1:
                return LivePreviewCTASmartDisplayManager.DEFAULT;
            case 2:
                return "MV_THEME";
            case 3:
                return "DUET";
            case 4:
                return "CUT_SAME";
            case 5:
                return "AUTO_CUT";
            case 6:
                return "UGC_TEMPLATE";
            case 7:
                return "AME_PUBLISH";
            case 8:
                return "COMMENT_IMAGE_EDIT";
            default:
                throw new C1954807lC();
        }
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1464030oCX valueOf(String str) {
        return (EnumC1464030oCX) C08FF.LIZ(EnumC1464030oCX.class, str);
    }

    public EnumC1464030oCX(String str, int i, int i2) {
        this.LL = i2;
    }
}
