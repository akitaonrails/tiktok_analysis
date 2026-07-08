package X;

import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShowcaseProductListRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcasePrefetchEntity$tryPrefetchData$1", f = "ShowcaseNativePrefetchManager.kt", l = {}, m = "invokeSuspend")
public final class C597800NcY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C597870Ncf LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ ShowcaseProductListRequest LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597800NcY(C597870Ncf c597870Ncf, String str, String str2, ShowcaseProductListRequest showcaseProductListRequest, InterfaceC1364105Vn<? super C597800NcY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c597870Ncf;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = showcaseProductListRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C597800NcY c597800NcY = new C597800NcY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c597800NcY.LL = obj;
        return c597800NcY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZIZ(C2296808zG.LIZ(interfaceC497601wk.getCoroutineContext()), null, null, new C597840Ncc(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
        C23250099c.LIZIZ(C2296808zG.LIZ(interfaceC497601wk.getCoroutineContext()), null, null, new C597780NcW(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
        C23250099c.LIZIZ(C2296808zG.LIZ(interfaceC497601wk.getCoroutineContext()), null, null, new C597820Nca(this.LLILZIL, this.LLILLJJLI, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
