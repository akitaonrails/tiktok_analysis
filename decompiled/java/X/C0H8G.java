package X;

import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H8G, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder$onViewDetachedFromWindow$1", f = "SearchPhotoHolder.kt", l = {1104}, m = "invokeSuspend")
public final class C0H8G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchPhotoHolder LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H8G(SearchPhotoHolder searchPhotoHolder, String str, InterfaceC1364105Vn<? super C0H8G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchPhotoHolder;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H8G(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchPhotoHolder@59ba.onViewDetachedFromWindow$1");
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
            Taco tacoLIZ = C0PCE.LIZ(this.LLILLJJLI.itemView, false);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0H8H c0h8h = new C0H8H(this.LLILLJJLI, this.LLILLL, tacoLIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c0h8h) == objLJFF) {
                C1C7U.LIZIZ("SearchPhotoHolder@59ba.onViewDetachedFromWindow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPhotoHolder@59ba.onViewDetachedFromWindow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
