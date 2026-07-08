package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoNoNetworkAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoNoNetworkAssem$onViewCreated$3", f = "TakoAIVideoNoNetworkAssem.kt", l = {68}, m = "invokeSuspend")
public final class C1327605Hm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoAIVideoNoNetworkAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327605Hm(TakoAIVideoNoNetworkAssem takoAIVideoNoNetworkAssem, InterfaceC1364105Vn<? super C1327605Hm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoAIVideoNoNetworkAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1327605Hm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoNoNetworkAssem@7bee.onViewCreated$3");
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
            TakoAIVideoNoNetworkAssem takoAIVideoNoNetworkAssem = this.LLILLJJLI;
            C414301jJ c414301jJ = new C414301jJ(takoAIVideoNoNetworkAssem.LLJJI, takoAIVideoNoNetworkAssem.LLJJIII, new C05A2(null));
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 42);
            this.LL = 1;
            if (c414301jJ.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoNoNetworkAssem@7bee.onViewCreated$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoNoNetworkAssem@7bee.onViewCreated$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
