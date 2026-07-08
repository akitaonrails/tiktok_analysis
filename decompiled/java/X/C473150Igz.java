package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskListUrlSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Igz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473150Igz implements InterfaceViewOnClickListenerC1102800enu {
    public final Context LL;
    public SparkContext LLILLJJLI;

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
    public final /* synthetic */ void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
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

    public C473150Igz(Context context) {
        this.LL = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C495520Jby c495520Jby = new C495520Jby(LiveBroadcastTaskListUrlSetting.INSTANCE.getValue());
        c495520Jby.LIZJ("enter_from", "mission_entrance");
        String strLIZLLL = c495520Jby.LIZLLL();
        int i = (int) (r2.widthPixels / view.getContext().getResources().getDisplayMetrics().density);
        SparkContext sparkContext = this.LLILLJJLI;
        if (sparkContext != null) {
            InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
            if (interfaceC1059280dfiLJJIJLIJ != null) {
                interfaceC1059280dfiLJJIJLIJ.close();
            }
            this.LLILLJJLI = null;
        }
        C760370TsB c760370TsBLIZJ = C0KYL.LIZJ(strLIZLLL);
        EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
        c760370TsBLIZJ.LJJ(i, enumC760350Ts9);
        c760370TsBLIZJ.LJIIIZ(400, enumC760350Ts9);
        c760370TsBLIZJ.LJIJI(8, enumC760350Ts9);
        c760370TsBLIZJ.LJIIIIZZ("bottom");
        this.LLILLJJLI = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.LL, c760370TsBLIZJ.LIZ().toString(), null);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_mission_entrance_click");
        c474500IjALIZ.LJJII("live", "_param_live_platform");
        c474500IjALIZ.LIZ();
    }
}
