package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeeting.view.PcsCalendlyBookingFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491200JOc extends C09AY implements Function2<C03H5, EnumC2273991DzZ, Unit> {
    public final /* synthetic */ PcsCalendlyBookingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491200JOc(PcsCalendlyBookingFragment pcsCalendlyBookingFragment) {
        super(2);
        this.LL = pcsCalendlyBookingFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, EnumC2273991DzZ enumC2273991DzZ) {
        final PcsCalendlyBookingFragment pcsCalendlyBookingFragment = this.LL;
        pcsCalendlyBookingFragment.getClass();
        switch (C2274031Dzd.LIZ[enumC2273991DzZ.ordinal()]) {
            case 1:
                break;
            case 2:
            case 3:
                IPcsLoadingAbility iPcsLoadingAbility = pcsCalendlyBookingFragment.LLILZLL;
                if (iPcsLoadingAbility != null) {
                    iPcsLoadingAbility.LJLJLJ();
                }
                break;
            case 4:
                if (C491230JOf.LIZ(Integer.valueOf(pcsCalendlyBookingFragment.OR().getState().LLILLL))) {
                    IPcsLoadingAbility iPcsLoadingAbility2 = pcsCalendlyBookingFragment.LLILZLL;
                    if (iPcsLoadingAbility2 != null) {
                        iPcsLoadingAbility2.LJJJJL();
                    }
                } else {
                    View view = pcsCalendlyBookingFragment.getView();
                    if (view != null) {
                        HandlerHook.viewPostDelay(view, new Runnable() { // from class: X.0JOd
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("PcsCalendlyBookingFragment@b831.updateLoadingUi$1");
                                try {
                                    IPcsLoadingAbility iPcsLoadingAbility3 = pcsCalendlyBookingFragment.LLILZLL;
                                    if (iPcsLoadingAbility3 != null) {
                                        iPcsLoadingAbility3.LJJJJL();
                                    }
                                    pcsCalendlyBookingFragment.OR().CQ2(EnumC2273991DzZ.CALENDLY_WEB_LOAD_END);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("PcsCalendlyBookingFragment@b831.updateLoadingUi$1");
                            }
                        }, Mp4ScreenVideoLoadTimeout.CONTROL);
                    }
                }
                break;
            case 5:
                IPcsLoadingAbility iPcsLoadingAbility3 = pcsCalendlyBookingFragment.LLILZLL;
                if (iPcsLoadingAbility3 != null) {
                    iPcsLoadingAbility3.LJJJJL();
                }
                break;
            case 6:
                pcsCalendlyBookingFragment.PR();
                break;
            case 7:
                pcsCalendlyBookingFragment.PR();
                break;
            default:
                throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
