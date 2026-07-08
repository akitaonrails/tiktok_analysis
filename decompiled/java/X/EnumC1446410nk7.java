package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1446410nk7 {
    public static final EnumC1446410nk7 EDIT_AUDIO_EFFECT;
    public static final EnumC1446410nk7 EDIT_RECORD_SOUND;
    public static final /* synthetic */ EnumC1446410nk7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1446410nk7 MUSIC;
    public static final EnumC1446410nk7 RECORD_UPLOAD_VIDEO_SOUND;
    public static final EnumC1446410nk7 RECORD_VIDEO_SOUND;
    public static final EnumC1446410nk7 UPLOAD_VIDEO_SOUND;
    public static final EnumC1446410nk7 VOLUME_NOT_MUTE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1446410nk7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1446410nk7 enumC1446410nk7 = new EnumC1446410nk7("RECORD_VIDEO_SOUND", 0, 1);
        RECORD_VIDEO_SOUND = enumC1446410nk7;
        EnumC1446410nk7 enumC1446410nk72 = new EnumC1446410nk7("UPLOAD_VIDEO_SOUND", 1, 2);
        UPLOAD_VIDEO_SOUND = enumC1446410nk72;
        EnumC1446410nk7 enumC1446410nk73 = new EnumC1446410nk7("EDIT_RECORD_SOUND", 2, 4);
        EDIT_RECORD_SOUND = enumC1446410nk73;
        EnumC1446410nk7 enumC1446410nk74 = new EnumC1446410nk7("VOLUME_NOT_MUTE", 3, 8);
        VOLUME_NOT_MUTE = enumC1446410nk74;
        EnumC1446410nk7 enumC1446410nk75 = new EnumC1446410nk7("MUSIC", 4, 16);
        MUSIC = enumC1446410nk75;
        EnumC1446410nk7 enumC1446410nk76 = new EnumC1446410nk7("EDIT_AUDIO_EFFECT", 5, 32);
        EDIT_AUDIO_EFFECT = enumC1446410nk76;
        EnumC1446410nk7 enumC1446410nk77 = new EnumC1446410nk7("RECORD_UPLOAD_VIDEO_SOUND", 6, 64);
        RECORD_UPLOAD_VIDEO_SOUND = enumC1446410nk77;
        EnumC1446410nk7[] enumC1446410nk7Arr = {enumC1446410nk7, enumC1446410nk72, enumC1446410nk73, enumC1446410nk74, enumC1446410nk75, enumC1446410nk76, enumC1446410nk77};
        LLILLJJLI = enumC1446410nk7Arr;
        LLILLL = new C2254308sP(enumC1446410nk7Arr);
    }

    public static EnumC1446410nk7[] values() {
        return (EnumC1446410nk7[]) LLILLJJLI.clone();
    }

    public final int getTag() {
        return this.LL;
    }

    public static EnumC1446410nk7 valueOf(String str) {
        return (EnumC1446410nk7) C08FF.LIZ(EnumC1446410nk7.class, str);
    }

    public EnumC1446410nk7(String str, int i, int i2) {
        this.LL = i2;
    }
}
