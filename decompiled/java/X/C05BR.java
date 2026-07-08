package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05BR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.tako.SearchTakoRouteWrapper$openWithTryOnGallery$currentFrameSaveTask$1", f = "SearchTakoRouteWrapper.kt", l = {}, m = "invokeSuspend")
public final class C05BR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ C1318505Dz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05BR(C19EG c19eg, C1318505Dz c1318505Dz, InterfaceC1364105Vn<? super C05BR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = c1318505Dz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05BR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchTakoRouteWrapper@fad0.openWithTryOnGallery$currentFrameSaveTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLJJ = C14TF.LIZIZ.LJJ(this.LL, this.LLILLJJLI.LIZJ, "try_on_frame");
        C1C7U.LIZIZ("SearchTakoRouteWrapper@fad0.openWithTryOnGallery$currentFrameSaveTask$1");
        return strLJJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
