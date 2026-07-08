package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mhw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creative.tangram.workflow.ParseModelTask$execute$result$1", f = "ParseModelTask.kt", l = {82}, m = "invokeSuspend")
public final class C575660Mhw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C575810MiB>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C575640Mhu LLILLL;
    public final /* synthetic */ C575770Mi7 LLILZ;
    public final /* synthetic */ Map<Class<?>, Function0<InterfaceC575170Mh9<?, ?>>> LLILZIL;
    public final /* synthetic */ InterfaceC569070MTp LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C575660Mhw(C575640Mhu c575640Mhu, C575770Mi7 c575770Mi7, Map<Class<?>, ? extends Function0<? extends InterfaceC575170Mh9<?, ?>>> map, InterfaceC569070MTp interfaceC569070MTp, InterfaceC1364105Vn<? super C575660Mhw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c575640Mhu;
        this.LLILZ = c575770Mi7;
        this.LLILZIL = map;
        this.LLILZLL = interfaceC569070MTp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C575660Mhw c575660Mhw = new C575660Mhw(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c575660Mhw.LLILLJJLI = obj;
        return c575660Mhw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ParseModelTask@a58a.execute$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C09AE c09ae = (C09AE) ((InterfaceC497601wk) this.LLILLJJLI).getCoroutineContext().get(C09AE.LJJLJ);
                this.LLILLL.LL = c09ae;
                if (this.LLILLL.LLILLJJLI && c09ae != null) {
                    c09ae.LIZIZ(null);
                }
                C575640Mhu c575640Mhu = this.LLILLL;
                C575770Mi7 c575770Mi7 = this.LLILZ;
                Map<Class<?>, Function0<InterfaceC575170Mh9<?, ?>>> map = this.LLILZIL;
                InterfaceC569070MTp interfaceC569070MTp = this.LLILZLL;
                this.LL = 1;
                obj = c575640Mhu.LJIIIIZZ(c575770Mi7, map, interfaceC569070MTp, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ParseModelTask@a58a.execute$result$1");
                    return objLJFF;
                }
            }
            C575810MiB c575810MiB = (C575810MiB) obj;
            this.LLILLL.LL = null;
            C1C7U.LIZIZ("ParseModelTask@a58a.execute$result$1");
            return c575810MiB;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.LL = null;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C575810MiB> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
