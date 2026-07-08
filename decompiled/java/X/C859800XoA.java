package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.seqmgr.impl.AnimSeqShowMgrImpl$cancelAndClearScope$1", f = "AnimSeqShowMgrImpl.kt", l = {}, m = "invokeSuspend")
public final class C859800XoA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C859810XoB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859800XoA(C859810XoB c859810XoB, InterfaceC1364105Vn<? super C859800XoA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c859810XoB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C859800XoA c859800XoA = new C859800XoA(this.LLILLJJLI, interfaceC1364105Vn);
        c859800XoA.LL = obj;
        return c859800XoA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnimSeqShowMgrImpl@5.cancelAndClearScope$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        this.LLILLJJLI.LLILZ = null;
        this.LLILLJJLI.LLILZIL = null;
        this.LLILLJJLI.LLILZLL = null;
        this.LLILLJJLI.LLIZLLLIL.clear();
        C2296808zG.LIZJ(interfaceC497601wk, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnimSeqShowMgrImpl@5.cancelAndClearScope$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
