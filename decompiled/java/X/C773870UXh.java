package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773870UXh implements InterfaceViewOnClickListenerC1102800enu {
    public DataChannel LL;
    public C1110120ezi LLILLJJLI;
    public long LLILLL;
    public InterfaceC1103130eoR LLILZ;
    public C16FV LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
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
    public final boolean f1() {
        return true;
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
    public final void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0KX8 c0kx8;
        C0N1P c0n1p;
        boolean z;
        Context context;
        C19EG c19egLJ;
        FragmentManager fragmentManager;
        Context context2;
        int i;
        DataChannel dataChannel = this.LL;
        String string = null;
        if (dataChannel != null) {
            c0kx8 = (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class);
        } else {
            c0kx8 = null;
        }
        if (c0kx8 != null && c0kx8.LIZLLL && (C01C5.LIZ(this.LL) || C500260Jjc.LJIIZILJ(this.LL))) {
            if (C500260Jjc.LJIIZILJ(this.LL)) {
                C766270U4b.LIZLLL(2131844184);
            }
            if (C01C5.LIZ(this.LL)) {
                C766270U4b.LIZLLL(2131844187);
                return;
            }
            return;
        }
        if (C494680Jac.LJI(this.LL)) {
            if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.LL)) {
                i = 2131856620;
            } else {
                i = 2131844448;
            }
            C766270U4b.LIZLLL(i);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.LLILLL >= 500) {
            this.LLILLL = jUptimeMillis;
            C1110120ezi c1110120ezi = this.LLILLJJLI;
            if (c1110120ezi != null) {
                c0n1p = c1110120ezi.LJII;
            } else {
                c0n1p = null;
            }
            if (c0n1p == C0N1P.CUSTOM_POLL) {
                z = true;
            } else {
                z = false;
            }
            if (c1110120ezi != null) {
                c1110120ezi.LJI();
            }
            C01C3.LIZJ(this.LL, "toolbar", z, false, false, false, "video_live", 0);
            Room roomLIZ = C162100jj.LIZ(this.LL);
            if (roomLIZ != null && roomLIZ.cppVersion == 2 && this.LLILZLL) {
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null && (fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class)) != null) {
                    IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                    if (view != null && (context2 = view.getContext()) != null) {
                        string = context2.getString(2131841312);
                    }
                    iBroadcastService.showCppUnlockGuideDialogV2(string, "custom_poll", Boolean.TRUE, fragmentManager);
                    return;
                }
                return;
            }
            if (view == null || (context = view.getContext()) == null || (c19egLJ = C500260Jjc.LJ(context)) == null) {
                return;
            }
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Sc2("toolbar", c19egLJ, this.LL, true, "");
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        C0IK5.LIZLLL(this);
        C1110120ezi c1110120ezi = this.LLILLJJLI;
        if (c1110120ezi != null) {
            c1110120ezi.LJIIIIZZ();
        }
        this.LLILZLL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    @Override // X.InterfaceViewOnClickListenerC1102800enu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WH(X.InterfaceC1103130eoR r11, com.bytedance.ies.sdk.datachannel.DataChannel r12) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C773870UXh.WH(X.0eoR, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
