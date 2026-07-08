package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$initLoadMore$2$2", f = "DraftBoxFragment.kt", l = {}, m = "invokeSuspend")
public final class C561230Lzl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftBoxFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561230Lzl(DraftBoxFragment draftBoxFragment, InterfaceC1364105Vn<? super C561230Lzl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftBoxFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561230Lzl(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxFragment@80e.initLoadMore$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.dS().LLJILJIL.setValue(false);
        this.LL.VR().LLILZLL = false;
        this.LL.VR().LLLIIIIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.initLoadMore$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
