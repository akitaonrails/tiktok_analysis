package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2249711D3p {
    public static final EnumC2249711D3p Default;
    public static final EnumC2249711D3p Favorite;
    public static final EnumC2249711D3p INVITE_RECOMMENDATION_MIX;
    public static final EnumC2249711D3p Invitation;
    public static final /* synthetic */ EnumC2249711D3p[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2249711D3p Recommendation;
    public static final EnumC2249711D3p ReplyPanel;
    public static final EnumC2249711D3p StickerPanel;
    public static final EnumC2249711D3p TextToQuestion;

    public static InterfaceC2044707zh<EnumC2249711D3p> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2249711D3p enumC2249711D3p = new EnumC2249711D3p("TextToQuestion", 0);
        TextToQuestion = enumC2249711D3p;
        EnumC2249711D3p enumC2249711D3p2 = new EnumC2249711D3p("StickerPanel", 1);
        StickerPanel = enumC2249711D3p2;
        EnumC2249711D3p enumC2249711D3p3 = new EnumC2249711D3p("Recommendation", 2);
        Recommendation = enumC2249711D3p3;
        EnumC2249711D3p enumC2249711D3p4 = new EnumC2249711D3p("INVITE_RECOMMENDATION_MIX", 3);
        INVITE_RECOMMENDATION_MIX = enumC2249711D3p4;
        EnumC2249711D3p enumC2249711D3p5 = new EnumC2249711D3p("Invitation", 4);
        Invitation = enumC2249711D3p5;
        EnumC2249711D3p enumC2249711D3p6 = new EnumC2249711D3p("Favorite", 5);
        Favorite = enumC2249711D3p6;
        EnumC2249711D3p enumC2249711D3p7 = new EnumC2249711D3p("ReplyPanel", 6);
        ReplyPanel = enumC2249711D3p7;
        EnumC2249711D3p enumC2249711D3p8 = new EnumC2249711D3p("Default", 7);
        Default = enumC2249711D3p8;
        EnumC2249711D3p[] enumC2249711D3pArr = {enumC2249711D3p, enumC2249711D3p2, enumC2249711D3p3, enumC2249711D3p4, enumC2249711D3p5, enumC2249711D3p6, enumC2249711D3p7, enumC2249711D3p8};
        LL = enumC2249711D3pArr;
        LLILLJJLI = new C2254308sP(enumC2249711D3pArr);
    }

    public static EnumC2249711D3p[] values() {
        return (EnumC2249711D3p[]) LL.clone();
    }

    public final String getMobValue() {
        switch (C2249721D3q.LIZ[ordinal()]) {
            case 1:
                return "text_to_question";
            case 2:
                return "sticker_panel";
            case 3:
                return "recommendation";
            case 4:
                return "invitation";
            case 5:
                return "invite_recommendation_mix";
            case 6:
                return "favorite";
            case 7:
                return "reply_panel";
            case 8:
                return "default";
            default:
                throw new C1954807lC();
        }
    }

    public static EnumC2249711D3p valueOf(String str) {
        return (EnumC2249711D3p) C08FF.LIZ(EnumC2249711D3p.class, str);
    }

    public EnumC2249711D3p(String str, int i) {
    }
}
