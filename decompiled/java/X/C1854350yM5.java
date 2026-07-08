package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS606S0100000_27;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yM5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854350yM5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<String, Unit> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ TakoSug LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1854350yM5(AwS606S0100000_27 awS606S0100000_27, String str, TakoSug takoSug, int i) {
        super(0);
        this.LL = awS606S0100000_27;
        this.LLILLJJLI = str;
        this.LLILLL = takoSug;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        this.LL.invoke(this.LLILLJJLI);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        Pair[] pairArr = new Pair[6];
        Integer num = this.LLILLL.sugSource;
        pairArr[0] = new Pair("source", num != null ? num.toString() : null);
        pairArr[1] = new Pair("rank", String.valueOf(this.LLILZ));
        C1854260yLw.LIZ.getClass();
        C1852650yJL c1852650yJL = C1854260yLw.LIZIZ;
        pairArr[2] = new Pair("log_id", c1852650yJL != null ? c1852650yJL.LJ : null);
        pairArr[3] = new Pair("interaction_name", this.LLILLJJLI);
        C1852650yJL c1852650yJL2 = C1854260yLw.LIZIZ;
        pairArr[4] = new Pair("mode", c1852650yJL2 != null ? C1855920yOc.LIZJ(Integer.valueOf(c1852650yJL2.LIZ)) : null);
        C1852650yJL c1852650yJL3 = C1854260yLw.LIZIZ;
        pairArr[5] = new Pair("mode_source", c1852650yJL3 != null ? c1852650yJL3.LJI : null);
        c1862330yYx.mobTikbotQuickInteractionClick(C2097608Jq.LJIIIIZZ(pairArr), C1854260yLw.LJ, null);
        return Unit.LIZ;
    }
}
