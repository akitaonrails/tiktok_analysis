package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wCC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$request$2", f = "ShopMallRepository.kt", l = {197, 228, 265, 294}, m = "invokeSuspend")
public final class C1771340wCC extends C09AX implements Function2<C094D<? super AbstractC1771170wBv>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1771590wCb LLILLL;
    public final /* synthetic */ EnumC1771830wCz LLILZ;
    public final /* synthetic */ C1771500wCS LLILZIL;
    public final /* synthetic */ InterfaceC1773310wFN LLILZLL;
    public final /* synthetic */ C1773140wF6 LLIZ;
    public final /* synthetic */ Function1<AbstractC1771170wBv, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771340wCC(C1771500wCS c1771500wCS, InterfaceC1773310wFN interfaceC1773310wFN, C1773140wF6 c1773140wF6, C1771590wCb c1771590wCb, EnumC1771830wCz enumC1771830wCz, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1771590wCb;
        this.LLILZ = enumC1771830wCz;
        this.LLILZIL = c1771500wCS;
        this.LLILZLL = interfaceC1773310wFN;
        this.LLIZ = c1773140wF6;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1771340wCC c1771340wCC = new C1771340wCC(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILLL, this.LLILZ, interfaceC1364105Vn, this.LLIZLLLIL);
        c1771340wCC.LLILLJJLI = obj;
        return c1771340wCC;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARN: Type inference failed for: r0v136, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v72, types: [T, java.util.Map] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 1201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1771340wCC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super AbstractC1771170wBv> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
