package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0STc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC721820STc {
    public static final EnumC721820STc CLICK_HEAD;
    public static final EnumC721820STc CLICK_NAME;
    public static final EnumC721820STc CLICK_REC_LABEL;
    public static final /* synthetic */ EnumC721820STc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC721820STc SLIDE_LEFT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC721820STc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC721820STc enumC721820STc = new EnumC721820STc("CLICK_REC_LABEL", 0, "click_rec_label");
        CLICK_REC_LABEL = enumC721820STc;
        EnumC721820STc enumC721820STc2 = new EnumC721820STc("CLICK_HEAD", 1, "click_head");
        CLICK_HEAD = enumC721820STc2;
        EnumC721820STc enumC721820STc3 = new EnumC721820STc("SLIDE_LEFT", 2, "slide_left");
        SLIDE_LEFT = enumC721820STc3;
        EnumC721820STc enumC721820STc4 = new EnumC721820STc("CLICK_NAME", 3, "click_name");
        CLICK_NAME = enumC721820STc4;
        EnumC721820STc[] enumC721820STcArr = {enumC721820STc, enumC721820STc2, enumC721820STc3, enumC721820STc4};
        LLILLJJLI = enumC721820STcArr;
        LLILLL = new C2254308sP(enumC721820STcArr);
    }

    public static EnumC721820STc[] values() {
        return (EnumC721820STc[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC721820STc valueOf(String str) {
        return (EnumC721820STc) C08FF.LIZ(EnumC721820STc.class, str);
    }

    public EnumC721820STc(String str, int i, String str2) {
        this.LL = str2;
    }
}
