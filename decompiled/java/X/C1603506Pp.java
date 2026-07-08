package X;

import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06Pp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1603506Pp extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ C1603306Pn LL;
    public final /* synthetic */ Pair<String, String> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603506Pp(C1603306Pn c1603306Pn, Pair<String, String> pair, boolean z, long j) {
        super(1);
        this.LL = c1603306Pn;
        this.LLILLJJLI = pair;
        this.LLILLL = z;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        String strLJJJLL;
        boolean z;
        String str;
        C1533790q13 c1533790q132 = c1533790q13;
        C1603306Pn c1603306Pn = this.LL;
        Pair<String, String> pair = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        long j = this.LLILZ;
        c1603306Pn.getClass();
        String first = pair.getFirst();
        String second = pair.getSecond();
        String strLIZLLL = c1533790q132.LIZLLL();
        if (strLIZLLL != null) {
            strLJJJLL = a0.LJJJLL(second, strLIZLLL);
        } else {
            strLJJJLL = null;
        }
        String str2 = "Local";
        if (c1533790q132.LIZIZ && strLJJJLL != null) {
            boolean z3 = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakMilestoneGeckoResHelper, ");
            sbLIZ.append(pair);
            sbLIZ.append(" fetchResFrom");
            if (!z2) {
                str2 = "Cdn";
            }
            sbLIZ.append(str2);
            sbLIZ.append(", success");
            C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c1603306Pn.LIZLLL.put(first, new C1603806Ps(first, strLJJJLL, 1));
            z = true;
        } else {
            boolean z4 = C1590906Kt.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("StreakMilestoneGeckoResHelper, ");
            sbLIZ2.append(pair);
            sbLIZ2.append(" fetchResFrom");
            if (!z2) {
                str2 = "Cdn";
            }
            sbLIZ2.append(str2);
            sbLIZ2.append(", fail, errCode=");
            sbLIZ2.append(c1533790q132.LIZLLL);
            C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c1603306Pn.LIZLLL.put(first, new C1603806Ps(first, strLJJJLL, 2));
            z = false;
        }
        if (z2) {
            str = "preload";
        } else {
            str = "download";
        }
        List listSingletonList = Collections.singletonList(second);
        C13BV c13bv = C13BV.INSTANCE;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        int i = c1533790q132.LIZLLL.LIZIZ;
        C15527066b.LIZ(str, first, listSingletonList, c13bv, z, jCurrentTimeMillis, Integer.valueOf(i), c1533790q132.LJIIIZ, 768);
        return Unit.LIZ;
    }
}
