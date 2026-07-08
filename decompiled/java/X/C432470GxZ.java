package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.prompt.PromptAdapter$onViewDetachedFromWindow$1", f = "PromptAdapter.kt", l = {86}, m = "invokeSuspend")
public final class C432470GxZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C425510GmL LLILLJJLI;
    public final /* synthetic */ C434660H2q LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432470GxZ(C425510GmL c425510GmL, C434660H2q c434660H2q, InterfaceC1364105Vn<? super C432470GxZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c425510GmL;
        this.LLILLL = c434660H2q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432470GxZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PromptAdapter@8f9.onViewDetachedFromWindow$1");
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
            InterfaceC434700H2u interfaceC434700H2u = this.LLILLJJLI.LLILZ;
            if (interfaceC434700H2u == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PromptAdapter@8f9.onViewDetachedFromWindow$1");
                return unit;
            }
            C05YC<C443120HZe<InterfaceC434700H2u, Integer, Boolean>> c05ycLIZ = this.LLILLL.LLILLL.LIZ();
            C443120HZe<InterfaceC434700H2u, Integer, Boolean> c443120HZe = new C443120HZe<>(interfaceC434700H2u, C2286608xc.LJ(-1), false);
            this.LL = 1;
            if (c05ycLIZ.emit(c443120HZe, this) == objLJFF) {
                C1C7U.LIZIZ("PromptAdapter@8f9.onViewDetachedFromWindow$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PromptAdapter@8f9.onViewDetachedFromWindow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
