package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17sx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.core.download.ability.WaterMarkAbility$handleRequest$2", f = "WaterMarkAbility.kt", l = {}, m = "invokeSuspend")
public final class C21170117sx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21170017sw<CONTEXT> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21170117sx(C21170017sw<CONTEXT> c21170017sw, InterfaceC1364105Vn<? super C21170117sx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21170017sw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21170117sx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WaterMarkAbility@dbe4.handleRequest$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJFF.getClass();
        C21170017sw<CONTEXT> c21170017sw = this.LL;
        c21170017sw.LJII.LIZJ(c21170017sw.LJIIL().LIZIZ, this.LL.LJIIIIZZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WaterMarkAbility@dbe4.handleRequest$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
