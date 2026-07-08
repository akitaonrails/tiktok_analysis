package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingDetailAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JPM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JPM extends C09AY implements Function2<UIAssem, String, Unit> {
    public final /* synthetic */ PcsCalendlyBookingDetailAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPM(PcsCalendlyBookingDetailAssem pcsCalendlyBookingDetailAssem) {
        super(2);
        this.LL = pcsCalendlyBookingDetailAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        String str2 = str;
        if (!C491230JOf.LIZ(Integer.valueOf(this.LL.ip().getState().LLILLL)) && str2 != null) {
            PcsCalendlyBookingDetailAssem pcsCalendlyBookingDetailAssem = this.LL;
            pcsCalendlyBookingDetailAssem.getClass();
            C1548820qPI.LIZLLL("ttlive_smb_audience_booking_event", pcsCalendlyBookingDetailAssem);
            C259800zU c259800zU = new C259800zU();
            IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
            Context context = pcsCalendlyBookingDetailAssem.getContext();
            if (context != null) {
                pcsCalendlyBookingDetailAssem.LLJJIJI = iHybridContainerService.DU1(context, str2, null, true, new C0JPU(c259800zU));
                FrameLayout frameLayout = pcsCalendlyBookingDetailAssem.hp().LLILLJJLI;
                if (frameLayout != null) {
                    frameLayout.addView(pcsCalendlyBookingDetailAssem.LLJJIJI, -1, -1);
                }
                if (c259800zU.element != 0 && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = pcsCalendlyBookingDetailAssem.LLJJIJI) != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
                }
            }
        }
        return Unit.LIZ;
    }
}
