package X;

import java.util.LinkedList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532400pyo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1532180pyS LL;
    public final /* synthetic */ C1532300pye LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1532300pye LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ LinkedList<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> LLIZ;
    public final /* synthetic */ C1532710pzJ LLIZLLLIL;
    public final /* synthetic */ C1532180pyS LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532400pyo(C1532180pyS c1532180pyS, C1532300pye c1532300pye, boolean z, C1532300pye c1532300pye2, boolean z2, boolean z3, LinkedList<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> linkedList, C1532710pzJ c1532710pzJ, C1532180pyS c1532180pyS2) {
        super(0);
        this.LL = c1532180pyS;
        this.LLILLJJLI = c1532300pye;
        this.LLILLL = z;
        this.LLILZ = c1532300pye2;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = linkedList;
        this.LLIZLLLIL = c1532710pzJ;
        this.LLJ = c1532180pyS2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1532180pyS c1532180pyS = this.LL;
        C1532300pye c1532300pye = this.LLILLJJLI;
        c1532180pyS.LIZ(c1532300pye.LIZ, new C1532370pyl(c1532300pye, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ));
        return Unit.LIZ;
    }
}
