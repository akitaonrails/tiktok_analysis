package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostModeSwitchLoopCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostModeSwitchLoopIntervalSetting;

/* JADX INFO: renamed from: X.0aps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class RunnableC950260aps implements Runnable {
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC921780a5w LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final int LL = LiveCoHostModeSwitchLoopCountSetting.getValue();
    public final long LLILLL = LiveCoHostModeSwitchLoopIntervalSetting.getValue();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MultiHostCrossAdapterImpl@dfc5.onNeedJoinChannel$closeCallback$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiHostCrossAdapterImpl@dfc5.onNeedJoinChannel$closeCallback$1");
    }

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNeedJoinChannel: closeCallback.run(), currentCount = ");
        sbLIZ.append(this.LLILLJJLI);
        C20441214yg.LJIIIZ("MultiHostCrossAdapter", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (!(interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LJJLIIJ() : false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onNeedJoinChannel: joinChannel(), currentCount = ");
            sbLIZ2.append(this.LLILLJJLI);
            C20441214yg.LJIIIZ("MultiHostCrossAdapter", C2188811AlT.LIZIZ(sbLIZ2));
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.LLILZ.joinChannel();
            new C955440ayE().LJJIJIL(1, this.LLILLJJLI, jUptimeMillis - this.LLILZIL);
            return;
        }
        if (this.LLILLJJLI < this.LL) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onNeedJoinChannel: postDelayed, currentCount = ");
            sbLIZ3.append(this.LLILLJJLI);
            C20441214yg.LJIIIZ("MultiHostCrossAdapter", C2188811AlT.LIZIZ(sbLIZ3));
            C473410IhP.LIZJ(this, this.LLILLL);
            this.LLILLJJLI++;
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onNeedJoinChannel: timeout, currentCount = ");
        sbLIZ4.append(this.LLILLJJLI);
        C20441214yg.LJIIIZ("MultiHostCrossAdapter", C2188811AlT.LIZIZ(sbLIZ4));
        C1304660k3U.LIZ.LIZ(1098, "cohost_mode_switch_timeout", null);
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        this.LLILZ.joinChannel();
        new C955440ayE().LJJIJIL(2, this.LLILLJJLI, jUptimeMillis2 - this.LLILZIL);
    }

    public RunnableC950260aps(C965030bDh c965030bDh, long j) {
        this.LLILZ = c965030bDh;
        this.LLILZIL = j;
    }
}
