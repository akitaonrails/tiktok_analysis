package X;

/* JADX INFO: renamed from: X.1DM0, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1DM0 {
    Unknown(-1),
    AiCutOutClipFilter(0),
    AmazingEffect(1),
    AudioDsp(2),
    AudioEffect(3),
    AudioFade(4),
    AudioLoudnessBalanceFilter(5),
    AudioNoiseFilter(6),
    AudioPreprocessFilter(7),
    AudioSamiFilter(8),
    AudioVolume(9),
    AudioSpeed(10),
    BefColor(11),
    BefEffect(12),
    ColorHslFilter(13),
    Composer(14),
    EmojiSticker(15),
    LeaderSecurityDetect(16),
    HdrEnhancement(17),
    ImageTransformFilter(18),
    InfoSticker(19),
    LensHdr(20),
    LensOneKeyHdr(21),
    Makeup(22),
    MusicSrtSticker(23),
    StickerAnimation(24),
    StickerTemplate(25),
    Stream(26),
    TextSticker(27),
    Transform(28),
    VideoAnimation(29),
    VideoCanvas(30),
    VideoCrop(31),
    VideoStableFilter(32),
    VideoStableFilterEx(33),
    VideoCanvasTransformAnimationFilter(34),
    VideoBlur(35),
    LensVFI(36),
    MotionBlur(37),
    CustomPreFilter(38),
    CustomSwingFilter(39),
    CustomPostFilter(40),
    MagnifierFilter(41),
    PreviewTransformFilter(42),
    BrushSticker(43),
    SAMIProcessorFilter(44),
    LensDeflicker(45),
    ScriptSticker(46),
    LayerSticker(47);

    public final int value;

    public static C1DM0 valueOf(String str) {
        return (C1DM0) C08FF.LIZ(C1DM0.class, str);
    }

    C1DM0(int i) {
        this.value = i;
    }
}
