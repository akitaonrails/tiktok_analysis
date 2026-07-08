package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Z0M, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tars.impl.TarsPipelineExecution$subscribe$1", f = "TarsPipelineExecution.kt", l = {178}, m = "invokeSuspend")
public final class C0Z0M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0Z0P LLILLJJLI;
    public final /* synthetic */ C882890YkJ LLILLL;
    public final /* synthetic */ InterfaceC892690Z0h LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z0M(C0Z0P c0z0p, C882890YkJ c882890YkJ, InterfaceC892690Z0h interfaceC892690Z0h, InterfaceC1364105Vn<? super C0Z0M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0z0p;
        this.LLILLL = c882890YkJ;
        this.LLILZ = interfaceC892690Z0h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z0M(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("TarsPipelineExecution@e84c.subscribe$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C0Z0P c0z0p = this.LLILLJJLI;
                this.LL = 1;
                if (c0z0p.LJ(this) == objLJFF) {
                    C1C7U.LIZIZ("TarsPipelineExecution@e84c.subscribe$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.LJFF(th);
            this.LLILLJJLI.LIZLLL(this.LLILLL);
            this.LLILZ.LIZ(this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TarsPipelineExecution@e84c.subscribe$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
