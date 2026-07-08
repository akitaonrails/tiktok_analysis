package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.camera.core.api.effect.IMComposerInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS105S1200000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0meH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404350meH implements InterfaceC1404330meF {
    public final C1DK1 LIZ;
    public final HashMap<EnumC1404340meG, List<IMComposerInfo>> LIZIZ = new HashMap<>(8);

    public C1404350meH(C1DK1 c1dk1) {
        this.LIZ = c1dk1;
    }

    @Override // X.InterfaceC1404330meF
    public final void LJJLIIIJILLIZJL(List<IMComposerInfo> list) {
        ArrayList<IMComposerInfo> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (IMComposerInfo iMComposerInfo : arrayList) {
            arrayList2.add(iMComposerInfo.nodePath);
            String str = iMComposerInfo.nodePath;
            for (EnumC1404340meG enumC1404340meG : this.LIZIZ.keySet()) {
                List<IMComposerInfo> list2 = this.LIZIZ.get(enumC1404340meG);
                if (list2 != null) {
                    C19719612Di.LJJIIJ(list2, new AwS105S1200000_22(this, enumC1404340meG, str, 11), true);
                }
            }
        }
        this.LIZ.LIZ().LJIILL(arrayList2.size(), (String[]) arrayList2.toArray(new String[0]));
    }

    public static String LJI(String str, EnumC1404340meG enumC1404340meG) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6);
        if (enumC1404340meG == EnumC1404340meG.FILTER) {
            if (!listLJJLIIIJILLIZJL.isEmpty()) {
                return (String) C13LP.LJJJJZI(listLJJLIIIJILLIZJL);
            }
            return str;
        }
        if (listLJJLIIIJILLIZJL.size() >= 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
            sbLIZ.append(':');
            sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    @Override // X.InterfaceC1404330meF
    public final void LIZ(List<IMComposerInfo> list, EnumC1404340meG enumC1404340meG) {
        List<IMComposerInfo> copyOnWriteArrayList = this.LIZIZ.get(enumC1404340meG);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.LIZIZ.put(enumC1404340meG, copyOnWriteArrayList);
        }
        C13LP.LJJJJLL(list, copyOnWriteArrayList);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = this.LIZIZ.values().iterator();
        while (it2.hasNext()) {
            for (IMComposerInfo iMComposerInfo : (List) it2.next()) {
                arrayList.add(iMComposerInfo.nodePath);
                arrayList2.add(iMComposerInfo.extra);
            }
        }
        this.LIZ.LIZ().LJIJJLI(arrayList.size(), (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
    }

    @Override // X.InterfaceC1404330meF
    public final void LIZLLL(List<IMComposerInfo> list, EnumC1404340meG enumC1404340meG) {
        List<IMComposerInfo> list2 = this.LIZIZ.get(enumC1404340meG);
        if (list2 == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.addAll(list);
            this.LIZIZ.put(enumC1404340meG, copyOnWriteArrayList);
        } else {
            list2.removeAll(list);
            list2.addAll(list);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((IMComposerInfo) it2.next()).nodePath);
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((IMComposerInfo) it3.next()).extra);
        }
        this.LIZ.LIZ().LJ(arrayList.size(), (String[]) arrayList.toArray(new String[0]), (String[]) arrayList3.toArray(new String[0]));
    }

    @Override // X.InterfaceC1404330meF
    public final void LJ(List<IMComposerInfo> list, EnumC1404340meG enumC1404340meG) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap<EnumC1404340meG, List<IMComposerInfo>> map = this.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<EnumC1404340meG, List<IMComposerInfo>> entry : map.entrySet()) {
            if (entry.getKey() == enumC1404340meG) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) it2.next()).iterator();
            while (it3.hasNext()) {
                arrayList.add(((IMComposerInfo) it3.next()).nodePath);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (IMComposerInfo iMComposerInfo : list) {
            arrayList3.add(iMComposerInfo.nodePath);
            String str = iMComposerInfo.extra;
            if (str == null) {
                str = "";
            }
            arrayList2.add(str);
        }
        List<IMComposerInfo> copyOnWriteArrayList = this.LIZIZ.get(enumC1404340meG);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.LIZIZ.put(enumC1404340meG, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.addAll(list);
        this.LIZ.LIZ().LJIJ((String[]) arrayList.toArray(new String[0]), arrayList.size(), (String[]) arrayList3.toArray(new String[0]), arrayList3.size(), (String[]) arrayList2.toArray(new String[0]));
    }

    @Override // X.InterfaceC1404330meF
    public final void LJFF(List<IMComposerInfo> list, EnumC1404340meG enumC1404340meG) {
        if (this.LIZIZ.containsKey(enumC1404340meG)) {
            LJ(list, enumC1404340meG);
        } else {
            LIZ(list, enumC1404340meG);
        }
    }

    @Override // X.InterfaceC1404330meF
    public final int[] LJJLL(String str, String str2) {
        return this.LIZ.LIZ().LJFF(str, str2);
    }

    @Override // X.InterfaceC1404330meF
    public final void LIZIZ(String str, String str2, float f) {
        this.LIZ.LIZ().LJJIJIIJI(str, str2, f);
    }

    @Override // X.InterfaceC1404330meF
    public final void LIZJ(List<IMComposerInfo> list, List<IMComposerInfo> list2, EnumC1404340meG enumC1404340meG) {
        List<IMComposerInfo> list3 = this.LIZIZ.get(enumC1404340meG);
        if (list3 == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.removeAll(list);
            copyOnWriteArrayList.addAll(list2);
            this.LIZIZ.put(enumC1404340meG, copyOnWriteArrayList);
        } else {
            list3.removeAll(list);
            list3.addAll(list2);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(LJI(((IMComposerInfo) it2.next()).nodePath, enumC1404340meG));
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        ArrayList arrayList3 = (ArrayList) list2;
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((IMComposerInfo) it3.next()).nodePath);
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((IMComposerInfo) it4.next()).extra);
        }
        this.LIZ.LIZ().LJIJ((String[]) arrayList.toArray(new String[0]), arrayList.size(), (String[]) arrayList2.toArray(new String[0]), arrayList2.size(), (String[]) arrayList4.toArray(new String[0]));
    }
}
