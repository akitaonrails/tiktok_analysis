package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H8D, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder$mobShowPartial$1", f = "SearchPhotoHolder.kt", l = {991}, m = "invokeSuspend")
public final class C0H8D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchPhotoHolder LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H8D(SearchPhotoHolder searchPhotoHolder, InterfaceC1364105Vn<? super C0H8D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchPhotoHolder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H8D(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchPhotoHolder@59ba.mobShowPartial$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            C0H8F c0h8f = new C0H8F(this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfh, c0h8f) == objLJFF) {
                C1C7U.LIZIZ("SearchPhotoHolder@59ba.mobShowPartial$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPhotoHolder@59ba.mobShowPartial$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
