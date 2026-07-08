package X;

import Y.AgS75S1200000_6;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HP0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem$onViewCreated$14$1", f = "MixStudioHomePageAssem.kt", l = {912}, m = "invokeSuspend")
public final class C0HP0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC440230HOb<? extends List<C440440HOw>> LLILLJJLI;
    public final /* synthetic */ MixStudioHomePageAssem LLILLL;
    public final /* synthetic */ InterfaceC440230HOb<? extends List<C440440HOw>> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HP0(InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb, MixStudioHomePageAssem mixStudioHomePageAssem, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb2, String str, InterfaceC1364105Vn<? super C0HP0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC440230HOb;
        this.LLILLL = mixStudioHomePageAssem;
        this.LLILZ = interfaceC440230HOb2;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HP0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioHomePageAssem@94b0.onViewCreated$14$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<C0HOM<? extends Object>> state = this.LLILLJJLI.getState();
            AgS75S1200000_6 agS75S1200000_6 = new AgS75S1200000_6(this.LLILLL, this.LLILZ, this.LLILZIL, 0);
            this.LL = 1;
            if (state.collect(agS75S1200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.onViewCreated$14$1");
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
