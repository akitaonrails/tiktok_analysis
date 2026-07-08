package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05Jy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1334005Jy extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ AbstractC1333605Ju<Object, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1334005Jy(AbstractC1333605Ju<Object, Object> abstractC1333605Ju) {
        super(1);
        this.LL = abstractC1333605Ju;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        AbstractC1333605Ju<Object, Object> abstractC1333605Ju = this.LL;
        C13IQ<? extends UIContentAssem> c13iq = ((AbstractC1334105Jz) abstractC1333605Ju).LIZLLL;
        if (c13iq == null) {
            c13iq = null;
        }
        c696590RUb2.LL = c13iq;
        abstractC1333605Ju.getClass();
        c696590RUb2.LLILLJJLI = null;
        c696590RUb2.LLIZLLLIL = ((AbstractC1334105Jz) this.LL).LIZJ;
        c696590RUb2.LLJ = null;
        return Unit.LIZ;
    }
}
