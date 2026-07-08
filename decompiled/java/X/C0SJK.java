package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0SJK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0SJK extends C0SJL<C719000SIg> {
    public final List<C0SJL<C719000SIg>> LLJ;

    public final List<C0SJL<C719000SIg>> LJFF() {
        List<C0SJL<C719000SIg>> list = this.LLJ;
        ArrayList arrayList = new ArrayList();
        for (C0SJL c0sjl : (ArrayList) list) {
            C19719612Di.LJJI(c0sjl instanceof C0SJK ? ((C0SJK) c0sjl).LJFF() : Collections.singletonList(c0sjl), arrayList);
        }
        return arrayList;
    }

    @Override // X.C0SFJ
    public String LIZ() {
        List<C0SJL<C719000SIg>> listLJFF = LJFF();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJFF, 10));
        Iterator<C0SJL<C719000SIg>> it2 = listLJFF.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ());
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) next);
            sbLIZ.append(str);
            next = C2188811AlT.LIZIZ(sbLIZ);
        }
        return (String) next;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [METADATA] */
    public final void LJ(C0SJL<C719000SIg> c0sjl) {
        this.LLILLL = c0sjl.LLILLL;
        this.LLILZ = c0sjl.LLILZ;
        this.LLILZIL = c0sjl.LLILZIL;
        this.LLILZLL = c0sjl.LLILZLL;
        this.LLIZ = c0sjl.LLIZ;
        this.LLIZLLLIL.addAll(c0sjl.LLIZLLLIL);
        if (c0sjl instanceof C0SJK) {
            ((ArrayList) this.LLJ).addAll(((C0SJK) c0sjl).LLJ);
        }
    }

    public C0SJK(int i, int i2) {
        super(i, i2);
        this.LLJ = new ArrayList();
    }
}
