package X;

import Y.ARunnableS28S0101000_17;
import android.os.SystemClock;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.wallet.LiveProbeReportForWallet;
import com.bytedance.android.livesdkapi.host.IProbeSDK;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fTX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1128610fTX extends C2217421BqW implements Function0<Unit> {
    public C1128610fTX(AbstractC1100450ek7 abstractC1100450ek7) {
        super(0, abstractC1100450ek7, C1128710fTh.class, "onGiftPanelReady", "onGiftPanelReady()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IProbeSDK iProbeSDK;
        LinearLayoutManager linearLayoutManager;
        C1128710fTh c1128710fTh = (C1128710fTh) this.receiver;
        if (c1128710fTh.LLZLLIL.compareAndSet(true, false)) {
            C1128590fTV.LJJIIJ = SystemClock.uptimeMillis() - C1130100fVw.LIZ.LJII;
            C1128590fTV.LJIILJJIL = SystemClock.uptimeMillis();
            RunnableC781530UlD runnableC781530UlD = c1128710fTh.LLJJIII;
            RecyclerView.LayoutManager layoutManager = runnableC781530UlD != null ? runnableC781530UlD.getLayoutManager() : null;
            if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int iFindLastVisibleItemPosition = (linearLayoutManager.findLastVisibleItemPosition() - linearLayoutManager.findFirstVisibleItemPosition()) + 1;
                C1128590fTV.LJJIIJZLJL = iFindLastVisibleItemPosition;
                if (C1128590fTV.LJJIJIIJI >= C1128590fTV.LJJIIJZLJL) {
                    C1128590fTV.LJJJI = SystemClock.uptimeMillis();
                }
                RunnableC781530UlD runnableC781530UlD2 = c1128710fTh.LLJJIII;
                if (runnableC781530UlD2 != null) {
                    HandlerHook.viewPostDelay(runnableC781530UlD2, new ARunnableS28S0101000_17(iFindLastVisibleItemPosition, c1128710fTh, 11), c1128710fTh.LLZIL);
                }
            }
        }
        c1128710fTh.LLLLJI.LIZ(c1128710fTh.P1(), c1128710fTh.LLLIL);
        if (LiveProbeReportForWallet.INSTANCE.getValue() && (iProbeSDK = (IProbeSDK) C1161920gLG.LIZJ(IProbeSDK.class)) != null) {
            iProbeSDK.setUpProbeSDK("ttl_inapp_gift_panel", "https://api.tiktokv.com", null);
        }
        return Unit.LIZ;
    }
}
