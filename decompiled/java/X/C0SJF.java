package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SJF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SJF implements Cloneable {
    public final Iterable<C0SJL<C719000SIg>> LL;
    public Iterable<? extends C0SJL<C719000SIg>> LLILLJJLI;

    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C0SJF clone() {
        Iterable<C0SJL<C719000SIg>> iterable = this.LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        Iterator<C0SJL<C719000SIg>> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().clone());
        }
        return new C0SJF(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<TextExtraStruct> LIZJ() {
        int size;
        TextExtraStruct textExtraStruct;
        TextExtraStruct textExtraStruct2;
        TextExtraStruct textExtraStruct3;
        Iterable<? extends C0SJL<C719000SIg>> iterable = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LongTextComponentsBuilder getValidMetadata count: ");
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator<? extends C0SJL<C719000SIg>> it2 = iterable.iterator();
            size = 0;
            while (it2.hasNext()) {
                it2.next();
                size++;
                if (size < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        sbLIZ.append(size);
        C719300SJk.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList<C0SJL> arrayList = new ArrayList();
        for (C0SJL<C719000SIg> c0sjl : iterable) {
            if (!c0sjl.LLILZIL) {
                arrayList.add(c0sjl);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C0SJL c0sjl2 : arrayList) {
            C719000SIg c719000SIg = (C719000SIg) c0sjl2.LLIZ;
            if (c719000SIg != null && (textExtraStruct3 = c719000SIg.LIZ) != null) {
                textExtraStruct3.setStart(c0sjl2.LLILLL);
            }
            C719000SIg c719000SIg2 = (C719000SIg) c0sjl2.LLIZ;
            if (c719000SIg2 != null && (textExtraStruct2 = c719000SIg2.LIZ) != null) {
                textExtraStruct2.setEnd(c0sjl2.LLILZ);
            }
            C719000SIg c719000SIg3 = (C719000SIg) c0sjl2.LLIZ;
            if (c719000SIg3 != null && (textExtraStruct = c719000SIg3.LIZ) != null) {
                arrayList2.add(textExtraStruct);
            }
        }
        return C13LP.LLIIII(arrayList2);
    }

    public final void LJ() {
        Iterable<? extends C0SJL<C719000SIg>> iterable = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (C0SJL<C719000SIg> c0sjl : iterable) {
            C19719612Di.LJJI(c0sjl instanceof C0SJK ? ((C0SJK) c0sjl).LJFF() : Collections.singletonList(c0sjl), arrayList);
        }
        this.LLILLJJLI = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0SJF(Iterable<? extends C0SJL<C719000SIg>> iterable) {
        this.LL = iterable;
        this.LLILLJJLI = iterable;
    }

    public static CharSequence LIZ(C0SJF c0sjf) {
        List list;
        Iterable<? extends C0SJL<C719000SIg>> iterable = c0sjf.LLILLJJLI;
        if (C19719512Dh.LJI(iterable) && (list = (List) iterable) != null) {
            return C0SJH.LIZ(list, false);
        }
        return "";
    }

    public final void LIZLLL(Function1 function1) {
        Iterable<? extends C0SJL<C719000SIg>> iterable = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        Iterator<? extends C0SJL<C719000SIg>> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(function1.invoke(it2.next()));
        }
        this.LLILLJJLI = arrayList;
    }
}
