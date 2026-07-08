package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1904240zeY {
    public static final EnumC1904240zeY FilterComment;
    public static final EnumC1904240zeY FilterFollow;
    public static final EnumC1904240zeY FilterFromTiktok;
    public static final EnumC1904240zeY FilterLike;
    public static final EnumC1904240zeY FilterMention;
    public static final EnumC1904240zeY FilterTimelineAll;
    public static final EnumC1904240zeY FilterTypeAllExceptFollow;
    public static final EnumC1904240zeY FilterTypeAllExceptFollowAndShop;
    public static final EnumC1904240zeY FilterTypeFollowAndFollowRequest;
    public static final EnumC1904240zeY FilterTypeProfileViewer;
    public static final EnumC1904240zeY FilterTypeQA;
    public static final EnumC1904240zeY FilterTypeShop;
    public static final /* synthetic */ EnumC1904240zeY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1904240zeY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1904240zeY enumC1904240zeY = new EnumC1904240zeY("FilterTimelineAll", 0);
        FilterTimelineAll = enumC1904240zeY;
        EnumC1904240zeY enumC1904240zeY2 = new EnumC1904240zeY("FilterLike", 1);
        FilterLike = enumC1904240zeY2;
        EnumC1904240zeY enumC1904240zeY3 = new EnumC1904240zeY("FilterComment", 2);
        FilterComment = enumC1904240zeY3;
        EnumC1904240zeY enumC1904240zeY4 = new EnumC1904240zeY("FilterMention", 3);
        FilterMention = enumC1904240zeY4;
        EnumC1904240zeY enumC1904240zeY5 = new EnumC1904240zeY("FilterFollow", 4);
        FilterFollow = enumC1904240zeY5;
        EnumC1904240zeY enumC1904240zeY6 = new EnumC1904240zeY("FilterFromTiktok", 5);
        FilterFromTiktok = enumC1904240zeY6;
        EnumC1904240zeY enumC1904240zeY7 = new EnumC1904240zeY("FilterTypeQA", 6);
        FilterTypeQA = enumC1904240zeY7;
        EnumC1904240zeY enumC1904240zeY8 = new EnumC1904240zeY("FilterTypeShop", 7);
        FilterTypeShop = enumC1904240zeY8;
        EnumC1904240zeY enumC1904240zeY9 = new EnumC1904240zeY("FilterTypeAllExceptFollow", 8);
        FilterTypeAllExceptFollow = enumC1904240zeY9;
        EnumC1904240zeY enumC1904240zeY10 = new EnumC1904240zeY("FilterTypeFollowAndFollowRequest", 9);
        FilterTypeFollowAndFollowRequest = enumC1904240zeY10;
        EnumC1904240zeY enumC1904240zeY11 = new EnumC1904240zeY("FilterTypeProfileViewer", 10);
        FilterTypeProfileViewer = enumC1904240zeY11;
        EnumC1904240zeY enumC1904240zeY12 = new EnumC1904240zeY("FilterTypeAllExceptFollowAndShop", 11);
        FilterTypeAllExceptFollowAndShop = enumC1904240zeY12;
        EnumC1904240zeY[] enumC1904240zeYArr = {enumC1904240zeY, enumC1904240zeY2, enumC1904240zeY3, enumC1904240zeY4, enumC1904240zeY5, enumC1904240zeY6, enumC1904240zeY7, enumC1904240zeY8, enumC1904240zeY9, enumC1904240zeY10, enumC1904240zeY11, enumC1904240zeY12};
        LL = enumC1904240zeYArr;
        LLILLJJLI = new C2254308sP(enumC1904240zeYArr);
    }

    public static EnumC1904240zeY[] values() {
        return (EnumC1904240zeY[]) LL.clone();
    }

    public static EnumC1904240zeY valueOf(String str) {
        return (EnumC1904240zeY) C08FF.LIZ(EnumC1904240zeY.class, str);
    }

    public EnumC1904240zeY(String str, int i) {
    }
}
