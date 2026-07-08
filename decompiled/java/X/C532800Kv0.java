package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.MaterialHandler$downloadResource$1", f = "MaterialHandler.kt", l = {86}, m = "invokeSuspend")
public final class C532800Kv0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C532910KvB LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC531800KtO LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532800Kv0(C532910KvB c532910KvB, String str, InterfaceC531800KtO interfaceC531800KtO, InterfaceC1364105Vn<? super C532800Kv0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c532910KvB;
        this.LLILLL = str;
        this.LLILZ = interfaceC531800KtO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532800Kv0(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MaterialHandler@ef69.downloadResource$1");
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
                C532910KvB c532910KvB = this.LLILLJJLI;
                String str = this.LLILLL;
                InterfaceC531800KtO interfaceC531800KtO = this.LLILZ;
                this.LL = 1;
                if (c532910KvB.LJIIJJI(str, interfaceC531800KtO, this) == objLJFF) {
                    C1C7U.LIZIZ("MaterialHandler@ef69.downloadResource$1");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C532910KvB c532910KvB2 = this.LLILLJJLI;
        String str2 = this.LLILLL;
        InterfaceC531800KtO interfaceC531800KtO2 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadResource failed: ");
            sbLIZ.append(str2);
            sbLIZ.append(", ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            c532910KvB2.LJI(C2188811AlT.LIZIZ(sbLIZ));
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = thM5exceptionOrNullimpl.toString();
            }
            interfaceC531800KtO2.onError(str2, -4002, message);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MaterialHandler@ef69.downloadResource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
