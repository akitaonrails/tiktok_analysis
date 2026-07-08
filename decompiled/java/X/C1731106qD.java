package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06qD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageShareHelper$shareImageToDMMultiple$1$1$onSuccess$1$2", f = "SearchImageShareHelper.kt", l = {}, m = "invokeSuspend")
public final class C1731106qD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseSharePackage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1731106qD(BaseSharePackage baseSharePackage, InterfaceC1364105Vn<? super C1731106qD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseSharePackage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1731106qD(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchImageShareHelper@9d.shareImageToDMMultiple$1$1$onSuccess$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1731606qI c1731606qI = C1731606qI.LIZ;
        BaseSharePackage baseSharePackage = this.LL;
        c1731606qI.getClass();
        C1731606qI.LIZ(null, baseSharePackage);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchImageShareHelper@9d.shareImageToDMMultiple$1$1$onSuccess$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
