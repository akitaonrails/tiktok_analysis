package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyDraggleHeightDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490380JKy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1822090xW3 LL;
    public final /* synthetic */ PcsCalendlyBookingData LLILLJJLI;
    public final /* synthetic */ FragmentManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C490380JKy(C1822090xW3 c1822090xW3, PcsCalendlyBookingData pcsCalendlyBookingData, FragmentManager fragmentManager) {
        super(0);
        this.LL = c1822090xW3;
        this.LLILLJJLI = pcsCalendlyBookingData;
        this.LLILLL = fragmentManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage()) {
            C1822090xW3 c1822090xW3 = this.LL;
            EnumC1785280wYg enumC1785280wYg = EnumC1785280wYg.CALENDLY;
            PcsCalendlyBookingData pcsCalendlyBookingData = this.LLILLJJLI;
            String str = pcsCalendlyBookingData.showEntrance;
            long j = pcsCalendlyBookingData.skuId;
            Long lLJIILIIL = C2095008Iq.LJIILIIL(pcsCalendlyBookingData.anchorId);
            String str2 = this.LLILLJJLI.secAnchorId;
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            Long lValueOf = room != null ? Long.valueOf(room.getId()) : null;
            PcsCalendlyBookingData pcsCalendlyBookingData2 = this.LLILLJJLI;
            c1822090xW3.LJIIJ(new C1822010xVv(enumC1785280wYg, str, pcsCalendlyBookingData2.showBackButton, false, false, null, lLJIILIIL, str2, lValueOf, Long.valueOf(j), null, null, false, null, null, null, pcsCalendlyBookingData2.description, pcsCalendlyBookingData2.title, 130104));
        } else {
            FragmentManager fragmentManager = this.LLILLL;
            PcsCalendlyBookingData pcsCalendlyBookingData3 = this.LLILLJJLI;
            PcsCalendlyDraggleHeightDialog pcsCalendlyDraggleHeightDialog = new PcsCalendlyDraggleHeightDialog();
            pcsCalendlyDraggleHeightDialog.LLILLL = pcsCalendlyBookingData3;
            pcsCalendlyDraggleHeightDialog.show(fragmentManager, (String) null);
        }
        return Unit.LIZ;
    }
}
