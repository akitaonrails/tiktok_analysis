package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.pipeline.handler.PPBaseHandler$handleRunningThread$2", f = "PPBaseHandler.kt", l = {365}, m = "invokeSuspend")
public final class C19523311Zv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC19524311a5 LLILLJJLI;
    public final /* synthetic */ InterfaceC19526511aR LLILLL;
    public final /* synthetic */ List<InterfaceC19526611aS> LLILZ;
    public final /* synthetic */ C11ZU LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19523311Zv(InterfaceC19524311a5 interfaceC19524311a5, InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list, C11ZU c11zu, InterfaceC1364105Vn<? super C19523311Zv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC19524311a5;
        this.LLILLL = interfaceC19526511aR;
        this.LLILZ = list;
        this.LLILZIL = c11zu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19523311Zv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PPBaseHandler@19d7.handleRunningThread$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC19524311a5 interfaceC19524311a5 = this.LLILLJJLI;
            InterfaceC19526511aR interfaceC19526511aR = this.LLILLL;
            List<InterfaceC19526611aS> list = this.LLILZ;
            C11ZU c11zu = this.LLILZIL;
            this.LL = 1;
            if (interfaceC19524311a5.LIZ(interfaceC19526511aR, list, c11zu, this) == objLJFF) {
                C1C7U.LIZIZ("PPBaseHandler@19d7.handleRunningThread$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PPBaseHandler@19d7.handleRunningThread$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
