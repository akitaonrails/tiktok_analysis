package X;

import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Dyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C356680Dyc {
    public static final Map<String, SoundEffect> LIZ = new LinkedHashMap();

    public static void LIZ(SoundEffect soundEffect) {
        if (LIZIZ(String.valueOf(soundEffect.id)) == null) {
            LIZ.put(String.valueOf(soundEffect.id), SoundEffect.LIZ(soundEffect));
        }
    }

    public static SoundEffect LIZIZ(String str) {
        SoundEffect soundEffect;
        Map<String, SoundEffect> map = LIZ;
        if (!map.isEmpty() && str != null && str.length() != 0 && map.containsKey(str) && (soundEffect = (SoundEffect) ((LinkedHashMap) map).get(str)) != null) {
            return SoundEffect.LIZ(soundEffect);
        }
        return null;
    }
}
