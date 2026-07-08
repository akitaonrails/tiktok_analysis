package X;

import Y.AComparatorS29S0000000_10;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
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

/* JADX INFO: renamed from: X.0QjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678590QjZ implements InterfaceC676520QgE {
    public C054G LIZIZ;
    public AnonymousClass0956 LIZLLL;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public Function0<Integer> LJIILIIL;
    public InterfaceC648270Pbl LJIILJJIL;
    public InterfaceC678640Qje LJIILL;
    public final CopyOnWriteArrayList<InterfaceC648270Pbl> LIZ = new CopyOnWriteArrayList<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(660));
    public final Map<String, Object> LJ = new LinkedHashMap();
    public final Set<Integer> LJFF = new LinkedHashSet();
    public final CopyOnWriteArrayList<String> LJI = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<String, Long> LJII = new ConcurrentHashMap<>();
    public long LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
    public long LJIIIZ = 1000;
    public float LJIIJ = 0.5f;

    @Override // X.InterfaceC676520QgE
    public final void LJI() {
        String strLIZ;
        InterfaceC211600ri interfaceC211600ri;
        if (this.LIZ.size() > 0) {
            int size = this.LIZ.size();
            for (int i = 0; i < size; i++) {
                InterfaceC648270Pbl interfaceC648270Pbl = this.LIZ.get(i);
                if (!(interfaceC648270Pbl instanceof InterfaceC211600ri) || (interfaceC211600ri = (InterfaceC211600ri) interfaceC648270Pbl) == null || (strLIZ = C161300jb.LIZ(interfaceC211600ri)) == null) {
                    strLIZ = "";
                }
                if (strLIZ.length() > 0 && !this.LJI.contains(strLIZ)) {
                    return;
                }
            }
            this.LJI.clear();
            LJ();
        }
    }

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
        LJIILL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJ() {
        InterfaceC211600ri interfaceC211600ri;
        InterfaceC648270Pbl next;
        InterfaceC648270Pbl next2;
        InterfaceC648270Pbl interfaceC648270Pbl;
        InterfaceC211600ri interfaceC211600ri2;
        InterfaceC211600ri interfaceC211600ri3;
        InterfaceC678640Qje interfaceC678640Qje;
        if (!this.LJFF.isEmpty()) {
            return;
        }
        if (!C07GF.LIZ() || (interfaceC678640Qje = this.LJIILL) == null || interfaceC678640Qje.LIZIZ() == 0) {
            if (this.LJIIJJI) {
                for (Object obj : this.LIZ) {
                    if (LJIILIIL((View) obj) && (obj instanceof InterfaceC211600ri)) {
                        String strLIZ = C161300jb.LIZ((InterfaceC211600ri) obj);
                        if (strLIZ.length() > 0) {
                            this.LJII.remove(strLIZ);
                            this.LJI.remove(strLIZ);
                        }
                    }
                }
            }
            Iterator<InterfaceC648270Pbl> it2 = this.LIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC648270Pbl next3 = it2.next();
                InterfaceC648270Pbl interfaceC648270Pbl2 = next3;
                Boolean boolZ3 = interfaceC648270Pbl2.z3();
                if (boolZ3 != null ? boolZ3.booleanValue() : interfaceC648270Pbl2.isPlaying()) {
                    if (next3 != null) {
                        Iterator<InterfaceC648270Pbl> it3 = this.LIZ.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            InterfaceC648270Pbl interfaceC648270Pbl3 = next;
                            Boolean boolZ32 = interfaceC648270Pbl3.z3();
                            if ((boolZ32 != null ? boolZ32.booleanValue() : interfaceC648270Pbl3.isPlaying()) && LJIILIIL((View) interfaceC648270Pbl3)) {
                                break;
                            }
                        }
                        Iterator<InterfaceC648270Pbl> it4 = this.LIZ.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it4.next();
                            InterfaceC648270Pbl interfaceC648270Pbl4 = next2;
                            Boolean boolZ33 = interfaceC648270Pbl4.z3();
                            boolean zBooleanValue = boolZ33 != null ? boolZ33.booleanValue() : interfaceC648270Pbl4.isPlaying();
                            if ((interfaceC648270Pbl4 instanceof InterfaceC211600ri) && (interfaceC211600ri3 = (InterfaceC211600ri) interfaceC648270Pbl4) != null && C161300jb.LIZJ(interfaceC211600ri3) && !LJIILIIL((View) interfaceC648270Pbl4) && !zBooleanValue) {
                                break;
                            }
                        }
                        if (next == null) {
                            if (next2 == null) {
                                if (this.LJIIL) {
                                    List listLJLLLL = C13LP.LJLLLL(new AComparatorS29S0000000_10(5), new ArrayList(this.LIZ));
                                    Iterator it5 = listLJLLLL.iterator();
                                    int i = 0;
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            i = -1;
                                            break;
                                        }
                                        InterfaceC648350Pbt interfaceC648350Pbt = (InterfaceC648350Pbt) it5.next();
                                        Boolean boolZ34 = interfaceC648350Pbt.z3();
                                        if (boolZ34 != null ? boolZ34.booleanValue() : interfaceC648350Pbt.isPlaying()) {
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                    if (!(!listLJLLLL.isEmpty()) || i <= 0) {
                                        return;
                                    }
                                    int size = listLJLLLL.size();
                                    for (int i2 = 0; i2 < size && i2 < i; i2++) {
                                        Object obj2 = ListProtector.get(listLJLLLL, i2);
                                        String strLIZ2 = (!(obj2 instanceof InterfaceC211600ri) || (interfaceC211600ri2 = (InterfaceC211600ri) obj2) == null) ? null : C161300jb.LIZ(interfaceC211600ri2);
                                        if (!LJIILIIL((View) ListProtector.get(listLJLLLL, i2)) && !this.LJI.contains(strLIZ2)) {
                                            LJIILL();
                                            LJIILLIIL();
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                        } else if (this.LIZ.size() > 1) {
                            CopyOnWriteArrayList<InterfaceC648270Pbl> copyOnWriteArrayList = this.LIZ;
                            ArrayList arrayList = new ArrayList();
                            for (InterfaceC648270Pbl interfaceC648270Pbl5 : copyOnWriteArrayList) {
                                InterfaceC648270Pbl interfaceC648270Pbl6 = interfaceC648270Pbl5;
                                Boolean boolZ35 = interfaceC648270Pbl6.z3();
                                if (boolZ35 != null ? boolZ35.booleanValue() : interfaceC648270Pbl6.isPlaying()) {
                                    arrayList.add(interfaceC648270Pbl5);
                                }
                            }
                            if (arrayList.size() > 1 && (interfaceC648270Pbl = this.LJIILJJIL) != null && !Intrinsics.LJFF(next, interfaceC648270Pbl)) {
                                return;
                            }
                        }
                        LJIILL();
                        LJIILLIIL();
                        return;
                    }
                }
            }
            Iterator<InterfaceC648270Pbl> it6 = this.LIZ.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next4 = it6.next();
                Object obj3 = (InterfaceC648270Pbl) next4;
                String strLIZ3 = (!(obj3 instanceof InterfaceC211600ri) || (interfaceC211600ri = (InterfaceC211600ri) obj3) == null) ? null : C161300jb.LIZ(interfaceC211600ri);
                if (!LJIILIIL((View) obj3) && strLIZ3 != null && !this.LJI.contains(strLIZ3)) {
                    if (next4 != null) {
                        LJIILLIIL();
                        return;
                    }
                }
            }
            if (this.LIZ.isEmpty()) {
                C054G c054g = this.LIZIZ;
                if (c054g != null) {
                    C2296808zG.LIZJ(c054g, null);
                }
                this.LIZIZ = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        if ((r2 instanceof X.InterfaceC648270Pbl) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
    
        return (X.InterfaceC648270Pbl) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9 A[LOOP:2: B:36:0x0083->B:62:0x00d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC648270Pbl LJIIJJI() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C678590QjZ.LJIIJJI():X.0Pbl");
    }

    public final boolean LJIIL() {
        C678500QjQ c678500QjQLIZ;
        InterfaceC678640Qje interfaceC678640Qje;
        C678500QjQ c678500QjQLIZ2;
        InterfaceC678640Qje interfaceC678640Qje2 = this.LJIILL;
        return (interfaceC678640Qje2 == null || (c678500QjQLIZ = interfaceC678640Qje2.LIZ()) == null || c678500QjQLIZ.LIZ <= 0 || (interfaceC678640Qje = this.LJIILL) == null || (c678500QjQLIZ2 = interfaceC678640Qje.LIZ()) == null || c678500QjQLIZ2.LIZIZ <= 0) ? false : true;
    }

    public final void LJIILL() {
        Iterator<InterfaceC648270Pbl> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            LJIJI(it2.next());
        }
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZLLL = null;
    }

    public final void LJIJ() {
        InterfaceC678640Qje interfaceC678640Qje;
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
            this.LIZLLL = null;
        }
        if (!C07GF.LIZ() || (interfaceC678640Qje = this.LJIILL) == null || interfaceC678640Qje.LIZIZ() == 0) {
            this.LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) this.LIZJ.getValue(), null, null, new C678620Qjc(this, null), 3);
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
            LJIJI((InterfaceC648270Pbl) it2.next());
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
    }

    @Override // X.InterfaceC676520QgE
    public final void LJ() {
        LJIIJ();
        if (!this.LIZ.isEmpty()) {
            C054G c054g = this.LIZIZ;
            if (c054g == null || !C2296808zG.LJI(c054g)) {
                C1DFH c1dfh = C0PEM.LIZ;
                C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
                this.LIZIZ = c054gLIZ;
                C23250099c.LIZLLL(c054gLIZ, null, null, new C05IJ(this, null), 3);
            }
        }
    }

    public final void LJIILLIIL() {
        InterfaceC648270Pbl interfaceC648270PblLJIIJJI = LJIIJJI();
        if (interfaceC648270PblLJIIJJI != null) {
            boolean zLIZJ = interfaceC648270PblLJIIJJI instanceof InterfaceC211600ri ? C161300jb.LIZJ((InterfaceC211600ri) interfaceC648270PblLJIIJJI) : false;
            LJIJJ(interfaceC648270PblLJIIJJI);
            AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LIZLLL = null;
            if (zLIZJ || C140400gE.LIZ()) {
                return;
            }
            this.LJIILJJIL = interfaceC648270PblLJIIJJI;
            LJIJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC676520QgE
    public final void LIZIZ(View view) {
        if (!(!this.LJFF.isEmpty()) && (view instanceof InterfaceC648270Pbl) && (view instanceof InterfaceC211600ri)) {
            if (!this.LJI.contains(C161300jb.LIZ((InterfaceC211600ri) view))) {
                this.LIZ.addIfAbsent(view);
                C054G c054g = this.LIZIZ;
                if (c054g == null || !C2296808zG.LJI(c054g)) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
                    this.LIZIZ = c054gLIZ;
                    C23250099c.LIZLLL(c054gLIZ, null, null, new C05IJ(this, null), 3);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC676520QgE
    public final void LIZJ(View view) {
        if (view instanceof InterfaceC648270Pbl) {
            this.LIZ.remove(view);
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

    public final boolean LJIILIIL(View view) {
        int iIntValue;
        int iHeight;
        InterfaceC678640Qje interfaceC678640Qje;
        C678500QjQ c678500QjQLIZ;
        InterfaceC678640Qje interfaceC678640Qje2;
        C678500QjQ c678500QjQLIZ2;
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return true;
        }
        float f = this.LJIIJ;
        try {
            Function0<Integer> function0 = this.LJIILIIL;
            if (function0 != null) {
                iIntValue = function0.invoke().intValue();
            } else {
                iIntValue = 0;
            }
            if (rect.top < iIntValue) {
                if (LJIIL() && (interfaceC678640Qje2 = this.LJIILL) != null && (c678500QjQLIZ2 = interfaceC678640Qje2.LIZ()) != null) {
                    f = c678500QjQLIZ2.LIZ / 100.0f;
                }
                iHeight = rect.width() * (rect.bottom - iIntValue);
            } else {
                if (LJIIL() && (interfaceC678640Qje = this.LJIILL) != null && (c678500QjQLIZ = interfaceC678640Qje.LIZ()) != null) {
                    f = c678500QjQLIZ.LIZIZ / 100.0f;
                }
                iHeight = rect.height() * rect.width();
            }
            if (iHeight < view.getWidth() * view.getHeight() * f) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (rect.width() * rect.height() < view.getWidth() * view.getHeight() * this.LJIIJ) {
                return true;
            }
            return false;
        }
    }

    public final void LJIIZILJ(InterfaceC648270Pbl interfaceC648270Pbl) {
        if (interfaceC648270Pbl instanceof InterfaceC211600ri) {
            String strLIZ = C161300jb.LIZ((InterfaceC211600ri) interfaceC648270Pbl);
            if (strLIZ.length() > 0) {
                this.LJII.put(strLIZ, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public final void LJIJI(InterfaceC648270Pbl interfaceC648270Pbl) {
        Long l;
        if (interfaceC648270Pbl == null) {
            return;
        }
        boolean z = interfaceC648270Pbl instanceof InterfaceC211600ri;
        if (z) {
            InterfaceC211600ri interfaceC211600ri = (InterfaceC211600ri) interfaceC648270Pbl;
            boolean zLIZJ = C161300jb.LIZJ(interfaceC211600ri);
            String strLIZ = C161300jb.LIZ(interfaceC211600ri);
            if (!zLIZJ && strLIZ.length() > 0 && (l = this.LJII.get(strLIZ)) != null) {
                long jLongValue = l.longValue();
                if (jLongValue > 0 && System.currentTimeMillis() - jLongValue >= this.LJIIIIZZ) {
                    this.LJI.addIfAbsent(strLIZ);
                }
            }
        }
        if (interfaceC648270Pbl instanceof C661440Px0) {
            C661440Px0 c661440Px0 = (C661440Px0) interfaceC648270Pbl;
            if (c661440Px0 != null) {
                c661440Px0.LJJIII();
            }
            LJIILJJIL("video_play", (InterfaceC211600ri) interfaceC648270Pbl);
            return;
        }
        interfaceC648270Pbl.LLJJJ();
        if (!z) {
            return;
        }
        LJIILJJIL("live_play", (InterfaceC211600ri) interfaceC648270Pbl);
    }

    public final void LJIJJ(InterfaceC648270Pbl interfaceC648270Pbl) {
        if (!C140400gE.LIZ()) {
            LJIIZILJ(interfaceC648270Pbl);
        }
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
                    String strLIZ = C161300jb.LIZ((InterfaceC211600ri) view);
                    if (strLIZ.length() > 0) {
                        this.LJI.addIfAbsent(strLIZ);
                    }
                    LJIIJ();
                    return;
                }
                if (!str.equals("play")) {
                    return;
                }
                InterfaceC648270Pbl interfaceC648270Pbl = (InterfaceC648270Pbl) view;
                this.LJIILJJIL = interfaceC648270Pbl;
                LJIIZILJ(interfaceC648270Pbl);
                LJIJ();
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
                    this.LJI.addIfAbsent(strLIZ2);
                }
                LJIIJ();
                return;
            }
            if (!str.equals("play")) {
                return;
            }
            InterfaceC648270Pbl interfaceC648270Pbl2 = (InterfaceC648270Pbl) view;
            this.LJIILJJIL = interfaceC648270Pbl2;
            LJIIZILJ(interfaceC648270Pbl2);
            LJIJ();
        }
    }

    public final void LJIILJJIL(String str, InterfaceC211600ri interfaceC211600ri) {
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
        if (j2 > 0) {
            this.LJIIIZ = j2;
        }
        if (f > 0.0f && f <= 1.0f) {
            this.LJIIJ = f;
        }
        this.LJIILL = c678400QjG;
        this.LJIIJJI = z;
        this.LJIIL = z2;
        this.LJIILIIL = awS554S0100000_10;
    }
}
