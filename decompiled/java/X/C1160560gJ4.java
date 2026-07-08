package X;

import Y.AComparatorS37S0000000_18;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0gJ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160560gJ4 {
    public final List<Aweme> LIZ;
    public final List<AbstractC1158220gFI> LIZIZ = new ArrayList();

    public final List<Aweme> LIZ() {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            return this.LIZ;
        }
        ArrayList arrayList = new ArrayList(this.LIZ);
        List<AbstractC1158220gFI> list = this.LIZIZ;
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC1158220gFI abstractC1158220gFI : list) {
            if (abstractC1158220gFI instanceof C1158210gFH) {
                arrayList2.add(abstractC1158220gFI);
            }
        }
        for (C1158210gFH c1158210gFH : C13LP.LJLLLL(new AComparatorS37S0000000_18(20), arrayList2)) {
            arrayList.addAll(C13LZ.LJ(c1158210gFH.LIZ, 0, arrayList.size()), c1158210gFH.LIZIZ);
        }
        List<AbstractC1158220gFI> list2 = this.LIZIZ;
        ArrayList arrayList3 = new ArrayList();
        for (AbstractC1158220gFI abstractC1158220gFI2 : list2) {
            if (abstractC1158220gFI2 instanceof C1158230gFJ) {
                arrayList3.add(abstractC1158220gFI2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList.remove(((C1158230gFJ) it2.next()).LIZ);
        }
        ((ArrayList) this.LIZIZ).clear();
        return arrayList;
    }

    public final List<Aweme> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        List<AbstractC1158220gFI> list = this.LIZIZ;
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC1158220gFI abstractC1158220gFI : list) {
            if (abstractC1158220gFI instanceof C1158230gFJ) {
                arrayList2.add(abstractC1158220gFI);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1158230gFJ) it2.next()).LIZ);
        }
        return arrayList;
    }

    public final List<Aweme> LIZJ() {
        ArrayList arrayList = new ArrayList();
        List<AbstractC1158220gFI> list = this.LIZIZ;
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC1158220gFI abstractC1158220gFI : list) {
            if (abstractC1158220gFI instanceof C1158210gFH) {
                arrayList2.add(abstractC1158220gFI);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(((C1158210gFH) it2.next()).LIZIZ);
        }
        return arrayList;
    }

    public C1160560gJ4(List<? extends Aweme> list) {
        this.LIZ = C13LP.LLIIII(list);
    }

    public final void LJ(Aweme aweme) {
        ((ArrayList) this.LIZIZ).add(new C1158230gFJ(aweme));
    }

    public final void LIZLLL(int i, Aweme... awemeArr) {
        if (awemeArr.length != 0) {
            ((ArrayList) this.LIZIZ).add(new C1158210gFH(i, C13LQ.LJJLL(awemeArr)));
        }
    }
}
