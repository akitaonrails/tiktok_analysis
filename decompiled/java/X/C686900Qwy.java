package X;

import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: renamed from: X.0Qwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686900Qwy extends C686870Qwv {
    public final Scene LJ;

    public C686900Qwy(BaseScreenAdaptScene baseScreenAdaptScene) {
        super(baseScreenAdaptScene.requireActivity());
        this.LJ = baseScreenAdaptScene;
    }

    @Override // X.C686870Qwv, X.C0QTN
    public final View LIZIZ(int i) {
        Context contextRequireSceneContext = this.LJ.requireSceneContext();
        if (C800870VbJ.LIZ()) {
            LinkedList<View> linkedList = this.LIZIZ.get(Integer.valueOf(i));
            if (linkedList != null) {
                synchronized (linkedList) {
                    try {
                        View viewPoll = linkedList.poll();
                        if (viewPoll != null) {
                            return viewPoll;
                        }
                        this.LIZIZ.remove(Integer.valueOf(i));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return C20742916Ex.LIZ(contextRequireSceneContext, i, new FrameLayout(contextRequireSceneContext), false, -1);
        }
        if (((Boolean) C800870VbJ.LIZIZ.getValue()).booleanValue()) {
            return C20742916Ex.LIZ(contextRequireSceneContext, i, new FrameLayout(contextRequireSceneContext), false, -1);
        }
        return C786410Ut5.Td(C786410Ut5.ne(contextRequireSceneContext), i, new FrameLayout(contextRequireSceneContext), false);
    }

    @Override // X.C686870Qwv, X.AbstractC686880Qww
    public final void LIZJ(C686940Qx2 c686940Qx2, long j) {
        if (!C800870VbJ.LIZ()) {
            return;
        }
        AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(this, c686940Qx2, 94);
        if (j > 0) {
            C786410Ut5.LJLIIL(j, C686950Qx3.LIZ, new ARunnableS110S0100000_10(awS411S0200000_10, 160));
        } else {
            C786410Ut5.LJJZZIII(C686950Qx3.LIZ, new ARunnableS110S0100000_10(awS411S0200000_10, 160));
        }
    }
}
