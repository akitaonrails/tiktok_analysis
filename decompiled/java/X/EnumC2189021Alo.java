package X;

/* JADX INFO: renamed from: X.1Alo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2189021Alo {
    MediaTrans,
    ParseSei,
    CalcuLayout,
    RenderLayout,
    ParseLayoutInfo,
    QueryLayoutModel;

    public static final C2189031Alp Companion = new Object() { // from class: X.1Alp
    };

    public static EnumC2189021Alo valueOf(String str) {
        return (EnumC2189021Alo) C08FF.LIZ(EnumC2189021Alo.class, str);
    }

    public final EnumC2189041Alq into() {
        switch (C2189011Aln.LIZ[ordinal()]) {
            case 1:
                return EnumC2189041Alq.VAR_LINK_MIC_LAYOUT_DRIVE_STEP_MEDIA_TRANS;
            case 2:
                return EnumC2189041Alq.VAR_LINK_MIC_LAYOUT_DRIVE_STEP_PARSE_SEI;
            case 3:
                return EnumC2189041Alq.VAR_LINK_MIC_LAYOUT_DRIVE_STEP_CALCU_LAYOUT;
            case 4:
                return EnumC2189041Alq.VAR_LINK_MIC_LAYOUT_DRIVE_STEP_RENDER_LAYOUT;
            case 5:
                return EnumC2189041Alq.VAR_LINK_MIC_LAYOUT_DRIVE_STEP_PARSE_LAYOUT_INFO;
            case 6:
                return EnumC2189041Alq.VAR_LINK_MIC_LAYOUT_DRIVE_STEP_QUERY_LAYOUT_MODEL;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C2189011Aln.LIZ[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new C1954807lC();
        }
    }
}
