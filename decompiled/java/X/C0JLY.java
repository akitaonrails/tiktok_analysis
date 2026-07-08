package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.moderator.assem.PcsServiceModeratorAssem;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JLY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JLY extends C09AY implements Function2<SparkContext, Integer, Unit> {
    public final /* synthetic */ PcsServiceModeratorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JLY(PcsServiceModeratorAssem pcsServiceModeratorAssem) {
        super(2);
        this.LL = pcsServiceModeratorAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(SparkContext sparkContext, Integer num) {
        SparkContext sparkContext2 = sparkContext;
        num.intValue();
        final PcsServiceModeratorAssem pcsServiceModeratorAssem = this.LL;
        sparkContext2.LJJ(InterfaceC1538940q9M.class, new InterfaceC1538940q9M() { // from class: X.0JLZ
            @Override // X.InterfaceC1538940q9M
            public final void LIZ() {
            }

            @Override // X.InterfaceC1538940q9M
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1538940q9M
            public final void LJJ() {
                PcsDialogAbility pcsDialogAbility = (PcsDialogAbility) pcsServiceModeratorAssem.LLJJJIL.getValue();
                if (pcsDialogAbility != null) {
                    pcsDialogAbility.dY1();
                }
            }
        });
        final PcsServiceModeratorAssem pcsServiceModeratorAssem2 = this.LL;
        sparkContext2.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0JLX
            @Override // X.AbstractC1537870q7d
            public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                C500260Jjc.LJIILIIL(pcsServiceModeratorAssem2.LJJIJL());
            }
        });
        return Unit.LIZ;
    }
}
