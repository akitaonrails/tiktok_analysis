package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioModeratorPinCardAssem;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KUI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KUI extends C09AY implements Function2<SparkContext, Integer, Unit> {
    public final /* synthetic */ PcsServiceBioModeratorPinCardAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KUI(PcsServiceBioModeratorPinCardAssem pcsServiceBioModeratorPinCardAssem) {
        super(2);
        this.LL = pcsServiceBioModeratorPinCardAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(SparkContext sparkContext, Integer num) {
        SparkContext sparkContext2 = sparkContext;
        num.intValue();
        final PcsServiceBioModeratorPinCardAssem pcsServiceBioModeratorPinCardAssem = this.LL;
        sparkContext2.LJJ(InterfaceC1538940q9M.class, new InterfaceC1538940q9M() { // from class: X.0KUK
            @Override // X.InterfaceC1538940q9M
            public final void LIZ() {
            }

            @Override // X.InterfaceC1538940q9M
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1538940q9M
            public final void LJJ() {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = pcsServiceBioModeratorPinCardAssem.LLJJIJI;
                ViewGroup.MarginLayoutParams marginLayoutParams = null;
                ViewGroup.LayoutParams layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getLayoutParams() : null;
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.height = -2;
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = pcsServiceBioModeratorPinCardAssem.LLJJIJI;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                    C786410Ut5.W5(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, marginLayoutParams);
                }
            }
        });
        final PcsServiceBioModeratorPinCardAssem pcsServiceBioModeratorPinCardAssem2 = this.LL;
        sparkContext2.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0KUJ
            @Override // X.AbstractC1542100qES
            public final void LJLLJ(SparkContext sparkContext3, C1548490qOl c1548490qOl) {
            }

            @Override // X.AbstractC1537870q7d
            public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                View viewLJJIJL = pcsServiceBioModeratorPinCardAssem2.LJJIJL();
                if (viewLJJIJL != null) {
                    C500260Jjc.LJIILIIL(viewLJJIJL);
                }
                pcsServiceBioModeratorPinCardAssem2.ip().setState(new C0KUL(false));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLoadFailed url=");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("PcsServiceBioModeratorPinCardAssem", C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        return Unit.LIZ;
    }
}
