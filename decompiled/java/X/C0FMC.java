package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FMC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.textemplate.TextTemplateComponent$applyEffectToPlayer$2$1", f = "TextTemplateComponent.kt", l = {}, m = "invokeSuspend")
public final class C0FMC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C194431114z LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Pair<Integer, Integer> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FMC(C194431114z c194431114z, Effect effect, Effect effect2, String str, String str2, String str3, Pair<Integer, Integer> pair, boolean z, boolean z2, boolean z3, InterfaceC1364105Vn<? super C0FMC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c194431114z;
        this.LLILLJJLI = effect;
        this.LLILLL = effect2;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = pair;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FMC(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextTemplateComponent@b18.applyEffectToPlayer$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FMR c0fmr = this.LL.LLJJJJJIL;
        String effectId = this.LLILLJJLI.getEffectId();
        Effect effect = this.LLILLJJLI;
        Effect effect2 = this.LLILLL;
        String str = this.LLILZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c0fmr.LIZJ(effectId, new C0FMO(effect, effect2, str, this.LLILZIL, this.LLILZLL));
        C194431114z c194431114z = this.LL;
        Effect effect3 = this.LLILLJJLI;
        Pair<Integer, Integer> pair = this.LLIZ;
        Effect effect4 = this.LLILLL;
        String str3 = this.LLILZ;
        if (str3 != null) {
            str2 = str3;
        }
        C194431114z.L6(c194431114z, effect3, pair, effect4, str2, this.LLILZIL, this.LLILZLL, this.LLIZLLLIL, this.LLJ, this.LLJI, "", false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextTemplateComponent@b18.applyEffectToPlayer$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
