package X;

import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings.CommonDispatchConfigModel;
import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings.CustomCpuConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057170dcJ extends C09AY implements Function0<C1057270dcT> {
    public final /* synthetic */ C1057080dcA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057170dcJ(C1057080dcA c1057080dcA) {
        super(0);
        this.LL = c1057080dcA;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1057270dcT invoke() {
        CustomCpuConfig customCpuConfig = ((CommonDispatchConfigModel) this.LL.LIZJ.getValue()).customCpuState;
        if (customCpuConfig == null) {
            return null;
        }
        C1057260dcS c1057260dcS = new C1057260dcS();
        Double d = customCpuConfig.minimumCpu;
        if (d != null) {
            c1057260dcS.LIZJ = (float) d.doubleValue();
        }
        Double d2 = customCpuConfig.midCpu;
        if (d2 != null) {
            c1057260dcS.LIZIZ = (float) d2.doubleValue();
        }
        Double d3 = customCpuConfig.criticalCpu;
        if (d3 != null) {
            c1057260dcS.LIZ = (float) d3.doubleValue();
        }
        return c1057260dcS.LIZ();
    }
}
