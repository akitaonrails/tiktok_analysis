package X;

import com.ss.android.vesdk.VEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ds1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.CompressVideoUtil$optimizeVideo$1$1$onCompileDone$1", f = "CompressVideoUtil.kt", l = {}, m = "invokeSuspend")
public final class C352590Ds1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VEEditor LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352590Ds1(VEEditor vEEditor, InterfaceC1364105Vn<? super C352590Ds1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = vEEditor;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352590Ds1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CompressVideoUtil@9a1f.optimizeVideo$1$1$onCompileDone$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIILIIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CompressVideoUtil@9a1f.optimizeVideo$1$1$onCompileDone$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
