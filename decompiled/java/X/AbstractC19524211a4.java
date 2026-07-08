package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11a4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19524211a4 extends AbstractC19526011aM implements InterfaceC19524011a2 {
    public final C19523911a1 LJIIIZ = new C19523911a1(LJIILLIIL());
    public final C19523711Zz LJIIJ = new C19523711Zz(LJIILLIIL());

    @Override // X.AbstractC19526011aM
    public final Object LJIJI(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list, List<? extends InterfaceC19526611aS> list2, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return "can't reach here";
    }

    @Override // X.AbstractC19526011aM
    public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
        return false;
    }

    @Override // X.AbstractC19526011aM
    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
    }

    public abstract void LJJIJL();

    @Override // X.InterfaceC19524011a2
    public final C19523711Zz LJIIJ() {
        this.LJIIJ.LJIIJ = false;
        this.LJIIJ.LJJIIZ(1, "schedule_item_one_by_one");
        return this.LJIIJ;
    }

    @Override // X.InterfaceC19524011a2
    public final void LJII() {
        LJJIJL();
        ((ArrayList) C1195004lw.LIZ).clear();
        ((LinkedHashMap) C1195004lw.LIZIZ).clear();
        LJI();
    }

    @Override // X.InterfaceC19524311a5
    public final String LJIILLIIL() {
        return getClass().getSimpleName();
    }

    @Override // X.InterfaceC19524011a2
    public final C19523911a1 LIZIZ() {
        return this.LJIIIZ;
    }

    public final void LJJIJLIJ(List<C19524511a7> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (C19524511a7 c19524511a7 : list) {
            arrayList.add(c19524511a7.LIZ);
            String str = "";
            if (c19524511a7.LIZJ) {
                arrayList2.add(c19524511a7.LIZ);
                InterfaceC19524311a5 interfaceC19524311a5 = c19524511a7.LIZ;
                String str2 = c19524511a7.LIZIZ;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap2.put(interfaceC19524311a5, str2);
            }
            InterfaceC19524311a5 interfaceC19524311a52 = c19524511a7.LIZ;
            String str3 = c19524511a7.LIZIZ;
            if (str3 != null) {
                str = str3;
            }
            linkedHashMap.put(interfaceC19524311a52, str);
        }
        this.LJIIJ.LJJIIZ(1, "schedule_item_all_end");
        if (arrayList2.isEmpty()) {
            this.LJIIJ.LJJIIJZLJL("schedule_handler_only_one", linkedHashMap);
        } else {
            this.LJIIJ.LJJIIJZLJL("schedule_handler_all", linkedHashMap2);
        }
        for (C19524511a7 c19524511a72 : list) {
            String str4 = c19524511a72.LIZIZ;
            if (str4 == null) {
                c19524511a72.LIZ.LJIIJJI();
                LJJIJIIJIL(c19524511a72.LIZ, "_GROUP_INNER_END", this.LJIIJ);
            } else {
                c19524511a72.LIZ.LIZJ(str4);
                LJJIJIIJIL(c19524511a72.LIZ, c19524511a72.LIZIZ, this.LJIIJ);
            }
        }
    }

    public final void LJJIZ(List<? extends InterfaceC19524311a5> list) {
        Iterator<? extends InterfaceC19524311a5> it2 = list.iterator();
        while (it2.hasNext()) {
            LJJIJIIJIL(this.LJIIIZ, "_GROUP_INNER_START", it2.next());
        }
    }

    public final void LJJIJIL(C19529711ax c19529711ax, C11ZU c11zu) {
        Map<String, String> map = C1195004lw.LIZIZ;
        if (map.isEmpty()) {
            C19529611aw.LIZ();
        } else {
            for (String str : ((LinkedHashMap) map).keySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) ((LinkedHashMap) C1195004lw.LIZIZ).get(str));
                sbLIZ.append(' ');
                sbLIZ.append(str);
                sbLIZ.append('\n');
                C2188811AlT.LIZIZ(sbLIZ);
            }
            for (String str2 : (ArrayList) C1195004lw.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append('\n');
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            C19529611aw.LIZ();
        }
        c19529711ax.LJIIIIZZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C19522811Zq(c19529711ax, this, c11zu, null), 3);
    }

    public final void LJJIL(List<? extends InterfaceC19524311a5> list, List<? extends InterfaceC19524311a5> list2) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC19524311a5 interfaceC19524311a5 : list) {
            arrayList.add(interfaceC19524311a5);
            interfaceC19524311a5.LJIIJJI();
        }
        if (list2 == null) {
            this.LJIIJ.LJJIIJ("schedule_handler_all", arrayList);
        } else if (list2.isEmpty()) {
            this.LJIIJ.LJJIIJ("schedule_handler_only_one", arrayList);
        } else {
            this.LJIIJ.LJJIIJ("schedule_handler_all", list2);
        }
        this.LJIIJ.LJJIIZ(1, "schedule_item_all_end");
        Iterator<? extends InterfaceC19524311a5> it2 = list.iterator();
        while (it2.hasNext()) {
            LJJIJIIJIL(it2.next(), "_GROUP_INNER_END", this.LJIIJ);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.0zJw] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.11a6] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.11a5] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(X.InterfaceC19524311a5 r7, java.lang.String r8, X.InterfaceC19524311a5 r9) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19524211a4.LJJIJIIJIL(X.11a5, java.lang.String, X.11a5):void");
    }

    @Override // X.AbstractC19526011aM, X.InterfaceC19524311a5
    public final Object LIZ(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list, C11ZU c11zu, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = this.LJIIIZ.LIZ(interfaceC19526511aR, list, c11zu, interfaceC1364105Vn);
        if (objLIZ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLIZ;
    }
}
