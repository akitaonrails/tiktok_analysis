package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.VCBasePipelineHandler$process$2$1", f = "VCBasePipelineHandler.kt", l = {}, m = "invokeSuspend")
public final class C353080Dso extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public final /* synthetic */ Function1<C19536311c1, Object> LL;
    public final /* synthetic */ C19536311c1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C353080Dso(Function1<? super C19536311c1, Object> function1, C19536311c1 c19536311c1, InterfaceC1364105Vn<? super C353080Dso> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c19536311c1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353080Dso(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VCBasePipelineHandler@28e4.process$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objInvoke = this.LL.invoke(this.LLILLJJLI);
        C1C7U.LIZIZ("VCBasePipelineHandler@28e4.process$2$1");
        return objInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
