package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ngc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.ccdc.jsb.PipoInitOcrModelMethodIDL$handle$1", f = "PipoInitOcrModelMethodIDL.kt", l = {31}, m = "invokeSuspend")
public final class C600320Ngc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CompletionBlock<InterfaceC600470Ngr> LLILLJJLI;
    public final /* synthetic */ C600570Nh1 LLILLL;
    public final /* synthetic */ InterfaceC600460Ngq LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C600320Ngc(CompletionBlock<InterfaceC600470Ngr> completionBlock, C600570Nh1 c600570Nh1, InterfaceC600460Ngq interfaceC600460Ngq, InterfaceC1364105Vn<? super C600320Ngc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = completionBlock;
        this.LLILLL = c600570Nh1;
        this.LLILZ = interfaceC600460Ngq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C600320Ngc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PipoInitOcrModelMethodIDL@c8c1.handle$1");
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
                C600570Nh1 c600570Nh1 = this.LLILLL;
                String enterFrom = this.LLILZ.getEnterFrom();
                this.LL = 1;
                obj = c600570Nh1.LIZJ(enterFrom, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PipoInitOcrModelMethodIDL@c8c1.handle$1");
                    return objLJFF;
                }
            }
            c098200Yq = Boolean.valueOf(((Boolean) obj).booleanValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = false;
        }
        if (!((Boolean) c098200Yq).booleanValue()) {
            C2382909Vj.LIZ(this.LLILLJJLI, 0, "init ocr model failed", null, 4);
        } else {
            this.LLILLJJLI.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC600470Ngr.class, null), "");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoInitOcrModelMethodIDL@c8c1.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
