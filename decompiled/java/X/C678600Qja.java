package X;

import Y.ARunnableS110S0100000_10;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678600Qja implements InterfaceC676520QgE {
    public C054G LIZIZ;
    public AnonymousClass0956 LIZLLL;
    public long LJIIIZ;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public Function0<Integer> LJIILL;
    public InterfaceC648270Pbl LJIILLIIL;
    public InterfaceC648270Pbl LJIIZILJ;
    public long LJIJ;
    public InterfaceC678640Qje LJIJI;
    public final CopyOnWriteArrayList<InterfaceC648270Pbl> LIZ = new CopyOnWriteArrayList<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(661));
    public final Map<String, Object> LJ = new LinkedHashMap();
    public final Set<Integer> LJFF = new LinkedHashSet();
    public final ConcurrentHashMap.KeySetView<String, Boolean> LJI = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap<String, Long> LJII = new ConcurrentHashMap<>();
    public long LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
    public long LJIIJ = 1000;
    public float LJIIJJI = 0.5f;

    @Override // X.InterfaceC676520QgE
    public final void LJIIIIZZ() {
        this.LJFF.add(0);
        reset();
    }

    @Override // X.InterfaceC676520QgE
    public final void LJIIIZ() {
        C054G c054g = this.LIZIZ;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        this.LIZIZ = null;
        LJIJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C678630Qjd> LJIIJ() {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C678600Qja.LJIIJ():java.util.List");
    }

    public final void LJIIL() {
        C678630Qjd next;
        Object next2;
        C678630Qjd next3;
        InterfaceC648270Pbl interfaceC648270Pbl;
        InterfaceC678640Qje interfaceC678640Qje;
        if (!this.LJFF.isEmpty()) {
            return;
        }
        if (!C07GF.LIZ() || (interfaceC678640Qje = this.LJIJI) == null || interfaceC678640Qje.LIZIZ() == 0) {
            List<C678630Qjd> listLJIIJ = LJIIJ();
            if (this.LJIIL) {
                for (C678630Qjd c678630Qjd : listLJIIJ) {
                    if (!c678630Qjd.LJ && c678630Qjd.LIZIZ.length() > 0) {
                        this.LJII.remove(c678630Qjd.LIZIZ);
                        this.LJI.remove(c678630Qjd.LIZIZ);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C678630Qjd c678630Qjd2 : listLJIIJ) {
                if (c678630Qjd2.LIZLLL) {
                    arrayList.add(c678630Qjd2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C678630Qjd) it2.next()).LIZ);
            }
            if (!(!arrayList2.isEmpty())) {
                Iterator<C678630Qjd> it3 = listLJIIJ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    C678630Qjd c678630Qjd3 = next;
                    if (c678630Qjd3.LJ && !this.LJI.contains(c678630Qjd3.LIZIZ)) {
                        break;
                    }
                }
                C678630Qjd c678630Qjd4 = next;
                if (c678630Qjd4 != null && c678630Qjd4.LIZ != null) {
                    LJIJJ(listLJIIJ);
                    return;
                } else {
                    if (this.LIZ.isEmpty()) {
                        C054G c054g = this.LIZIZ;
                        if (c054g != null) {
                            C2296808zG.LIZJ(c054g, null);
                        }
                        this.LIZIZ = null;
                        return;
                    }
                    return;
                }
            }
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (!((C678630Qjd) next2).LJ) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            C678630Qjd c678630Qjd5 = (C678630Qjd) next2;
            InterfaceC648270Pbl interfaceC648270Pbl2 = c678630Qjd5 != null ? c678630Qjd5.LIZ : null;
            Iterator<C678630Qjd> it5 = listLJIIJ.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
                C678630Qjd c678630Qjd6 = next3;
                if (c678630Qjd6.LJFF && c678630Qjd6.LJ && !c678630Qjd6.LIZLLL) {
                    break;
                }
            }
            C678630Qjd c678630Qjd7 = next3;
            InterfaceC648270Pbl interfaceC648270Pbl3 = c678630Qjd7 != null ? c678630Qjd7.LIZ : null;
            if (interfaceC648270Pbl2 == null) {
                if (interfaceC648270Pbl3 == null) {
                    if (this.LJIILIIL) {
                        Iterator<C678630Qjd> it6 = listLJIIJ.iterator();
                        int i = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i = -1;
                                break;
                            } else if (it6.next().LIZLLL) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (!(!listLJIIJ.isEmpty()) || i <= 0) {
                            return;
                        }
                        int size = listLJIIJ.size();
                        for (int i2 = 0; i2 < size && i2 < i; i2++) {
                            String str = ((C678630Qjd) ListProtector.get(listLJIIJ, i2)).LIZIZ;
                            if (((C678630Qjd) ListProtector.get(listLJIIJ, i2)).LJ && !this.LJI.contains(str)) {
                                LJIJI();
                                LJIJJ(listLJIIJ);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            } else if (this.LIZ.size() > 1 && arrayList2.size() > 1 && (interfaceC648270Pbl = this.LJIILLIIL) != null && !Intrinsics.LJFF(interfaceC648270Pbl2, interfaceC648270Pbl)) {
                return;
            }
            LJIJI();
            LJIJJ(listLJIIJ);
        }
    }

    public final boolean LJIIZILJ() {
        C678500QjQ c678500QjQLIZ;
        InterfaceC678640Qje interfaceC678640Qje;
        C678500QjQ c678500QjQLIZ2;
        InterfaceC678640Qje interfaceC678640Qje2 = this.LJIJI;
        return (interfaceC678640Qje2 == null || (c678500QjQLIZ = interfaceC678640Qje2.LIZ()) == null || c678500QjQLIZ.LIZ <= 0 || (interfaceC678640Qje = this.LJIJI) == null || (c678500QjQLIZ2 = interfaceC678640Qje.LIZ()) == null || c678500QjQLIZ2.LIZIZ <= 0) ? false : true;
    }

    public final void LJIJI() {
        Iterator<InterfaceC648270Pbl> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            LJJI(it2.next());
        }
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZLLL = null;
    }

    public final void LJJ() {
        InterfaceC678640Qje interfaceC678640Qje;
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
            this.LIZLLL = null;
        }
        if (!C07GF.LIZ() || (interfaceC678640Qje = this.LJIJI) == null || interfaceC678640Qje.LIZIZ() == 0) {
            this.LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) this.LIZJ.getValue(), null, null, new C678610Qjb(this, null), 3);
            return;
        }
        CopyOnWriteArrayList<InterfaceC648270Pbl> copyOnWriteArrayList = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC648270Pbl interfaceC648270Pbl : copyOnWriteArrayList) {
            InterfaceC648270Pbl interfaceC648270Pbl2 = interfaceC648270Pbl;
            Boolean boolZ3 = interfaceC648270Pbl2.z3();
            if (boolZ3 != null ? boolZ3.booleanValue() : interfaceC648270Pbl2.isPlaying()) {
                arrayList.add(interfaceC648270Pbl);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LJJI((InterfaceC648270Pbl) it2.next());
        }
    }

    @Override // X.InterfaceC676520QgE
    public final void reset() {
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZLLL = null;
        C054G c054g = this.LIZIZ;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        this.LIZIZ = null;
        this.LJII.clear();
        this.LIZ.clear();
        this.LJI.clear();
        LJIIJJI(null);
    }

    @Override // X.InterfaceC676520QgE
    public final void LJ() {
        LJIIL();
        if (!this.LIZ.isEmpty()) {
            C054G c054g = this.LIZIZ;
            if (c054g == null || !C2296808zG.LJI(c054g)) {
                C1DFH c1dfh = C0PEM.LIZ;
                C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
                this.LIZIZ = c054gLIZ;
                C23250099c.LIZLLL(c054gLIZ, null, null, new C05IG(this, null), 3);
            }
        }
    }

    @Override // X.InterfaceC676520QgE
    public final void LJI() {
        List listLJIILL = LJIILL(LJIIJ());
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJIILL).iterator();
        while (it2.hasNext()) {
            String strLIZ = C161300jb.LIZ((C661440Px0) it2.next());
            if (strLIZ.length() > 0) {
                arrayList.add(strLIZ);
            }
        }
        if (arrayList.size() <= 1) {
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (!this.LJI.contains(it3.next())) {
                    return;
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            this.LJI.remove(it4.next());
        }
        LJ();
    }

    public static List LJIILL(List list) {
        List listLJIILLIIL = LJIILLIIL(list);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJIILLIIL).iterator();
        while (it2.hasNext()) {
            InterfaceC648270Pbl interfaceC648270Pbl = ((C678630Qjd) it2.next()).LIZ;
            if ((interfaceC648270Pbl instanceof C661440Px0) && interfaceC648270Pbl != null) {
                arrayList.add(interfaceC648270Pbl);
            }
        }
        return arrayList;
    }

    public static List LJIILLIIL(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C678630Qjd) obj).LJ) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC676520QgE
    public final void LIZIZ(View view) {
        if (!(!this.LJFF.isEmpty()) && (view instanceof InterfaceC648270Pbl) && (view instanceof InterfaceC211600ri)) {
            C161300jb.LIZ((InterfaceC211600ri) view);
            this.LIZ.addIfAbsent(view);
            C054G c054g = this.LIZIZ;
            if (c054g == null || !C2296808zG.LJI(c054g)) {
                C1DFH c1dfh = C0PEM.LIZ;
                C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
                this.LIZIZ = c054gLIZ;
                C23250099c.LIZLLL(c054gLIZ, null, null, new C05IG(this, null), 3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC676520QgE
    public final void LIZJ(View view) {
        if (view instanceof InterfaceC648270Pbl) {
            this.LIZ.remove(view);
            LJIIJJI((InterfaceC648270Pbl) view);
            if (view instanceof InterfaceC211600ri) {
                String strLIZ = C161300jb.LIZ((InterfaceC211600ri) view);
                if (strLIZ.length() > 0) {
                    this.LJII.remove(strLIZ);
                    this.LJI.remove(strLIZ);
                }
            }
        }
    }

    @Override // X.InterfaceC676520QgE
    public final void LIZLLL(Map<String, Object> map) {
        this.LJ.putAll(map);
    }

    @Override // X.InterfaceC676520QgE
    public final void LJII(View view) {
        LIZIZ(view);
        LJ();
    }

    public final void LJIIJJI(InterfaceC648270Pbl interfaceC648270Pbl) {
        if (interfaceC648270Pbl == null || Intrinsics.LJFF(interfaceC648270Pbl, this.LJIIZILJ)) {
            this.LJIIZILJ = null;
            this.LJIJ = 0L;
        }
    }

    public final InterfaceC648270Pbl LJIILIIL(List<C678630Qjd> list) {
        C678630Qjd next;
        C678630Qjd c678630Qjd;
        InterfaceC648270Pbl interfaceC648270Pbl;
        Iterator<C678630Qjd> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C678630Qjd c678630Qjd2 = next;
                if (c678630Qjd2.LJFF && c678630Qjd2.LJ && !c678630Qjd2.LIZLLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C678630Qjd c678630Qjd3 = next;
        if (c678630Qjd3 != null && (interfaceC648270Pbl = c678630Qjd3.LIZ) != null) {
            return interfaceC648270Pbl;
        }
        List listLJIILLIIL = LJIILLIIL(list);
        ArrayList arrayList = (ArrayList) listLJIILLIIL;
        Iterator it3 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (it3.hasNext()) {
                if (((C678630Qjd) it3.next()).LIZLLL) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        int size = arrayList.size();
        if (size <= 0) {
            return null;
        }
        int i2 = 1;
        while (true) {
            c678630Qjd = (C678630Qjd) ListProtector.get(listLJIILLIIL, (i + i2) % size);
            if (!c678630Qjd.LIZLLL && (c678630Qjd.LIZIZ.length() == 0 || !this.LJI.contains(c678630Qjd.LIZIZ))) {
                break;
            }
            if (i2 == size) {
                return null;
            }
            i2++;
        }
        return c678630Qjd.LIZ;
    }

    public final void LJIJJ(List<C678630Qjd> list) {
        boolean zLIZJ;
        InterfaceC648270Pbl interfaceC648270PblLJIILIIL = LJIILIIL(list);
        if (interfaceC648270PblLJIILIIL != null) {
            if (interfaceC648270PblLJIILIIL instanceof InterfaceC211600ri) {
                zLIZJ = C161300jb.LIZJ((InterfaceC211600ri) interfaceC648270PblLJIILIIL);
            } else {
                zLIZJ = false;
            }
            LJJIFFI(interfaceC648270PblLJIILIIL);
            AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LIZLLL = null;
            if (!zLIZJ && !C140400gE.LIZ()) {
                this.LJIILLIIL = interfaceC648270PblLJIILIIL;
                LJJ();
            }
        }
    }

    public final void LJIJJLI(InterfaceC648270Pbl interfaceC648270Pbl) {
        if (interfaceC648270Pbl instanceof InterfaceC211600ri) {
            String strLIZ = C161300jb.LIZ((InterfaceC211600ri) interfaceC648270Pbl);
            if (strLIZ.length() > 0) {
                this.LJII.put(strLIZ, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public final void LJIL(List<C678630Qjd> list) {
        if (!this.LJIILJJIL) {
            return;
        }
        List listLJIILL = LJIILL(list);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJIILL).iterator();
        while (it2.hasNext()) {
            String strLIZ = C161300jb.LIZ((C661440Px0) it2.next());
            if (strLIZ.length() > 0) {
                arrayList.add(strLIZ);
            }
        }
        if (arrayList.size() <= 1) {
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (!this.LJI.contains(it3.next())) {
                    return;
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            this.LJI.remove(it4.next());
        }
        LJ();
    }

    public final void LJJI(InterfaceC648270Pbl interfaceC648270Pbl) {
        Long l;
        if (interfaceC648270Pbl == null) {
            return;
        }
        LJIIJJI(interfaceC648270Pbl);
        boolean z = interfaceC648270Pbl instanceof InterfaceC211600ri;
        if (z) {
            InterfaceC211600ri interfaceC211600ri = (InterfaceC211600ri) interfaceC648270Pbl;
            boolean zLIZJ = C161300jb.LIZJ(interfaceC211600ri);
            String strLIZ = C161300jb.LIZ(interfaceC211600ri);
            if (!zLIZJ && strLIZ.length() > 0 && (l = this.LJII.get(strLIZ)) != null) {
                long jLongValue = l.longValue();
                long jLJIILJJIL = LJIILJJIL(Collections.singletonList(interfaceC648270Pbl), null);
                if (jLongValue > 0 && System.currentTimeMillis() - jLongValue >= jLJIILJJIL) {
                    this.LJI.add(strLIZ);
                }
            }
        }
        if (interfaceC648270Pbl instanceof C661440Px0) {
            ((C661440Px0) interfaceC648270Pbl).LJJIII();
            LJIJ("video_play", (InterfaceC211600ri) interfaceC648270Pbl);
        } else {
            interfaceC648270Pbl.LLJJJ();
            if (!z) {
                return;
            }
            LJIJ("live_play", (InterfaceC211600ri) interfaceC648270Pbl);
        }
    }

    public final void LJJIFFI(InterfaceC648270Pbl interfaceC648270Pbl) {
        if (!C140400gE.LIZ()) {
            LJIJJLI(interfaceC648270Pbl);
        }
        this.LJIIZILJ = interfaceC648270Pbl;
        this.LJIJ = System.currentTimeMillis();
        if (interfaceC648270Pbl instanceof C661440Px0) {
            ((C661440Px0) interfaceC648270Pbl).LJIJI();
        } else {
            if (!(interfaceC648270Pbl instanceof C658550PsL)) {
                return;
            }
            ((C658550PsL) interfaceC648270Pbl).LLLLLIL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC676520QgE
    public final void LJFF(View view, String str) {
        if ((!(view instanceof InterfaceC211600ri) || !C161300jb.LIZJ((InterfaceC211600ri) view)) && C140400gE.LIZ()) {
            if (view instanceof C661440Px0) {
                int iHashCode = str.hashCode();
                if (iHashCode != 3443508) {
                    if (iHashCode != 96651962) {
                        if (iHashCode != 96784904 || !str.equals("error")) {
                            return;
                        }
                    } else if (!str.equals("ended")) {
                        return;
                    }
                    if (Intrinsics.LJFF(str, "ended")) {
                        HandlerHook.viewPost(view, new ARunnableS110S0100000_10(view, 179));
                    }
                    String strLIZ = C161300jb.LIZ((InterfaceC211600ri) view);
                    if (strLIZ.length() > 0) {
                        this.LJI.add(strLIZ);
                    }
                    LJIIL();
                    LJIL(LJIIJ());
                    return;
                }
                if (!str.equals("play")) {
                    return;
                }
                InterfaceC648270Pbl interfaceC648270Pbl = (InterfaceC648270Pbl) view;
                LJIIJJI(interfaceC648270Pbl);
                this.LJIILLIIL = interfaceC648270Pbl;
                LJIJJLI(interfaceC648270Pbl);
                LJJ();
                return;
            }
            if (!(view instanceof C658550PsL)) {
                return;
            }
            int iHashCode2 = str.hashCode();
            if (iHashCode2 != 3443508) {
                if (iHashCode2 != 96651962) {
                    if (iHashCode2 != 96784904 || !str.equals("error")) {
                        return;
                    }
                } else if (!str.equals("ended")) {
                    return;
                }
                String strLIZ2 = C161300jb.LIZ((InterfaceC211600ri) view);
                if (strLIZ2.length() > 0) {
                    this.LJI.add(strLIZ2);
                }
                LJIIL();
                LJIL(LJIIJ());
                return;
            }
            if (!str.equals("play")) {
                return;
            }
            InterfaceC648270Pbl interfaceC648270Pbl2 = (InterfaceC648270Pbl) view;
            LJIIJJI(interfaceC648270Pbl2);
            this.LJIILLIIL = interfaceC648270Pbl2;
            LJIJJLI(interfaceC648270Pbl2);
            LJJ();
        }
    }

    public final long LJIILJJIL(List<? extends InterfaceC648270Pbl> list, List<C678630Qjd> list2) {
        int size;
        boolean z = false;
        if ((list instanceof Collection) && list.isEmpty()) {
            if (list.isEmpty()) {
                z = true;
            }
        } else {
            Iterator<? extends InterfaceC648270Pbl> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof C661440Px0) {
                    break;
                }
            }
            if (list.isEmpty() && (this.LJIILLIIL instanceof C661440Px0)) {
                z = true;
            }
        }
        if (list2 != null) {
            size = ((ArrayList) LJIILL(list2)).size();
        } else {
            size = ((ArrayList) LJIILL(LJIIJ())).size();
        }
        long j = this.LJIIIZ;
        if (j > 0 && z && size == 1) {
            return j;
        }
        return this.LJIIIIZZ;
    }

    public final void LJIJ(String str, InterfaceC211600ri interfaceC211600ri) {
        Aweme awemeStruct;
        Video video;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LJ);
        Map<String, Object> originLogExtra = interfaceC211600ri.getOriginLogExtra();
        int i = 0;
        if (originLogExtra != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : originLogExtra.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
            Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(linkedHashMap3);
            if (mapLJIIZILJ != null) {
                linkedHashMap.putAll(mapLJIIZILJ);
            }
        }
        linkedHashMap.put("group_id", interfaceC211600ri.getGroupId());
        linkedHashMap.put("author_id", interfaceC211600ri.getAuthorId());
        String strLIZ = C161300jb.LIZ(interfaceC211600ri);
        Long l = this.LJII.get(strLIZ);
        long j = 0;
        if (l != null) {
            long jLongValue = l.longValue();
            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            if (jLongValue > 0) {
                this.LJII.remove(strLIZ);
                j = jCurrentTimeMillis;
            }
        }
        if ((interfaceC211600ri instanceof C661440Px0) && (awemeStruct = ((C661440Px0) interfaceC211600ri).getAwemeStruct()) != null && (video = awemeStruct.getVideo()) != null) {
            linkedHashMap.put("video_duration", Integer.valueOf(video.getDuration()));
            if (j >= video.getDuration()) {
                i = 1;
            }
            linkedHashMap.put("is_play_completed", Integer.valueOf(i));
        }
        linkedHashMap.put("duration", String.valueOf(j));
        JSONObject jSONObject = new JSONObject();
        Object key = "";
        try {
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                key = entry3.getKey();
                jSONObject.put((String) entry3.getKey(), entry3.getValue());
            }
            jSONObject.put("rd_mixed_page", 1);
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECLoggerUtils, sendLog2: fail send event ");
            sbLIZ.append(str);
            sbLIZ.append(", key = ");
            sbLIZ.append((String) key);
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC676520QgE
    public final void LIZ(long j, float f, long j2, boolean z, boolean z2, C678400QjG c678400QjG, long j3, boolean z3, AwS554S0100000_10 awS554S0100000_10) {
        ((LinkedHashMap) this.LJ).clear();
        this.LJII.clear();
        if (j > 0) {
            this.LJIIIIZZ = j;
        }
        if (j3 <= 0) {
            j3 = 0;
        }
        this.LJIIIZ = j3;
        if (j2 > 0) {
            this.LJIIJ = j2;
        }
        if (f > 0.0f && f <= 1.0f) {
            this.LJIIJJI = f;
        }
        this.LJIJI = c678400QjG;
        this.LJIIL = z;
        this.LJIILIIL = z2;
        this.LJIILJJIL = z3;
        this.LJIILL = awS554S0100000_10;
    }
}
