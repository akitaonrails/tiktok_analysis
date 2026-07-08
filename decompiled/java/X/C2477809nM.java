package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09nM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UpdateImageInformationCacheKt$updateImageInformationCache$1$rotateDegree$1", f = "UpdateImageInformationCache.kt", l = {}, m = "invokeSuspend")
public final class C2477809nM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2477809nM(String str, InterfaceC1364105Vn<? super C2477809nM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2477809nM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateImageInformationCacheKt@8add.updateImageInformationCache$1$rotateDegree$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer numLJ = C2286608xc.LJ(C0CHQ.LIZ().LJIILL().getImageRotateDegree(this.LL));
        C1C7U.LIZIZ("UpdateImageInformationCacheKt@8add.updateImageInformationCache$1$rotateDegree$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
