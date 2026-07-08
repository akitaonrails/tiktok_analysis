package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965780bEu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL = true;
    public final /* synthetic */ C966020bFI LLILLJJLI;
    public final /* synthetic */ C914780Zue LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ EnumC965730bEp LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965780bEu(C966020bFI c966020bFI, C914780Zue c914780Zue, int i, boolean z, String str, EnumC965730bEp enumC965730bEp) {
        super(0);
        this.LLILLJJLI = c966020bFI;
        this.LLILLL = c914780Zue;
        this.LLILZ = i;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = enumC965730bEp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EnumC969200bKQ enumC969200bKQ;
        this.LLILLJJLI.LJ().LJJLIIIJJI(this.LL && (!this.LLILLJJLI.LJIILIIL() ? this.LLILZ < 2 : !((enumC969200bKQ = this.LLILLL.LIZ) == EnumC969200bKQ.Wait || C954950axR.LIZJ(enumC969200bKQ) || C954950axR.LIZIZ(this.LLILLL.LIZIZ))), this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILLJJLI.LJIILIIL());
        return Unit.LIZ;
    }
}
