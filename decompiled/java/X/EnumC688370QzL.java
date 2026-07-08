package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC688370QzL {
    public static final EnumC688370QzL BACK_FROM_AUTHOR_PROFILE_PAGE;
    public static final EnumC688370QzL FAVORITE;
    public static final EnumC688370QzL FOLLOW_AUTHOR;
    public static final /* synthetic */ EnumC688370QzL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC688370QzL REACH_PLAY_PROGRESS_THRESHOLD;
    public static final EnumC688370QzL SHARE_VIDEO;

    public static InterfaceC2044707zh<EnumC688370QzL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC688370QzL enumC688370QzL = new EnumC688370QzL("FAVORITE", 0);
        FAVORITE = enumC688370QzL;
        EnumC688370QzL enumC688370QzL2 = new EnumC688370QzL("SHARE_VIDEO", 1);
        SHARE_VIDEO = enumC688370QzL2;
        EnumC688370QzL enumC688370QzL3 = new EnumC688370QzL("FOLLOW_AUTHOR", 2);
        FOLLOW_AUTHOR = enumC688370QzL3;
        EnumC688370QzL enumC688370QzL4 = new EnumC688370QzL("REACH_PLAY_PROGRESS_THRESHOLD", 3);
        REACH_PLAY_PROGRESS_THRESHOLD = enumC688370QzL4;
        EnumC688370QzL enumC688370QzL5 = new EnumC688370QzL("BACK_FROM_AUTHOR_PROFILE_PAGE", 4);
        BACK_FROM_AUTHOR_PROFILE_PAGE = enumC688370QzL5;
        EnumC688370QzL[] enumC688370QzLArr = {enumC688370QzL, enumC688370QzL2, enumC688370QzL3, enumC688370QzL4, enumC688370QzL5};
        LL = enumC688370QzLArr;
        LLILLJJLI = new C2254308sP(enumC688370QzLArr);
    }

    public static EnumC688370QzL[] values() {
        return (EnumC688370QzL[]) LL.clone();
    }

    public static EnumC688370QzL valueOf(String str) {
        return (EnumC688370QzL) C08FF.LIZ(EnumC688370QzL.class, str);
    }

    public EnumC688370QzL(String str, int i) {
    }
}
