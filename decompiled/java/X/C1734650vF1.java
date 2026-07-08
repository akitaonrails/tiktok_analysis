package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.PcsFormFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vF1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734650vF1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsFormFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734650vF1(PcsFormFragment pcsFormFragment) {
        super(0);
        this.LL = pcsFormFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PcsFormVm pcsFormVmNR = this.LL.NR();
        pcsFormVmNR.xQ2(pcsFormVmNR.LLJILJIL, pcsFormVmNR.LLJILJILJ);
        return Unit.LIZ;
    }
}
