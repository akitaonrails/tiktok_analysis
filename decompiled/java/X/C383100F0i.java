package X;

import Y.AgS196S0200000_5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0F0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.preview.EPAIGCPreviewMediator$3$1", f = "EPAIGCPreviewMediator.kt", l = {111}, m = "invokeSuspend")
public final class C383100F0i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C383070F0f LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C383100F0i(C383070F0f c383070F0f, InterfaceC1364105Vn<? super C383100F0i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c383070F0f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C383100F0i c383100F0i = new C383100F0i(this.LLILLL, interfaceC1364105Vn);
        c383100F0i.LLILLJJLI = obj;
        return c383100F0i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPAIGCPreviewMediator@1518.<init>$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C383070F0f c383070F0f = this.LLILLL;
            C2252321DDq c2252321DDq = c383070F0f.LJI;
            AgS196S0200000_5 agS196S0200000_5 = new AgS196S0200000_5(c383070F0f, interfaceC497601wk, 1);
            this.LL = 1;
            if (c2252321DDq.collect(agS196S0200000_5, this) == objLJFF) {
                C1C7U.LIZIZ("EPAIGCPreviewMediator@1518.<init>$3$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
