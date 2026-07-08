package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.05i8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1426205i8 implements C05WF {
    public final C1426305i9 LIZ;

    @Override // X.C05WF
    public final void LIZ(float f, String str) {
    }

    public C1426205i8(C1426305i9 c1426305i9) {
        this.LIZ = c1426305i9;
    }

    @Override // X.C05WF
    public final void LIZIZ(float f, EnumC1426605iC enumC1426605iC) {
        float fLIZLLL;
        C1426305i9 c1426305i9 = this.LIZ;
        float fLIZLLL2 = 1.0f;
        float fLIZLLL3 = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        if (!c1426305i9.LIZLLL) {
            C1426405iA c1426405iA = (C1426405iA) ((LinkedHashMap) c1426305i9.LIZJ).get(enumC1426605iC);
            if (c1426405iA != null) {
                float fLIZLLL4 = C13LZ.LIZLLL(fLIZLLL3, 0.0f, 1.0f);
                c1426405iA.LIZJ = fLIZLLL4;
                if (fLIZLLL4 >= 1.0f) {
                    c1426405iA.LIZJ = 1.0f;
                    c1426405iA.LJ = true;
                }
            }
            C05WF c05wf = c1426305i9.LIZIZ;
            if (c05wf != null) {
                if (!c1426305i9.LIZLLL) {
                    Set setEntrySet = ((LinkedHashMap) c1426305i9.LIZJ).entrySet();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : setEntrySet) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (entry.getKey() != EnumC1426605iC.DOWNLOAD_RES && entry.getKey() != EnumC1426605iC.FETCH_MINI_DRAFT) {
                            arrayList2.add(obj);
                        } else {
                            arrayList.add(obj);
                        }
                    }
                    Pair pair = new Pair(arrayList, arrayList2);
                    List<Map.Entry> list = (List) pair.getFirst();
                    List list2 = (List) pair.getSecond();
                    if (true ^ list.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (Map.Entry entry2 : list) {
                            arrayList3.add(Float.valueOf(C13LZ.LIZLLL(((C1426405iA) entry2.getValue()).LIZJ, 0.0f, 1.0f) * ((C1426405iA) entry2.getValue()).LIZIZ));
                        }
                        fLIZLLL = C13LP.LJZ(arrayList3) + 0.0f;
                    } else {
                        fLIZLLL = 0.0f;
                    }
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C1426405iA c1426405iA2 = (C1426405iA) ((Map.Entry) it2.next()).getValue();
                        fLIZLLL += C13LZ.LIZLLL(c1426405iA2.LIZJ, 0.0f, 1.0f) * c1426405iA2.LIZIZ;
                    }
                    fLIZLLL2 = C13LZ.LIZLLL(fLIZLLL, 0.0f, 1.0f);
                }
                c05wf.LIZ(fLIZLLL2, c1426305i9.LIZ);
            }
        }
    }
}
