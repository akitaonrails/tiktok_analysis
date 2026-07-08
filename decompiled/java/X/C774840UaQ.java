package X;

import Y.ACListenerS79S0300000_12;
import Y.ARunnableS112S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.record.LiveRecordManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774840UaQ implements InterfaceViewOnClickListenerC1102800enu, InterfaceC774810UaN, C0UXZ {
    public final LifecycleOwner LL;
    public DataChannel LLILLJJLI;
    public InterfaceC1103130eoR LLILLL;
    public View LLILZ;
    public C16F5 LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 736));
    public LiveIconView LLIZ;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceC774810UaN
    public final void LIZ() {
    }

    @Override // X.InterfaceC774810UaN
    public final void LIZJ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    public final ValueAnimator LJI() {
        return (ValueAnimator) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC774810UaN
    public final void LIZLLL() {
        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS112S0100000_12(this, 246));
    }

    @Override // X.InterfaceC774810UaN
    public final void LJ() {
        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS112S0100000_12(this, 245));
    }

    public C774840UaQ(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    @Override // X.InterfaceC774810UaN
    public final void LJFF(String str) {
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null) {
            c16f5.setText(str);
        }
    }

    public final void LJIIIIZZ(boolean z) {
        int i;
        int iLIZIZ;
        LiveIconView liveIconView = this.LLIZ;
        if (liveIconView != null) {
            Context context = liveIconView.getContext();
            if (z) {
                i = R.attr.e0w;
            } else {
                i = R.attr.e0x;
            }
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(i, context);
            if (c20743516FdLIZLLL != null) {
                liveIconView.setIcon(c20743516FdLIZLLL);
            }
            Context context2 = liveIconView.getContext();
            if (z) {
                iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezv, C1834150xpV.LJIIIIZZ(context2));
            } else {
                iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezs, C1834150xpV.LJIIIIZZ(context2));
                if (LiveHostSettingsUIConfig.v2()) {
                    iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezs, C1834150xpV.LJII(context2));
                }
            }
            Integer numValueOf = Integer.valueOf(iLIZIZ);
            if (numValueOf != null) {
                liveIconView.setIconTint(numValueOf.intValue());
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_RECORD_LIVE);
        C774850UaR.LJ(this.LLILLJJLI, "click");
        LiveRecordManager liveRecordManager = LiveRecordManager.LL;
        liveRecordManager.getClass();
        if (LiveRecordManager.LLILZ) {
            if (LiveHostSettingsUIConfig.enable()) {
                liveRecordManager.getClass();
                LiveRecordManager.LJ("manual", true, false);
                return;
            } else {
                C766270U4b.LIZLLL(2131855981);
                return;
            }
        }
        LiveRecordManager.LIZJ(0, "more_panel");
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        LJI().cancel();
        LiveRecordManager.LL.getClass();
        ((ArrayList) LiveRecordManager.LLJIJIL).remove(this);
    }

    public final void LJII(DataChannel dataChannel, InterfaceC1103130eoR interfaceC1103130eoR) {
        View viewFindViewById;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = interfaceC1103130eoR;
        C16F5 c16f5 = null;
        if (interfaceC1103130eoR != null) {
            viewFindViewById = interfaceC1103130eoR.findViewById(R.id.sys);
        } else {
            viewFindViewById = null;
        }
        this.LLILZ = viewFindViewById;
        if (interfaceC1103130eoR != null) {
            c16f5 = (C16F5) interfaceC1103130eoR.findViewById(R.id.szo);
        }
        this.LLILZIL = c16f5;
        LifecycleOwner lifecycleOwner = this.LL;
        if (lifecycleOwner != null) {
            RedDotExtensionKt.LJI(this.LLILZ, lifecycleOwner, null, C0UX6.LIVE_BROADCAST_RECORD_LIVE, new AwS591S0100000_12(dataChannel, 755));
        }
        LiveRecordManager.LL.getClass();
        ((ArrayList) LiveRecordManager.LLJIJIL).add(this);
        if (LiveRecordManager.LLILZ) {
            View view = this.LLILZ;
            if (view != null) {
                C500260Jjc.LLFFF(view);
            }
            C16F5 c16f52 = this.LLILZIL;
            if (c16f52 != null) {
                C500260Jjc.LLFFF(c16f52);
            }
            if (LJI().isRunning()) {
                LJI().cancel();
            }
            LJI().start();
        } else {
            View view2 = this.LLILZ;
            if (view2 != null) {
                C500260Jjc.LJIILIIL(view2);
            }
            C16F5 c16f53 = this.LLILZIL;
            if (c16f53 != null) {
                C500260Jjc.LJIILIIL(c16f53);
            }
        }
        LJIIIIZZ(LiveRecordManager.LLILZ);
        C774850UaR.LJ(dataChannel, "show");
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        interfaceC1103130eoR.findViewById(R.id.y7r);
        LJII(dataChannel, interfaceC1103130eoR);
    }

    @Override // X.C0UXZ
    public final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        this.LLIZ = c499640Jic.LIZIZ;
        LJII(dataChannel, null);
        View view = c499640Jic.LIZ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS79S0300000_12(this, c499640Jic, dataChannel, 15), view);
        }
    }
}
