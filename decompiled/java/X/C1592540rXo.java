package X;

import com.ss.android.ugc.aweme.experiment.OptValue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592540rXo extends C09AY implements Function0<C1592630rXx> {
    public final /* synthetic */ C1592450rXf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592540rXo(C1592450rXf c1592450rXf) {
        super(0);
        this.LL = c1592450rXf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1592630rXx invoke() {
        Integer num;
        C1589740rTI c1589740rTI = C1589740rTI.LIZ;
        C1592450rXf c1592450rXf = this.LL;
        OptValue optValueLIZ = C1589740rTI.LIZ();
        if (!(optValueLIZ != null && (num = optValueLIZ.enableSlideTitleAnimation) != null && num.intValue() == 1 && c1592450rXf.getSwipeMode() && c1592450rXf.getEnableAnimation()) || c1589740rTI == null) {
            return null;
        }
        return new C1592630rXx(this.LL);
    }
}
