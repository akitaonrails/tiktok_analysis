package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18mH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21383518mH {
    public static final EnumC21383518mH CANCEL;
    public static final EnumC21383518mH CLICK_PENCIL;
    public static final EnumC21383518mH CLICK_SUBTITLE;
    public static final EnumC21383518mH DONE;
    public static final /* synthetic */ EnumC21383518mH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21383518mH PENCIL;
    public static final EnumC21383518mH SAVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21383518mH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21383518mH enumC21383518mH = new EnumC21383518mH("PENCIL", 0, "pencil");
        PENCIL = enumC21383518mH;
        EnumC21383518mH enumC21383518mH2 = new EnumC21383518mH("CLICK_PENCIL", 1, "click_pencil");
        CLICK_PENCIL = enumC21383518mH2;
        EnumC21383518mH enumC21383518mH3 = new EnumC21383518mH("CANCEL", 2, "cancel");
        CANCEL = enumC21383518mH3;
        EnumC21383518mH enumC21383518mH4 = new EnumC21383518mH("DONE", 3, "done");
        DONE = enumC21383518mH4;
        EnumC21383518mH enumC21383518mH5 = new EnumC21383518mH("SAVE", 4, "save");
        SAVE = enumC21383518mH5;
        EnumC21383518mH enumC21383518mH6 = new EnumC21383518mH("CLICK_SUBTITLE", 5, "click_subtitle");
        CLICK_SUBTITLE = enumC21383518mH6;
        EnumC21383518mH[] enumC21383518mHArr = {enumC21383518mH, enumC21383518mH2, enumC21383518mH3, enumC21383518mH4, enumC21383518mH5, enumC21383518mH6};
        LLILLJJLI = enumC21383518mHArr;
        LLILLL = new C2254308sP(enumC21383518mHArr);
    }

    public static EnumC21383518mH[] values() {
        return (EnumC21383518mH[]) LLILLJJLI.clone();
    }

    public final String getLoggingName() {
        return this.LL;
    }

    public static EnumC21383518mH valueOf(String str) {
        return (EnumC21383518mH) C08FF.LIZ(EnumC21383518mH.class, str);
    }

    public EnumC21383518mH(String str, int i, String str2) {
        this.LL = str2;
    }
}
