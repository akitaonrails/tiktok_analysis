package Y;

import X.C0PYV;
import X.C1860140yVQ;
import X.C20085613iQ;
import X.C2250281D5u;
import X.InterfaceC2250311D5x;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public class AComparatorS509S0100000_10 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS509S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS509S0100000_10 aComparatorS509S0100000_10, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1860140yVQ) aComparatorS509S0100000_10.l0).LIZ.getSpanStart(obj2)), Integer.valueOf(((C1860140yVQ) aComparatorS509S0100000_10.l0).LIZ.getSpanStart(obj)));
    }

    public static final int compare$1(AComparatorS509S0100000_10 aComparatorS509S0100000_10, Object obj, Object obj2) {
        int priority;
        InterfaceC2250311D5x interfaceC2250311D5x = (InterfaceC2250311D5x) ((LinkedHashMap) ((C2250281D5u) aComparatorS509S0100000_10.l0).LIZLLL).get(obj2);
        int priority2 = 0;
        if (interfaceC2250311D5x != null) {
            priority = interfaceC2250311D5x.getPriority();
        } else {
            priority = 0;
        }
        Integer numValueOf = Integer.valueOf(priority);
        InterfaceC2250311D5x interfaceC2250311D5x2 = (InterfaceC2250311D5x) ((LinkedHashMap) ((C2250281D5u) aComparatorS509S0100000_10.l0).LIZLLL).get(obj);
        if (interfaceC2250311D5x2 != null) {
            priority2 = interfaceC2250311D5x2.getPriority();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(priority2));
    }

    public static final int compare$2(AComparatorS509S0100000_10 aComparatorS509S0100000_10, Object obj, Object obj2) {
        int iLJJJ;
        String richMessage;
        String richMessage2;
        Map.Entry entry = (Map.Entry) obj;
        TakoInfo bot = ((C0PYV) aComparatorS509S0100000_10.l0).LL.getBot();
        int iLJJJ2 = 0;
        if (bot != null && (richMessage2 = bot.getRichMessage()) != null) {
            iLJJJ = a0.LJJJ(richMessage2, (String) entry.getKey(), 0, false, 6);
        } else {
            iLJJJ = 0;
        }
        Integer numValueOf = Integer.valueOf(iLJJJ);
        Map.Entry entry2 = (Map.Entry) obj2;
        TakoInfo bot2 = ((C0PYV) aComparatorS509S0100000_10.l0).LL.getBot();
        if (bot2 != null && (richMessage = bot2.getRichMessage()) != null) {
            iLJJJ2 = a0.LJJJ(richMessage, (String) entry2.getKey(), 0, false, 6);
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iLJJJ2));
    }

    public static final int compare$3(AComparatorS509S0100000_10 aComparatorS509S0100000_10, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1860140yVQ) aComparatorS509S0100000_10.l0).LIZ.getSpanStart(obj2)), Integer.valueOf(((C1860140yVQ) aComparatorS509S0100000_10.l0).LIZ.getSpanStart(obj)));
    }
}
