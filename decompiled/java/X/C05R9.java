package X;

import Y.AgS193S0200000_2;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05R9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem$RenderUi$3$3$1$1", f = "TakoContentPreviewAssem.kt", l = {249}, m = "invokeSuspend")
public final class C05R9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoContentPreviewAssem LLILLJJLI;
    public final /* synthetic */ C05UN LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05R9(TakoContentPreviewAssem takoContentPreviewAssem, C05UN c05un, InterfaceC1364105Vn<? super C05R9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoContentPreviewAssem;
        this.LLILLL = c05un;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05R9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = this.LLILLJJLI.Oo().LLILLJJLI;
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILLL, this.LLILLJJLI, 15);
            this.LL = 1;
            if (anonymousClass0951.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$1");
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
