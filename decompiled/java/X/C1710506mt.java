package X;

import Y.AgS283S0100000_2;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.im.messagelist.protocols.AIGroupShotGetStartedBannerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.AIGroupShotGetStartedBannerAssem$onViewCreated$4", f = "AIGroupShotGetStartedBannerAssem.kt", l = {116}, m = "invokeSuspend")
public final class C1710506mt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIGroupShotGetStartedBannerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1710506mt(AIGroupShotGetStartedBannerAssem aIGroupShotGetStartedBannerAssem, InterfaceC1364105Vn<? super C1710506mt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGroupShotGetStartedBannerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1710506mt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGroupShotGetStartedBannerAssem@6cef.onViewCreated$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<Lifecycle.State> currentStateFlow = this.LLILLJJLI.getLifecycle().getCurrentStateFlow();
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 20);
            this.LL = 1;
            if (currentStateFlow.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("AIGroupShotGetStartedBannerAssem@6cef.onViewCreated$4");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
