package X;

import com.ss.android.ugc.aweme.unifiedauthapi.model.ServerIntelligentRequest;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.intelligent.PushServerIntelligentPopupHelper$processServerIntelligentAsync$1$1", f = "PushServerIntelligentPopupHelper.kt", l = {118}, m = "invokeSuspend")
public final class C495601wQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UnifiedAuthPopupConfig LLILLJJLI;
    public final /* synthetic */ ServerIntelligentRequest LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C495601wQ(UnifiedAuthPopupConfig unifiedAuthPopupConfig, ServerIntelligentRequest serverIntelligentRequest, long j, Function2<? super Boolean, ? super Boolean, Unit> function2, InterfaceC1364105Vn<? super C495601wQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = unifiedAuthPopupConfig;
        this.LLILLL = serverIntelligentRequest;
        this.LLILZ = j;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495601wQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushServerIntelligentPopupHelper@92aa.processServerIntelligentAsync$1$1");
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
            C19208210Cq c19208210Cq = C19208210Cq.LIZ;
            UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LLILLJJLI;
            String str = this.LLILLL.traceId;
            Float fLIZLLL = C2286608xc.LIZLLL(-1.0f);
            long j = this.LLILZ;
            c19208210Cq.getClass();
            C19208210Cq.LIZIZ(unifiedAuthPopupConfig, false, false, str, fLIZLLL, null, "cancelled by user", j);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
            C495501wP c495501wP = new C495501wP(this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pqLLIILII, c495501wP) == objLJFF) {
                C1C7U.LIZIZ("PushServerIntelligentPopupHelper@92aa.processServerIntelligentAsync$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushServerIntelligentPopupHelper@92aa.processServerIntelligentAsync$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
