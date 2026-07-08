package X;

import android.os.Build;
import com.ss.android.ugc.feed.platform.ab.ComponentsUIShakeDetectConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ygG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1866860ygG extends C09AY implements Function0<Boolean> {
    public C1866860ygG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ComponentsUIShakeDetectConfig componentsUIShakeDetectConfigLIZIZ = C1866840ygE.LIZIZ();
        boolean z = false;
        if (componentsUIShakeDetectConfigLIZIZ != null && Intrinsics.LJFF(componentsUIShakeDetectConfigLIZIZ.enable, Boolean.TRUE) && Build.VERSION.SDK_INT >= 26) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
