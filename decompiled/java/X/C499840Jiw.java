package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0Jiw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499840Jiw implements InterfaceViewOnClickListenerC1102800enu {
    public final Context LL;
    public DataChannel LLILLJJLI;

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

    public C499840Jiw(Context context) {
        this.LL = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String liveEventStickerGuidanceSchema;
        Long l;
        String str;
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.s8;
        Boolean boolLIZIZ = c20337914i1.LIZIZ();
        if (boolLIZIZ.booleanValue()) {
            liveEventStickerGuidanceSchema = LiveEventPageLynxUrl.INSTANCE.getInLiveEventListSchema();
        } else {
            liveEventStickerGuidanceSchema = LiveEventPageLynxUrl.INSTANCE.getLiveEventStickerGuidanceSchema();
        }
        if (liveEventStickerGuidanceSchema.length() == 0) {
            return;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            l = (Long) dataChannel.gg0(C1085140eLQ.class);
        } else {
            l = null;
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(liveEventStickerGuidanceSchema).buildUpon().appendQueryParameter("enter_from", "live_take_detail");
        if (SecondPageCodeCacheABSetting.INSTANCE.isMatch() && boolLIZIZ.booleanValue()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("enable_code_cache", str);
        if (l != null) {
            builderAppendQueryParameter2.appendQueryParameter("current_event_id", l.toString());
        }
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.LL, builderAppendQueryParameter2.build().toString(), null);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_module_entrance");
        c474500IjALIZ.LJJII(Boolean.FALSE, "has_red_dot");
        c474500IjALIZ.LJJII("live_take_detail", "event_page");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LIZ();
        if (!boolLIZIZ.booleanValue()) {
            c20337914i1.LIZLLL(Boolean.TRUE);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILLJJLI = dataChannel;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_module_entrance");
        c474500IjALIZ.LJJII("live_take_detail", "event_page");
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LJJII(Boolean.FALSE, "has_red_dot");
        c474500IjALIZ.LIZ();
    }
}
