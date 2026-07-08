package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ndq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.PdpRepositoryOptimized$fetchProductInfoV2$source$3$2", f = "PdpRepositoryOptimized.kt", l = {}, m = "invokeSuspend")
public final class C598600Ndq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598600Ndq(Map<String, ? extends Object> map, IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i, InterfaceC1364105Vn<? super C598600Ndq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = pdpEnterParam;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598600Ndq(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$source$3$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
        Map<String, Object> map = this.LL;
        Map<String, Object> map2 = this.LLILLJJLI.trackParams;
        boolean z = this.LLILLL;
        int i = this.LLILZ;
        c1758310vrB.getClass();
        C1758310vrB.LJJJ(i, map, map2, z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$source$3$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
