package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CV6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.creative.GuideCreateVideoWithEffectRepo$requestData$draftCnt$1", f = "GuideCreateVideoWithEffectRepo.kt", l = {158}, m = "invokeSuspend")
public final class C0CV6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public final /* synthetic */ C12ED LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CV6(C12ED c12ed, InterfaceC1364105Vn<? super C0CV6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c12ed;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CV6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GuideCreateVideoWithEffectRepo@1a2.requestData$draftCnt$1");
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
            C12ED c12ed = this.LLILLJJLI;
            this.LL = 1;
            c12ed.getClass();
            obj = C12ED.LIZ();
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GuideCreateVideoWithEffectRepo@1a2.requestData$draftCnt$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GuideCreateVideoWithEffectRepo@1a2.requestData$draftCnt$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
