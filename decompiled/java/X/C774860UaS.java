package X;

import Y.ARunnableS112S0100000_12;
import android.os.SystemClock;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.broadcast.record.LiveRecordManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774860UaS implements InterfaceC774810UaN {
    public final FrameLayout LL;
    public C0GXM LLILLJJLI;
    public C775350UbF LLILLL;
    public RunnableC776140UcW LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC774810UaN
    public final void LIZJ() {
    }

    @Override // X.InterfaceC774810UaN
    public final void LIZ() {
        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS112S0100000_12(this, 441));
    }

    @Override // X.InterfaceC774810UaN
    public final void LIZLLL() {
        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS112S0100000_12(this, 442));
    }

    @Override // X.InterfaceC774810UaN
    public final void LJ() {
        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS112S0100000_12(this, 442));
    }

    public C774860UaS(FrameLayout frameLayout) {
        this.LL = frameLayout;
        LiveRecordManager.LL.getClass();
        ((ArrayList) LiveRecordManager.LLJIJIL).add(this);
    }

    public final void LIZIZ(String str) {
        C500260Jjc.LJIILIIL(this.LLILLJJLI);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_record_floating_ball_show_duration");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf((SystemClock.uptimeMillis() - C774850UaR.LIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "show_duration");
        if (Intrinsics.LJFF(C774850UaR.LIZIZ, "live_end")) {
            c474500IjALIZ.LJJII("live_end", "close_reason");
            C774850UaR.LIZIZ = null;
        } else {
            c474500IjALIZ.LJJII(str, "close_reason");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC774810UaN
    public final void LJFF(String str) {
        RunnableC776140UcW runnableC776140UcW = this.LLILZ;
        if (runnableC776140UcW != null) {
            runnableC776140UcW.getTvRecordTimeFromXml().setText(str);
        }
    }
}
