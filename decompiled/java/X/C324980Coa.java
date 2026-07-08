package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Coa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoEnterUtil$checkPreloadAndShow$1", f = "TakoEnterUtil.kt", l = {742}, m = "invokeSuspend")
public final class C324980Coa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoEnterParams LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, Long, String, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C324980Coa(TakoEnterParams takoEnterParams, C19EG c19eg, long j, InterfaceC1631620sYq<? super Boolean, ? super Long, ? super String, Unit> interfaceC1631620sYq, InterfaceC1364105Vn<? super C324980Coa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = takoEnterParams;
        this.LLILZ = c19eg;
        this.LLILZIL = j;
        this.LLILZLL = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C324980Coa c324980Coa = new C324980Coa(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c324980Coa.LLILLJJLI = obj;
        return c324980Coa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ = obj;
        C1C7U.LIZ("TakoEnterUtil@4341.checkPreloadAndShow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                AIBotInfo aIBotInfo = this.LLILLL.botInfo;
                long j = aIBotInfo.botId;
                int i2 = aIBotInfo.botSource;
                int iLIZ = C0R2Q.LIZ(C2286608xc.LJ(aIBotInfo.botType));
                int iLIZ2 = C0R2Q.LIZ(C2286608xc.LJ(this.LLILLL.botInfo.botMode));
                long j2 = C1EE3.LIZ().sheetLoadingTimeout;
                C324970CoZ c324970CoZ = new C324970CoZ(j, i2, iLIZ, iLIZ2, this.LLILLL, interfaceC497601wk, null);
                this.LL = 1;
                objLIZIZ = C099A.LIZIZ(j2, c324970CoZ, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("TakoEnterUtil@4341.checkPreloadAndShow$1");
                    return objLJFF;
                }
            }
            if (((Boolean) objLIZIZ).booleanValue()) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILZ);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C343801Vc(this.LLILZLL, this.LLILZIL, null), 2);
            } else {
                LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(this.LLILZ);
                C1DFH c1dfh2 = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope2, C2107308Nj.LIZ, null, new C01YQ(this.LLILZ, null), 2);
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                TakoEnterParams takoEnterParams = this.LLILLL;
                String str = takoEnterParams.enterFrom;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = takoEnterParams.enterMethod;
                if (str3 != null) {
                    str2 = str3;
                }
                C1862330yYx.LJJLIIJ(c1862330yYx, str, str2, System.currentTimeMillis() - this.LLILZIL);
            }
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            LifecycleCoroutineScope lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(this.LLILZ);
            C1DFH c1dfh3 = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope3, C2107308Nj.LIZ, null, new C343901Vd(this.LLILZLL, this.LLILZIL, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoEnterUtil@4341.checkPreloadAndShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
