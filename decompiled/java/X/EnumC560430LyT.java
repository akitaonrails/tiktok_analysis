package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC560430LyT {
    public static final EnumC560430LyT APP_RESUME;
    public static final EnumC560430LyT CONTINUE_POPUP;
    public static final EnumC560430LyT EDIT_DRAFT;
    public static final /* synthetic */ EnumC560430LyT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC560430LyT OTHERS;
    public static final EnumC560430LyT SCREEN_OPEN;
    public static final EnumC560430LyT SHOOT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC560430LyT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC560430LyT enumC560430LyT = new EnumC560430LyT("SHOOT", 0, "shoot");
        SHOOT = enumC560430LyT;
        EnumC560430LyT enumC560430LyT2 = new EnumC560430LyT("EDIT_DRAFT", 1, "edit_draft");
        EDIT_DRAFT = enumC560430LyT2;
        EnumC560430LyT enumC560430LyT3 = new EnumC560430LyT("APP_RESUME", 2, "app_resume");
        APP_RESUME = enumC560430LyT3;
        EnumC560430LyT enumC560430LyT4 = new EnumC560430LyT("SCREEN_OPEN", 3, "screen_open");
        SCREEN_OPEN = enumC560430LyT4;
        EnumC560430LyT enumC560430LyT5 = new EnumC560430LyT("CONTINUE_POPUP", 4, "continue_popup");
        CONTINUE_POPUP = enumC560430LyT5;
        EnumC560430LyT enumC560430LyT6 = new EnumC560430LyT("OTHERS", 5, "others");
        OTHERS = enumC560430LyT6;
        EnumC560430LyT[] enumC560430LyTArr = {enumC560430LyT, enumC560430LyT2, enumC560430LyT3, enumC560430LyT4, enumC560430LyT5, enumC560430LyT6};
        LLILLJJLI = enumC560430LyTArr;
        LLILLL = new C2254308sP(enumC560430LyTArr);
    }

    public static EnumC560430LyT[] values() {
        return (EnumC560430LyT[]) LLILLJJLI.clone();
    }

    public final String getWay() {
        return this.LL;
    }

    public static EnumC560430LyT valueOf(String str) {
        return (EnumC560430LyT) C08FF.LIZ(EnumC560430LyT.class, str);
    }

    public EnumC560430LyT(String str, int i, String str2) {
        this.LL = str2;
    }
}
