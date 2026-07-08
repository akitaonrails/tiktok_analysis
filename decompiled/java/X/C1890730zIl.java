package X;

import com.ss.android.ugc.aweme.inbox.widget.change.InboxListChangeConfigModel;
import com.ss.android.ugc.aweme.inbox.widget.change.InboxListChangeEventReporter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890730zIl implements InterfaceC1890670zIf {
    public final String LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(210));
    public AbstractC1890740zIm LIZJ = C1890750zIn.LIZIZ;
    public final Set<String> LIZLLL = new LinkedHashSet();
    public final List<String> LJ = new ArrayList();
    public final CopyOnWriteArrayList<InboxListChangeEventReporter.SingleChangeDetail> LJFF = new CopyOnWriteArrayList<>();
    public final C01GW LJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 260));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 261));
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);

    @Override // X.InterfaceC1890670zIf
    public final void LIZ() {
        if (this.LJIIIIZZ.get()) {
            return;
        }
        if (this.LIZLLL.isEmpty() && ((ArrayList) this.LJ).isEmpty()) {
            int i = C2187451AjH.LIZ;
            return;
        }
        InboxListChangeEventReporter.SingleChangeDetail singleChangeDetail = new InboxListChangeEventReporter.SingleChangeDetail(this.LIZLLL.size(), ((ArrayList) this.LJ).size(), new LinkedHashSet(), new CopyOnWriteArrayList());
        singleChangeDetail.itemChangeIdentity.addAll(this.LJ);
        singleChangeDetail.listChangeIdentity.addAll(this.LIZLLL);
        this.LJFF.add(singleChangeDetail);
        C1890710zIj c1890710zIj = (C1890710zIj) this.LJI.getValue();
        c1890710zIj.LLILLL.clear();
        c1890710zIj.LLILZ.clear();
        C1890710zIj c1890710zIj2 = (C1890710zIj) this.LJII.getValue();
        c1890710zIj2.LLILLL.clear();
        c1890710zIj2.LLILZ.clear();
        ((ArrayList) this.LJ).clear();
        this.LIZLLL.clear();
    }

    @Override // X.InterfaceC1890670zIf
    public final C1890710zIj LIZIZ() {
        return (C1890710zIj) this.LJI.getValue();
    }

    @Override // X.InterfaceC1890670zIf
    public final C1890710zIj LJ() {
        return (C1890710zIj) this.LJII.getValue();
    }

    @Override // X.InterfaceC1890670zIf
    public final void LJFF() {
        this.LJIIIIZZ.compareAndSet(false, true);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (InboxListChangeEventReporter.SingleChangeDetail singleChangeDetail : this.LJFF) {
            i++;
            int i6 = singleChangeDetail.listChangeCount;
            if (i6 > 0) {
                i2++;
                i4 += i6;
                f += i6 * ((InboxListChangeConfigModel) this.LIZIZ.getValue()).listChangeWeight;
            }
            int i7 = singleChangeDetail.itemChangeCount;
            if (i7 > 0) {
                i3++;
                i5 += i7;
                f += i7 * ((InboxListChangeConfigModel) this.LIZIZ.getValue()).itemChangeWeight;
            }
            for (Object obj : singleChangeDetail.listChangeIdentity) {
                Integer num = (Integer) map2.get(obj);
                if (num != null) {
                    map2.put(obj, Integer.valueOf(num.intValue() + 1));
                } else {
                    map2.put(obj, 1);
                }
            }
            for (String str : singleChangeDetail.itemChangeIdentity) {
                Integer num2 = (Integer) map.get(str);
                if (num2 != null) {
                    map.put(str, Integer.valueOf(num2.intValue() + 1));
                } else {
                    map.put(str, 1);
                }
            }
        }
        HashMap map4 = new HashMap();
        Collection<AbstractC1890770zIp> collectionValues = C1890800zIs.LIZJ.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (obj2 instanceof C1890790zIr) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList) {
            String str2 = ((AbstractC1890770zIp) obj3).LIZ;
            Object arrayList2 = linkedHashMap.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str2, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            map4.put(entry.getKey(), Integer.valueOf(((List) entry.getValue()).size()));
        }
        int i8 = 0;
        C1890800zIs.LIZIZ = false;
        C1890800zIs.LIZJ.clear();
        for (Map.Entry entry2 : map4.entrySet()) {
            Object key = entry2.getKey();
            int iIntValue = ((Number) entry2.getValue()).intValue();
            i8 += iIntValue;
            map3.put(key, Integer.valueOf(iIntValue));
        }
        float f2 = f + (i8 * ((InboxListChangeConfigModel) this.LIZIZ.getValue()).imgChangeWeight);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getInboxImgChangeResult -> imageResultMap: ");
        sbLIZ.append(map4);
        C2188811AlT.LIZIZ(sbLIZ);
        int i9 = C2187451AjH.LIZ;
        C1890860zIy c1890860zIy = new C1890860zIy(this.LIZ, this.LIZJ.LIZ, f2, i, i2, i3, i4, i5, i8, map2, map, map3);
        c1890860zIy.LJIIL = this.LJFF;
        C2450909j1.LIZ(new AwS572S0100000_28(c1890860zIy, 259));
        this.LJFF.clear();
    }

    public C1890730zIl(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1890670zIf
    public final void LIZJ(AbstractC1890740zIm abstractC1890740zIm) {
        this.LIZJ = abstractC1890740zIm;
        this.LJFF.clear();
        String str = this.LIZ;
        C1890800zIs.LIZJ.clear();
        C1890800zIs.LIZIZ = true;
        C1890800zIs.LIZLLL = str;
        this.LJIIIIZZ.set(false);
    }

    @Override // X.InterfaceC1890670zIf
    public final void LIZLLL(List<? extends InterfaceC1890700zIi> list, List<? extends InterfaceC1890700zIi> list2) {
        if (this.LJIIIIZZ.get()) {
            return;
        }
        ((C1890710zIj) this.LJI.getValue()).LLILLL = new ArrayList(list);
        ((C1890710zIj) this.LJI.getValue()).LLILZ = new ArrayList(list2);
    }

    @Override // X.InterfaceC1890670zIf
    public final void LJI(List<? extends InterfaceC1890700zIi> list, List<? extends InterfaceC1890700zIi> list2) {
        if (this.LJIIIIZZ.get()) {
            return;
        }
        ((C1890710zIj) this.LJII.getValue()).LLILLL = new ArrayList(list);
        ((C1890710zIj) this.LJII.getValue()).LLILZ = new ArrayList(list2);
    }
}
