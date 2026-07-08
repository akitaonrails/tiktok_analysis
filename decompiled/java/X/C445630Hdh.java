package X;

import com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService;
import com.ss.android.ugc.aweme.share.improve.channel.AIRemixChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.channel.AIRemixChannel$reportShowResultWhenSettled$1", f = "AIRemixChannel.kt", l = {309}, m = "invokeSuspend")
public final class C445630Hdh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIRemixChannel LLILLL;
    public final /* synthetic */ IAIRemixEntranceMobService LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445630Hdh(AIRemixChannel aIRemixChannel, IAIRemixEntranceMobService iAIRemixEntranceMobService, InterfaceC1364105Vn<? super C445630Hdh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIRemixChannel;
        this.LLILZ = iAIRemixEntranceMobService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C445630Hdh c445630Hdh = new C445630Hdh(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c445630Hdh.LLILLJJLI = obj;
        return c445630Hdh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("AIRemixChannel@4caa.reportShowResultWhenSettled$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C0M7D c0m7d = this.LLILLL.LLILLL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (c0m7d.LIZIZ(this) == objLJFF) {
                C1C7U.LIZIZ("AIRemixChannel@4caa.reportShowResultWhenSettled$1");
                return objLJFF;
            }
        }
        if (!C2296808zG.LJI(interfaceC497601wk)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIRemixChannel@4caa.reportShowResultWhenSettled$1");
            return unit;
        }
        this.LLILLL.LIZ(this.LLILZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIRemixChannel@4caa.reportShowResultWhenSettled$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
