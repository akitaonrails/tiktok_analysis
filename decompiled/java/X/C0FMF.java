package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FMF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.textemplate.TextTemplateComponent$applyEffectToPlayer$1", f = "TextTemplateComponent.kt", l = {503}, m = "invokeSuspend")
public final class C0FMF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C194431114z LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ Effect LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Pair<Integer, Integer> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FMF(C194431114z c194431114z, Effect effect, Effect effect2, String str, String str2, Pair<Integer, Integer> pair, boolean z, boolean z2, boolean z3, InterfaceC1364105Vn<? super C0FMF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c194431114z;
        this.LLILLL = effect;
        this.LLILZ = effect2;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = pair;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FMF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextTemplateComponent@b18.applyEffectToPlayer$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0FME c0fme = new C0FME(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c0fme) == objLJFF) {
                C1C7U.LIZIZ("TextTemplateComponent@b18.applyEffectToPlayer$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextTemplateComponent@b18.applyEffectToPlayer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
