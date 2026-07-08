package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05KT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMUserPreloader$cancel$1", f = "IMUserPreloader.kt", l = {149}, m = "invokeSuspend")
public final class C05KT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C05KW LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C05KW LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05KT(C05KW c05kw, String str, InterfaceC1364105Vn<? super C05KT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c05kw;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05KT(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05KW c05kw;
        C1DEV c1dev;
        Object obj2;
        C1C7U.LIZ("IMUserPreloader@15f4.cancel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.LLILLL;
                c05kw = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c05kw = this.LLILZIL;
            c1dev = c05kw.LIZLLL;
            obj2 = this.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = c05kw;
            this.LLILLL = obj2;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("IMUserPreloader@15f4.cancel$1");
                return objLJFF;
            }
        }
        try {
            c05kw.LIZIZ.remove(obj2);
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMUserPreloader@15f4.cancel$1");
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
