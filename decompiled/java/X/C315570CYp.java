package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.sparklite.helper.PreloadViewHelper$preloadNG$1", f = "PreloadViewHelper.kt", l = {}, m = "invokeSuspend")
public final class C315570CYp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315570CYp(String str, int i, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315570CYp(this.LL, this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreloadViewHelper@5f70.preloadNG$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1546360qLK c1546360qLK = C1546360qLK.LIZ;
        String str = this.LL;
        boolean z = this.LLILLJJLI;
        int i = this.LLILLL;
        c1546360qLK.getClass();
        C1546360qLK.LIZJ(11, i, str, z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreloadViewHelper@5f70.preloadNG$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
