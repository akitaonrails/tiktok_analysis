package X;

import com.bytedance.android.livesdk.broadcast.preview.animation.manager.PreviewAnimationConfig;
import com.bytedance.android.livesdk.broadcast.preview.animation.manager.PreviewAnimationConfigSetting;
import com.bytedance.android.livesdk.broadcast.preview.animation.manager.PreviewAnimationTask;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0UI9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UI9 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(264));
    public static final Map<String, Boolean> LIZIZ = new HashMap();

    public static PriorityQueue LIZ() {
        return (PriorityQueue) LIZ.getValue();
    }

    public static void LIZLLL() {
        Object c098200Yq;
        C0UIB c0uib;
        try {
            if (((HashMap) LIZIZ).size() == PreviewAnimationConfigSetting.INSTANCE.activeAnimationSize() && (!LIZ().isEmpty())) {
                PreviewAnimationTask previewAnimationTask = (PreviewAnimationTask) LIZ().poll();
                if (previewAnimationTask != null && (c0uib = previewAnimationTask.listener) != null) {
                    c0uib.show();
                }
                Iterator it2 = LIZ().iterator();
                while (it2.hasNext()) {
                    C0UIB c0uib2 = ((PreviewAnimationTask) it2.next()).listener;
                    if (c0uib2 != null) {
                        c0uib2.LIZ();
                    }
                }
                ((HashMap) LIZIZ).clear();
                LIZ().clear();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C0IB2.LIZ());
            sbLIZ.append(", ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C20441214yg.LJ("PreviewAnimationToolManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZIZ(C0UI4 c0ui4) {
        if (PreviewAnimationConfigSetting.INSTANCE.isActive(c0ui4.getKey())) {
            ((HashMap) LIZIZ).put(c0ui4.getKey(), Boolean.FALSE);
            LIZLLL();
        }
    }

    public static void LIZJ(C0UI4 c0ui4, C0UIB c0uib) {
        PreviewAnimationConfig config = PreviewAnimationConfigSetting.INSTANCE.getConfig(c0ui4.getKey());
        if (config == null) {
            return;
        }
        LIZ().add(new PreviewAnimationTask(c0uib, config.priority, c0ui4.getKey()));
        ((HashMap) LIZIZ).put(c0ui4.getKey(), Boolean.TRUE);
        LIZLLL();
    }
}
