package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.player.audio.EcAudioPlayer;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0XRL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XRL {
    public static EcAudioPlayer LIZ(LifecycleOwner lifecycleOwner) {
        HashMap<LifecycleOwner, EcAudioPlayer> map = EcAudioPlayer.LLILZIL;
        EcAudioPlayer ecAudioPlayer = map.get(lifecycleOwner);
        if (ecAudioPlayer == null) {
            EcAudioPlayer ecAudioPlayer2 = new EcAudioPlayer(lifecycleOwner);
            map.put(lifecycleOwner, ecAudioPlayer2);
            return ecAudioPlayer2;
        }
        return ecAudioPlayer;
    }
}
