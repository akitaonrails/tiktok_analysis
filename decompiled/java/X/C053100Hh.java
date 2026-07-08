package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSoundWaveImageUrlSetting;
import kotlin.text.a0;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: renamed from: X.00Hh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C053100Hh {
    public static final SoundWareEffectExtra LIZ;

    static {
        SoundWareEffectExtra soundWareEffectExtra = new SoundWareEffectExtra();
        soundWareEffectExtra.staticImageName = "sound_wave_default_static";
        soundWareEffectExtra.dynamicImageName = "sound_wave_default_dynamic";
        LIZ = soundWareEffectExtra;
    }

    public static String LIZ(String str) {
        if (str == null) {
            return "";
        }
        String url = MultiGuestSoundWaveImageUrlSetting.INSTANCE.getUrl(str);
        if (url == null || a0.LJJJIL(url)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getImageUrl, imageName: ");
            sbLIZ.append(str);
            sbLIZ.append(", url: null");
            C20441214yg.LJ("VoiceWaveImageUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
        return url;
    }
}
