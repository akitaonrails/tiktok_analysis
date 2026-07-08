package Y;

import X.C09JN;
import X.C15438062q;
import X.C1638380sjk;
import X.C1639670slp;
import X.C1C7U;
import X.C2219091BtD;
import X.InterfaceC1463990oCT;
import com.ss.android.ugc.aweme.filter.repository.internal.main.a;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public class AfS13S0111000_25 implements C09JN {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS13S0111000_25 afS13S0111000_25, Object obj) {
        C1C7U.LIZ("DefaultFilterRepository@352a.fetchDataWithReturn$fetch$1");
        C1638380sjk c1638380sjk = (C1638380sjk) obj;
        if (afS13S0111000_25.z1) {
            C2219091BtD.LIZLLL().d("viki filter, DefaultFilterRepository#fetchDataWithReturn -> forceRefresh");
        }
        if (c1638380sjk.LIZ.LIZIZ.isEmpty()) {
            ((a) afS13S0111000_25.l0).LJJIZ(afS13S0111000_25.i2, c1638380sjk.LIZ.LIZ);
        } else {
            a aVar = (a) afS13S0111000_25.l0;
            aVar.LJJIZ(afS13S0111000_25.i2, aVar.LJJIJIL(c1638380sjk).LIZ.LIZ);
        }
        C1C7U.LIZIZ("DefaultFilterRepository@352a.fetchDataWithReturn$fetch$1");
    }

    public static final void accept$1(AfS13S0111000_25 afS13S0111000_25, Object obj) {
        C1C7U.LIZ("DefaultFilterRepository@352a.fetchDataWithReturn$fetch$3$alterFetcher$1");
        C1638380sjk c1638380sjk = (C1638380sjk) obj;
        if (afS13S0111000_25.z1) {
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sb = new StringBuilder("viki filter, alterFetcher -> filterTable=");
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
        if (c1638380sjk.LIZ.LIZIZ.isEmpty()) {
            ((a) afS13S0111000_25.l0).LJJIZ(afS13S0111000_25.i2, c1638380sjk.LIZ.LIZ);
        } else {
            a aVar = (a) afS13S0111000_25.l0;
            aVar.LJJIZ(afS13S0111000_25.i2, aVar.LJJIJIL(c1638380sjk).LIZ.LIZ);
        }
        C1C7U.LIZIZ("DefaultFilterRepository@352a.fetchDataWithReturn$fetch$3$alterFetcher$1");
    }

    public AfS13S0111000_25(boolean z, a aVar, int i, int i2) {
        this.$t = i2;
        this.z1 = z;
        this.l0 = aVar;
        this.i2 = i;
    }
}
