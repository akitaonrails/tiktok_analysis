package X;

import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FMB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.textemplate.TextTemplateComponent$applyEffectToPlayer$2", f = "TextTemplateComponent.kt", l = {525}, m = "invokeSuspend")
public final class C0FMB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ C194431114z LLILZ;
    public final /* synthetic */ Effect LLILZIL;
    public final /* synthetic */ Pair<Integer, Integer> LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FMB(String str, Effect effect, C194431114z c194431114z, Effect effect2, Pair<Integer, Integer> pair, boolean z, boolean z2, boolean z3, InterfaceC1364105Vn<? super C0FMB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = effect;
        this.LLILZ = c194431114z;
        this.LLILZIL = effect2;
        this.LLILZLL = pair;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FMB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextTemplateComponent@b18.applyEffectToPlayer$2");
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
            String strLJFF = TextTemplateTools.LJFF(this.LLILLJJLI);
            String strLIZLLL = TextTemplateTools.LIZLLL(this.LLILLL.getUnzipPath());
            String strLJI = TextTemplateTools.LJI(this.LLILLL.getUnzipPath());
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0FMC c0fmc = new C0FMC(this.LLILZ, this.LLILLL, this.LLILZIL, strLJFF, strLIZLLL, strLJI, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c0fmc) == objLJFF) {
                C1C7U.LIZIZ("TextTemplateComponent@b18.applyEffectToPlayer$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextTemplateComponent@b18.applyEffectToPlayer$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
