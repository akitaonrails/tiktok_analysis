package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC355950DxR {
    public static final EnumC355950DxR AUTO_ADJUST;
    public static final EnumC355950DxR BRIGHTNESS;
    public static final EnumC355950DxR COMBINE_ADJUST;
    public static final EnumC355950DxR CONTRAST;
    public static final EnumC355950DxR FADE;
    public static final EnumC355950DxR HSL;
    public static final EnumC355950DxR LIGHT_SENSATION;
    public static final /* synthetic */ EnumC355950DxR[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC355950DxR PARTICLE;
    public static final EnumC355950DxR SATURATION;
    public static final EnumC355950DxR SHADOW;
    public static final EnumC355950DxR SHARPEN;
    public static final EnumC355950DxR TEMPERATURE;
    public static final EnumC355950DxR TONE_TEMPERA;
    public static final EnumC355950DxR VIGNETTING;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;

    public static InterfaceC2044707zh<EnumC355950DxR> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC355950DxR enumC355950DxR = new EnumC355950DxR(0, "BRIGHTNESS", "brightness", NLEEditorJniJNI.NLEFilterName_getBRIGHTNESS(), "brightness_intensity", true);
        BRIGHTNESS = enumC355950DxR;
        EnumC355950DxR enumC355950DxR2 = new EnumC355950DxR(1, "TONE_TEMPERA", "tone_temperature", NLEEditorJniJNI.NLEFilterName_getTONE(), "tint_intensity", true);
        TONE_TEMPERA = enumC355950DxR2;
        String str = null;
        int i = 12;
        EnumC355950DxR enumC355950DxR3 = new EnumC355950DxR("HSL", "hsl", 2, NLEEditorJniJNI.NLEFilterName_getHSL(), str, i);
        HSL = enumC355950DxR3;
        EnumC355950DxR enumC355950DxR4 = new EnumC355950DxR("PARTICLE", "particle", 3, NLEEditorJniJNI.NLEFilterName_getPARTICLE(), str, i);
        PARTICLE = enumC355950DxR4;
        EnumC355950DxR enumC355950DxR5 = new EnumC355950DxR("VIGNETTING", "vignetting", 4, NLEEditorJniJNI.NLEFilterName_getVIGNETTING(), str, i);
        VIGNETTING = enumC355950DxR5;
        EnumC355950DxR enumC355950DxR6 = new EnumC355950DxR(5, "LIGHT_SENSATION", "light_sensation", NLEEditorJniJNI.NLEFilterName_getLIGHT_SENSATION(), "light_sensation_intensity", true);
        LIGHT_SENSATION = enumC355950DxR6;
        EnumC355950DxR enumC355950DxR7 = new EnumC355950DxR(6, "FADE", "fade", NLEEditorJniJNI.NLEFilterName_getFADE(), "fade_intensity", true);
        FADE = enumC355950DxR7;
        EnumC355950DxR enumC355950DxR8 = new EnumC355950DxR("SHARPEN", "sharpen", 7, NLEEditorJniJNI.NLEFilterName_getSHARPEN(), (String) null, 12);
        SHARPEN = enumC355950DxR8;
        EnumC355950DxR enumC355950DxR9 = new EnumC355950DxR(8, "SATURATION", "saturation", NLEEditorJniJNI.NLEFilterName_getSATURATION(), "saturation_intensity", true);
        SATURATION = enumC355950DxR9;
        EnumC355950DxR enumC355950DxR10 = new EnumC355950DxR(9, "CONTRAST", "contrast", NLEEditorJniJNI.NLEFilterName_getCONTRACT(), "contrast_intensity", true);
        CONTRAST = enumC355950DxR10;
        EnumC355950DxR enumC355950DxR11 = new EnumC355950DxR(10, "TEMPERATURE", "temperature", NLEEditorJniJNI.NLEFilterName_getTEMPERATURE(), "temperature_intensity", true);
        TEMPERATURE = enumC355950DxR11;
        EnumC355950DxR enumC355950DxR12 = new EnumC355950DxR(11, "SHADOW", "shadow", NLEEditorJniJNI.NLEFilterName_getSHADOW(), "shadow_intensity", true);
        SHADOW = enumC355950DxR12;
        int i2 = 12;
        EnumC355950DxR enumC355950DxR13 = new EnumC355950DxR("COMBINE_ADJUST", "combine_adjust", i2, "combine_adjust", (String) null, i2);
        COMBINE_ADJUST = enumC355950DxR13;
        EnumC355950DxR enumC355950DxR14 = new EnumC355950DxR("AUTO_ADJUST", "auto_adjust", 13, "auto_adjust", "auto_adjust_intensity", 8);
        AUTO_ADJUST = enumC355950DxR14;
        EnumC355950DxR[] enumC355950DxRArr = {enumC355950DxR, enumC355950DxR2, enumC355950DxR3, enumC355950DxR4, enumC355950DxR5, enumC355950DxR6, enumC355950DxR7, enumC355950DxR8, enumC355950DxR9, enumC355950DxR10, enumC355950DxR11, enumC355950DxR12, enumC355950DxR13, enumC355950DxR14};
        LLILZIL = enumC355950DxRArr;
        LLILZLL = new C2254308sP(enumC355950DxRArr);
    }

    public static EnumC355950DxR[] values() {
        return (EnumC355950DxR[]) LLILZIL.clone();
    }

    public final String getAdjustParamsName() {
        return this.LLILLL;
    }

    public final String getEffectName() {
        return this.LL;
    }

    public final String getNleName() {
        return this.LLILLJJLI;
    }

    public final boolean getUseCombinePackage() {
        return this.LLILZ;
    }

    public static EnumC355950DxR valueOf(String str) {
        return (EnumC355950DxR) C08FF.LIZ(EnumC355950DxR.class, str);
    }

    public /* synthetic */ EnumC355950DxR(String str, String str2, int i, String str3, String str4, int i2) {
        this(i, str, str2, str3, (i2 & 4) != 0 ? null : str4, false);
    }

    public EnumC355950DxR(int i, String str, String str2, String str3, String str4, boolean z) {
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = str4;
        this.LLILZ = z;
    }
}
