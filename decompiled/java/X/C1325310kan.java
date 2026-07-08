package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallTabRefreshAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS599S0100000_20;
import njp.a;

/* JADX INFO: renamed from: X.0kan, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallTabRefreshAssem$waitToRefreshFinish$refreshType$1", f = "MixMallTabRefreshAssem.kt", l = {422}, m = "invokeSuspend")
public final class C1325310kan extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EnumC1599680rjK>, Object> {
    public int LL;
    public final /* synthetic */ MixMallTabRefreshAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325310kan(MixMallTabRefreshAssem mixMallTabRefreshAssem, InterfaceC1364105Vn<? super C1325310kan> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixMallTabRefreshAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1325310kan(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixMallTabRefreshAssem@7e11.waitToRefreshFinish$refreshType$1");
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
            MixMallTabRefreshAssem mixMallTabRefreshAssem = this.LLILLJJLI;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            mixMallTabRefreshAssem.LLJ = c2252611DEt;
            c2252611DEt.LJJII(new AwS599S0100000_20(mixMallTabRefreshAssem, 26));
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixMallTabRefreshAssem@7e11.waitToRefreshFinish$refreshType$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MixMallTabRefreshAssem@7e11.waitToRefreshFinish$refreshType$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EnumC1599680rjK> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
