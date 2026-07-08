package Y;

import X.C11IR;
import X.C11NZ;
import X.C15438062q;
import X.C1638380sjk;
import X.C1639670slp;
import X.C2219091BtD;
import X.InterfaceC1463990oCT;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public class AkS10S0010000_25 implements InterfaceC1487280oo2 {
    public final int $t;
    public boolean z0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS10S0010000_25(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }

    public static final Object apply$0(AkS10S0010000_25 akS10S0010000_25, Object obj) {
        C1638380sjk c1638380sjk = (C1638380sjk) obj;
        if (akS10S0010000_25.z0) {
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sb = new StringBuilder("viki filter, DefaultFilterRepository#fetchDataWithReturn -> ret -> filterTable=");
            List<Pair<EffectCategoryResponse, List<C1639670slp>>> list = c1638380sjk.LIZ.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Pair<EffectCategoryResponse, List<C1639670slp>>> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getFirst().getName());
            }
            sb.append(arrayList);
            sb.append(", filter.size=");
            sb.append(c1638380sjk.LIZ.LIZ.size());
            interfaceC1463990oCTLIZLLL.d(sb.toString());
        }
        return c1638380sjk.LIZ;
    }

    public static final Object apply$1(AkS10S0010000_25 akS10S0010000_25, Object obj) {
        C1638380sjk c1638380sjk = (C1638380sjk) obj;
        if (akS10S0010000_25.z0) {
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sb = new StringBuilder("viki filter, alterCache -> filterTable=");
            List<Pair<EffectCategoryResponse, List<C1639670slp>>> list = c1638380sjk.LIZ.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Pair<EffectCategoryResponse, List<C1639670slp>>> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getFirst().getName());
            }
            sb.append(arrayList);
            sb.append(", filter.size=");
            sb.append(c1638380sjk.LIZ.LIZ.size());
            interfaceC1463990oCTLIZLLL.d(sb.toString());
        }
        if (c1638380sjk.LIZIZ) {
            if (akS10S0010000_25.z0) {
                C2219091BtD.LIZLLL().d("viki filter, cachedResponse.brokenData");
            }
            return C11IR.LL;
        }
        if (c1638380sjk.LIZ.LIZ.isEmpty() && c1638380sjk.LIZ.LIZIZ.isEmpty()) {
            return C11IR.LL;
        }
        return C11NZ.LJJJJZ(c1638380sjk);
    }
}
