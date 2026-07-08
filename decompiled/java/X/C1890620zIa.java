package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.inbox.widget.change.InboxListChangeConfigModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890620zIa {
    public static final /* synthetic */ int LJIIJ = 0;
    public final LifecycleOwner LIZ;
    public final String LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 812));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(606));
    public List<? extends InterfaceC1890700zIi> LJ;
    public List<? extends InterfaceC1890700zIi> LJFF;
    public final HashMap<String, C1890630zIb> LJI;
    public final C01GW LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;

    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.13BV] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.13BV] */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.util.List] */
    public final void LJ() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<InterfaceC1891350zJl> list;
        List<InterfaceC1891350zJl> list2;
        C1890630zIb c1890630zIb = this.LJI.get("vertical_change");
        C1890630zIb c1890630zIb2 = this.LJI.get("horizontal_change");
        if (c1890630zIb == null && c1890630zIb2 == null) {
            return;
        }
        if (c1890630zIb == null || (list2 = c1890630zIb.LIZ) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list2) {
                if (interfaceC1891350zJl instanceof InterfaceC1890700zIi) {
                    arrayList.add(interfaceC1891350zJl);
                }
            }
        }
        C259800zU c259800zU = new C259800zU();
        ?? r0 = C13BV.INSTANCE;
        c259800zU.element = r0;
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = r0;
        if (arrayList != null && (!arrayList.isEmpty())) {
            if (this.LJ.isEmpty()) {
                this.LJ = arrayList;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("vertical list, positionPair is ");
                sbLIZ.append(c1890630zIb.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                int i = C2187451AjH.LIZ;
                c259800zU.element = LIZIZ(this.LJ, c1890630zIb.LIZIZ);
                c259800zU2.element = LIZIZ(arrayList, c1890630zIb.LIZIZ);
            }
        }
        if (c1890630zIb2 == null || (list = c1890630zIb2.LIZ) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl2 : list) {
                if (interfaceC1891350zJl2 instanceof InterfaceC1890700zIi) {
                    arrayList2.add(interfaceC1891350zJl2);
                }
            }
        }
        C259800zU c259800zU3 = new C259800zU();
        ?? r02 = C13BV.INSTANCE;
        c259800zU3.element = r02;
        C259800zU c259800zU4 = new C259800zU();
        c259800zU4.element = r02;
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            if (this.LJFF.isEmpty()) {
                this.LJFF = arrayList2;
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("horizontal list, positionPair is ");
                sbLIZ2.append(c1890630zIb2.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ2);
                int i2 = C2187451AjH.LIZ;
                c259800zU3.element = LIZIZ(this.LJFF, c1890630zIb2.LIZIZ);
                c259800zU4.element = LIZIZ(arrayList2, c1890630zIb2.LIZIZ);
            }
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZJ.getValue(), null, null, new C1890650zId(this, c259800zU, c259800zU2, c259800zU3, c259800zU4, null), 3);
    }

    public final boolean LIZ() {
        if (this.LJIIIIZZ > 0 && System.currentTimeMillis() - this.LJIIIIZZ > ((InboxListChangeConfigModel) this.LIZLLL.getValue()).monitorDuration) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("over ");
            sbLIZ.append(((InboxListChangeConfigModel) this.LIZLLL.getValue()).monitorDuration);
            sbLIZ.append("ms, no need to calculate!");
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C2187451AjH.LIZ;
            return false;
        }
        if (this.LJIIIZ <= 0 || System.currentTimeMillis() - this.LJIIIZ >= ((InboxListChangeConfigModel) this.LIZLLL.getValue()).singleChangePeriodThreshold) {
            this.LJIIIZ = System.currentTimeMillis();
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("less ");
        sbLIZ2.append(((InboxListChangeConfigModel) this.LIZLLL.getValue()).singleChangePeriodThreshold);
        sbLIZ2.append("ms, no need to calculate!");
        C2188811AlT.LIZIZ(sbLIZ2);
        int i2 = C2187451AjH.LIZ;
        return false;
    }

    public final InterfaceC1890670zIf LIZJ() {
        return (InterfaceC1890670zIf) this.LJII.getValue();
    }

    public final void LJFF(AbstractC1890740zIm abstractC1890740zIm) {
        if (this.LJIIIIZZ > 0) {
            return;
        }
        this.LJIIIIZZ = System.currentTimeMillis();
        LIZJ().LIZJ(abstractC1890740zIm);
        int i = C2187451AjH.LIZ;
        C23250099c.LIZLLL((InterfaceC497601wk) this.LIZJ.getValue(), C0PEM.LIZJ, null, new C1890610zIZ(this, null), 2);
    }

    public C1890620zIa(String str, Fragment fragment) {
        this.LIZ = fragment;
        this.LIZIZ = str;
        C13BV c13bv = C13BV.INSTANCE;
        this.LJ = c13bv;
        this.LJFF = c13bv;
        this.LJI = new HashMap<>();
        this.LJII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 811));
        this.LJIIIZ = -1L;
    }

    public static List LIZIZ(List list, Pair pair) {
        if (pair == null) {
            return C13BV.INSTANCE;
        }
        if (((Number) pair.getFirst()).intValue() >= 0 && ((Number) pair.getSecond()).intValue() >= 0 && ((Number) pair.getSecond()).intValue() > ((Number) pair.getFirst()).intValue()) {
            if (list.size() - 1 > ((Number) pair.getSecond()).intValue()) {
                return list.subList(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue() + 1);
            }
            return list;
        }
        return C13BV.INSTANCE;
    }

    public final void LIZLLL(List<? extends InterfaceC1891350zJl> list, Pair<Integer, Integer> pair) {
        InterfaceC1890700zIi interfaceC1890700zIi;
        this.LJI.put("vertical_change", new C1890630zIb(list, pair));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update vertical list at ");
        sbLIZ.append(System.currentTimeMillis() - this.LJIIIIZZ);
        sbLIZ.append("ms");
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        List<? extends InterfaceC1890700zIi> list2 = this.LJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<? extends InterfaceC1890700zIi> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().itemUniqueId());
        }
        arrayList.toString();
        int i2 = C2187451AjH.LIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            String strItemUniqueId = null;
            if ((interfaceC1891350zJl instanceof InterfaceC1890700zIi) && (interfaceC1890700zIi = (InterfaceC1890700zIi) interfaceC1891350zJl) != null) {
                strItemUniqueId = interfaceC1890700zIi.itemUniqueId();
            }
            arrayList2.add(strItemUniqueId);
        }
        arrayList2.toString();
        int i3 = C2187451AjH.LIZ;
        if (!LIZ()) {
            return;
        }
        LJ();
    }
}
