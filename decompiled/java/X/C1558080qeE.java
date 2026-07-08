package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558080qeE extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ C13IQ<? extends UIContentAssem> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558080qeE(C13IQ<? extends UIContentAssem> c13iq) {
        super(1);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LL = this.LL;
        c696590RUb2.LLIZLLLIL = R.id.i9v;
        return Unit.LIZ;
    }
}
