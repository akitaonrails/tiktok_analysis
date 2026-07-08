package X;

import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.text.TextEditFontListAbility$setCache$2", f = "TextEditFontListAbility.kt", l = {333}, m = "invokeSuspend")
public final class C387710FIb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ Effect LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<C0FMO, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C387710FIb(String str, Effect effect, Effect effect2, String str2, String str3, Function1<? super C0FMO, Unit> function1, InterfaceC1364105Vn<? super C387710FIb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = effect;
        this.LLILZ = effect2;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C387710FIb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextEditFontListAbility@a0ef.setCache$2");
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
            C387730FId c387730FId = new C387730FId(this.LLILLL, this.LLILZ, strLJFF, strLIZLLL, strLJI, this.LLILZIL, this.LLILZLL, this.LLIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c387730FId) == objLJFF) {
                C1C7U.LIZIZ("TextEditFontListAbility@a0ef.setCache$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextEditFontListAbility@a0ef.setCache$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
