package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752320TfC implements InterfaceViewOnClickListenerC1102800enu {
    public final Context LL;
    public DataChannel LLILLJJLI;
    public C19GN LLILLL;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
    }

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

    public final DataChannel LIZ() {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            return dataChannel;
        }
        return null;
    }

    public final void LIZIZ() {
        LIZ().LC0(UserWannaSendMessageEvent.class, new C1110530f0N());
        Object objGg0 = LIZ().gg0(LiveModeChannel.class);
        if (objGg0 == null) {
            objGg0 = LiveMode.VIDEO;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_comment_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJ(objGg0 == LiveMode.VIDEO ? "video_live" : "third_party");
        c474500IjALIZ.LJJII("more", "click_method");
        c474500IjALIZ.LIZ();
    }

    public C752320TfC(Context context) {
        this.LL = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!InterfaceC1106030et7.E4.LIZIZ().booleanValue()) {
            if (this.LLILLL == null) {
                C19GO c19go = new C19GO(this.LL);
                c19go.LJJI = true;
                c19go.LIZIZ(2131842706);
                c19go.LJ(2131842862, new DialogInterfaceOnClickListenerC786020UsS(this, 2), false);
                c19go.LIZJ(2131851524, new DialogInterface.OnClickListener() { // from class: X.0TfD
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }, false);
                this.LLILLL = c19go.LIZ();
            }
            C19GN c19gn = this.LLILLL;
            if (c19gn != null) {
                C500260Jjc.LJJLIIIJLLLLLLLZ(c19gn);
                return;
            }
            return;
        }
        LIZIZ();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        LiveIconView liveIconView;
        this.LLILLJJLI = dataChannel;
        if (LiveHostSettingsUIConfig.enable() && this.LLILLJJLI != null && C500260Jjc.LJIIZILJ(dataChannel) && (liveIconView = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74)) != null) {
            liveIconView.setIconAttr(R.attr.czi);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_comment_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }
}
