package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.prompt.DiceButtonVH$bind$2$1$onAnimationStart$1", f = "PromptAdapter.kt", l = {185}, m = "invokeSuspend")
public final class C432260GxE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C425470GmH LLILLJJLI;
    public final /* synthetic */ InterfaceC434700H2u LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432260GxE(C425470GmH c425470GmH, InterfaceC434700H2u interfaceC434700H2u, int i, InterfaceC1364105Vn<? super C432260GxE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c425470GmH;
        this.LLILLL = interfaceC434700H2u;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432260GxE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DiceButtonVH@4874.bind$2$1$onAnimationStart$1");
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
            C05YC<Pair<InterfaceC434700H2u, Integer>> c05ycLLLLLZL = this.LLILLJJLI.LLILLL.LLLLLZL();
            Pair<InterfaceC434700H2u, Integer> pair = new Pair<>(this.LLILLL, C2286608xc.LJ(this.LLILZ));
            this.LL = 1;
            if (c05ycLLLLLZL.emit(pair, this) == objLJFF) {
                C1C7U.LIZIZ("DiceButtonVH@4874.bind$2$1$onAnimationStart$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DiceButtonVH@4874.bind$2$1$onAnimationStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
