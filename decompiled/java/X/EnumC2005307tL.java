package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2005307tL {
    public static final EnumC2005307tL GUEST_WAVE_BLOCK;
    public static final EnumC2005307tL GUEST_WAVE_FPS_REDUCE;
    public static final EnumC2005307tL LINK_MIC_BLUR_BLOCK;
    public static final /* synthetic */ EnumC2005307tL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2005307tL PK_ANIMATION_DEGRADE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2005307tL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2005307tL enumC2005307tL = new EnumC2005307tL("GUEST_WAVE_FPS_REDUCE", 0, "guest_wave_fps_reduce");
        GUEST_WAVE_FPS_REDUCE = enumC2005307tL;
        EnumC2005307tL enumC2005307tL2 = new EnumC2005307tL("GUEST_WAVE_BLOCK", 1, "guest_wave_block");
        GUEST_WAVE_BLOCK = enumC2005307tL2;
        EnumC2005307tL enumC2005307tL3 = new EnumC2005307tL("LINK_MIC_BLUR_BLOCK", 2, "link_mic_bg_blur_block");
        LINK_MIC_BLUR_BLOCK = enumC2005307tL3;
        EnumC2005307tL enumC2005307tL4 = new EnumC2005307tL("PK_ANIMATION_DEGRADE", 3, "pk_animation_degrade");
        PK_ANIMATION_DEGRADE = enumC2005307tL4;
        EnumC2005307tL[] enumC2005307tLArr = {enumC2005307tL, enumC2005307tL2, enumC2005307tL3, enumC2005307tL4};
        LLILLJJLI = enumC2005307tLArr;
        LLILLL = new C2254308sP(enumC2005307tLArr);
    }

    public static EnumC2005307tL[] values() {
        return (EnumC2005307tL[]) LLILLJJLI.clone();
    }

    public final String getFeatureName() {
        return this.LL;
    }

    public static EnumC2005307tL valueOf(String str) {
        return (EnumC2005307tL) C08FF.LIZ(EnumC2005307tL.class, str);
    }

    public EnumC2005307tL(String str, int i, String str2) {
        this.LL = str2;
    }
}
