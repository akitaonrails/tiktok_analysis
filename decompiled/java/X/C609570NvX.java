package X;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper$runIntelligencePopupTaskAsync$2", f = "IntelligentPopupHelper.kt", l = {443}, m = "invokeSuspend")
public final class C609570NvX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C609590NvZ>, Object> {
    public int LL;
    public final /* synthetic */ UnifiedAuthPopupConfig LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C609570NvX(UnifiedAuthPopupConfig unifiedAuthPopupConfig, InterfaceC1364105Vn<? super C609570NvX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = unifiedAuthPopupConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C609570NvX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IntelligentPopupHelper@f5e9.runIntelligencePopupTaskAsync$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LLILLJJLI;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            try {
                IntelligentPopupHelper intelligentPopupHelper = IntelligentPopupHelper.LIZ;
                AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9(c2252611DEt, 409);
                intelligentPopupHelper.getClass();
                IntelligentPopupHelper.LIZIZ(unifiedAuthPopupConfig, awS588S0100000_9);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C609590NvZ c609590NvZ = new C609590NvZ(new PTYError(e.getMessage(), -1, -1, e.toString(), null), 13);
                C189200o6.m2constructorimpl(c609590NvZ);
                c2252611DEt.resumeWith(c609590NvZ);
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IntelligentPopupHelper@f5e9.runIntelligencePopupTaskAsync$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IntelligentPopupHelper@f5e9.runIntelligencePopupTaskAsync$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C609590NvZ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
