package X;

import com.ss.android.ugc.aweme.pipo.ccdc.internal.IPIPOClientAIOcrService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nhf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.ccdc.jsb.PipoStartBackgroundCcdcOcrMethodIDL$handle$1$result$1$ocrResult$1", f = "PipoStartBackgroundCcdcOcrMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C600970Nhf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1716240ulK>, Object> {
    public final /* synthetic */ IPIPOClientAIOcrService LL;
    public final /* synthetic */ InterfaceC1716220ulI LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C600970Nhf(IPIPOClientAIOcrService iPIPOClientAIOcrService, InterfaceC1716220ulI interfaceC1716220ulI, InterfaceC1364105Vn<? super C600970Nhf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iPIPOClientAIOcrService;
        this.LLILLJJLI = interfaceC1716220ulI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C600970Nhf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PipoStartBackgroundCcdcOcrMethodIDL@c18c.handle$1$result$1$ocrResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1716240ulK c1716240ulKLIZIZ = this.LL.LIZIZ(this.LLILLJJLI.getFrontCardImage(), this.LLILLJJLI.getBackCardImage());
        C1C7U.LIZIZ("PipoStartBackgroundCcdcOcrMethodIDL@c18c.handle$1$result$1$ocrResult$1");
        return c1716240ulKLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1716240ulK> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
