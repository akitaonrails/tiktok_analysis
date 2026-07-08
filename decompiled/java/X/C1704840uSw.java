package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.DefaultResourceProvider$fetchCategoryFromCacheAndUpdate$1$onSuccess$1", f = "DefaultResourceProvider.kt", l = {}, m = "invokeSuspend")
public final class C1704840uSw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1705310uTh LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704840uSw(C1705310uTh c1705310uTh, String str, int i, int i2, InterfaceC1364105Vn<? super C1704840uSw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1705310uTh;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704840uSw(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultResourceProvider@b5b8.fetchCategoryFromCacheAndUpdate$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIL().fetchPanelInfo(this.LLILLJJLI, false, "", this.LLILLL, this.LLILZ, null, C2097608Jq.LJ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultResourceProvider@b5b8.fetchCategoryFromCacheAndUpdate$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
