package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0fDB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118470fDB {
    public static final Map<C0U56, Long> LIZ = new EnumMap(C0U56.class);

    public static final void LIZ(C0U56 c0u56) {
        if (PanelOpenCostTimesSetting.INSTANCE.getValue().mSwitch && c0u56 != C0U56.DEFAULT && c0u56 != null) {
            ((EnumMap) LIZ).put(c0u56, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }
}
