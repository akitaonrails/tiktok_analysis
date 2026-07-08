package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Csn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionTextManager$insertCaption$3$2$1", f = "CaptionTextManager.kt", l = {}, m = "invokeSuspend")
public final class C327590Csn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C327620Csq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327590Csn(C327620Csq c327620Csq, InterfaceC1364105Vn<? super C327590Csn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c327620Csq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327590Csn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionTextManager@987e.insertCaption$3$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC327690Csx abstractC327690Csx = this.LL.LJIIIZ;
        if (abstractC327690Csx != null) {
            abstractC327690Csx.LIZIZ(this.LL.LJIIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionTextManager@987e.insertCaption$3$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
