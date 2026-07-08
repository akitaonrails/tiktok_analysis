package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2147}, m = "invokeSuspend")
public final class C1676870tjp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AbstractC1676900tjs LL;
    public int LLILLJJLI;
    public final /* synthetic */ AbstractC1676900tjs<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1676870tjp(AbstractC1676900tjs<Object> abstractC1676900tjs, InterfaceC1364105Vn<? super C1676870tjp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC1676900tjs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1676870tjp(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [S, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                AbstractC1676900tjs abstractC1676900tjs = this.LL;
                C155000ia.LIZIZ(obj);
                try {
                    ((C1676950tjx) abstractC1676900tjs).LIZIZ = abstractC1676900tjs.LIZIZ();
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw null;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        AbstractC1676900tjs<Object> abstractC1676900tjs2 = this.LLILLL;
        abstractC1676900tjs2.getClass();
        ((C20029113Yj) C1676860tjo.LIZIZ.getValue()).LIZLLL(abstractC1676900tjs2, null, C1676860tjo.LIZ);
        this.LLILLL.getClass();
        this.LL = this.LLILLL;
        this.LLILLJJLI = 1;
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
