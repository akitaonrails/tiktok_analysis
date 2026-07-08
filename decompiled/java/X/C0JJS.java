package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeetingdmdialog.dialog.CalendlyMeetingDmDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JJS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JJS extends C09AY implements Function2<C03H5, EnumC489910JJd, Unit> {
    public final /* synthetic */ CalendlyMeetingDmDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JJS(CalendlyMeetingDmDialog calendlyMeetingDmDialog) {
        super(2);
        this.LL = calendlyMeetingDmDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, EnumC489910JJd enumC489910JJd) {
        CalendlyMeetingDmDialog calendlyMeetingDmDialog = this.LL;
        calendlyMeetingDmDialog.getClass();
        int i = C489900JJc.LIZ[enumC489910JJd.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    IPcsLoadingAbility iPcsLoadingAbility = calendlyMeetingDmDialog.LLJZIJLIL;
                    if (iPcsLoadingAbility != null) {
                        iPcsLoadingAbility.Ly2(C1734970vFX.LIZ(new C0JJY(calendlyMeetingDmDialog)), null, null);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                IPcsLoadingAbility iPcsLoadingAbility2 = calendlyMeetingDmDialog.LLJZIJLIL;
                if (iPcsLoadingAbility2 != null) {
                    iPcsLoadingAbility2.LJJJJL();
                }
            }
        } else {
            IPcsLoadingAbility iPcsLoadingAbility3 = calendlyMeetingDmDialog.LLJZIJLIL;
            if (iPcsLoadingAbility3 != null) {
                iPcsLoadingAbility3.LJLJLJ();
            }
        }
        return Unit.LIZ;
    }
}
