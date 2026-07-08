package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FME, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.textemplate.TextTemplateComponent$applyEffectToPlayer$1$1", f = "TextTemplateComponent.kt", l = {}, m = "invokeSuspend")
public final class C0FME extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C194431114z LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Pair<Integer, Integer> LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FME(C194431114z c194431114z, Effect effect, Effect effect2, String str, String str2, Pair<Integer, Integer> pair, boolean z, boolean z2, boolean z3, InterfaceC1364105Vn<? super C0FME> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c194431114z;
        this.LLILLJJLI = effect;
        this.LLILLL = effect2;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = pair;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FME(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextTemplateComponent@b18.applyEffectToPlayer$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJJJJJIL.LIZJ(this.LLILLJJLI.getEffectId(), new C0FMO(this.LLILLJJLI, this.LLILLL, this.LLILZ, "", "", this.LLILZIL));
        C194431114z.L6(this.LL, this.LLILLJJLI, this.LLILZLL, this.LLILLL, this.LLILZ, "", "", this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLILZIL, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextTemplateComponent@b18.applyEffectToPlayer$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
