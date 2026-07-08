package X;

import Y.AgS289S0100000_8;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.viewholder.AIContentExploreAISelfViewHolder$updateProfileImage$1", f = "AIContentExploreAISelfViewHolder.kt", l = {88}, m = "invokeSuspend")
public final class C557680Lu2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C557670Lu1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557680Lu2(C557670Lu1 c557670Lu1, InterfaceC1364105Vn<? super C557680Lu2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c557670Lu1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C557680Lu2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIContentExploreAISelfViewHolder@2972.updateProfileImage$1");
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
            C557670Lu1 c557670Lu1 = this.LLILLJJLI;
            C581160Mqo c581160Mqo = new C581160Mqo(new C414301jJ(c557670Lu1.lottieAnimationLoadedFlow, c557670Lu1.albumAiSelfTaskViewModel.LLILLJJLI, new C410801ik(null)), 6);
            AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLJJLI, 38);
            this.LL = 1;
            if (c581160Mqo.collect(agS289S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("AIContentExploreAISelfViewHolder@2972.updateProfileImage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIContentExploreAISelfViewHolder@2972.updateProfileImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
