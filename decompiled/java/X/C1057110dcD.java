package X;

import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings.CustomNetConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057110dcD extends C09AY implements Function0<C1057120dcE> {
    public final /* synthetic */ C1057060dc8 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057110dcD(C1057060dc8 c1057060dc8) {
        super(0);
        this.LL = c1057060dc8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1057120dcE invoke() {
        Integer num;
        Integer num2;
        Integer num3;
        if (this.LL.LIZJ.getValue() == null) {
            return null;
        }
        C1057130dcF c1057130dcF = new C1057130dcF();
        CustomNetConfig customNetConfig = (CustomNetConfig) this.LL.LIZJ.getValue();
        if (customNetConfig != null && (num3 = customNetConfig.minimumNet) != null) {
            c1057130dcF.LIZJ = num3.intValue();
        }
        CustomNetConfig customNetConfig2 = (CustomNetConfig) this.LL.LIZJ.getValue();
        if (customNetConfig2 != null && (num2 = customNetConfig2.midNet) != null) {
            c1057130dcF.LIZIZ = num2.intValue();
        }
        CustomNetConfig customNetConfig3 = (CustomNetConfig) this.LL.LIZJ.getValue();
        if (customNetConfig3 != null && (num = customNetConfig3.criticalNet) != null) {
            c1057130dcF.LIZ = num.intValue();
        }
        C1057120dcE c1057120dcE = new C1057120dcE();
        c1057120dcE.LIZ = c1057130dcF.LIZ;
        c1057120dcE.LIZIZ = c1057130dcF.LIZIZ;
        c1057120dcE.LIZJ = c1057130dcF.LIZJ;
        return c1057120dcE;
    }
}
