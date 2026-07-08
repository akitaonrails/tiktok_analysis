package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qOJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.hybrid.jsb.PipoGetMemoryMetricsMethodMethod$handle$1", f = "PipoGetMemoryMetricsMethodMethod.kt", l = {37}, m = "invokeSuspend")
public final class C1548210qOJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1548200qOI LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1547870qNl LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ CompletionBlock<InterfaceC1548200qOI> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1548210qOJ(C1547870qNl c1547870qNl, Context context, CompletionBlock<InterfaceC1548200qOI> completionBlock, InterfaceC1364105Vn<? super C1548210qOJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1547870qNl;
        this.LLILZ = context;
        this.LLILZIL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1548210qOJ(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String containerID;
        InterfaceC1548200qOI interfaceC1548200qOI;
        C1C7U.LIZ("PipoGetMemoryMetricsMethodMethod@4f61.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                interfaceC1548200qOI = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC634840OvC interfaceC634840OvC = this.LLILLL.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            interfaceC1548200qOI = (InterfaceC1548200qOI) C1909107dp.LIZJ(InterfaceC1548200qOI.class, containerID);
            C1725770v0h c1725770v0h = C1725770v0h.LIZ;
            Context context = this.LLILZ;
            this.LL = interfaceC1548200qOI;
            this.LLILLJJLI = 1;
            obj = c1725770v0h.LIZ(context, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PipoGetMemoryMetricsMethodMethod@4f61.handle$1");
                return objLJFF;
            }
        }
        C1548220qOK c1548220qOK = (C1548220qOK) obj;
        if (c1548220qOK == null) {
            C2382909Vj.LIZ(this.LLILZIL, -100, "empty memory status", null, 4);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PipoGetMemoryMetricsMethodMethod@4f61.handle$1");
            return unit;
        }
        interfaceC1548200qOI.setAppMemory(C2286608xc.LIZLLL(c1548220qOK.LIZ));
        interfaceC1548200qOI.setTotalMemory(C2286608xc.LIZLLL(c1548220qOK.LIZJ));
        interfaceC1548200qOI.setMemoryStatus(C2286608xc.LJ(c1548220qOK.LIZLLL));
        interfaceC1548200qOI.setMemoryAvailPercent(C2286608xc.LIZLLL(c1548220qOK.LIZIZ));
        this.LLILZIL.onSuccess(interfaceC1548200qOI, "");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PipoGetMemoryMetricsMethodMethod@4f61.handle$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
