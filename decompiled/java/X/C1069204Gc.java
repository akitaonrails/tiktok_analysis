package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.04Gc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.promotion.SeaPdpPromotionMgr$fetchRelatedProducts$1", f = "SeaPdpPromotionMgr.kt", l = {375}, m = "invokeSuspend")
public final class C1069204Gc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public SeaPdpViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ C04GO LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1069204Gc(C04GO c04go, List<String> list, InterfaceC1364105Vn<? super C1069204Gc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c04go;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1069204Gc(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SeaPdpViewModel seaPdpViewModel;
        C1C7U.LIZ("SeaPdpPromotionMgr@45da.fetchRelatedProducts$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                seaPdpViewModel = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            seaPdpViewModel = this.LLILLL.LIZ;
            C1758570vrb c1758570vrb = PdpApi.LIZ;
            List<String> list = this.LLILZ;
            this.LL = seaPdpViewModel;
            this.LLILLJJLI = 1;
            obj = c1758570vrb.LJ(4, list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SeaPdpPromotionMgr@45da.fetchRelatedProducts$1");
                return objLJFF;
            }
        }
        seaPdpViewModel.e = (C1758730vrr) obj;
        C04GO c04go = this.LLILLL;
        SeaPdpViewModel seaPdpViewModel2 = c04go.LIZ;
        seaPdpViewModel2.f = true;
        seaPdpViewModel2.setState(new AwS580S0100000_1(c04go, 953));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpPromotionMgr@45da.fetchRelatedProducts$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
