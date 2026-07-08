package X;

import Y.AgS289S0100000_8;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseAiContentFragment$setupMobEnterFlow$1", f = "ChooseAiContentFragment.kt", l = {220}, m = "invokeSuspend")
public final class C1327705Hn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C528760KoU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327705Hn(C528760KoU c528760KoU, InterfaceC1364105Vn<? super C1327705Hn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c528760KoU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1327705Hn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChooseAiContentFragment@d5f4.setupMobEnterFlow$1");
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
            C528760KoU c528760KoU = this.LLILLJJLI;
            C1768806wI c1768806wI = new C1768806wI(new C414301jJ(c528760KoU.LLLLZLL, c528760KoU.LLLLZLLIL, new C1317905Dt(null)), 7);
            AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLJJLI, 22);
            this.LL = 1;
            if (c1768806wI.collect(agS289S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("ChooseAiContentFragment@d5f4.setupMobEnterFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChooseAiContentFragment@d5f4.setupMobEnterFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
