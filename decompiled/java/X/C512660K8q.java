package X;

import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.PinCardCheckRequestEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import webcast.api.sub.GetModeratorPinInfoRequest;
import webcast.api.sub.GetModeratorPinInfoResponse;
import webcast.api.sub.SubPinRequest;
import webcast.api.sub.SubPinResponse;
import webcast.api.sub.SubUnPinRequest;
import webcast.api.sub.SubUnPinResponse;

/* JADX INFO: renamed from: X.0K8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512660K8q implements InterfaceC509740Jyu {
    public final /* synthetic */ C1103530ep5 LL = new C1103530ep5();
    public final Context LLILLJJLI;
    public final boolean LLILLL;
    public final DataChannel LLILZ;

    public static final void LIZIZ(DataChannel dataChannel) {
        C2660011e c2660011e;
        if (dataChannel != null && (c2660011e = (C2660011e) dataChannel.gg0(C770500UKi.class)) != null) {
            ((ConcurrentHashMap) c2660011e.LIZ).remove(InterfaceC509740Jyu.class);
        }
    }

    public final void LIZ(Context context, DataChannel dataChannel) {
        if (dataChannel != null) {
            C2659011d.LIZIZ(dataChannel, InterfaceC509740Jyu.class, this, false);
        }
    }

    @Override // X.InterfaceC509740Jyu
    public final void LIZLLL(SubPinRequest subPinRequest, C512750K8z<SubPinResponse> c512750K8z) {
        if (this.LLILLL) {
            DataChannel dataChannel = this.LLILZ;
            if (dataChannel != null) {
                dataChannel.LC0(PinCardCheckRequestEvent.class, new C512730K8x(subPinRequest.type, new LinkedHashMap(), new C512720K8w(this, subPinRequest, c512750K8z)));
                return;
            }
            return;
        }
        LJI(subPinRequest, c512750K8z);
    }

    public final void LJI(SubPinRequest subPinRequest, final C512750K8z<SubPinResponse> c512750K8z) {
        C480460Ism.LIZ().getClass();
        ((C11NJ) this.LL.LIZ.getValue()).LIZ(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).pinExplainCard(subPinRequest.roomId, subPinRequest.pinId, subPinRequest.type, subPinRequest.secAnchorId).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0K8u
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PinCardManager@139b.readyToPin$1");
                c512750K8z.LIZ.invoke(((BaseResponse) obj).data);
                C1C7U.LIZIZ("PinCardManager@139b.readyToPin$1");
            }
        }, new C09JN() { // from class: X.0K8r
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PinCardManager@139b.readyToPin$2");
                Throwable th = (Throwable) obj;
                c512750K8z.LIZIZ.invoke(th);
                C501540Jlg.LIZJ(this.LLILLJJLI, th);
                C1C7U.LIZIZ("PinCardManager@139b.readyToPin$2");
            }
        }));
    }

    @Override // X.InterfaceC509740Jyu
    public final void LJIJJ(SubUnPinRequest subUnPinRequest, final C512750K8z<SubUnPinResponse> c512750K8z) {
        C480460Ism.LIZ().getClass();
        ((C11NJ) this.LL.LIZ.getValue()).LIZ(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).unpinExplainCard(subUnPinRequest.roomId, subUnPinRequest.unpinId, subUnPinRequest.type, subUnPinRequest.secAnchorId).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0K8p
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PinCardManager@139b.unpin$1");
                c512750K8z.LIZ.invoke(((BaseResponse) obj).data);
                C766270U4b.LIZLLL(2131855124);
                C1C7U.LIZIZ("PinCardManager@139b.unpin$1");
            }
        }, new C09JN() { // from class: X.0K8s
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PinCardManager@139b.unpin$2");
                Throwable th = (Throwable) obj;
                c512750K8z.LIZIZ.invoke(th);
                C501540Jlg.LIZJ(this.LLILLJJLI, th);
                C1C7U.LIZIZ("PinCardManager@139b.unpin$2");
            }
        }));
    }

    @Override // X.InterfaceC509740Jyu
    public final void LJJIJIIJIL(GetModeratorPinInfoRequest getModeratorPinInfoRequest, final C512750K8z<GetModeratorPinInfoResponse.Data> c512750K8z) {
        C480460Ism.LIZ().getClass();
        ((C11NJ) this.LL.LIZ.getValue()).LIZ(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getModeratorPinInfo(getModeratorPinInfoRequest.secAnchorId, getModeratorPinInfoRequest.roomId).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0K8t
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PinCardManager@139b.checkModeratorPinInfo$1");
                c512750K8z.LIZ.invoke(((BaseResponse) obj).data);
                C1C7U.LIZIZ("PinCardManager@139b.checkModeratorPinInfo$1");
            }
        }, new C09JN() { // from class: X.0K8v
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PinCardManager@139b.checkModeratorPinInfo$2");
                c512750K8z.LIZIZ.invoke(obj);
                C1C7U.LIZIZ("PinCardManager@139b.checkModeratorPinInfo$2");
            }
        }));
    }

    public C512660K8q(Context context, DataChannel dataChannel, boolean z) {
        this.LLILLJJLI = context;
        this.LLILLL = z;
        this.LLILZ = dataChannel;
    }
}
