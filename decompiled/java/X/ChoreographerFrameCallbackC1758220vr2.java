package X;

import android.view.Choreographer;
import com.ss.android.ugc.aweme.ecommerce.ab.EcMeaningfulMonitorNewStandardSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class ChoreographerFrameCallbackC1758220vr2 implements Choreographer.FrameCallback {
    public int LL;
    public final /* synthetic */ C1758210vr1 LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int iIntValue;
        int i = this.LL + 1;
        this.LL = i;
        Integer num = EcMeaningfulMonitorNewStandardSettings.LIZ().endFrameFp;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (i >= iIntValue - 1) {
            this.LLILLJJLI.LJIIIZ();
            Function0<Unit> function0 = this.LLILLL;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        C786410Ut5.v2().postFrameCallback(this);
    }

    public ChoreographerFrameCallbackC1758220vr2(C1758210vr1 c1758210vr1, Function0<Unit> function0) {
        this.LLILLJJLI = c1758210vr1;
        this.LLILLL = function0;
        System.currentTimeMillis();
    }
}
