package X;

import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.api.IReflect;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0oSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474190oSv {
    public static Field LIZ;

    public static void LIZ(String str, Surface surface) {
        IReflect iReflect = (IReflect) InjectedConfigManager.getConfig(IReflect.class);
        if (iReflect == null) {
            return;
        }
        try {
            if (LIZ == null) {
                LIZ = iReflect.getField(Surface.class, "mName");
            }
            if (LIZ != null && ((Boolean) C1474810oTv.LJIIIZ.getValue()).booleanValue()) {
                iReflect.updateField(surface, LIZ, str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
