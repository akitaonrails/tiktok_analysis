package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782700wUW {
    public static final EnumC1782700wUW CAPTION_NOT_SHOWN_WHEN_CAPTION_SWITCH_ON;
    public static final EnumC1782700wUW CAPTION_SHOWN_WHEN_CAPTION_SWITCH_OFF;
    public static final /* synthetic */ EnumC1782700wUW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782700wUW MIXED;
    public static final EnumC1782700wUW TRANSLATION_SHOWN_WHEN_TRANSLATION_SWITCH_OFF;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1782700wUW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782700wUW enumC1782700wUW = new EnumC1782700wUW("CAPTION_SHOWN_WHEN_CAPTION_SWITCH_OFF", 0, "caption_shown_when_caption_switch_off");
        CAPTION_SHOWN_WHEN_CAPTION_SWITCH_OFF = enumC1782700wUW;
        EnumC1782700wUW enumC1782700wUW2 = new EnumC1782700wUW("TRANSLATION_SHOWN_WHEN_TRANSLATION_SWITCH_OFF", 1, "translation_shown_when_translation_switch_off");
        TRANSLATION_SHOWN_WHEN_TRANSLATION_SWITCH_OFF = enumC1782700wUW2;
        EnumC1782700wUW enumC1782700wUW3 = new EnumC1782700wUW("CAPTION_NOT_SHOWN_WHEN_CAPTION_SWITCH_ON", 2, "caption_not_shown_when_caption_switch_on");
        CAPTION_NOT_SHOWN_WHEN_CAPTION_SWITCH_ON = enumC1782700wUW3;
        EnumC1782700wUW enumC1782700wUW4 = new EnumC1782700wUW("MIXED", 3, "mixed");
        MIXED = enumC1782700wUW4;
        EnumC1782700wUW[] enumC1782700wUWArr = {enumC1782700wUW, enumC1782700wUW2, enumC1782700wUW3, enumC1782700wUW4};
        LLILLJJLI = enumC1782700wUWArr;
        LLILLL = new C2254308sP(enumC1782700wUWArr);
    }

    public static EnumC1782700wUW[] values() {
        return (EnumC1782700wUW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1782700wUW valueOf(String str) {
        return (EnumC1782700wUW) C08FF.LIZ(EnumC1782700wUW.class, str);
    }

    public EnumC1782700wUW(String str, int i, String str2) {
        this.LL = str2;
    }
}
