package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dB9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1040330dB9 {
    public static final EnumC1040330dB9 LLILLJJLI;
    public static final EnumC1040330dB9 LLILLL;
    public static final EnumC1040330dB9 LLILZ;
    public static final EnumC1040330dB9 LLILZIL;
    public static final /* synthetic */ EnumC1040330dB9[] LLILZLL;
    public final String LL;

    static {
        EnumC1040330dB9 enumC1040330dB9 = new EnumC1040330dB9("CLOSE", 0, "close");
        LLILLJJLI = enumC1040330dB9;
        EnumC1040330dB9 enumC1040330dB92 = new EnumC1040330dB9("SLIDE_CLOSE", 1, "slide_close");
        LLILLL = enumC1040330dB92;
        EnumC1040330dB9 enumC1040330dB93 = new EnumC1040330dB9("CLICK_PRIVACY", 2, "click_privacy");
        LLILZ = enumC1040330dB93;
        EnumC1040330dB9 enumC1040330dB94 = new EnumC1040330dB9("CLICK_ADS_AND_YOUR_DATA", 3, "click_ads_and_your_data");
        LLILZIL = enumC1040330dB94;
        EnumC1040330dB9[] enumC1040330dB9Arr = {enumC1040330dB9, enumC1040330dB92, enumC1040330dB93, enumC1040330dB94};
        LLILZLL = enumC1040330dB9Arr;
        new C2254308sP(enumC1040330dB9Arr);
    }

    public static EnumC1040330dB9[] values() {
        return (EnumC1040330dB9[]) LLILZLL.clone();
    }

    public static EnumC1040330dB9 valueOf(String str) {
        return (EnumC1040330dB9) C08FF.LIZ(EnumC1040330dB9.class, str);
    }

    public EnumC1040330dB9(String str, int i, String str2) {
        this.LL = str2;
    }
}
