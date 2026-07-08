package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.experiment.ImSpecialEffectsFrequencyControlSettings;
import com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NP1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl$deleteOldData$1", f = "AwemeManageServiceImpl.kt", l = {179}, m = "invokeSuspend")
public final class C0NP1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ AwemeManageServiceImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NP1(AwemeManageServiceImpl awemeManageServiceImpl, InterfaceC1364105Vn<? super C0NP1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = awemeManageServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NP1(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        C1C7U.LIZ("AwemeManageServiceImpl@876f.deleteOldData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    jCurrentTimeMillis = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                this.LLILLL.getClass();
                ImSpecialEffectsFrequencyControlSettings.ImSpecialEffectsFrequencyControlModel imSpecialEffectsFrequencyControlModelLIZ = ImSpecialEffectsFrequencyControlSettings.LIZ();
                jCurrentTimeMillis = ((System.currentTimeMillis() / 86400000) * 86400000) - C0NP2.LIZ(Math.max(imSpecialEffectsFrequencyControlModelLIZ.shareAgainRetroactiveValidityPeriod + imSpecialEffectsFrequencyControlModelLIZ.shareAgainValidityWindow, imSpecialEffectsFrequencyControlModelLIZ.shareHighFreqValidityWindow) - 1);
                AwemeManageServiceImpl awemeManageServiceImpl = this.LLILLL;
                this.LL = jCurrentTimeMillis;
                this.LLILLJJLI = 1;
                obj = awemeManageServiceImpl.LIZIZ(jCurrentTimeMillis, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AwemeManageServiceImpl@876f.deleteOldData$1");
                    return objLJFF;
                }
            }
            int iIntValue = ((Number) obj).intValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteOldData: deleted ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(" records older than ");
            sbLIZ.append(jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeManageServiceImpl@876f.deleteOldData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
