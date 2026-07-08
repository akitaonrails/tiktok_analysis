package X;

import android.util.Pair;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.OverScroller;
import j27.s;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0kEL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311390kEL {
    public final OverScroller LIZ;
    public s LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public VelocityTracker LJFF;
    public HashSet<InterfaceC1311590kEf> LJI;
    public HashSet<Integer> LJII;
    public InterfaceC1311590kEf LJIIIIZZ;
    public InterfaceC1311590kEf LJIIIZ;
    public InterfaceC1311590kEf LJIIJ;
    public InterfaceC1311590kEf LJIIJJI;
    public final C1310330kCd LJIIL;
    public C1311460kES LJIILIIL;

    public static void LJFF(InterfaceC1311590kEf interfaceC1311590kEf) {
        Map<Integer, AbstractC1311530kEZ> gestureHandlers;
        if (interfaceC1311590kEf == null || (gestureHandlers = interfaceC1311590kEf.getGestureHandlers()) == null) {
            return;
        }
        Iterator<AbstractC1311530kEZ> it2 = gestureHandlers.values().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIL();
        }
    }

    public final int LIZLLL(InterfaceC1311590kEf interfaceC1311590kEf) {
        Map<Integer, AbstractC1311530kEZ> gestureHandlers;
        if (interfaceC1311590kEf == null || (gestureHandlers = interfaceC1311590kEf.getGestureHandlers()) == null) {
            return 3;
        }
        int i = -1;
        for (AbstractC1311530kEZ abstractC1311530kEZ : gestureHandlers.values()) {
            int i2 = abstractC1311530kEZ.LIZIZ;
            if (i2 == 5) {
                LJI(interfaceC1311590kEf);
                this.LJIIJ = null;
                return 5;
            }
            if (i2 == 2) {
                int i3 = abstractC1311530kEZ.LJ.LIZ;
                HashSet<Integer> hashSet = this.LJII;
                Map<Integer, AbstractC1311530kEZ> gestureHandlers2 = interfaceC1311590kEf.getGestureHandlers();
                if (gestureHandlers2 != null) {
                    for (AbstractC1311530kEZ abstractC1311530kEZ2 : gestureHandlers2.values()) {
                        int i4 = abstractC1311530kEZ2.LJ.LIZ;
                        if (i4 != i3 && !hashSet.contains(Integer.valueOf(i4))) {
                            abstractC1311530kEZ2.LJ();
                        }
                    }
                }
                return 2;
            }
            if (i < 0 || i > i2) {
                i = i2;
            }
        }
        return i;
    }

    public final void LJI(InterfaceC1311590kEf interfaceC1311590kEf) {
        LJFF(interfaceC1311590kEf);
        HashSet<InterfaceC1311590kEf> hashSet = this.LJI;
        if (hashSet != null) {
            Iterator<InterfaceC1311590kEf> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                LJFF(it2.next());
            }
        }
    }

    public final void LJII(InterfaceC1311590kEf interfaceC1311590kEf) {
        Map<Integer, C1311420kEO> gestureDetectorMap;
        List list;
        InterfaceC1311590kEf interfaceC1311590kEf2;
        C1310330kCd c1310330kCd = this.LJIIL;
        if (interfaceC1311590kEf != null) {
            if (c1310330kCd.LIZIZ != null && (gestureDetectorMap = interfaceC1311590kEf.getGestureDetectorMap()) != null) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                Iterator<Map.Entry<Integer, C1311420kEO>> it2 = gestureDetectorMap.entrySet().iterator();
                while (it2.hasNext()) {
                    hashSet2.add(Integer.valueOf(it2.next().getValue().LIZ));
                }
                for (Map.Entry<Integer, C1311420kEO> entry : gestureDetectorMap.entrySet()) {
                    if (entry.getValue() != null && (list = (List) ((HashMap) entry.getValue().LIZLLL).get("simultaneous")) != null && !list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            int iIntValue = ((Integer) it3.next()).intValue();
                            if (hashSet2.contains(Integer.valueOf(iIntValue))) {
                                hashSet3.add(Integer.valueOf(iIntValue));
                            } else {
                                Set set = (Set) ((HashMap) c1310330kCd.LIZ).get(Integer.valueOf(iIntValue));
                                if (set != null) {
                                    Iterator it4 = set.iterator();
                                    while (it4.hasNext()) {
                                        Reference reference = (Reference) ((HashMap) c1310330kCd.LIZIZ.LIZ).get(Integer.valueOf(((Integer) it4.next()).intValue()));
                                        if (reference != null && (interfaceC1311590kEf2 = (InterfaceC1311590kEf) reference.get()) != null && interfaceC1311590kEf2.getGestureArenaMemberId() != interfaceC1311590kEf.getGestureArenaMemberId()) {
                                            hashSet.add(interfaceC1311590kEf2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Pair pair = new Pair(hashSet, hashSet3);
                this.LJI = (HashSet) pair.first;
                this.LJII = (HashSet) pair.second;
                return;
            }
            return;
        }
        c1310330kCd.getClass();
    }

    public C1311390kEL(s sVar, C1310330kCd c1310330kCd) {
        this.LIZ = new OverScroller(sVar);
        this.LIZIZ = sVar;
        this.LJIIL = c1310330kCd;
    }

    public final InterfaceC1311590kEf LJ(LinkedList<InterfaceC1311590kEf> linkedList, InterfaceC1311590kEf interfaceC1311590kEf) {
        boolean z;
        InterfaceC1311590kEf interfaceC1311590kEf2;
        if ((interfaceC1311590kEf == null && this.LJIIJ == null) || linkedList == null) {
            return null;
        }
        if (interfaceC1311590kEf == null && (interfaceC1311590kEf2 = this.LJIIJ) != null) {
            LJI(interfaceC1311590kEf2);
            z = true;
            interfaceC1311590kEf = interfaceC1311590kEf2;
        } else {
            z = false;
        }
        int iLIZLLL = LIZLLL(interfaceC1311590kEf);
        if (iLIZLLL <= 2) {
            return interfaceC1311590kEf;
        }
        if (iLIZLLL == 5 || z) {
            return null;
        }
        int iIndexOf = linkedList.indexOf(interfaceC1311590kEf);
        int iLastIndexOf = linkedList.lastIndexOf(interfaceC1311590kEf);
        if (iIndexOf != iLastIndexOf) {
            InterfaceC1311590kEf interfaceC1311590kEf3 = this.LJIIIIZZ;
            if (interfaceC1311590kEf3 != null) {
                LJI(interfaceC1311590kEf3);
                iIndexOf = iLastIndexOf;
            } else {
                this.LJIIIIZZ = linkedList.get(iIndexOf);
            }
        }
        if (iIndexOf >= 0 && iIndexOf < linkedList.size()) {
            int gestureArenaMemberId = linkedList.get(iIndexOf).getGestureArenaMemberId();
            for (int i = iIndexOf + 1; i < linkedList.size(); i++) {
                InterfaceC1311590kEf interfaceC1311590kEf4 = linkedList.get(i);
                if (interfaceC1311590kEf4.getGestureArenaMemberId() != gestureArenaMemberId) {
                    if (this.LJIIIIZZ == interfaceC1311590kEf4) {
                        this.LJIIIIZZ = null;
                    } else if (LIZLLL(interfaceC1311590kEf4) != 5) {
                        LJI(interfaceC1311590kEf4);
                    }
                    int iLIZLLL2 = LIZLLL(interfaceC1311590kEf4);
                    if (iLIZLLL2 <= 2) {
                        return interfaceC1311590kEf4;
                    }
                    if (iLIZLLL2 == 5) {
                        return null;
                    }
                }
            }
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                InterfaceC1311590kEf interfaceC1311590kEf5 = linkedList.get(i2);
                if (interfaceC1311590kEf5.getGestureArenaMemberId() != gestureArenaMemberId) {
                    if (this.LJIIIIZZ == interfaceC1311590kEf5) {
                        this.LJIIIIZZ = null;
                    } else if (LIZLLL(interfaceC1311590kEf5) != 5) {
                        LJI(interfaceC1311590kEf5);
                    }
                    int iLIZLLL3 = LIZLLL(interfaceC1311590kEf5);
                    if (iLIZLLL3 <= 2) {
                        return interfaceC1311590kEf5;
                    }
                    if (iLIZLLL3 == 5) {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final void LIZJ(C1298740jtw c1298740jtw, LinkedList<InterfaceC1311590kEf> linkedList, float f, float f2, MotionEvent motionEvent) {
        for (int i = 0; i < linkedList.size(); i++) {
            InterfaceC1311590kEf interfaceC1311590kEf = this.LJIIIZ;
            InterfaceC1311590kEf interfaceC1311590kEf2 = this.LJIIJ;
            if (interfaceC1311590kEf != interfaceC1311590kEf2 && interfaceC1311590kEf != null) {
                if (interfaceC1311590kEf2 != interfaceC1311590kEf) {
                    this.LJIIJ = interfaceC1311590kEf;
                }
                LJII(interfaceC1311590kEf);
                LIZIZ(this.LJIIIZ, f, f2, c1298740jtw, linkedList, motionEvent);
            } else {
                return;
            }
        }
        LIZIZ(this.LJIIJ, f, f2, c1298740jtw, linkedList, motionEvent);
    }

    public final void LIZIZ(InterfaceC1311590kEf interfaceC1311590kEf, float f, float f2, C1298740jtw c1298740jtw, LinkedList<InterfaceC1311590kEf> linkedList, MotionEvent motionEvent) {
        if (interfaceC1311590kEf == null) {
            return;
        }
        LIZ(motionEvent, interfaceC1311590kEf, c1298740jtw, f, f2, false, this.LJIILIIL);
        HashSet<InterfaceC1311590kEf> hashSet = this.LJI;
        if (hashSet != null) {
            Iterator<InterfaceC1311590kEf> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                LIZ(motionEvent, it2.next(), c1298740jtw, f, f2, true, this.LJIILIIL);
            }
            C1311460kES c1311460kES = this.LJIILIIL;
            c1311460kES.LIZIZ = 0.0f;
            c1311460kES.LIZJ = 0.0f;
            c1311460kES.LIZLLL = false;
        }
        if (linkedList != null) {
            this.LJIIIZ = LJ(linkedList, this.LJIIIZ);
        }
    }

    public static void LIZ(MotionEvent motionEvent, InterfaceC1311590kEf interfaceC1311590kEf, C1298740jtw c1298740jtw, float f, float f2, boolean z, C1311460kES c1311460kES) {
        Map<Integer, AbstractC1311530kEZ> gestureHandlers;
        if (interfaceC1311590kEf == null || (gestureHandlers = interfaceC1311590kEf.getGestureHandlers()) == null) {
            return;
        }
        Iterator<AbstractC1311530kEZ> it2 = gestureHandlers.values().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJ(motionEvent, c1298740jtw, f, f2, z, c1311460kES);
        }
    }
}
