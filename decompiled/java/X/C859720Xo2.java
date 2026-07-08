package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xo2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.seqmgr.impl.AnimSeqShowMgrImpl$tryLaunchDoAnimLoopJob$2", f = "AnimSeqShowMgrImpl.kt", l = {}, m = "invokeSuspend")
public final class C859720Xo2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C859810XoB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859720Xo2(C859810XoB c859810XoB, InterfaceC1364105Vn<? super C859720Xo2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c859810XoB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C859720Xo2 c859720Xo2 = new C859720Xo2(this.LLILLJJLI, interfaceC1364105Vn);
        c859720Xo2.LL = obj;
        return c859720Xo2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnimSeqShowMgrImpl@5.tryLaunchDoAnimLoopJob$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) this.LL, C0PEM.LIZJ, null, new C859730Xo3(this.LLILLJJLI, null), 2);
        C1C7U.LIZIZ("AnimSeqShowMgrImpl@5.tryLaunchDoAnimLoopJob$2");
        return anonymousClass0956LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
