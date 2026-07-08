package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavControllerViewModel;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS63S0500000_30;
import kotlin.jvm.internal.AwS80S1000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13qF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20134113qF {
    public static final /* synthetic */ int LJJIIZ = 0;
    public final Context LIZ;
    public final Activity LIZIZ;
    public C20131913pt LIZJ;
    public Bundle LIZLLL;
    public Parcelable[] LJ;
    public boolean LJFF;
    public final C13E8<NavBackStackEntry> LJI;
    public final C2252321DDq LJII;
    public final Map<NavBackStackEntry, NavBackStackEntry> LJIIIIZZ;
    public final Map<NavBackStackEntry, AtomicInteger> LJIIIZ;
    public final Map<Integer, String> LJIIJ;
    public final Map<String, C13E8<NavBackStackEntryState>> LJIIJJI;
    public LifecycleOwner LJIIL;
    public OnBackPressedDispatcher LJIILIIL;
    public NavControllerViewModel LJIILJJIL;
    public final CopyOnWriteArrayList<InterfaceC20134813qM> LJIILL;
    public Lifecycle.State LJIILLIIL;
    public final C20134513qJ LJIIZILJ;
    public final C1864490ycR LJIJ;
    public boolean LJIJI;
    public final C20132913q3 LJIJJ;
    public final Map<AbstractC20133313q7<? extends C20131713pr>, C20134213qG> LJIJJLI;
    public Function1<? super NavBackStackEntry, Unit> LJIL;
    public Function1<? super NavBackStackEntry, Unit> LJJ;
    public final Map<NavBackStackEntry, Boolean> LJJI;
    public int LJJIFFI;
    public final List<NavBackStackEntry> LJJII;
    public final C01GW LJJIII;
    public final C2252331DDr LJJIIJ;
    public final AnonymousClass0950 LJJIIJZLJL;

    public final boolean LIZIZ() {
        while (!this.LJI.isEmpty() && (this.LJI.last().LLILLJJLI instanceof C20131913pt)) {
            LJIJJ(this.LJI.last(), false, new C13E8<>());
        }
        NavBackStackEntry navBackStackEntryLJIIIIZZ = this.LJI.LJIIIIZZ();
        if (navBackStackEntryLJIIIIZZ != null) {
            ((ArrayList) this.LJJII).add(navBackStackEntryLJIIIIZZ);
        }
        this.LJJIFFI++;
        LJJIIJ();
        int i = this.LJJIFFI - 1;
        this.LJJIFFI = i;
        if (i == 0) {
            ArrayList<NavBackStackEntry> arrayList = new ArrayList(this.LJJII);
            ((ArrayList) this.LJJII).clear();
            for (NavBackStackEntry navBackStackEntry : arrayList) {
                Iterator<InterfaceC20134813qM> it2 = this.LJIILL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(navBackStackEntry.LLILLJJLI, navBackStackEntry.LLILLL);
                }
                this.LJJIIJ.LIZJ(navBackStackEntry);
            }
            this.LJII.setValue(LJIL());
        }
        return navBackStackEntryLJIIIIZZ != null;
    }

    public final C20131713pr LJFF() {
        NavBackStackEntry navBackStackEntryLJIIIIZZ = this.LJI.LJIIIIZZ();
        if (navBackStackEntryLJIIIIZZ != null) {
            return navBackStackEntryLJIIIIZZ.LLILLJJLI;
        }
        return null;
    }

    public final int LJI() {
        C13E8<NavBackStackEntry> c13e8 = this.LJI;
        int i = 0;
        if (!(c13e8 instanceof Collection) || !c13e8.isEmpty()) {
            Iterator<NavBackStackEntry> it2 = c13e8.iterator();
            while (it2.hasNext()) {
                if ((!(it2.next().LLILLJJLI instanceof C20131913pt)) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public final C20131913pt LJII() {
        C20131913pt c20131913pt = this.LIZJ;
        if (c20131913pt != null) {
            return c20131913pt;
        }
        "You must call setGraph() before calling getGraph()".toString();
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final Lifecycle.State LJIIIIZZ() {
        return this.LJIIL == null ? Lifecycle.State.CREATED : this.LJIILLIIL;
    }

    public final NavBackStackEntry LJIIIZ() {
        Object next;
        Iterator it2 = C13LP.LJLJJLL(this.LJI).iterator();
        if (it2.hasNext()) {
            it2.next();
        }
        Iterator it3 = C09R4.LIZIZ(it2).iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (!(((NavBackStackEntry) next).LLILLJJLI instanceof C20131913pt)) {
                break;
            }
        }
        return (NavBackStackEntry) next;
    }

    public final boolean LJIIZILJ() {
        return !this.LJI.isEmpty() && LJIJI(LJFF().LLIZLLLIL, true, false) && LIZIZ();
    }

    public final List<NavBackStackEntry> LJIL() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((LinkedHashMap) this.LJIJJLI).values().iterator();
        while (it2.hasNext()) {
            Iterable iterable = (Iterable) ((AbstractC20133613qA) it2.next()).LJFF.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.LLJILJILJ.isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            C19719612Di.LJJI(arrayList2, arrayList);
        }
        C13E8<NavBackStackEntry> c13e8 = this.LJI;
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : c13e8) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.LLJILJILJ.isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        C19719612Di.LJJI(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((NavBackStackEntry) obj2).LLILLJJLI instanceof C20131913pt)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle LJJIFFI() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : C2097608Jq.LJIIZILJ(this.LJIJJ.LIZ).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleLJFF = ((AbstractC20133313q7) entry.getValue()).LJFF();
            if (bundleLJFF != null) {
                arrayList.add(str);
                C786410Ut5.LJJIIZI(bundle2, bundleLJFF, str);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            C786410Ut5.LJJJIL(bundle2, "android-support-nav:controller:navigatorState:names", arrayList);
            C786410Ut5.LJJIIZI(bundle, bundle2, "android-support-nav:controller:navigatorState");
        } else {
            bundle = null;
        }
        if (!this.LJI.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.LJI.size()];
            Iterator<NavBackStackEntry> it2 = this.LJI.iterator();
            int i = 0;
            while (it2.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it2.next());
                i++;
            }
            C786410Ut5.LJJIJLIJ(bundle, "android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.LJIIJ.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.LJIIJ.size()];
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (Map.Entry entry2 : ((LinkedHashMap) this.LJIIJ).entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                Object value = entry2.getValue();
                iArr[i2] = iIntValue;
                arrayList2.add(value);
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            C786410Ut5.LJJJIL(bundle, "android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.LJIIJJI.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry3 : ((LinkedHashMap) this.LJIIJJI).entrySet()) {
                String str2 = (String) entry3.getKey();
                C13DZ c13dz = (C13DZ) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[c13dz.size()];
                int i3 = 0;
                for (Object obj : c13dz) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    parcelableArr2[i3] = obj;
                    i3 = i4;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("android-support-nav:controller:backStackStates:");
                sbLIZ.append(str2);
                C786410Ut5.LJJIJLIJ(bundle, C2188811AlT.LIZIZ(sbLIZ), parcelableArr2);
            }
            C786410Ut5.LJJJIL(bundle, "android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.LJFF) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.LJFF);
        }
        return bundle;
    }

    public final void LJJIIJ() {
        C20131713pr c20131713pr;
        AtomicInteger atomicInteger;
        AnonymousClass0951 anonymousClass0951;
        Set set;
        ArrayList<NavBackStackEntry> arrayList = new ArrayList(this.LJI);
        if (arrayList.isEmpty()) {
            return;
        }
        C20131713pr c20131713pr2 = ((NavBackStackEntry) C13LP.LJJLIIIJJI(arrayList)).LLILLJJLI;
        if (c20131713pr2 instanceof InterfaceC20135213qQ) {
            Iterator it2 = C13LP.LJLJJLL(arrayList).iterator();
            while (it2.hasNext()) {
                c20131713pr = ((NavBackStackEntry) it2.next()).LLILLJJLI;
                if (!(c20131713pr instanceof C20131913pt) && !(c20131713pr instanceof InterfaceC20135213qQ)) {
                    break;
                }
            }
            c20131713pr = null;
        } else {
            c20131713pr = null;
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : C13LP.LJLJJLL(arrayList)) {
            Lifecycle.State state = navBackStackEntry.LLJILJILJ;
            C20131713pr c20131713pr3 = navBackStackEntry.LLILLJJLI;
            if (c20131713pr2 != null && c20131713pr3.LLIZLLLIL == c20131713pr2.LLIZLLLIL) {
                Lifecycle.State state2 = Lifecycle.State.RESUMED;
                if (state != state2) {
                    AbstractC20133613qA abstractC20133613qA = (AbstractC20133613qA) ((LinkedHashMap) this.LJIJJLI).get(this.LJIJJ.LIZIZ(c20131713pr3.LL));
                    if (Intrinsics.LJFF((abstractC20133613qA == null || (anonymousClass0951 = abstractC20133613qA.LJFF) == null || (set = (Set) anonymousClass0951.getValue()) == null) ? null : Boolean.valueOf(set.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) ((LinkedHashMap) this.LJIIIZ).get(navBackStackEntry)) != null && atomicInteger.get() == 0)) {
                        map.put(navBackStackEntry, Lifecycle.State.STARTED);
                    } else {
                        map.put(navBackStackEntry, state2);
                    }
                }
                c20131713pr2 = c20131713pr2.LLILLJJLI;
            } else if (c20131713pr == null || c20131713pr3.LLIZLLLIL != c20131713pr.LLIZLLLIL) {
                navBackStackEntry.LIZ(Lifecycle.State.CREATED);
            } else {
                if (state == Lifecycle.State.RESUMED) {
                    navBackStackEntry.LIZ(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state3 = Lifecycle.State.STARTED;
                    if (state != state3) {
                        map.put(navBackStackEntry, state3);
                    }
                }
                c20131713pr = c20131713pr.LLILLJJLI;
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList) {
            Lifecycle.State state4 = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state4 != null) {
                navBackStackEntry2.LIZ(state4);
            } else {
                navBackStackEntry2.LIZIZ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL() {
        /*
            r3 = this;
            X.0ycR r2 = r3.LJIJ
            boolean r0 = r3.LJIJI
            if (r0 == 0) goto L11
            int r1 = r3.LJI()
            r0 = 1
            if (r1 <= r0) goto L11
        Ld:
            r2.LJFF(r0)
            return
        L11:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20134113qF.LJJIIJZLJL():void");
    }

    public final boolean LJIILL() {
        Bundle extras;
        Bundle extras2;
        Intent intent;
        if (LJI() != 1) {
            return LJIIZILJ();
        }
        Activity activity = this.LIZIZ;
        if (activity == null || (intent = activity.getIntent()) == null) {
            extras = null;
        } else {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        }
        int i = 0;
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            C20131713pr c20131713prLJFF = LJFF();
            int i2 = c20131713prLJFF.LLIZLLLIL;
            for (C20131913pt c20131913pt = c20131713prLJFF.LLILLJJLI; c20131913pt != null; c20131913pt = c20131913pt.LLILLJJLI) {
                if (c20131913pt.LLJILJIL != i2) {
                    Bundle bundle = new Bundle();
                    Activity activity2 = this.LIZIZ;
                    if (activity2 != null && activity2.getIntent() != null && this.LIZIZ.getIntent().getData() != null) {
                        C786410Ut5.LJJIJL(bundle, "android-support-nav:controller:deepLinkIntent", this.LIZIZ.getIntent());
                        C20132213pw c20132213pwLJIIJJI = this.LIZJ.LJIIJJI(new C20132113pv(this.LIZIZ.getIntent()));
                        if (c20132213pwLJIIJJI != null) {
                            C786410Ut5.LJJIIJZLJL(bundle, c20132213pwLJIIJJI.LL.LJ(c20132213pwLJIIJJI.LLILLJJLI));
                        }
                    }
                    C20134313qH c20134313qH = new C20134313qH((C1845220y7M) this);
                    int i3 = c20131913pt.LLIZLLLIL;
                    ((ArrayList) c20134313qH.LIZLLL).clear();
                    ((ArrayList) c20134313qH.LIZLLL).add(new C20134713qL(i3, null));
                    if (c20134313qH.LIZJ != null) {
                        c20134313qH.LIZJ();
                    }
                    c20134313qH.LIZIZ.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                    c20134313qH.LIZ().LJFF();
                    Activity activity3 = this.LIZIZ;
                    if (activity3 != null) {
                        activity3.finish();
                    }
                    return true;
                }
                i2 = c20131913pt.LLIZLLLIL;
            }
            return false;
        }
        if (this.LJFF) {
            Intent intent2 = this.LIZIZ.getIntent();
            try {
                extras2 = intent2.getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                extras2 = null;
            }
            List<Integer> listLJJZZIII = C13LQ.LJJZZIII(extras2.getIntArray("android-support-nav:controller:deepLinkIds"));
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            int iIntValue = ((Number) C19719612Di.LJJIJ(listLJJZZIII)).intValue();
            if (parcelableArrayList != null) {
                C19719612Di.LJJIJ(parcelableArrayList);
            }
            ArrayList arrayList = (ArrayList) listLJJZZIII;
            if (!arrayList.isEmpty()) {
                C20131713pr c20131713prLIZLLL = LIZLLL(LJII(), iIntValue);
                if (c20131713prLIZLLL instanceof C20131913pt) {
                    C20131913pt c20131913pt2 = (C20131913pt) c20131713prLIZLLL;
                    iIntValue = ((C20131713pr) C09RB.LJIIZILJ(C09R4.LJ(AFwS274S0000000_30.get$arr$(253), c20131913pt2.LJIJ(c20131913pt2.LLJILJIL, true)))).LLIZLLLIL;
                }
                C20131713pr c20131713prLJFF2 = LJFF();
                if (c20131713prLJFF2 != null && iIntValue == c20131713prLJFF2.LLIZLLLIL) {
                    C20134313qH c20134313qH2 = new C20134313qH((C1845220y7M) this);
                    Bundle bundleLIZ = C799520VXy.LIZ(new Pair("android-support-nav:controller:deepLinkIntent", intent2));
                    Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle2 != null) {
                        C786410Ut5.LJJIIJZLJL(bundleLIZ, bundle2);
                    }
                    c20134313qH2.LIZIZ.putExtra("android-support-nav:controller:deepLinkExtras", bundleLIZ);
                    for (Object obj : arrayList) {
                        int i4 = i + 1;
                        if (i < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        ((ArrayList) c20134313qH2.LIZLLL).add(new C20134713qL(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) ListProtector.get(parcelableArrayList, i) : null));
                        if (c20134313qH2.LIZJ != null) {
                            c20134313qH2.LIZJ();
                        }
                        i = i4;
                    }
                    c20134313qH2.LIZ().LJFF();
                    Activity activity4 = this.LIZIZ;
                    if (activity4 == null) {
                        return true;
                    }
                    activity4.finish();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.13qJ] */
    public C20134113qF(Context context) {
        Object next;
        this.LIZ = context;
        Iterator it2 = C09R4.LJ(AFwS269S0000000_27.get$arr$(370), context).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof Activity) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.LIZIZ = (Activity) next;
        this.LJI = new C13E8<>();
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C13BV.INSTANCE);
        this.LJII = c2252321DDqLIZ;
        C09IC.LIZIZ(c2252321DDqLIZ);
        this.LJIIIIZZ = new LinkedHashMap();
        this.LJIIIZ = new LinkedHashMap();
        this.LJIIJ = new LinkedHashMap();
        this.LJIIJJI = new LinkedHashMap();
        this.LJIILL = new CopyOnWriteArrayList<>();
        this.LJIILLIIL = Lifecycle.State.INITIALIZED;
        this.LJIIZILJ = new LifecycleEventObserver() { // from class: X.13qJ
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C20134113qF c20134113qF = this.LL;
                c20134113qF.LJIILLIIL = event.getTargetState();
                if (c20134113qF.LIZJ != null) {
                    for (NavBackStackEntry navBackStackEntry : c20134113qF.LJI) {
                        navBackStackEntry.getClass();
                        navBackStackEntry.LLILZ = event.getTargetState();
                        navBackStackEntry.LIZIZ();
                    }
                }
            }
        };
        this.LJIJ = new C1864490ycR(this, 6);
        this.LJIJI = true;
        final C20132913q3 c20132913q3 = new C20132913q3();
        this.LJIJJ = c20132913q3;
        this.LJIJJLI = new LinkedHashMap();
        this.LJJI = new LinkedHashMap();
        c20132913q3.LIZ(new AbstractC20133313q7<C20131913pt>(c20132913q3) { // from class: X.13q6
            public final C20132913q3 LIZJ;

            @Override // X.AbstractC20133313q7
            public final C20131713pr LIZ() {
                return new C20131913pt(this);
            }

            {
                this.LIZJ = c20132913q3;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x0081 A[LOOP:0: B:3:0x0004->B:28:0x0081, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x004f A[SYNTHETIC] */
            @Override // X.AbstractC20133313q7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(java.util.List<androidx.navigation.NavBackStackEntry> r8, X.C20133813qC r9, X.InterfaceC20133413q8 r10) {
                /*
                    r7 = this;
                    java.util.Iterator r6 = r8.iterator()
                L4:
                    boolean r0 = r6.hasNext()
                    if (r0 == 0) goto L9e
                    java.lang.Object r0 = r6.next()
                    androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
                    X.13pr r5 = r0.LLILLJJLI
                    X.13pt r5 = (X.C20131913pt) r5
                    android.os.Bundle r4 = r0.LLILLL
                    int r2 = r5.LLJILJIL
                    java.lang.String r1 = r5.LLJILLL
                    r0 = 0
                    if (r2 != 0) goto L47
                    if (r1 != 0) goto L7c
                    java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "no start destination defined via app:startDestination for "
                    r2.append(r0)
                    int r1 = r5.LLIZLLLIL
                    if (r1 == 0) goto L44
                    java.lang.String r0 = r5.LLILLL
                    if (r0 != 0) goto L34
                    java.lang.String r0 = java.lang.String.valueOf(r1)
                L34:
                    r2.append(r0)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1.toString()
                    r0.<init>(r1)
                    throw r0
                L44:
                    java.lang.String r0 = "the root navigation"
                    goto L34
                L47:
                    if (r1 != 0) goto L7c
                    X.13pr r3 = r5.LJIJ(r2, r0)
                L4d:
                    if (r3 != 0) goto L81
                    java.lang.String r0 = r5.LLJILJILJ
                    if (r0 != 0) goto L5f
                    java.lang.String r0 = r5.LLJILLL
                    if (r0 != 0) goto L5d
                    int r0 = r5.LLJILJIL
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                L5d:
                    r5.LLJILJILJ = r0
                L5f:
                    java.lang.String r3 = r5.LLJILJILJ
                    java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "navigation destination "
                    r1.append(r0)
                    r1.append(r3)
                    java.lang.String r0 = " is not a direct child of this NavGraph"
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    r2.<init>(r0)
                    throw r2
                L7c:
                    X.13pr r3 = r5.LJIL(r1, r0)
                    goto L4d
                L81:
                    X.13q3 r1 = r7.LIZJ
                    java.lang.String r0 = r3.LL
                    X.13q7 r2 = r1.LIZIZ(r0)
                    X.13qA r1 = r7.LIZIZ()
                    android.os.Bundle r0 = r3.LJ(r4)
                    androidx.navigation.NavBackStackEntry r0 = r1.LIZ(r3, r0)
                    java.util.List r0 = java.util.Collections.singletonList(r0)
                    r2.LIZLLL(r0, r9, r10)
                    goto L4
                L9e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20133213q6.LIZLLL(java.util.List, X.13qC, X.13q8):void");
            }
        });
        final Context context2 = this.LIZ;
        c20132913q3.LIZ(new AbstractC20133313q7<C20132713q1>(context2) { // from class: X.13qB
            public final Context LIZJ;
            public final Activity LIZLLL;

            @Override // X.AbstractC20133313q7
            public final C20131713pr LIZ() {
                return new C20132713q1(this);
            }

            @Override // X.AbstractC20133313q7
            public final boolean LJII() {
                Activity activity = this.LIZLLL;
                if (activity == null) {
                    return false;
                }
                activity.finish();
                return true;
            }

            {
                Object next2;
                this.LIZJ = context2;
                Iterator it3 = C09R4.LJ(AFwS274S0000000_30.get$arr$(247), context2).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (next2 instanceof Activity) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                this.LIZLLL = (Activity) next2;
            }

            @Override // X.AbstractC20133313q7
            public final C20131713pr LIZJ(C20131713pr c20131713pr, Bundle bundle, C20133813qC c20133813qC, InterfaceC20133413q8 interfaceC20133413q8) {
                Intent intent;
                int intExtra;
                Object obj;
                C20132713q1 c20132713q1 = (C20132713q1) c20131713pr;
                if (c20132713q1.LLJIJIL != null) {
                    Intent intent2 = new Intent(c20132713q1.LLJIJIL);
                    int i = 0;
                    if (bundle != null) {
                        intent2.putExtras(bundle);
                        String str = c20132713q1.LLJILJIL;
                        if (str != null && str.length() != 0) {
                            StringBuffer stringBuffer = new StringBuffer();
                            Matcher matcher = PatternProtector.compile("\\{(.+?)\\}").matcher(str);
                            while (matcher.find()) {
                                String strGroup = matcher.group(1);
                                if (bundle.containsKey(strGroup)) {
                                    matcher.appendReplacement(stringBuffer, "");
                                    try {
                                        obj = bundle.get(strGroup);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        obj = null;
                                    } catch (OutOfMemoryError e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        obj = null;
                                    }
                                    stringBuffer.append(Uri.encode(String.valueOf(obj)));
                                } else {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Could not find ");
                                    sbLIZ.append(strGroup);
                                    sbLIZ.append(" in ");
                                    sbLIZ.append(bundle);
                                    sbLIZ.append(" to fill data pattern ");
                                    sbLIZ.append(str);
                                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                            matcher.appendTail(stringBuffer);
                            intent2.setData(UriProtector.parse(stringBuffer.toString()));
                        }
                    }
                    boolean z = interfaceC20133413q8 instanceof C20133913qD;
                    if (z) {
                        interfaceC20133413q8.getClass();
                        intent2.addFlags(0);
                    }
                    if (this.LIZLLL == null) {
                        intent2.addFlags(268435456);
                    }
                    if (c20133813qC != null && c20133813qC.LIZ) {
                        intent2.addFlags(536870912);
                    }
                    Activity activity = this.LIZLLL;
                    if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                        intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
                    }
                    intent2.putExtra("android-support-navigation:ActivityNavigator:current", c20132713q1.LLIZLLLIL);
                    Resources resources = this.LIZJ.getResources();
                    if (c20133813qC != null) {
                        int i2 = c20133813qC.LJII;
                        int i3 = c20133813qC.LJIIIIZZ;
                        if ((i2 <= 0 || !Intrinsics.LJFF(resources.getResourceTypeName(i2), "animator")) && (i3 <= 0 || !Intrinsics.LJFF(resources.getResourceTypeName(i3), "animator"))) {
                            intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i2);
                            intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i3);
                        }
                    }
                    if (z) {
                        interfaceC20133413q8.getClass();
                        Context context3 = this.LIZJ;
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context3, intent2, "Context_startActivity_1");
                        C2204961BRm.LJJJJJL(context3, intent2, new C0WZX("dTF6Tg0zW9KSW1Y3TBWFcmI9K9q6lf3Sae8bpdUtlqWx/i0jKw==", new String[]{"01789"}));
                    } else {
                        Context context4 = this.LIZJ;
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context4, intent2, "Context_startActivity_1");
                        C2204961BRm.LJJJJJL(context4, intent2, new C0WZX("dTF6Tg0zW9KSW1Y3TBWFcmI9K9q6lf3Sae8bpdUtlqWx/i0jKw==", new String[]{"01789"}));
                    }
                    if (c20133813qC != null && this.LIZLLL != null) {
                        int i4 = c20133813qC.LJFF;
                        int i5 = c20133813qC.LJI;
                        if ((i4 <= 0 || !Intrinsics.LJFF(resources.getResourceTypeName(i4), "animator")) && (i5 <= 0 || !Intrinsics.LJFF(resources.getResourceTypeName(i5), "animator"))) {
                            if (i4 < 0) {
                                if (i5 >= 0) {
                                    i4 = 0;
                                }
                            }
                            if (i5 >= 0) {
                                i = i5;
                            }
                            C786410Ut5.ae(i4, this.LIZLLL, i);
                            return null;
                        }
                    }
                    return null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Destination ");
                sbLIZ2.append(c20132713q1.LLIZLLLIL);
                sbLIZ2.append(" does not have an Intent set.");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
        });
        this.LJJII = new ArrayList();
        this.LJJIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1123));
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, EnumC2252401DDy.DROP_OLDEST, 2);
        this.LJJIIJ = c2252331DDrLIZIZ;
        this.LJJIIJZLJL = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    public final C20131713pr LIZJ(int i) {
        C20131713pr c20131713pr;
        C20131913pt c20131913pt = this.LIZJ;
        if (c20131913pt == null) {
            return null;
        }
        if (c20131913pt.LLIZLLLIL == i) {
            return c20131913pt;
        }
        NavBackStackEntry navBackStackEntryLJIIIIZZ = this.LJI.LJIIIIZZ();
        if (navBackStackEntryLJIIIIZZ == null || (c20131713pr = navBackStackEntryLJIIIIZZ.LLILLJJLI) == null) {
            c20131713pr = this.LIZJ;
        }
        return LIZLLL(c20131713pr, i);
    }

    public final NavBackStackEntry LJ(int i) {
        NavBackStackEntry navBackStackEntryPrevious;
        C13E8<NavBackStackEntry> c13e8 = this.LJI;
        ListIterator<NavBackStackEntry> listIterator = c13e8.listIterator(c13e8.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                navBackStackEntryPrevious = listIterator.previous();
                if (navBackStackEntryPrevious.LLILLJJLI.LLIZLLLIL == i) {
                    break;
                }
            } else {
                navBackStackEntryPrevious = null;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No destination with ID ");
        sbLIZ.append(i);
        sbLIZ.append(" is on the NavController's back stack. The current destination is ");
        sbLIZ.append(LJFF());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final void LJJ(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.LIZ.getClassLoader());
        this.LIZLLL = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.LJ = bundle.getParcelableArray("android-support-nav:controller:backStack");
        ((LinkedHashMap) this.LJIIJJI).clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                this.LJIIJ.put(Integer.valueOf(intArray[i]), (String) ListProtector.get(stringArrayList, i2));
                i++;
                i2++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("android-support-nav:controller:backStackStates:");
                sbLIZ.append(str);
                Parcelable[] parcelableArray = bundle.getParcelableArray(C2188811AlT.LIZIZ(sbLIZ));
                if (parcelableArray != null) {
                    Map<String, C13E8<NavBackStackEntryState>> map = this.LJIIJJI;
                    C13E8 c13e8 = new C13E8(parcelableArray.length);
                    C089E c089e = new C089E(parcelableArray);
                    while (c089e.hasNext()) {
                        Parcelable parcelable = (Parcelable) c089e.next();
                        if (parcelable != null) {
                            c13e8.addLast(parcelable);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        }
                    }
                    map.put(str, (C13E8<NavBackStackEntryState>) c13e8);
                }
            }
        }
        this.LJFF = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public final void LJJIII(NavBackStackEntry navBackStackEntry) {
        AtomicInteger atomicInteger;
        Integer numValueOf;
        NavBackStackEntry navBackStackEntryRemove = this.LJIIIIZZ.remove(navBackStackEntry);
        if (navBackStackEntryRemove != null && (atomicInteger = (AtomicInteger) ((LinkedHashMap) this.LJIIIZ).get(navBackStackEntryRemove)) != null && (numValueOf = Integer.valueOf(atomicInteger.decrementAndGet())) != null && numValueOf.intValue() == 0) {
            AbstractC20133613qA abstractC20133613qA = (AbstractC20133613qA) ((LinkedHashMap) this.LJIJJLI).get(this.LJIJJ.LIZIZ(navBackStackEntryRemove.LLILLJJLI.LL));
            if (abstractC20133613qA != null) {
                abstractC20133613qA.LIZIZ(navBackStackEntryRemove);
            }
            this.LJIIIZ.remove(navBackStackEntryRemove);
        }
    }

    public static C20131713pr LIZLLL(C20131713pr c20131713pr, int i) {
        C20131913pt c20131913pt;
        if (c20131713pr.LLIZLLLIL == i) {
            return c20131713pr;
        }
        if (c20131713pr instanceof C20131913pt) {
            c20131913pt = (C20131913pt) c20131713pr;
        } else {
            c20131913pt = c20131713pr.LLILLJJLI;
        }
        return c20131913pt.LJIJ(i, true);
    }

    public final void LJIIJ(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.LJIIIIZZ.put(navBackStackEntry, navBackStackEntry2);
        if (((LinkedHashMap) this.LJIIIZ).get(navBackStackEntry2) == null) {
            this.LJIIIZ.put(navBackStackEntry2, new AtomicInteger(0));
        }
        ((AtomicInteger) ((LinkedHashMap) this.LJIIIZ).get(navBackStackEntry2)).incrementAndGet();
    }

    public final void LJIILIIL(String str, Function1<? super C1308940kAO, Unit> function1) {
        LJIILJJIL(this, str, C1308930kAN.LIZ(function1), 4);
    }

    public final void LJIILLIIL(int i, boolean z) {
        if (LJIJI(i, z, false)) {
            LIZIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x021c, code lost:
    
        if (X.C1308920kAM.LIZIZ(r13, r14.LIZ) == null) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026a A[PHI: r11 r12
      0x026a: PHI (r11v4 int[]) = (r11v2 int[]), (r11v1 int[]) binds: [B:119:0x0268, B:112:0x0247] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r12v4 java.util.ArrayList) = (r12v2 java.util.ArrayList), (r12v1 java.util.ArrayList) binds: [B:119:0x0268, B:112:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(X.C20131913pt r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20134113qF.LJJII(X.13pt, android.os.Bundle):void");
    }

    public static void LJIJ(C1845220y7M c1845220y7M, String str, boolean z) {
        c1845220y7M.getClass();
        if (c1845220y7M.LJIJI(C1308920kAM.LIZ(str).hashCode(), z, false)) {
            c1845220y7M.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(int r8, android.os.Bundle r9, X.C20133813qC r10) {
        /*
            r7 = this;
            X.13E8<androidx.navigation.NavBackStackEntry> r0 = r7.LJI
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L43
            X.13pt r5 = r7.LIZJ
        La:
            if (r5 == 0) goto Lbc
            X.0kAH r6 = r5.LJIIIIZZ(r8)
            r4 = 0
            if (r6 == 0) goto L40
            if (r10 != 0) goto L17
            X.13qC r10 = r6.LIZIZ
        L17:
            int r3 = r6.LIZ
            android.os.Bundle r0 = r6.LIZJ
            if (r0 == 0) goto L41
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            X.C786410Ut5.LJJIIJZLJL(r2, r0)
        L25:
            if (r9 == 0) goto L31
            if (r2 != 0) goto L2e
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L2e:
            X.C786410Ut5.LJJIIJZLJL(r2, r9)
        L31:
            if (r3 != 0) goto L4e
            if (r10 == 0) goto Lb1
            int r1 = r10.LIZJ
            r0 = -1
            if (r1 == r0) goto Lb1
            boolean r0 = r10.LIZLLL
            r7.LJIILLIIL(r1, r0)
            return
        L40:
            r3 = r8
        L41:
            r2 = r4
            goto L25
        L43:
            X.13E8<androidx.navigation.NavBackStackEntry> r0 = r7.LJI
            java.lang.Object r0 = r0.last()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            X.13pr r5 = r0.LLILLJJLI
            goto La
        L4e:
            r1 = 1
            if (r3 == 0) goto Lb1
            X.13pr r0 = r7.LIZJ(r3)
            if (r0 != 0) goto Lad
            android.content.Context r0 = r7.LIZ
            java.lang.String r4 = X.C1308920kAM.LIZIZ(r3, r0)
            if (r6 == 0) goto L60
            r1 = 0
        L60:
            java.lang.String r3 = " cannot be found from the current destination "
            if (r1 != 0) goto L91
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Navigation destination "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " referenced from action "
            r1.append(r0)
            android.content.Context r0 = r7.LIZ
            java.lang.String r0 = X.C1308920kAM.LIZIZ(r8, r0)
            r1.append(r0)
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L91:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Navigation action/destination "
            r1.append(r0)
            r1.append(r4)
            r1.append(r3)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        Lad:
            r7.LJIIL(r0, r2, r10, r4)
            return
        Lb1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"
            r0.toString()
            r1.<init>(r0)
            throw r1
        Lbc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "no current navigation node"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20134113qF.LJIIJJI(int, android.os.Bundle, X.13qC):void");
    }

    public final boolean LJIJI(int i, boolean z, boolean z2) {
        String str;
        String str2;
        if (this.LJI.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = C13LP.LJLJJLL(this.LJI).iterator();
        while (it2.hasNext()) {
            C20131713pr c20131713pr = ((NavBackStackEntry) it2.next()).LLILLJJLI;
            AbstractC20133313q7 abstractC20133313q7LIZIZ = this.LJIJJ.LIZIZ(c20131713pr.LL);
            if (z || c20131713pr.LLIZLLLIL != i) {
                arrayList.add(abstractC20133313q7LIZIZ);
            }
            if (c20131713pr.LLIZLLLIL == i) {
                C013C c013c = new C013C();
                C13E8<NavBackStackEntryState> c13e8 = new C13E8<>();
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        AbstractC20133313q7 abstractC20133313q7 = (AbstractC20133313q7) it3.next();
                        C013C c013c2 = new C013C();
                        NavBackStackEntry navBackStackEntryLast = this.LJI.last();
                        this.LJJ = new C20134613qK(c013c2, c013c, this, z2, c13e8);
                        abstractC20133313q7.LJI(navBackStackEntryLast, z2);
                        str = null;
                        this.LJJ = null;
                        if (!c013c2.element) {
                            break;
                        }
                    } else {
                        str = null;
                        break;
                    }
                }
                if (z2) {
                    if (!z) {
                        C13BX c13bx = new C13BX(new C13BY(C09R4.LJ(AFwS274S0000000_30.get$arr$(248), c20131713pr), new AwS609S0100000_30(this, 149)));
                        while (c13bx.hasNext()) {
                            C20131713pr c20131713pr2 = (C20131713pr) c13bx.next();
                            Map<Integer, String> map = this.LJIIJ;
                            Integer numValueOf = Integer.valueOf(c20131713pr2.LLIZLLLIL);
                            NavBackStackEntryState navBackStackEntryStateLJFF = c13e8.LJFF();
                            if (navBackStackEntryStateLJFF != null) {
                                str2 = navBackStackEntryStateLJFF.id;
                            } else {
                                str2 = str;
                            }
                            map.put(numValueOf, str2);
                        }
                    }
                    if (!c13e8.isEmpty()) {
                        NavBackStackEntryState navBackStackEntryStateFirst = c13e8.first();
                        C13BX c13bx2 = new C13BX(new C13BY(C09R4.LJ(AFwS274S0000000_30.get$arr$(249), LIZJ(navBackStackEntryStateFirst.destinationId)), new AwS609S0100000_30(this, 150)));
                        while (c13bx2.hasNext()) {
                            this.LJIIJ.put(Integer.valueOf(((C20131713pr) c13bx2.next()).LLIZLLLIL), navBackStackEntryStateFirst.id);
                        }
                        this.LJIIJJI.put(navBackStackEntryStateFirst.id, c13e8);
                    }
                }
                LJJIIJZLJL();
                return c013c.element;
            }
        }
        C1308920kAM.LIZIZ(i, this.LIZ);
        return false;
    }

    public final void LJIJJ(NavBackStackEntry navBackStackEntry, boolean z, C13E8<NavBackStackEntryState> c13e8) {
        NavControllerViewModel navControllerViewModel;
        AnonymousClass0951 anonymousClass0951;
        Set set;
        NavBackStackEntry navBackStackEntryLast = this.LJI.last();
        if (Intrinsics.LJFF(navBackStackEntryLast, navBackStackEntry)) {
            this.LJI.removeLast();
            AbstractC20133613qA abstractC20133613qA = (AbstractC20133613qA) ((LinkedHashMap) this.LJIJJLI).get(this.LJIJJ.LIZIZ(navBackStackEntryLast.LLILLJJLI.LL));
            boolean z2 = true;
            if ((abstractC20133613qA == null || (anonymousClass0951 = abstractC20133613qA.LJFF) == null || (set = (Set) anonymousClass0951.getValue()) == null || !set.contains(navBackStackEntryLast)) && !this.LJIIIZ.containsKey(navBackStackEntryLast)) {
                z2 = false;
            }
            Lifecycle.State currentState = navBackStackEntryLast.LLIZLLLIL.getCurrentState();
            Lifecycle.State state = Lifecycle.State.CREATED;
            if (currentState.isAtLeast(state)) {
                if (z) {
                    navBackStackEntryLast.LIZ(state);
                    c13e8.addFirst(new NavBackStackEntryState(navBackStackEntryLast));
                }
                if (!z2) {
                    navBackStackEntryLast.LIZ(Lifecycle.State.DESTROYED);
                    LJJIII(navBackStackEntryLast);
                } else {
                    navBackStackEntryLast.LIZ(state);
                }
            }
            if (!z && !z2 && (navControllerViewModel = this.LJIILJJIL) != null) {
                ViewModelStore viewModelStoreRemove = navControllerViewModel.LL.remove(navBackStackEntryLast.LLILZLL);
                if (viewModelStoreRemove != null) {
                    viewModelStoreRemove.clear();
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Attempted to pop ");
        sbLIZ.append(navBackStackEntry.LLILLJJLI);
        sbLIZ.append(", which is not the top of the back stack (");
        sbLIZ.append(navBackStackEntryLast.LLILLJJLI);
        sbLIZ.append(')');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static void LJIILJJIL(C20134113qF c20134113qF, String str, C20133813qC c20133813qC, int i) {
        if ((i & 2) != 0) {
            c20133813qC = null;
        }
        c20134113qF.getClass();
        Uri uri = UriProtector.parse(C1308920kAM.LIZ(str));
        C20132113pv c20132113pv = new C20132113pv(uri, null, null);
        C20132213pw c20132213pwLJIIJJI = c20134113qF.LIZJ.LJIIJJI(c20132113pv);
        if (c20132213pwLJIIJJI != null) {
            Bundle bundleLJ = c20132213pwLJIIJJI.LL.LJ(c20132213pwLJIIJJI.LLILLJJLI);
            if (bundleLJ == null) {
                bundleLJ = new Bundle();
            }
            C20131713pr c20131713pr = c20132213pwLJIIJJI.LL;
            Intent intent = new Intent();
            intent.setDataAndType(uri, null);
            intent.setAction(null);
            C786410Ut5.LJJIJL(bundleLJ, "android-support-nav:controller:deepLinkIntent", intent);
            c20134113qF.LJIIL(c20131713pr, bundleLJ, c20133813qC, null);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Navigation destination that matches request ");
        sbLIZ.append(c20132113pv);
        sbLIZ.append(" cannot be found in the navigation graph ");
        sbLIZ.append(c20134113qF.LIZJ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r1 = X.C197062128e.LIZ(r9.LIZ, r6, r11, LJIIIIZZ(), r9.LJIILJJIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        r1 = X.C197062128e.LIZ(r9.LIZ, r8, r8.LJ(r11), LJIIIIZZ(), r9.LJIILJJIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016c, code lost:
    
        r5 = r9.LIZ;
        r4 = r9.LIZJ;
        r2 = X.C197062128e.LIZ(r5, r4, r4.LJ(r11), LJIIIIZZ(), r9.LJIILJJIL);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C20131713pr r10, android.os.Bundle r11, androidx.navigation.NavBackStackEntry r12, java.util.List<androidx.navigation.NavBackStackEntry> r13) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20134113qF.LIZ(X.13pr, android.os.Bundle, androidx.navigation.NavBackStackEntry, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[LOOP:1: B:20:0x006b->B:22:0x0071, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.C20131713pr r21, android.os.Bundle r22, X.C20133813qC r23, X.InterfaceC20133413q8 r24) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20134113qF.LJIIL(X.13pr, android.os.Bundle, X.13qC, X.13q8):void");
    }

    public final boolean LJJI(int i, Bundle bundle, C20133813qC c20133813qC, InterfaceC20133413q8 interfaceC20133413q8) {
        C20131713pr c20131713prLJII;
        NavBackStackEntry navBackStackEntry;
        C20131713pr c20131713pr;
        if (!this.LJIIJ.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) ((LinkedHashMap) this.LJIIJ).get(Integer.valueOf(i));
        C19719612Di.LJJIII(((LinkedHashMap) this.LJIIJ).values(), new AwS80S1000000_30(str, 4), true);
        AbstractList<NavBackStackEntryState> abstractList = (AbstractList) C19719512Dh.LIZJ(this.LJIIJJI).remove(str);
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntryLJIIIIZZ = this.LJI.LJIIIIZZ();
        if (navBackStackEntryLJIIIIZZ == null || (c20131713prLJII = navBackStackEntryLJIIIIZZ.LLILLJJLI) == null) {
            c20131713prLJII = LJII();
        }
        if (abstractList != null) {
            for (NavBackStackEntryState navBackStackEntryState : abstractList) {
                C20131713pr c20131713prLIZLLL = LIZLLL(c20131713prLJII, navBackStackEntryState.destinationId);
                if (c20131713prLIZLLL != null) {
                    arrayList.add(navBackStackEntryState.LIZ(this.LIZ, c20131713prLIZLLL, LJIIIIZZ(), this.LJIILJJIL));
                    c20131713prLJII = c20131713prLIZLLL;
                } else {
                    String strLIZIZ = C1308920kAM.LIZIZ(navBackStackEntryState.destinationId, this.LIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Restore State failed: destination ");
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(" cannot be found from the current destination ");
                    sbLIZ.append(c20131713prLJII);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ2.toString();
                    throw new IllegalStateException(strLIZIZ2);
                }
            }
        }
        ArrayList<List<NavBackStackEntry>> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((NavBackStackEntry) obj).LLILLJJLI instanceof C20131913pt)) {
                arrayList3.add(obj);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it2.next();
            List list = (List) C13LP.LJJLIIIJL(arrayList2);
            if (list != null && (navBackStackEntry = (NavBackStackEntry) C13LP.LJJLIIIJJI(list)) != null && (c20131713pr = navBackStackEntry.LLILLJJLI) != null) {
                str2 = c20131713pr.LL;
            }
            if (Intrinsics.LJFF(str2, navBackStackEntry2.LLILLJJLI.LL)) {
                list.add(navBackStackEntry2);
            } else {
                arrayList2.add(C1697810uHb.LJIILJJIL(navBackStackEntry2));
            }
        }
        C013C c013c = new C013C();
        for (List<NavBackStackEntry> list2 : arrayList2) {
            AbstractC20133313q7 abstractC20133313q7LIZIZ = this.LJIJJ.LIZIZ(((NavBackStackEntry) C13LP.LJJJJZI(list2)).LLILLJJLI.LL);
            this.LJIL = new AwS63S0500000_30(c013c, (C013C) arrayList, (List<NavBackStackEntry>) new C118300cf(), (C118300cf) this, (C20134113qF) bundle, (Bundle) 0);
            abstractC20133313q7LIZIZ.LIZLLL(list2, c20133813qC, interfaceC20133413q8);
            this.LJIL = null;
        }
        return c013c.element;
    }
}
