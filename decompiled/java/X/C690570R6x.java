package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690570R6x extends C09AY implements Function0<WindowOnFrameMetricsAvailableListenerC690580R6y> {
    public C690570R6x() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final WindowOnFrameMetricsAvailableListenerC690580R6y invoke() {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            C690560R6w c690560R6w = C690560R6w.LIZ;
            return new WindowOnFrameMetricsAvailableListenerC690580R6y(new C0RCP(c690560R6w), new C0RCQ(c690560R6w));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UIDetectManager init error: windowFrameListener crash ");
            sbLIZ.append(e.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
