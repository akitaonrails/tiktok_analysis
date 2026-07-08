package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05rM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.neo.SearchListAutoplayHelper$SearchListAutoplay$checkLogicV2$6", f = "SearchListAutoplayHelper.kt", l = {484}, m = "invokeSuspend")
public final class C1483405rM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C648610PcJ LLILLJJLI;
    public final /* synthetic */ List<InterfaceC648350Pbt> LLILLL;
    public final /* synthetic */ C587060N0u LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1483405rM(C648610PcJ c648610PcJ, List<? extends InterfaceC648350Pbt> list, C587060N0u c587060N0u, InterfaceC1364105Vn<? super C1483405rM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c648610PcJ;
        this.LLILLL = list;
        this.LLILZ = c587060N0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1483405rM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SearchListAutoplayHelper$SearchListAutoplay@5fc1.checkLogicV2$6");
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
            C1483205rK<UrlModel> c1483205rK = C1483305rL.LIZ;
            int iIntValue = ((Number) C1483505rN.LIZ.getValue()).intValue();
            this.LL = 1;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C1483305rL.LIZIZ.compareAndSet(false, true)) {
                obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1483105rJ(iIntValue, jCurrentTimeMillis, null));
            } else {
                obj = false;
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchListAutoplayHelper$SearchListAutoplay@5fc1.checkLogicV2$6");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILLJJLI.LIZLLL.Q1(this.LLILLL, this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchListAutoplayHelper$SearchListAutoplay@5fc1.checkLogicV2$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
