package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06hW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.prompts.api.misc.SafeMutableSet$clear$1", f = "SafeMutableSet.kt", l = {108}, m = "invokeSuspend")
public final class C1677206hW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C1676806hS LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1676806hS<T> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677206hW(C1676806hS<T> c1676806hS, InterfaceC1364105Vn<? super C1677206hW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1676806hS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1677206hW(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1676806hS c1676806hS;
        C1DEV c1dev;
        C1C7U.LIZ("SafeMutableSet@9a5e.clear$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c1676806hS = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1676806hS = this.LLILZ;
            c1dev = c1676806hS.LIZIZ;
            this.LL = c1dev;
            this.LLILLJJLI = c1676806hS;
            this.LLILLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("SafeMutableSet@9a5e.clear$1");
                return objLJFF;
            }
        }
        try {
            c1676806hS.LIZ.clear();
            c1676806hS.LIZJ = C08CX.INSTANCE;
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SafeMutableSet@9a5e.clear$1");
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
