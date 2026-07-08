package X;

import Y.ARunnableS26S0101000_15;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostFeedMatchRetryIntervalSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0bL5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969610bL5 {
    public InterfaceC969600bL4 LIZ;
    public final C11NJ LIZIZ = new C11NJ();
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public int LIZLLL;

    public final void LIZ(int i) {
        if (this.LIZ == null) {
            C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", "checkBattleInfo, return by viewInterface == null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkBattleInfo, type = ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = this.LIZLLL;
        if (i2 == 0) {
            C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", "checkBattleInfo, return by remainedGetBattleInfoRetryCount == 0");
            return;
        }
        this.LIZLLL = i2 - 1;
        C786410Ut5.LJLIIL(LiveCohostFeedMatchRetryIntervalSetting.INSTANCE.getValue(), this.LIZJ, new ARunnableS26S0101000_15(i, this, 6));
    }
}
