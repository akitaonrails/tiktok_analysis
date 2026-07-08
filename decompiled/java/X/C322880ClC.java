package X;

import com.ss.android.ugc.aweme.poi.detail.amusement.PoiAmusementListSharedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ClC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.amusement.PoiAmusementListSharedVM$manualListLoadMore$1", f = "PoiAmusementListSharedVM.kt", l = {220}, m = "invokeSuspend")
public final class C322880ClC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiAmusementListSharedVM LLILLJJLI;
    public final /* synthetic */ C1180260goq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322880ClC(PoiAmusementListSharedVM poiAmusementListSharedVM, C1180260goq c1180260goq, InterfaceC1364105Vn<? super C322880ClC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiAmusementListSharedVM;
        this.LLILLL = c1180260goq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322880ClC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiAmusementListSharedVM@e0b1.manualListLoadMore$1");
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
            PoiAmusementListSharedVM poiAmusementListSharedVM = this.LLILLJJLI;
            C1180260goq c1180260goq = this.LLILLL;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            AbstractC329610Cw3<C1180260goq> config = poiAmusementListSharedVM.getConfig();
            if (c1180260goq == null) {
                c1180260goq = poiAmusementListSharedVM.LLILZIL;
            }
            config.onLoadMore(c2252611DEt, c1180260goq);
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("PoiAmusementListSharedVM@e0b1.manualListLoadMore$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiAmusementListSharedVM@e0b1.manualListLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
