package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696610RUd extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ C696590RUb LL;
    public final /* synthetic */ UIContentAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696610RUd(C696590RUb c696590RUb, UIContentAssem uIContentAssem) {
        super(1);
        this.LL = c696590RUb;
        this.LLILLJJLI = uIContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LLIZLLLIL = this.LL.LLIZLLLIL;
        c696590RUb2.LLJI = this.LLILLJJLI;
        return Unit.LIZ;
    }
}
