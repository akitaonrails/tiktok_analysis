package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Urt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC785670Urt {
    public static final EnumC785670Urt CAMPAIGN;
    public static final EnumC785670Urt DYNAMIC;
    public static final EnumC785670Urt GIFT_BAR;
    public static final EnumC785670Urt GO_LIVE;
    public static final EnumC785670Urt INTERACT;
    public static final /* synthetic */ EnumC785670Urt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC785670Urt OTHER;
    public static final EnumC785670Urt WISH_QUEUE_PAGE;

    public static InterfaceC2044707zh<EnumC785670Urt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC785670Urt enumC785670Urt = new EnumC785670Urt("GO_LIVE", 0);
        GO_LIVE = enumC785670Urt;
        EnumC785670Urt enumC785670Urt2 = new EnumC785670Urt("INTERACT", 1);
        INTERACT = enumC785670Urt2;
        EnumC785670Urt enumC785670Urt3 = new EnumC785670Urt("GIFT_BAR", 2);
        GIFT_BAR = enumC785670Urt3;
        EnumC785670Urt enumC785670Urt4 = new EnumC785670Urt("WISH_QUEUE_PAGE", 3);
        WISH_QUEUE_PAGE = enumC785670Urt4;
        EnumC785670Urt enumC785670Urt5 = new EnumC785670Urt("DYNAMIC", 4);
        DYNAMIC = enumC785670Urt5;
        EnumC785670Urt enumC785670Urt6 = new EnumC785670Urt("CAMPAIGN", 5);
        CAMPAIGN = enumC785670Urt6;
        EnumC785670Urt enumC785670Urt7 = new EnumC785670Urt("OTHER", 6);
        OTHER = enumC785670Urt7;
        EnumC785670Urt[] enumC785670UrtArr = {enumC785670Urt, enumC785670Urt2, enumC785670Urt3, enumC785670Urt4, enumC785670Urt5, enumC785670Urt6, enumC785670Urt7};
        LL = enumC785670UrtArr;
        LLILLJJLI = new C2254308sP(enumC785670UrtArr);
    }

    public static EnumC785670Urt[] values() {
        return (EnumC785670Urt[]) LL.clone();
    }

    public static EnumC785670Urt valueOf(String str) {
        return (EnumC785670Urt) C08FF.LIZ(EnumC785670Urt.class, str);
    }

    public EnumC785670Urt(String str, int i) {
    }
}
