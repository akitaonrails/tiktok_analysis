package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2N, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q2N {
    public boolean LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final Set<String> LJ;
    public final List<Pair<Integer, String>> LJFF;
    public final List<String> LJI;
    public String LJII;
    public final Set<String> LJIIIIZZ;
    public final List<String> LJIIIZ;
    public final List<String> LJIIJ;
    public final C603820NmG<String, List<C645810PUt>> LJIIJJI;
    public final List<List<String>> LJIIL;
    public List<String> LJIILIIL;
    public final List<String> LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;

    public C0Q2N() {
        this(null);
    }

    public C0Q2N(Object obj) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C603820NmG<String, List<C645810PUt>> c603820NmG = new C603820NmG<>(2);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        this.LIZ = false;
        this.LIZIZ = false;
        this.LIZJ = CardStruct.IStatusCode.DEFAULT;
        this.LIZLLL = "";
        this.LJ = hashSet;
        this.LJFF = arrayList;
        this.LJI = arrayList2;
        this.LJII = "";
        this.LJIIIIZZ = hashSet2;
        this.LJIIIZ = arrayList3;
        this.LJIIJ = arrayList4;
        this.LJIIJJI = c603820NmG;
        this.LJIIL = arrayList5;
        this.LJIILIIL = arrayList6;
        this.LJIILJJIL = arrayList7;
        this.LJIILL = 0L;
        this.LJIILLIIL = 0L;
        this.LJIIZILJ = 0L;
        this.LJIJ = 0L;
        this.LJIJI = 0L;
        this.LJIJJ = 0L;
        this.LJIJJLI = 0L;
        this.LJIL = 0L;
        this.LJJ = 0L;
    }

    public final void LIZ(String str) {
        List<C645810PUt> listLIZJ = this.LJIIJJI.LIZJ(str);
        if (listLIZJ == null) {
            listLIZJ = new ArrayList<>();
        }
        this.LJIIJJI.LJIIIZ(-1);
        if (str.length() > 0) {
            this.LJIIJJI.LIZLLL(str, listLIZJ);
        }
        this.LJIIL.clear();
    }

    public final List<List<String>> LIZIZ(String str) {
        List<C645810PUt> listLIZJ = this.LJIIJJI.LIZJ(str);
        if (listLIZJ == null) {
            listLIZJ = new ArrayList<>();
        }
        this.LJIIJJI.LIZLLL(str, listLIZJ);
        Object value = null;
        for (Map.Entry entry : ((LinkedHashMap) this.LJIIJJI.LJIIIIZZ()).entrySet()) {
            if (!Intrinsics.LJFF(entry.getKey(), str)) {
                value = entry.getValue();
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List list = (List) value;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (jCurrentTimeMillis - ((C645810PUt) obj).LIZJ <= 18000000) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C645810PUt) it2.next()).LIZIZ);
            }
            if ((!arrayList2.isEmpty()) && (!((Collection) ListProtector.get(arrayList2, 0)).isEmpty())) {
                return arrayList2;
            }
        }
        return this.LJIIL;
    }
}
