package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import com.bytedance.android.livesdk.comp.api.event.api.data.PaidEventAmountChannel;
import com.bytedance.android.livesdk.comp.impl.event.widget.LivePaidEventMaskWidget;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.livesetting.LiveEventIAPMerchantID;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePaidEventInRoomRiskCheckSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0KAM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KAM implements InterfaceC1791670wiz {
    public final DataChannel LIZ;
    public final WidgetManager LIZIZ;
    public final Room LIZJ;
    public String LJ;
    public LiveWidget LJFF;
    public C11JF LJIIIIZZ;
    public int LJIIIZ;
    public final String LIZLLL = LiveEventIAPMerchantID.INSTANCE.getValue();
    public final C01GW LJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 40));
    public final C01GW LJII = C452501pT.LIZIZ(new C5182020e(this, 83));

    public final void LJFF() {
        if (LivePaidEventInRoomRiskCheckSetting.INSTANCE.enable()) {
            this.LJIIIIZZ = (C11JF) C11NZ.LJLJJLL(new SecureRandom().nextInt(121) + 30, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new C516201zk(this, 76), new C09JN() { // from class: X.01W3
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PaidEventManager@f316.scheduleReportPreviewInfo$2");
                    C1C7U.LIZIZ("PaidEventManager@f316.scheduleReportPreviewInfo$2");
                }
            });
        }
    }

    @Override // X.InterfaceC1791670wiz
    public final void LIZLLL(C518160KTu c518160KTu) {
        IapProductDetail iapProductDetail;
        C1617230sBd c1617230sBd;
        String str;
        DataChannel dataChannel;
        C20441214yg.LIZIZ("PaidEventManager", "success");
        String str2 = this.LJ;
        if (str2 != null) {
            Map<String, IapProductDetail> map = c518160KTu.LJIIJ;
            if (map != null && (iapProductDetail = map.get(str2)) != null && (c1617230sBd = iapProductDetail.oneTimePurchaseProduct) != null && (str = c1617230sBd.price) != null && (dataChannel = this.LIZ) != null) {
                dataChannel.zW(PaidEventAmountChannel.class, new C512990K9x(true, str));
                return;
            }
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.zW(PaidEventAmountChannel.class, new C512990K9x(false, ""));
                return;
            }
        }
        DataChannel dataChannel3 = this.LIZ;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.zW(PaidEventAmountChannel.class, new C512990K9x(false, ""));
    }

    @Override // X.InterfaceC1791670wiz
    public final void LJ(C518080KTm c518080KTm) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fail");
        sbLIZ.append(c518080KTm.LJFF);
        C20441214yg.LIZIZ("PaidEventManager", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zW(PaidEventAmountChannel.class, new C512990K9x(false, ""));
        }
    }

    public final void LJI(C1324720kZq c1324720kZq, Context context) {
        WidgetManager widgetManager;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
            C0IQ6.LIZIZ(c1324720kZq, C464330IIt.LJII(this.LIZJ), context);
            C786410Ut5.e8(c1324720kZq, new View.OnClickListener() { // from class: X.0KAN
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        if (this.LJFF == null) {
            LivePaidEventMaskWidget livePaidEventMaskWidgetPf1 = ((ILiveEventService) C1161920gLG.LIZJ(ILiveEventService.class)).pf1(c1324720kZq);
            this.LJFF = livePaidEventMaskWidgetPf1;
            if (livePaidEventMaskWidgetPf1 != null && (widgetManager = this.LIZIZ) != null) {
                widgetManager.load(R.id.wif, livePaidEventMaskWidgetPf1, false);
            }
        }
        LJFF();
    }

    public C0KAM(DataChannel dataChannel, RecyclableWidgetManager recyclableWidgetManager, Room room) {
        this.LIZ = dataChannel;
        this.LIZIZ = recyclableWidgetManager;
        this.LIZJ = room;
    }
}
