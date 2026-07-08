package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17qT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21154717qT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC21154817qU LL;
    public final /* synthetic */ ConstraintLayout LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Pair<Integer, String> LLILZ;
    public final /* synthetic */ C1741560vQA LLILZIL;
    public final /* synthetic */ InterfaceC21154617qS LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21154717qT(AbstractC21154817qU abstractC21154817qU, ConstraintLayout constraintLayout, boolean z, Pair<Integer, String> pair, C1741560vQA c1741560vQA, InterfaceC21154617qS interfaceC21154617qS) {
        super(0);
        this.LL = abstractC21154817qU;
        this.LLILLJJLI = constraintLayout;
        this.LLILLL = z;
        this.LLILZ = pair;
        this.LLILZIL = c1741560vQA;
        this.LLILZLL = interfaceC21154617qS;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIILJJIL(this.LLILLJJLI);
        if (!this.LLILLL) {
            this.LL.LJIILLIIL();
        }
        AbstractC21154817qU abstractC21154817qU = this.LL;
        Pair<Integer, String> pair = this.LLILZ;
        if (pair != null) {
            C0NOE.LIZIZ(abstractC21154817qU.LL.LIZ, "ec_mix_mall_bubble_dismissed", C2097608Jq.LJIIJ(new Pair("bubble_id", abstractC21154817qU.LLJIJIL), new Pair("reason_code", pair.getFirst()), new Pair("reason_msg", pair.getSecond())), false);
        } else {
            abstractC21154817qU.getClass();
        }
        C1741560vQA c1741560vQA = this.LLILZIL;
        if (c1741560vQA != null) {
            this.LLILZLL.LIZ(c1741560vQA, true, null);
        }
        return Unit.LIZ;
    }
}
