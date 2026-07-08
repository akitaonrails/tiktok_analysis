package X;

import Y.AComparatorS21S0000000_2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS119S1200000_2;
import kotlin.jvm.internal.AwS129S0201000_2;
import kotlin.jvm.internal.AwS151S1100000_2;
import kotlin.jvm.internal.AwS25S1201000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.05dV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1397505dV {
    public static final /* synthetic */ int LJII = 0;
    public final CopyOnWriteArrayList<C1397705dX> LIZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<AbstractC677840QiM> LIZIZ = new CopyOnWriteArrayList<>();
    public int LIZJ = -1;
    public long LIZLLL = -1;
    public int LJ;
    public C675270QeD LJFF;
    public C675270QeD LJI;

    public final List<Integer> LIZ() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        CopyOnWriteArrayList<C1397705dX> copyOnWriteArrayList = this.LIZ;
        ArrayList<C1397705dX> arrayList4 = new ArrayList();
        for (C1397705dX c1397705dX : copyOnWriteArrayList) {
            if (c1397705dX.LJFF) {
                arrayList4.add(c1397705dX);
            }
        }
        for (C1397705dX c1397705dX2 : arrayList4) {
            arrayList2.add(c1397705dX2.LIZ);
            for (AbstractC677840QiM abstractC677840QiM : c1397705dX2.LIZLLL) {
                arrayList.add(Integer.valueOf(this.LIZIZ.indexOf(abstractC677840QiM)));
                AbstractC677870QiP abstractC677870QiP = abstractC677840QiM.LL;
                arrayList3.add(Integer.valueOf(abstractC677870QiP != null ? abstractC677870QiP.LIZIZ : -1));
            }
        }
        return arrayList;
    }

    public final List<Integer> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        CopyOnWriteArrayList<C1397705dX> copyOnWriteArrayList = this.LIZ;
        ArrayList<C1397705dX> arrayList4 = new ArrayList();
        for (C1397705dX c1397705dX : copyOnWriteArrayList) {
            if (c1397705dX.LJ) {
                arrayList4.add(c1397705dX);
            }
        }
        for (C1397705dX c1397705dX2 : arrayList4) {
            arrayList2.add(c1397705dX2.LIZ);
            for (AbstractC677840QiM abstractC677840QiM : c1397705dX2.LIZLLL) {
                arrayList.add(Integer.valueOf(this.LIZIZ.indexOf(abstractC677840QiM)));
                AbstractC677870QiP abstractC677870QiP = abstractC677840QiM.LL;
                arrayList3.add(Integer.valueOf(abstractC677870QiP != null ? abstractC677870QiP.LIZIZ : -1));
            }
        }
        return arrayList;
    }

    public final void LIZLLL(C1422405hW c1422405hW) {
        int i = c1422405hW.LIZLLL;
        if (i >= 0) {
            this.LIZJ = i;
        }
        long j = c1422405hW.LJ;
        if (j >= 0) {
            this.LIZLLL = j;
        }
        int i2 = c1422405hW.LJFF;
        if (i2 >= 0) {
            this.LJ = i2;
        }
        C675270QeD c675270QeD = c1422405hW.LJI;
        if (c675270QeD != null) {
            if (c675270QeD.LIZJ == EnumC675700Qeu.FIRST_SCREEN.getValue() || c675270QeD.LIZJ == EnumC675700Qeu.FULL_PAGE_REFRESH.getValue()) {
                this.LJFF = c675270QeD;
            }
            this.LJI = c675270QeD;
        }
    }

    public final void LIZJ(C1422405hW c1422405hW, String str) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c1422405hW, 154);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(awS546S0100000_2);
        C2341109Fh.LIZIZ(new AwS546S0100000_2(this, 155));
        new AwS119S1200000_2(str, c1422405hW, this, 1);
        C034X.LIZIZ();
        if (c1422405hW.LIZJ.isEmpty()) {
            C2341109Fh.LIZIZ(AFwS187S0000000_2.get$arr$(222));
            return;
        }
        LIZLLL(c1422405hW);
        CopyOnWriteArrayList<C1397705dX> copyOnWriteArrayList = this.LIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C1397705dX c1397705dX : copyOnWriteArrayList) {
            linkedHashMap.put(c1397705dX.LIZ, c1397705dX);
        }
        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
        AwS546S0100000_2 awS546S0100000_22 = new AwS546S0100000_2(linkedHashMap, (Map<String, C1397705dX>) 156);
        c2341109Fh2.getClass();
        C2341109Fh.LIZIZ(awS546S0100000_22);
        for (C1397705dX c1397705dX2 : c1422405hW.LIZJ) {
            if (linkedHashMap.containsKey(c1397705dX2.LIZ)) {
                int iIndexOf = this.LIZ.indexOf(linkedHashMap.get(c1397705dX2.LIZ));
                if (iIndexOf >= 0 && iIndexOf < this.LIZ.size()) {
                    C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
                    AwS129S0201000_2 awS129S0201000_2 = new AwS129S0201000_2(c1397705dX2, iIndexOf, this, 6);
                    c2341109Fh3.getClass();
                    C2341109Fh.LIZIZ(awS129S0201000_2);
                    new AwS25S1201000_2(str, c1397705dX2, this, iIndexOf, 0);
                    C034X.LIZIZ();
                    this.LIZ.set(iIndexOf, c1397705dX2);
                }
            } else {
                C2341109Fh c2341109Fh4 = C2341109Fh.LIZ;
                AwS546S0100000_2 awS546S0100000_23 = new AwS546S0100000_2(c1397705dX2, 157);
                c2341109Fh4.getClass();
                C2341109Fh.LIZIZ(awS546S0100000_23);
                new AwS151S1100000_2(str, c1397705dX2, 9);
                C034X.LIZIZ();
                this.LIZ.add(c1397705dX2);
            }
        }
        C2341109Fh c2341109Fh5 = C2341109Fh.LIZ;
        AwS546S0100000_2 awS546S0100000_24 = new AwS546S0100000_2(this, 158);
        c2341109Fh5.getClass();
        C2341109Fh.LIZIZ(awS546S0100000_24);
        if (this.LIZ.size() > 1) {
            try {
                ArrayList arrayList = new ArrayList(this.LIZ);
                C08XD.LJJ(arrayList, new AComparatorS21S0000000_2(4));
                this.LIZ.clear();
                this.LIZ.addAll(arrayList);
                C2341109Fh.LIZIZ(new AwS546S0100000_2(this, 159));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        CopyOnWriteArrayList<AbstractC677840QiM> copyOnWriteArrayList2 = this.LIZIZ;
        copyOnWriteArrayList2.clear();
        Iterator<C1397705dX> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            copyOnWriteArrayList2.addAll(it2.next().LIZLLL);
        }
        C2341109Fh c2341109Fh6 = C2341109Fh.LIZ;
        AwS546S0100000_2 awS546S0100000_25 = new AwS546S0100000_2(this, 153);
        c2341109Fh6.getClass();
        C2341109Fh.LIZIZ(awS546S0100000_25);
        new AwS151S1100000_2(str, this, 8);
        C034X.LIZIZ();
    }
}
