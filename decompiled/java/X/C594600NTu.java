package X;

import com.ss.android.ugc.aweme.pipo.ccdc.internal.IPIPOClientAIOcrService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.ccdc.jsb.PipoInitOcrModelMethodIDL$initClientAIModels$2", f = "PipoInitOcrModelMethodIDL.kt", l = {58}, m = "invokeSuspend")
public final class C594600NTu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ IPIPOClientAIOcrService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594600NTu(IPIPOClientAIOcrService iPIPOClientAIOcrService, InterfaceC1364105Vn<? super C594600NTu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iPIPOClientAIOcrService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594600NTu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PipoInitOcrModelMethodIDL@c8c1.initClientAIModels$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        while (!this.LLILLJJLI.LJ()) {
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("PipoInitOcrModelMethodIDL@c8c1.initClientAIModels$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PipoInitOcrModelMethodIDL@c8c1.initClientAIModels$2");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
