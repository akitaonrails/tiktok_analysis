package X;

import android.graphics.Typeface;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817070xNx extends C09AY implements Function2<C1817980xPQ, Typeface, Unit> {
    public final /* synthetic */ List<C1836370xt5> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ C1817040xNu LLILZ;
    public final /* synthetic */ C1817080xNy LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817070xNx(List<C1836370xt5> list, int i, List<String> list2, C1817040xNu c1817040xNu, C1817080xNy c1817080xNy) {
        super(2);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = list2;
        this.LLILZ = c1817040xNu;
        this.LLILZIL = c1817080xNy;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1817980xPQ c1817980xPQ, Typeface typeface) {
        Typeface second;
        Pair<C1817980xPQ, Typeface> pairLIZ;
        C1836370xt5 c1836370xt5 = (C1836370xt5) C13LP.LJJJLZIJ(this.LLILLJJLI, this.LL);
        if (c1836370xt5 != null) {
            C1817040xNu c1817040xNu = this.LLILZ;
            C1817080xNy c1817080xNy = this.LLILZIL;
            int i = this.LLILLJJLI;
            InterfaceC971680bOQ interfaceC971680bOQ = c1817040xNu.getViewModel().LIZ;
            if (interfaceC971680bOQ != null && (pairLIZ = interfaceC971680bOQ.LIZ()) != null) {
                second = pairLIZ.getSecond();
            } else {
                second = null;
            }
            c1836370xt5.setFontType(second);
            c1817040xNu.LJIILL(c1836370xt5, c1817080xNy, i);
        }
        if (this.LLILLJJLI == C1697810uHb.LJIIJ(this.LLILLL)) {
            AbstractC1817030xNt.LJII(this.LLILZ);
        }
        return Unit.LIZ;
    }
}
