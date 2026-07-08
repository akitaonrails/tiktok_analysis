package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0PfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650620PfY implements InterfaceC588610N6t {
    public C587060N0u LIZJ;
    public InterfaceC648350Pbt LJFF;
    public boolean LJI;
    public boolean LJIIIIZZ;
    public Map<InterfaceC648350Pbt, C650660Pfc> LIZ = new LinkedHashMap();
    public ArrayList<InterfaceC648350Pbt> LIZIZ = new ArrayList<>();
    public int LIZLLL = 1;
    public ArrayList<InterfaceC648350Pbt> LJ = new ArrayList<>();
    public final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public final C650610PfX LJIIIZ = new InterfaceC659190PtN() { // from class: X.0PfX
        @Override // X.InterfaceC659190PtN
        public final void LIZ(InterfaceC648350Pbt interfaceC648350Pbt) {
            InterfaceC648350Pbt interfaceC648350Pbt2 = this.LIZ.LJFF;
            if (interfaceC648350Pbt2 != null && !Intrinsics.LJFF(interfaceC648350Pbt2, interfaceC648350Pbt)) {
                LJ("imageLoadFinished", interfaceC648350Pbt2);
            }
        }

        @Override // X.InterfaceC659190PtN
        public final void LIZIZ(String str, InterfaceC648350Pbt interfaceC648350Pbt) {
            if (!Intrinsics.LJFF(interfaceC648350Pbt, this.LIZ.LJFF)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ignore resume play callback for sourceId:");
                sbLIZ.append(str);
                sbLIZ.append('.');
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            this.LIZ.LJI = true;
            LJ("resume", interfaceC648350Pbt);
        }

        @Override // X.InterfaceC659190PtN
        public final void LIZJ(String str, InterfaceC648350Pbt interfaceC648350Pbt) {
            if (!Intrinsics.LJFF(interfaceC648350Pbt, this.LIZ.LJFF)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ignore render first frame callback for sourceId:");
                sbLIZ.append(str);
                sbLIZ.append('.');
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            this.LIZ.LJI = true;
            LJ("renderFirstFrame", interfaceC648350Pbt);
        }

        @Override // X.InterfaceC659190PtN
        public final void LIZLLL(String str, InterfaceC648350Pbt interfaceC648350Pbt) {
            int iIndexOf;
            if (!Intrinsics.LJFF(interfaceC648350Pbt, this.LIZ.LJFF)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ignore play completed callback for sourceId: ");
                sbLIZ.append(str);
                sbLIZ.append('.');
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            C664400Q4g c664400Q4g = new C664400Q4g();
            c664400Q4g.LIZJ = System.currentTimeMillis();
            c664400Q4g.LJIIJ = "auto_play";
            C650620PfY c650620PfY = this.LIZ;
            if (!c650620PfY.LIZIZ.isEmpty() && (iIndexOf = c650620PfY.LIZIZ.indexOf(interfaceC648350Pbt)) >= 0) {
                Pair<Integer, Integer> pairLJIIIIZZ = c650620PfY.LJIIIIZZ(iIndexOf, c650620PfY.LIZIZ.size(), c650620PfY.LIZLLL);
                int iIntValue = pairLJIIIIZZ.getFirst().intValue();
                c650620PfY.LIZLLL = pairLJIIIIZZ.getSecond().intValue();
                InterfaceC648350Pbt interfaceC648350Pbt2 = (InterfaceC648350Pbt) ListProtector.get(c650620PfY.LIZIZ, iIntValue);
                if (interfaceC648350Pbt2 != null && interfaceC648350Pbt2.N1()) {
                    interfaceC648350Pbt2.setPlayMetrics(c664400Q4g);
                    this.LIZ.LJIIIZ(interfaceC648350Pbt2, "onPlayCompleted", null);
                    this.LIZ.LJIIJ("onPlayCompleted", interfaceC648350Pbt2);
                }
            }
        }

        public final void LJ(final String str, final InterfaceC648350Pbt interfaceC648350Pbt) {
            C650620PfY c650620PfY = this.LIZ;
            if (!c650620PfY.LJI) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ignore to prepare next, source:");
                sbLIZ.append(str);
                sbLIZ.append(", current playable doesn't has first frame.");
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            Set setKeySet = ((LinkedHashMap) c650620PfY.LIZ).keySet();
            C650620PfY c650620PfY2 = this.LIZ;
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                InterfaceC648350Pbt interfaceC648350Pbt2 = (InterfaceC648350Pbt) obj;
                if (!Intrinsics.LJFF(interfaceC648350Pbt2, c650620PfY2.LJFF) && !interfaceC648350Pbt2.LLLLIIIILLL()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                if (C650560PfS.LIZ) {
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", e3.e, e3.f, 0, null, AFwS241S0000000_10.get$arr$(552), 24);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ignore to prepare next, source:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", loading size:");
                    sbLIZ2.append(arrayList.size());
                    sbLIZ2.append(", detail:");
                    sbLIZ2.append(strLJJLIIIJ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return;
                }
                return;
            }
            final C650620PfY c650620PfY3 = this.LIZ;
            if (c650620PfY3.LJIIIIZZ) {
                return;
            }
            c650620PfY3.LJIIIIZZ = true;
            C786410Ut5.LJJZZIII(c650620PfY3.LJII, new Runnable() { // from class: X.0PfV
                public final void LIZ() {
                    C650620PfY c650620PfY4 = c650620PfY3;
                    String str2 = str;
                    InterfaceC648350Pbt interfaceC648350Pbt3 = interfaceC648350Pbt;
                    c650620PfY4.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    int iIndexOf = c650620PfY4.LIZIZ.indexOf(interfaceC648350Pbt3);
                    if (iIndexOf >= 0 && (!c650620PfY4.LIZIZ.isEmpty())) {
                        Object obj2 = ListProtector.get(c650620PfY4.LIZIZ, c650620PfY4.LJIIIIZZ(iIndexOf, c650620PfY4.LIZIZ.size(), c650620PfY4.LIZLLL).getFirst().intValue());
                        if (!Intrinsics.LJFF(obj2, interfaceC648350Pbt3)) {
                            arrayList2.add(obj2);
                        }
                    }
                    C650660Pfc c650660Pfc = (C650660Pfc) ((LinkedHashMap) c650620PfY4.LIZ).get(interfaceC648350Pbt3);
                    if (c650660Pfc != null) {
                        C587060N0u c587060N0u = c650620PfY4.LIZJ;
                        int i = (c587060N0u != null ? c587060N0u.LIZ : null) == EnumC587050N0t.SCROLL_TO_TOP ? c650660Pfc.LIZIZ - 1 : c650660Pfc.LIZIZ + 1;
                        for (Map.Entry entry : ((LinkedHashMap) c650620PfY4.LIZ).entrySet()) {
                            Object key = entry.getKey();
                            C650660Pfc c650660Pfc2 = (C650660Pfc) entry.getValue();
                            if (c650660Pfc2.LIZIZ == i && c650660Pfc2.LIZJ == 0) {
                                arrayList2.add(key);
                            }
                        }
                    }
                    if (C650560PfS.LIZ) {
                        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList2, ",", e3.e, e3.f, 0, null, AFwS241S0000000_10.get$arr$(555), 24);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("get next playables, source:");
                        sbLIZ3.append(str2);
                        sbLIZ3.append(", current:(r:");
                        sbLIZ3.append(c650660Pfc != null ? Integer.valueOf(c650660Pfc.LIZIZ) : null);
                        sbLIZ3.append(",c:");
                        sbLIZ3.append(c650660Pfc != null ? Integer.valueOf(c650660Pfc.LIZJ) : null);
                        sbLIZ3.append("), size:");
                        sbLIZ3.append(arrayList2.size());
                        sbLIZ3.append(", detail:");
                        sbLIZ3.append(strLJJLIIIJ2);
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        InterfaceC584630MwP preload = ((InterfaceC648350Pbt) it2.next()).getPreload();
                        if (preload != null) {
                            preload.LIZJ();
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PlayServiceV3@3d0f.playableLifecycleListener$1$checkNeedPrepareNextPlayables$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PlayServiceV3@3d0f.playableLifecycleListener$1$checkNeedPrepareNextPlayables$2");
                }
            });
        }
    };

    @Override // X.InterfaceC588610N6t
    public final void LIZJ(Set<InterfaceC648350Pbt> set) {
    }

    @Override // X.InterfaceC588610N6t
    public final void LJ() {
        this.LIZIZ.clear();
        this.LJ.clear();
        this.LJFF = null;
        this.LIZLLL = 1;
        this.LJI = false;
        this.LJIIIIZZ = false;
    }

    @Override // X.InterfaceC588610N6t
    public final void pause() {
        InterfaceC648350Pbt interfaceC648350Pbt = this.LJFF;
        if (interfaceC648350Pbt != null) {
            interfaceC648350Pbt.LJJJLIIL();
        }
    }

    @Override // X.InterfaceC588610N6t
    public final void resume() {
        InterfaceC648350Pbt interfaceC648350Pbt = this.LJFF;
        if (interfaceC648350Pbt != null) {
            if (C650560PfS.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resume current playable. current:");
                sbLIZ.append(interfaceC648350Pbt.getDebugId());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            interfaceC648350Pbt.W0(150L, null);
            return;
        }
        if (!this.LJ.isEmpty()) {
            ArrayList<InterfaceC648350Pbt> arrayList = new ArrayList<>(this.LJ);
            this.LIZIZ = arrayList;
            LJIIIZ((InterfaceC648350Pbt) ListProtector.get(arrayList, 0), "resume", null);
            this.LJ.clear();
            LJIIJ("resume", this.LJFF);
        }
    }

    @Override // X.InterfaceC588610N6t
    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releasePlayerResources, size: ");
        sbLIZ.append(this.LIZ.size());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC648350Pbt interfaceC648350Pbt = this.LJFF;
        if (interfaceC648350Pbt != null) {
            interfaceC648350Pbt.LJJLIIIJLLLLLLLZ();
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LIZ).entrySet()) {
            InterfaceC648350Pbt interfaceC648350Pbt2 = (InterfaceC648350Pbt) entry.getKey();
            entry.getValue();
            interfaceC648350Pbt2.LJJLIIIJLLLLLLLZ();
        }
    }

    @Override // X.InterfaceC588610N6t
    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release all Playable. all playables size: ");
        sbLIZ.append(this.LIZ.size());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC648350Pbt interfaceC648350Pbt = this.LJFF;
        if (interfaceC648350Pbt != null) {
            interfaceC648350Pbt.release();
        }
        this.LJFF = null;
        this.LJII.removeCallbacksAndMessages(null);
        for (Map.Entry entry : ((LinkedHashMap) this.LIZ).entrySet()) {
            InterfaceC648350Pbt interfaceC648350Pbt2 = (InterfaceC648350Pbt) entry.getKey();
            entry.getValue();
            interfaceC648350Pbt2.release();
        }
    }

    @Override // X.InterfaceC588610N6t
    public final InterfaceC648350Pbt LJFF() {
        return this.LJFF;
    }

    @Override // X.InterfaceC588610N6t
    public final void LIZ(List<? extends InterfaceC648350Pbt> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update pending playable list data, data size:");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJ = new ArrayList<>(list);
        this.LIZIZ.clear();
        this.LJFF = null;
        this.LIZLLL = 1;
        this.LJI = false;
        this.LJIIIIZZ = false;
    }

    @Override // X.InterfaceC588610N6t
    public final void LIZIZ(InterfaceC648310Pbp interfaceC648310Pbp) {
        this.LJFF = interfaceC648310Pbp;
    }

    @Override // X.InterfaceC588610N6t
    public final void LJI(Set<C650660Pfc> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C650660Pfc c650660Pfc : set) {
            InterfaceC648350Pbt interfaceC648350Pbt = c650660Pfc.LIZ;
            interfaceC648350Pbt.setPlayableLifecycleListener(this.LJIIIZ);
            linkedHashMap.put(interfaceC648350Pbt, c650660Pfc);
        }
        this.LIZ = linkedHashMap;
        if (C650560PfS.LIZ) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(set, ", ", e3.e, e3.f, 0, null, AFwS241S0000000_10.get$arr$(553), 24);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set full playable data, size:");
            sbLIZ.append(set.size());
            sbLIZ.append(", ");
            sbLIZ.append(strLJJLIIIJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC588610N6t
    public final void LJII(List<? extends InterfaceC648350Pbt> list, C587060N0u c587060N0u) {
        if (list.isEmpty()) {
            pause();
            return;
        }
        if (C650560PfS.LIZ) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(list, ", ", e3.e, e3.f, 0, null, AFwS241S0000000_10.get$arr$(554), 24);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update playable list data, size: ");
            sbLIZ.append(list.size());
            sbLIZ.append(", ");
            sbLIZ.append(strLJJLIIIJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LIZIZ = new ArrayList<>(list);
        this.LIZJ = c587060N0u;
        this.LIZLLL = 1;
        LJIIIZ((InterfaceC648350Pbt) ListProtector.get(list, 0), "updateData", c587060N0u);
        LJIIJ("updateData", this.LJFF);
    }

    public final void LJIIJ(final String str, final InterfaceC648350Pbt interfaceC648350Pbt) {
        if (interfaceC648350Pbt == null) {
            return;
        }
        this.LJII.removeCallbacksAndMessages(null);
        ConcurrentHashMap<String, Boolean> concurrentHashMap = C650700Pfg.LIZ;
        if (concurrentHashMap.size() >= 3) {
            C786410Ut5.LJJZZIII(this.LJII, new Runnable() { // from class: X.0PfW
                public final void LIZ() {
                    C650620PfY c650620PfY = this.LL;
                    String str2 = str;
                    InterfaceC648350Pbt interfaceC648350Pbt2 = interfaceC648350Pbt;
                    c650620PfY.getClass();
                    ArrayList arrayList = new ArrayList();
                    C650660Pfc c650660Pfc = (C650660Pfc) ((LinkedHashMap) c650620PfY.LIZ).get(interfaceC648350Pbt2);
                    if (c650660Pfc != null) {
                        C587060N0u c587060N0u = c650620PfY.LIZJ;
                        if ((c587060N0u != null ? c587060N0u.LIZ : null) == EnumC587050N0t.SCROLL_TO_TOP) {
                            for (Map.Entry entry : ((LinkedHashMap) c650620PfY.LIZ).entrySet()) {
                                Object key = entry.getKey();
                                if (((C650660Pfc) entry.getValue()).LIZIZ > c650660Pfc.LIZIZ) {
                                    arrayList.add(key);
                                }
                            }
                        } else {
                            for (Map.Entry entry2 : ((LinkedHashMap) c650620PfY.LIZ).entrySet()) {
                                Object key2 = entry2.getKey();
                                if (((C650660Pfc) entry2.getValue()).LIZIZ < c650660Pfc.LIZIZ) {
                                    arrayList.add(key2);
                                }
                            }
                        }
                    }
                    if (C650560PfS.LIZ) {
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", e3.e, e3.f, 0, null, AFwS241S0000000_10.get$arr$(556), 24);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("get prev playables, source:");
                        sbLIZ.append(str2);
                        sbLIZ.append(", size:");
                        sbLIZ.append(arrayList.size());
                        sbLIZ.append(", detail:");
                        sbLIZ.append(strLJJLIIIJ);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC648350Pbt) it2.next()).LJJLIIIJLLLLLLLZ();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PlayServiceV3@3d0f.releasePrevPlayablesIfNeed$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PlayServiceV3@3d0f.releasePrevPlayablesIfNeed$1");
                }
            });
            if (C650560PfS.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("after release prev playables, source:");
                sbLIZ.append(str);
                sbLIZ.append(", remain:");
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(concurrentHashMap.keySet());
                sbLIZ.append(arrayList.toString());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public final Pair<Integer, Integer> LJIIIIZZ(int i, int i2, int i3) {
        EnumC587040N0s enumC587040N0s;
        boolean z;
        C587060N0u c587060N0u = this.LIZJ;
        if (c587060N0u != null) {
            enumC587040N0s = c587060N0u.LIZIZ;
        } else {
            enumC587040N0s = null;
        }
        if (enumC587040N0s == EnumC587040N0s.REVERSE_LOOP) {
            z = true;
        } else {
            z = false;
        }
        if (i2 <= 1) {
            return new Pair<>(0, Integer.valueOf(i3));
        }
        if (!z) {
            return new Pair<>(Integer.valueOf((i + 1) % i2), Integer.valueOf(i3));
        }
        if (i2 == 2) {
            return new Pair<>(Integer.valueOf(1 - i), Integer.valueOf(i3));
        }
        if (i3 >= 0) {
            if (i >= i2 - 1) {
                return new Pair<>(Integer.valueOf(i2 - 2), -1);
            }
            return new Pair<>(Integer.valueOf(i + 1), 1);
        }
        if (i <= 0) {
            return new Pair<>(1, 1);
        }
        return new Pair<>(Integer.valueOf(i - 1), -1);
    }

    public final void LJIIIZ(InterfaceC648350Pbt interfaceC648350Pbt, String str, C587060N0u c587060N0u) {
        String debugId;
        InterfaceC648350Pbt interfaceC648350Pbt2 = this.LJFF;
        if (interfaceC648350Pbt2 != null && !Intrinsics.LJFF(interfaceC648350Pbt2, interfaceC648350Pbt)) {
            interfaceC648350Pbt2.LJJJLIIL();
        }
        interfaceC648350Pbt.setPlayableLifecycleListener(this.LJIIIZ);
        interfaceC648350Pbt.W0(150L, c587060N0u);
        this.LJFF = interfaceC648350Pbt;
        this.LJI = false;
        this.LJIIIIZZ = false;
        if (C650560PfS.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("play playable, source:");
            sbLIZ.append(str);
            sbLIZ.append(", current:");
            InterfaceC648350Pbt interfaceC648350Pbt3 = this.LJFF;
            if (interfaceC648350Pbt3 != null) {
                debugId = interfaceC648350Pbt3.getDebugId();
            } else {
                debugId = null;
            }
            sbLIZ.append(debugId);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
