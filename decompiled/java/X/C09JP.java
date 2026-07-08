package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09JP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.config.AITheaterDraftSavedHandler$processLocalDraftSaved$1", f = "AITheaterDraftSavedHandler.kt", l = {40}, m = "invokeSuspend")
public final class C09JP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09JP(CreativeInfo creativeInfo, InterfaceC1364105Vn<? super C09JP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09JP c09jp = new C09JP(this.LLILLL, interfaceC1364105Vn);
        c09jp.LLILLJJLI = obj;
        return c09jp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterDraftSavedHandler@8d80.processLocalDraftSaved$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                CreativeInfo creativeInfo = this.LLILLL;
                C548590LfN.LIZ.getClass();
                DraftService draftServiceLIZ = C548590LfN.LIZ();
                C09JC c09jc = new C09JC(Source.AI_THEATER, creativeInfo);
                this.LL = 1;
                if (draftServiceLIZ.LJ(c09jc, this) == objLJFF) {
                    C1C7U.LIZIZ("AITheaterDraftSavedHandler@8d80.processLocalDraftSaved$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterDraftSavedHandler@8d80.processLocalDraftSaved$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
