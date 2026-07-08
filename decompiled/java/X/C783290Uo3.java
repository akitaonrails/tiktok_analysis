package X;

import Y.AfS181S0100000_12;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.api.LiveEventDescCardApi;
import com.bytedance.android.livesdk.api.LiveEventDescCardMApi;
import com.bytedance.android.livesdk.api.LiveEventResponse;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardStartTimeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Uo3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783290Uo3 implements InterfaceViewOnClickListenerC1102800enu {
    public final Context LL;
    public DataChannel LLILLJJLI;
    public Room LLILLL;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
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
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void onShow() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_event_promotion");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJJII("show", "type");
        c474500IjALIZ.LIZ();
    }

    public C783290Uo3(Context context) {
        this.LL = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iLongValue;
        Long lValueOf;
        C11NZ<LiveEventResponse> anchorSelectionResponse;
        Long lValueOf2;
        Long l;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_event_promotion");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJJII("click", "type");
        c474500IjALIZ.LIZ();
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(LiveEventCardStartTimeChannel.class)) != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        try {
            Long lValueOf3 = null;
            if (C1161920gLG.LIZJ(IHostAppContext.class) != null && !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion()) {
                C480460Ism.LIZ().getClass();
                LiveEventDescCardApi liveEventDescCardApi = (LiveEventDescCardApi) C480460Ism.LIZLLL(LiveEventDescCardApi.class);
                Room room = this.LLILLL;
                if (room != null) {
                    lValueOf2 = Long.valueOf(room.getOwnerUserId());
                } else {
                    lValueOf2 = null;
                }
                String strValueOf = String.valueOf(lValueOf2);
                Room room2 = this.LLILLL;
                if (room2 != null) {
                    lValueOf3 = Long.valueOf(room2.getId());
                }
                anchorSelectionResponse = liveEventDescCardApi.getAnchorSelectionResponse(strValueOf, 4, 0, 2, iLongValue, String.valueOf(lValueOf3));
            } else {
                C480460Ism.LIZ().getClass();
                LiveEventDescCardMApi liveEventDescCardMApi = (LiveEventDescCardMApi) C480460Ism.LIZLLL(LiveEventDescCardMApi.class);
                Room room3 = this.LLILLL;
                if (room3 != null) {
                    lValueOf = Long.valueOf(room3.getOwnerUserId());
                } else {
                    lValueOf = null;
                }
                String strValueOf2 = String.valueOf(lValueOf);
                Room room4 = this.LLILLL;
                if (room4 != null) {
                    lValueOf3 = Long.valueOf(room4.getId());
                }
                anchorSelectionResponse = liveEventDescCardMApi.getAnchorSelectionResponse(strValueOf2, 4, 0, 2, iLongValue, String.valueOf(lValueOf3));
            }
            anchorSelectionResponse.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 160), new C09JN() { // from class: X.0Uo4
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ToolbarEventPromotionBehavior@3acc.onClick$2");
                    C20441214yg.LJI("ToolbarEventPromotionBehavior", (Throwable) obj);
                    C1C7U.LIZIZ("ToolbarEventPromotionBehavior@3acc.onClick$2");
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("ToolbarEventPromotionBehavior", e);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILLJJLI = dataChannel;
        this.LLILLL = C162100jj.LIZ(dataChannel);
    }
}
