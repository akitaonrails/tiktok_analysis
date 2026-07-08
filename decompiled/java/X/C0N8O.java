package X;

import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N8O, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N8O extends C0N8N<Aweme> implements C0N8W, InterfaceC582120MsM {
    public static final /* synthetic */ int LJIIL = 0;
    public final C0N8Q LJFF;
    public final C0N8J<Aweme> LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final AtomicReference<C0N23> LJIIJ;
    public final AtomicReference<C0N23> LJIIJJI;

    public final void LJIILL() {
        C0N8Q c0n8q = this.LJFF;
        c0n8q.LIZ.setValue(c0n8q, C0N8Q.LIZIZ[0], this);
        C581480MrK c581480MrK = C581480MrK.LIZ;
        String str = this.LJII;
        c581480MrK.getClass();
        ConcurrentHashMap<String, WeakReference<InterfaceC582120MsM>> concurrentHashMap = C581480MrK.LJFF;
        if (concurrentHashMap.get(str) == null) {
            concurrentHashMap.put(str, new WeakReference<>(this));
        }
    }

    @Override // X.InterfaceC2258671Dar
    public final void LJIILLIIL() {
        C0N23 c0n23LJIJI;
        C589080N8o.LIZIZ(this, null, new AwS553S0100000_9(this, 1778));
        if (LJIIZILJ() != null && LJIJI() != null && (c0n23LJIJI = LJIJI()) != null) {
            C589080N8o.LIZLLL(this, null, new AwS553S0100000_9(this, 1779));
            if (!LJIL("componentDestroy")) {
                LJIJJ(c0n23LJIJI, this.LJIIIIZZ, C0N2R.LIZ(C2097908Jt.LIZJ(new Pair("disappear_from", "page_release"))));
                LJIJJLI();
            }
        }
        this.LJ.clear();
        C581480MrK c581480MrK = C581480MrK.LIZ;
        String str = this.LJII;
        c581480MrK.getClass();
        C581480MrK.LJFF.remove(str);
    }

    public final C0N23 LJIIZILJ() {
        return this.LJIIJ.get();
    }

    public final C0N23 LJIJI() {
        return this.LJIIJJI.get();
    }

    public final void LJIJJLI() {
        C0N23 c0n23LJIJI;
        if (LJIL("onUnBind")) {
            return;
        }
        if (((LJIIZILJ() == null || LJIJI() == null) ? false : true) && (c0n23LJIJI = LJIJI()) != null) {
            C589080N8o.LIZLLL(this, null, new AwS553S0100000_9(this, 1780));
            LJIJJ(c0n23LJIJI, this.LJIIIIZZ, C0N2R.LIZ(C2097908Jt.LIZJ(new Pair("disappear_from", "page_unbind"))));
        }
        C0N23 c0n23LJIIZILJ = LJIIZILJ();
        if (c0n23LJIIZILJ != null) {
            Iterator<T> it2 = this.LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N87) it2.next()).LJII(c0n23LJIIZILJ, this.LJIIIIZZ, C2097608Jq.LJ());
            }
        }
        this.LJIIJ.set(null);
    }

    @Override // X.C0N8W
    public final void onBind() {
        this.LJIIJ.set(this.LJI.LIZIZ(this.LJFF.LIZ(), this.LJIIIIZZ));
        C0N23 c0n23LJIIZILJ = LJIIZILJ();
        if (c0n23LJIIZILJ != null) {
            Iterator<T> it2 = this.LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N87) it2.next()).LJI(c0n23LJIIZILJ, this.LJIIIIZZ, C2097608Jq.LJ());
            }
        }
    }

    @Override // X.InterfaceC2258651Dap
    public final String LIZJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC2258651Dap
    public final String LJ() {
        return this.LJIIIZ;
    }

    @Override // X.C0N8W
    public final void LJJJJZ() {
        LJIJJLI();
    }

    public final boolean LJIL(String str) {
        String str2 = this.LJIIIIZZ;
        C0N23 c0n23LJIJI = LJIJI();
        if (!Intrinsics.LJFF(str2, "general_search") || !(c0n23LJIJI instanceof C585310MxV)) {
            return false;
        }
        C589080N8o.LIZLLL(this, null, new AwS158S1100000_9(str, this, 29));
        this.LJIIJ.set(null);
        this.LJIIJJI.set(null);
        return true;
    }

    public C0N8O(C588950N8b c588950N8b, C584970Mwx c584970Mwx) {
        super(0);
        this.LJFF = c588950N8b;
        this.LJI = c584970Mwx;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c588950N8b.LIZLLL);
        sbLIZ.append('/');
        sbLIZ.append(C0N8O.class.getSimpleName());
        this.LJII = C2088108Fz.LIZIZ(c588950N8b, C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIIZZ = c588950N8b.LIZJ;
        this.LJIIIZ = c588950N8b.LIZLLL;
        this.LJIIJ = new AtomicReference<>();
        this.LJIIJJI = new AtomicReference<>();
    }

    @Override // X.InterfaceC582120MsM
    public final String LIZ(String str, C0N23 c0n23) {
        String strLIZ;
        boolean zLJFF = Intrinsics.LJFF(this.LJIIIIZZ, str);
        boolean zLJFF2 = Intrinsics.LJFF(LJIIZILJ(), c0n23);
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("matchEventType", Boolean.valueOf(zLJFF));
        pairArr[1] = new Pair("matchMeasurableId", Boolean.valueOf(zLJFF2));
        pairArr[2] = new Pair("providerId", this.LJII);
        pairArr[3] = new Pair("eventType", this.LJIIIIZZ);
        C0N23 c0n23LJIIZILJ = LJIIZILJ();
        if (c0n23LJIIZILJ != null) {
            strLIZ = c0n23LJIIZILJ.LIZ();
        } else {
            strLIZ = null;
        }
        pairArr[4] = new Pair("dynamicBondContext", strLIZ);
        Set<C0N23> setKeySet = this.LJ.keySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C0N23) it2.next()).LIZ());
        }
        pairArr[5] = new Pair("exposeObservers", arrayList);
        return C2097608Jq.LJIIIIZZ(pairArr).toString();
    }

    @Override // X.InterfaceC582120MsM
    public final boolean LJFF(String str, C0N23 c0n23) {
        boolean zLJFF = Intrinsics.LJFF(this.LJIIIIZZ, str);
        boolean zLJFF2 = Intrinsics.LJFF(LJIIZILJ(), c0n23);
        if (zLJFF && zLJFF2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC582120MsM
    public final void LJI(C0N23 c0n23, String str, Map map) {
        if (Intrinsics.LJFF(str, this.LJIIIIZZ) && Intrinsics.LJFF(LJIIZILJ(), c0n23)) {
            MeasurementDependencyModules.LIZ.getClass();
            C04TF.LIZ().isDebug();
            LJIJJ(c0n23, str, map);
        }
    }

    @Override // X.InterfaceC582120MsM
    public final void LJII(C0N23 c0n23, String str, Map map) {
        if (Intrinsics.LJFF(str, this.LJIIIIZZ) && Intrinsics.LJFF(LJIIZILJ(), c0n23)) {
            MeasurementDependencyModules.LIZ.getClass();
            C04TF.LIZ().isDebug();
            Iterator<T> it2 = this.LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N87) it2.next()).LJFF(c0n23, str, map);
            }
            this.LJIIJJI.set(LJIIZILJ());
        }
    }

    public final void LJIJJ(C0N23 c0n23, String str, Map map) {
        Iterator<T> it2 = this.LJ.values().iterator();
        while (it2.hasNext()) {
            ((C0N87) it2.next()).LJIIZILJ(c0n23, str, map);
        }
        this.LJIIJJI.set(null);
    }
}
