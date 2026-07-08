package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06hT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.prompts.api.misc.SafeMutableSet$removeAll$1", f = "SafeMutableSet.kt", l = {108}, m = "invokeSuspend")
public final class C1676906hT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C1676806hS LLILLJJLI;
    public Function1 LLILLL;
    public int LLILZ;
    public final /* synthetic */ C1676806hS<T> LLILZIL;
    public final /* synthetic */ Function1<T, Boolean> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1676906hT(C1676806hS<T> c1676806hS, Function1<? super T, Boolean> function1, InterfaceC1364105Vn<? super C1676906hT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1676806hS;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1676906hT(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1676806hS c1676806hS;
        C1DEV c1dev;
        Function1 function1;
        C1C7U.LIZ("SafeMutableSet@9a5e.removeAll$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                function1 = this.LLILLL;
                c1676806hS = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1676806hS = this.LLILZIL;
            c1dev = c1676806hS.LIZIZ;
            function1 = this.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = c1676806hS;
            this.LLILLL = function1;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("SafeMutableSet@9a5e.removeAll$1");
                return objLJFF;
            }
        }
        try {
            C19719612Di.LJJIII(c1676806hS.LIZ, new AwS581S0100000_2(function1, (Function1<Object, String>) 36), true);
            c1676806hS.LIZJ = C13LP.LLIIJI(c1676806hS.LIZ);
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SafeMutableSet@9a5e.removeAll$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
