package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListRepository$refreshCommon$1$1$draftCardDeferred$1", f = "EffectProfileListRepository.kt", l = {52}, m = "invokeSuspend")
public final class C317960CdG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C317950CdF>, Object> {
    public int LL;
    public final /* synthetic */ C318050CdP LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317960CdG(C318050CdP c318050CdP, InterfaceC1364105Vn<? super C317960CdG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c318050CdP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317960CdG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectProfileListRepository@4ea9.refreshCommon$1$1$draftCardDeferred$1");
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
            C318050CdP c318050CdP = this.LLILLJJLI;
            this.LL = 1;
            obj = c318050CdP.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectProfileListRepository@4ea9.refreshCommon$1$1$draftCardDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EffectProfileListRepository@4ea9.refreshCommon$1$1$draftCardDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C317950CdF> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
