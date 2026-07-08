package X;

import android.view.View;
import com.bytedance.android.live.broadcast.api.ShouldStartFloatWindowServiceEvent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0JjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500110JjN implements InterfaceViewOnClickListenerC1102800enu {
    public C20743716Ff LL;
    public C16F5 LLILLJJLI;
    public DataChannel LLILLL;
    public InterfaceC1103130eoR LLILZ;
    public LiveIconView LLILZIL;
    public View LLILZLL;

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
    public final boolean dj() {
        return false;
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
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

    public final void LIZ(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C0UVE.LIZLLL(str);
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC1106030et7.O8;
        Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.put(strValueOf, Boolean.valueOf(z));
        c20337914i1.LJFF(mapLIZIZ);
        if (z) {
            DataChannel dataChannel = this.LLILLL;
            if (dataChannel != null) {
                dataChannel.FQ2(ShouldStartFloatWindowServiceEvent.class);
            }
            View view = this.LLILZLL;
            if (view != null) {
                view.setBackgroundColor(-1);
            }
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    @Override // X.InterfaceViewOnClickListenerC1102800enu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WH(X.InterfaceC1103130eoR r6, com.bytedance.ies.sdk.datachannel.DataChannel r7) {
        /*
            r5 = this;
            r5.LLILLL = r7
            r5.LLILZ = r6
            r6.getContext()
            r0 = 2131395070(0x7f0a81fe, float:1.8410842E38)
            android.view.View r0 = r6.findViewById(r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = (com.bytedance.android.live.design.view.icon.LiveIconView) r0
            r5.LLILZIL = r0
            r0 = 2131395096(0x7f0a8218, float:1.8410895E38)
            android.view.View r0 = r6.findViewById(r0)
            X.16F5 r0 = (X.C16F5) r0
            r5.LLILLJJLI = r0
            r0 = 2131373418(0x7f0a2d6a, float:1.8366927E38)
            android.view.View r0 = r6.findViewById(r0)
            X.16Ff r0 = (X.C20743716Ff) r0
            r5.LL = r0
            r0 = 2131368462(0x7f0a1a0e, float:1.8356875E38)
            android.view.View r0 = r6.findViewById(r0)
            r5.LLILZLL = r0
            X.16Ff r2 = r5.LL
            if (r2 == 0) goto L8d
            r4 = 1
            r2.setDebounceClickEnabled(r4)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDelayInterval(r0)
            X.14i1<java.util.Map<java.lang.String, java.lang.Boolean>> r0 = X.InterfaceC1106030et7.O8
            java.lang.Object r3 = r0.LIZIZ()
            java.util.Map r3 = (java.util.Map) r3
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r0 = r3.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto Lc6
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc6
            X.16Ff r0 = r5.LL
            if (r0 == 0) goto Lc4
            android.content.Context r0 = r0.getContext()
        L6c:
            boolean r0 = X.C0W78.LJFF(r0)
            if (r0 == 0) goto Lc6
        L72:
            r2.setChecked(r4)
            android.content.Context r1 = r2.getContext()
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto Lc1
            java.lang.String r0 = "1"
        L81:
            X.C0UVE.LJIIIIZZ(r1, r0)
            X.0Kd4 r1 = new X.0Kd4
            r0 = 3
            r1.<init>(r5, r2, r0)
            X.C786410Ut5.A7(r2, r1)
        L8d:
            if (r7 == 0) goto La7
            java.lang.Class<com.bytedance.android.live.broadcast.api.OpenOverlayPermissionSwitchEvent> r2 = com.bytedance.android.live.broadcast.api.OpenOverlayPermissionSwitchEvent.class
            kotlin.jvm.internal.AwS586S0100000_7 r1 = new kotlin.jvm.internal.AwS586S0100000_7
            r0 = 341(0x155, float:4.78E-43)
            r1.<init>(r5, r0)
            r7.CQ2(r2, r5, r1)
            java.lang.Class<com.bytedance.android.live.broadcast.api.FloatWindowMoreListScrollEvent> r2 = com.bytedance.android.live.broadcast.api.FloatWindowMoreListScrollEvent.class
            kotlin.jvm.internal.AwS586S0100000_7 r1 = new kotlin.jvm.internal.AwS586S0100000_7
            r0 = 342(0x156, float:4.79E-43)
            r1.<init>(r5, r0)
            r7.CQ2(r2, r5, r1)
        La7:
            com.bytedance.android.live.design.view.icon.LiveIconView r3 = r5.LLILZIL
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            java.lang.String r1 = "tiktok_live_broadcast_demand_8"
            java.lang.String r0 = "float_windo_icon.png"
            X.C1143680frq.LJ(r3, r1, r0, r2)
            X.16F5 r1 = r5.LLILLJJLI
            if (r1 == 0) goto Lc0
            r0 = 2131851249(0x7f1177f1, float:1.9336083E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r1.setText(r0)
        Lc0:
            return
        Lc1:
            java.lang.String r0 = "0"
            goto L81
        Lc4:
            r0 = 0
            goto L6c
        Lc6:
            r4 = 0
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C500110JjN.WH(X.0eoR, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
