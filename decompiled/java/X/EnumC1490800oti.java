package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1490800oti {
    public static final EnumC1490800oti BOTTOM_POPUP;
    public static final EnumC1490800oti CENTER_FADE;
    public static final /* synthetic */ EnumC1490800oti[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1490800oti NONE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1490800oti> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1490800oti enumC1490800oti = new EnumC1490800oti("NONE", 0, "none");
        NONE = enumC1490800oti;
        EnumC1490800oti enumC1490800oti2 = new EnumC1490800oti("CENTER_FADE", 1, "center_fade");
        CENTER_FADE = enumC1490800oti2;
        EnumC1490800oti enumC1490800oti3 = new EnumC1490800oti("BOTTOM_POPUP", 2, "bottom_popup");
        BOTTOM_POPUP = enumC1490800oti3;
        EnumC1490800oti[] enumC1490800otiArr = {enumC1490800oti, enumC1490800oti2, enumC1490800oti3};
        LLILLJJLI = enumC1490800otiArr;
        LLILLL = new C2254308sP(enumC1490800otiArr);
    }

    public static EnumC1490800oti[] values() {
        return (EnumC1490800oti[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1490800oti valueOf(String str) {
        return (EnumC1490800oti) C08FF.LIZ(EnumC1490800oti.class, str);
    }

    public EnumC1490800oti(String str, int i, String str2) {
        this.LL = str2;
    }
}
