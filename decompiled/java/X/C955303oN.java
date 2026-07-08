package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03oN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.engine.PageTemplateManger$getTemplate$2", f = "PageTemplateManger.kt", l = {}, m = "invokeSuspend")
public final class C955303oN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC955203oM LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C955303oN(EnumC955203oM enumC955203oM, String str, String str2, int i, InterfaceC1364105Vn<? super C955303oN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC955203oM;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C955303oN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PageTemplateManger@d473.getTemplate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0408 anonymousClass0408 = AnonymousClass0408.LIZ;
        EnumC955203oM enumC955203oM = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        int i = this.LLILZ;
        anonymousClass0408.getClass();
        AnonymousClass0408.LJIILIIL(enumC955203oM, str, str2, i);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PageTemplateManger@d473.getTemplate$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
