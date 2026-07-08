package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMVideoPreloader$preloadVideo$1", f = "IMVideoPreloader.kt", l = {180}, m = "invokeSuspend")
public final class C332380D1g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C332390D1h LLILLL;
    public final /* synthetic */ Aweme LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332380D1g(C332390D1h c332390D1h, Aweme aweme, InterfaceC1364105Vn<? super C332380D1g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c332390D1h;
        this.LLILZ = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C332380D1g c332380D1g = new C332380D1g(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c332380D1g.LLILLJJLI = obj;
        return c332380D1g;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("IMVideoPreloader@31b8.preloadVideo$1");
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
            long j = this.LLILLL.LIZJ().LIZIZ;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("IMVideoPreloader@31b8.preloadVideo$1");
                return objLJFF;
            }
        }
        if (this.LLILLL.LIZJ.containsKey(this.LLILZ.getAid())) {
            SimVideoUrlModel simVideoUrlModelLJFF = C1483340ohg.LJFF(this.LLILZ);
            if (simVideoUrlModelLJFF != null) {
                C1478160oZK.LIZ().LJJJJZ(simVideoUrlModelLJFF);
            }
            C2296808zG.LIZLLL(interfaceC497601wk, this.LLILZ.getAid());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMVideoPreloader@31b8.preloadVideo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
