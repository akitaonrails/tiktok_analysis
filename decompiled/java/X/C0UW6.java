package X;

import com.bytedance.android.livesdk.game.broadcast.setting.MobileHighPingAdjustBitrateInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0UW6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UW6 {
    public static final Map<C0UW5, C0UWD> LIZ;
    public static final AtomicBoolean LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ = linkedHashMap;
        LIZIZ = new AtomicBoolean(false);
        linkedHashMap.put(C0UW5.HIGH_PING_TIPS_MODULE, new C779130UhL());
        if (MobileHighPingAdjustBitrateInfo.INSTANCE.isEnableAdjustBitrateScope()) {
            linkedHashMap.put(C0UW5.HIGH_PING_BITRATE_ADJUST_MODULE, new C779120UhK());
        }
    }
}
