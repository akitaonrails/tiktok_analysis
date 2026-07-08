package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.vesdk.VERecorder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS105S1200000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0meI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404360meI implements InterfaceC1661400tKs {
    public final VERecorder LIZ;
    public final HashMap<Integer, List<ComposerInfo>> LIZIZ = new HashMap<>(8);

    public final void LIZ() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = this.LIZIZ.values().iterator();
        while (it2.hasNext()) {
            for (ComposerInfo composerInfo : (List) it2.next()) {
                arrayList.add(composerInfo.nodePath);
                String str = composerInfo.extra;
                if (str == null) {
                    str = "";
                }
                arrayList2.add(str);
            }
        }
        this.LIZ.LJIIL().LJIJJLI(arrayList.size(), (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
    }

    @Override // X.InterfaceC1661400tKs
    public final void LJJLIIIJJI() {
        this.LIZIZ.clear();
        LIZ();
    }

    @Override // X.InterfaceC1661400tKs
    public final void M4() {
        this.LIZ.LJIIL().LJIJJ();
    }

    @Override // X.InterfaceC1661400tKs
    public final C1404370meJ N4() {
        return new C1404370meJ(this);
    }

    public C1404360meI(VERecorder vERecorder) {
        this.LIZ = vERecorder;
    }

    public final void LIZJ(String str) {
        for (Integer num : this.LIZIZ.keySet()) {
            List<ComposerInfo> list = this.LIZIZ.get(num);
            if (list != null) {
                C19719612Di.LJJIIJ(list, new AwS105S1200000_22(this, num, str, 0), true);
            }
        }
    }

    @Override // X.InterfaceC1661400tKs
    public final void LJJLIIIJILLIZJL(List<ComposerInfo> list) {
        ArrayList<ComposerInfo> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ComposerInfo composerInfo : arrayList) {
            arrayList2.add(composerInfo.nodePath);
            LIZJ(composerInfo.nodePath);
        }
        this.LIZ.LJIIL().LJIILL(arrayList2.size(), (String[]) arrayList2.toArray(new String[0]));
    }

    public static String LIZIZ(int i, String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6);
        if (i == 500) {
            if (!listLJJLIIIJILLIZJL.isEmpty()) {
                return (String) C13LP.LJJJJZI(listLJJLIIIJILLIZJL);
            }
        } else if (listLJJLIIIJILLIZJL.size() >= 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
            sbLIZ.append(':');
            sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    @Override // X.InterfaceC1661400tKs
    public final void L4(List<ComposerInfo> list, int i) {
        List<ComposerInfo> copyOnWriteArrayList = this.LIZIZ.get(Integer.valueOf(i));
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.LIZIZ.put(Integer.valueOf(i), copyOnWriteArrayList);
        }
        C13LP.LJJJJLL(list, copyOnWriteArrayList);
        LIZ();
    }

    @Override // X.InterfaceC1661400tKs
    public final void R1(List<ComposerInfo> list, int i) {
        this.LIZIZ.clear();
        HashMap<Integer, List<ComposerInfo>> map = this.LIZIZ;
        Integer numValueOf = Integer.valueOf(i);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        C13LP.LJJJJLL(list, copyOnWriteArrayList);
        map.put(numValueOf, copyOnWriteArrayList);
        LIZ();
    }

    @Override // X.InterfaceC1661400tKs
    public final void h(List<ComposerInfo> list, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap<Integer, List<ComposerInfo>> map = this.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, List<ComposerInfo>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == i) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) it2.next()).iterator();
            while (it3.hasNext()) {
                arrayList.add(((ComposerInfo) it3.next()).nodePath);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (ComposerInfo composerInfo : (ArrayList) list) {
            arrayList3.add(composerInfo.nodePath);
            String str = composerInfo.extra;
            if (str == null) {
                str = "";
            }
            arrayList2.add(str);
        }
        List<ComposerInfo> copyOnWriteArrayList = this.LIZIZ.get(Integer.valueOf(i));
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.LIZIZ.put(Integer.valueOf(i), copyOnWriteArrayList);
        }
        copyOnWriteArrayList.addAll(list);
        this.LIZ.LJIIL().LJIJ((String[]) arrayList.toArray(new String[0]), arrayList.size(), (String[]) arrayList3.toArray(new String[0]), arrayList3.size(), (String[]) arrayList2.toArray(new String[0]));
    }

    @Override // X.InterfaceC1661400tKs
    public final void n0(List<ComposerInfo> list, int i) {
        List<ComposerInfo> list2 = this.LIZIZ.get(Integer.valueOf(i));
        if (list2 == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.addAll(list);
            this.LIZIZ.put(Integer.valueOf(i), copyOnWriteArrayList);
        } else {
            list2.removeAll(list);
            list2.addAll(list);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ComposerInfo) it2.next()).nodePath);
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((ComposerInfo) it3.next()).extra);
        }
        this.LIZ.LJIIL().LJ(arrayList.size(), (String[]) arrayList.toArray(new String[0]), (String[]) arrayList3.toArray(new String[0]));
    }

    @Override // X.InterfaceC1661400tKs
    public final void i2(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        List<ComposerInfo> list3 = this.LIZIZ.get(Integer.valueOf(i));
        if (list3 == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.removeAll(list);
            copyOnWriteArrayList.addAll(list2);
            this.LIZIZ.put(Integer.valueOf(i), copyOnWriteArrayList);
        } else {
            list3.removeAll(list);
            list3.addAll(list2);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(LIZIZ(i, ((ComposerInfo) it2.next()).nodePath));
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        ArrayList arrayList3 = (ArrayList) list2;
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((ComposerInfo) it3.next()).nodePath);
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((ComposerInfo) it4.next()).extra);
        }
        this.LIZ.LJIIL().LJIJ((String[]) arrayList.toArray(new String[0]), arrayList.size(), (String[]) arrayList2.toArray(new String[0]), arrayList2.size(), (String[]) arrayList4.toArray(new String[0]));
    }
}
