package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC714710S1t {
    public static final EnumC714710S1t CLICK_INPUT_BOX;
    public static final EnumC714710S1t CLICK_OUTER_EMOJI;
    public static final /* synthetic */ EnumC714710S1t[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC714710S1t> getEntries() {
        return LLILLL;
    }

    static {
        EnumC714710S1t enumC714710S1t = new EnumC714710S1t("CLICK_OUTER_EMOJI", 0, "click_outer_emoji");
        CLICK_OUTER_EMOJI = enumC714710S1t;
        EnumC714710S1t enumC714710S1t2 = new EnumC714710S1t("CLICK_INPUT_BOX", 1, "click_input_box");
        CLICK_INPUT_BOX = enumC714710S1t2;
        EnumC714710S1t[] enumC714710S1tArr = {enumC714710S1t, enumC714710S1t2};
        LLILLJJLI = enumC714710S1tArr;
        LLILLL = new C2254308sP(enumC714710S1tArr);
    }

    public static EnumC714710S1t[] values() {
        return (EnumC714710S1t[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC714710S1t valueOf(String str) {
        return (EnumC714710S1t) C08FF.LIZ(EnumC714710S1t.class, str);
    }

    public EnumC714710S1t(String str, int i, String str2) {
        this.LL = str2;
    }
}
