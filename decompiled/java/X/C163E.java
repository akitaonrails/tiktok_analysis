package X;

import Y.ARunnableS11S0210000_9;
import android.os.Handler;
import com.ss.android.ugc.aweme.cla.et.newet.PrefetchStatusDescTranslEvent;
import com.ss.android.ugc.aweme.cla.experiments.captions.ClaPrefetchConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.163E, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163E implements C162M {
    public static final ConcurrentHashMap<String, C163E> LJIJ = new ConcurrentHashMap<>();
    public final EnumSet<EnumC207101162h> LIZ;
    public Aweme LJIIL;
    public final Handler LIZIZ = C161N.LIZIZ.LLIILII();
    public final long LIZJ = 8000;
    public final C11NJ LIZLLL = new C11NJ();
    public final HashMap<C0RQH, Runnable> LJ = new HashMap<>();
    public String LJFF = "";
    public final ConcurrentHashMap<String, List<WeakReference<InterfaceC585880MyQ>>> LJI = new ConcurrentHashMap<>();
    public final C01GW LJII = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(18));
    public List<String> LJIIIIZZ = new ArrayList();
    public final Set<String> LJIIIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set<String> LJIIJ = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set<String> LJIIJJI = Collections.newSetFromMap(new ConcurrentHashMap());
    public final HashMap<String, C0ND9> LJIILIIL = new HashMap<>();
    public final Set<String> LJIILJJIL = Collections.newSetFromMap(new ConcurrentHashMap());
    public final C163Q LJIILL = new Runnable() { // from class: X.163Q
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("TranslationPrefetchTaskManagerImpl@2e5a.tryPrefetchRunnable$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("TranslationPrefetchTaskManagerImpl@2e5a.tryPrefetchRunnable$1");
        }

        public final void LIZ() {
            int i;
            int i2;
            Aweme awemeLJIIL;
            if (C294250Bg7.LIZ() < 2) {
                C163E c163e = this.LL;
                int size = c163e.LJIIIZ.size();
                if (C294250Bg7.LIZ() < 2 || (i = C0SKG.LIZ.maxConcurrentPrefetch) < 1) {
                    i = 1;
                }
                if (size >= i || c163e.LJ.size() > 0) {
                    this.LL.LJIILLIIL(false);
                    return;
                }
                Aweme awemeLJIIL2 = this.LL.LJIIL();
                if (awemeLJIIL2 != null) {
                    this.LL.LJIILJJIL(awemeLJIIL2);
                    return;
                }
                return;
            }
            int i3 = 0;
            while (true) {
                C163E c163e2 = this.LL;
                int size2 = c163e2.LJIIIZ.size();
                if (C294250Bg7.LIZ() < 2 || (i2 = C0SKG.LIZ.maxConcurrentPrefetch) < 1) {
                    i2 = 1;
                }
                if (size2 >= i2 || c163e2.LJ.size() > 0 || (awemeLJIIL = this.LL.LJIIL()) == null) {
                    break;
                }
                this.LL.LJIILJJIL(awemeLJIIL);
                i3++;
            }
            if (i3 != 0 || this.LL.LJ.size() <= 0) {
                return;
            }
            this.LL.LJIILLIIL(false);
        }
    };
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(19));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new C207116162w(this));

    public final C0N5E LJIIJJI() {
        return (C0N5E) this.LJII.getValue();
    }

    public final Aweme LJIIL() {
        boolean z;
        int iIndexOf;
        boolean z2;
        int iIndexOf2;
        Aweme next;
        int i;
        ClaPrefetchConfig claPrefetchConfig = C0SKG.LIZ;
        int iLJIIIZ = LJIIIZ(claPrefetchConfig.maxPrefetchNumber);
        if (iLJIIIZ < 1) {
            return null;
        }
        if (C294250Bg7.LIZ() >= 1 && (i = claPrefetchConfig.prefetchScanWindow) >= iLJIIIZ) {
            iLJIIIZ = i;
        }
        if (!C161T.LIZ().LIZ()) {
            return null;
        }
        Aweme aweme = this.LJIIL;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme) && !C292360Bd4.LIZ) {
            return null;
        }
        if (C1E9C.LIZ()) {
            if (this.LJIIL == null && C294250Bg7.LIZ() >= 1 && claPrefetchConfig.enableColdStartScan) {
                z2 = true;
                iIndexOf2 = -1;
            } else {
                z2 = false;
                List<String> list = this.LJIIIIZZ;
                Aweme aweme2 = this.LJIIL;
                iIndexOf2 = ((ArrayList) list).indexOf(aweme2 != null ? aweme2.getAid() : null);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("curAweme: ");
            Aweme aweme3 = this.LJIIL;
            sbLIZ.append(aweme3 != null ? aweme3.getAid() : null);
            C2188811AlT.LIZIZ(sbLIZ);
            if (iIndexOf2 == -1 && !z2) {
                return null;
            }
            int i2 = 1;
            while (true) {
                String str = (String) C13LP.LJJJLZIJ(iIndexOf2 + i2, this.LJIIIIZZ);
                if (str != null) {
                    Iterator<Aweme> it2 = LJIIJJI().LIZ().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getAid(), str)) {
                            break;
                        }
                    }
                    Aweme aweme4 = next;
                    if (aweme4 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Aweme ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(": Translatable ");
                        sbLIZ2.append(LJIILIIL().LIZJ(aweme4));
                        sbLIZ2.append(", Translation Enabled ");
                        sbLIZ2.append(LJIILIIL().LJ(aweme4, EnumC715680S5m.NOT_OVERWRITTEN));
                        sbLIZ2.append(" Prefetch Ongoing or completed = ");
                        sbLIZ2.append(this.LJIIJ.contains(str) || this.LJIIIZ.contains(str));
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (!this.LJIIJ.contains(str) && !this.LJIIIZ.contains(str)) {
                            if (LJIIIIZZ(this, aweme4)) {
                                return aweme4;
                            }
                            C0N5E c0n5eLJIIJJI = LJIIJJI();
                            if (c0n5eLJIIJJI.LIZIZ()) {
                                C19719612Di.LJJIIJ(c0n5eLJIIJJI.LIZIZ, new C5183020f(aweme4, 4), true);
                            } else {
                                c0n5eLJIIJJI.LIZ.remove(aweme4);
                            }
                        }
                    }
                }
                if (i2 == iLJIIIZ) {
                    return null;
                }
                i2++;
            }
        } else {
            if (this.LJIIL == null && C294250Bg7.LIZ() >= 1 && claPrefetchConfig.enableColdStartScan) {
                z = true;
                iIndexOf = -1;
            } else {
                z = false;
                iIndexOf = LJIIJJI().LIZ().indexOf(this.LJIIL);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("curAweme: ");
            Aweme aweme5 = this.LJIIL;
            sbLIZ3.append(aweme5 != null ? aweme5.getAid() : null);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (iIndexOf == -1 && !z) {
                return null;
            }
            int i3 = 1;
            while (true) {
                Aweme aweme6 = (Aweme) C13LP.LJJJLZIJ(iIndexOf + i3, LJIIJJI().LIZ());
                if (aweme6 != null) {
                    if (((Boolean) C283170B7z.LIZ.getValue()).booleanValue()) {
                        String aid = aweme6.getAid();
                        if (aid != null) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("Aweme ");
                            sbLIZ4.append(aid);
                            sbLIZ4.append(": Translatable ");
                            sbLIZ4.append(LJIILIIL().LIZJ(aweme6));
                            sbLIZ4.append(", Translation Enabled ");
                            sbLIZ4.append(LJIILIIL().LJ(aweme6, EnumC715680S5m.NOT_OVERWRITTEN));
                            sbLIZ4.append(" Prefetch Ongoing or completed = ");
                            sbLIZ4.append(this.LJIIJ.contains(aid) || this.LJIIIZ.contains(aid));
                            C2188811AlT.LIZIZ(sbLIZ4);
                            if (!this.LJIIJ.contains(aid) && !this.LJIIIZ.contains(aid) && LJIIIIZZ(this, aweme6)) {
                                return aweme6;
                            }
                        }
                    } else {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Aweme ");
                        sbLIZ5.append(aweme6.getAid());
                        sbLIZ5.append(": Translatable ");
                        sbLIZ5.append(LJIILIIL().LIZJ(aweme6));
                        sbLIZ5.append(", Translation Enabled ");
                        sbLIZ5.append(LJIILIIL().LJ(aweme6, EnumC715680S5m.NOT_OVERWRITTEN));
                        sbLIZ5.append(" Prefetch Ongoing or completed = ");
                        sbLIZ5.append(this.LJIIJ.contains(aweme6.getAid()) || this.LJIIIZ.contains(aweme6.getAid()));
                        C2188811AlT.LIZIZ(sbLIZ5);
                        if (!this.LJIIJ.contains(aweme6.getAid()) && !this.LJIIIZ.contains(aweme6.getAid()) && LJIIIIZZ(this, aweme6)) {
                            return aweme6;
                        }
                    }
                }
                if (i3 == iLJIIIZ) {
                    return null;
                }
                i3++;
            }
        }
    }

    public final C207136163q LJIILIIL() {
        return (C207136163q) this.LJIIZILJ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.163Q] */
    public C163E(EnumSet<EnumC207101162h> enumSet) {
        this.LIZ = enumSet;
    }

    public static int LJIIIZ(int i) {
        if (!C2367709Pn.LJIIIZ() || !C2521309uN.LIZ) {
            return i;
        }
        int i2 = 0;
        if (C294250Bg7.LIZ() < 4) {
            return 0;
        }
        int i3 = C0SKG.LIZ.lowEndPrefetchCount;
        if (i3 >= 0) {
            i2 = i3;
        }
        if (i2 <= i) {
            return i2;
        }
        return i;
    }

    @Override // X.C162M
    public final void LIZIZ(final Aweme aweme) {
        C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.163F
            /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 534
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C163F.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TranslationPrefetchTaskManagerImpl@2e5a.updateCurrentAweme$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TranslationPrefetchTaskManagerImpl@2e5a.updateCurrentAweme$1");
            }
        });
    }

    @Override // X.C162M
    public final void LIZLLL(final C0RQH c0rqh) {
        C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.14hN
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TranslationPrefetchTaskManagerImpl@2e5a.unblockPrefetch$1");
                try {
                    Runnable runnableRemove = this.LL.LJ.remove(c0rqh);
                    if (runnableRemove != null) {
                        this.LL.LIZIZ.removeCallbacks(runnableRemove);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TranslationPrefetchTaskManagerImpl@2e5a.unblockPrefetch$1");
            }
        });
    }

    @Override // X.C162M
    public final void LJFF(C0RQH c0rqh) {
        LJII(c0rqh, 3000L);
    }

    @Override // X.C162M
    public final EnumC20181313xr LJI(String str) {
        if (this.LJIIIZ.contains(str)) {
            return EnumC20181313xr.IN_FLIGHT;
        }
        if (this.LJIIJJI.contains(str)) {
            return EnumC20181313xr.FAILED;
        }
        if (this.LJIIJ.contains(str)) {
            return EnumC20181313xr.CACHE_HIT;
        }
        return EnumC20181313xr.NOT_STARTED;
    }

    public final void LJIILJJIL(Aweme aweme) {
        String aid = aweme.getAid();
        if (aid != null && !this.LJIIIZ.contains(aid) && !this.LJIIJ.contains(aid)) {
            this.LJIIIZ.add(aid);
            this.LJIIJJI.remove(aid);
            if (!this.LJIILJJIL.contains(aid)) {
                this.LJIILIIL.put(aid, new C0ND9(System.currentTimeMillis()));
            }
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LJIILLIIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TranslationPreload prefetchItem ");
            sbLIZ.append(aid);
            sbLIZ.append(" enterFrom ");
            sbLIZ.append(this.LJFF);
            abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ));
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.LIZLLL.LIZ(C1239300iM4.LJ(LJIILIIL().LIZLLL(true, aweme, null, this.LJFF, EnumC715680S5m.NOT_OVERWRITTEN).LJLJI(this.LIZJ, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()), new AwS240S0300000_31(atomicBoolean, this, aweme, 0), new AwS275S0300000_31(atomicBoolean, this, aweme, 0), new AwS240S0300000_31(atomicBoolean, this, aweme, 1)));
        }
    }

    public final void LJIILLIIL(boolean z) {
        long j;
        if (C294250Bg7.LIZ() >= 3) {
            ClaPrefetchConfig claPrefetchConfig = C0SKG.LIZ;
            if (z) {
                j = claPrefetchConfig.coldStartDelayMs;
            } else {
                j = claPrefetchConfig.swipeDelayMs;
            }
        } else {
            j = 300;
        }
        this.LIZIZ.removeCallbacks(this.LJIILL);
        C786410Ut5.LJLIIL(j, this.LIZIZ, this.LJIILL);
    }

    public static boolean LJIIIIZZ(C163E c163e, Aweme aweme) {
        c163e.getClass();
        String aid = aweme.getAid();
        if (aid != null && C161T.LIZ().LIZ() && c163e.LJIILIIL().LIZJ(aweme) && c163e.LJIILIIL().LJ(aweme, EnumC715680S5m.NOT_OVERWRITTEN) && !c163e.LJIIJ.contains(aid) && !c163e.LJIIIZ.contains(aid)) {
            return true;
        }
        return false;
    }

    @Override // X.C162M
    public final void LIZ(final Aweme aweme, final InterfaceC585880MyQ interfaceC585880MyQ) {
        C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.0MyP
            public final void LIZ() {
                String aid = aweme.getAid();
                if (aid == null) {
                    return;
                }
                List<WeakReference<InterfaceC585880MyQ>> arrayList = this.LJI.get(aid);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                InterfaceC585880MyQ interfaceC585880MyQ2 = interfaceC585880MyQ;
                Iterator<WeakReference<InterfaceC585880MyQ>> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(new WeakReference<>(interfaceC585880MyQ));
                        break;
                    } else if (Intrinsics.LJFF(it2.next().get(), interfaceC585880MyQ2)) {
                        break;
                    }
                }
                this.LJI.put(aid, arrayList);
                if (this.LJIIJ.contains(aid)) {
                    interfaceC585880MyQ.LIZ(aid);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TranslationPrefetchTaskManagerImpl@2e5a.addPrefetchCompletionListener$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TranslationPrefetchTaskManagerImpl@2e5a.addPrefetchCompletionListener$1");
            }
        });
    }

    @Override // X.C162M
    public final void LJ(final Aweme aweme, final InterfaceC585880MyQ interfaceC585880MyQ) {
        C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.0NCE
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                List<WeakReference<InterfaceC585880MyQ>> list;
                C1C7U.LIZ("TranslationPrefetchTaskManagerImpl@2e5a.removePrefetchCompletionListener$1");
                try {
                    String aid = aweme.getAid();
                    if (aid != null && (list = this.LJI.get(aid)) != null) {
                        C19719612Di.LJJIIJ(list, new C0NCF(interfaceC585880MyQ), true);
                        if (list.size() == 0) {
                            this.LJI.remove(aid);
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TranslationPrefetchTaskManagerImpl@2e5a.removePrefetchCompletionListener$1");
            }
        });
    }

    public final void LJII(final C0RQH c0rqh, final long j) {
        C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.14hL
            public final void LIZ() {
                Runnable runnable = this.LL.LJ.get(c0rqh);
                if (runnable != null) {
                    this.LL.LIZIZ.removeCallbacks(runnable);
                }
                final C163E c163e = this.LL;
                final C0RQH c0rqh2 = c0rqh;
                Runnable runnable2 = new Runnable() { // from class: X.14hM
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TranslationPrefetchTaskManagerImpl@2e5a.blockPrefetch$1$runnable$1");
                        try {
                            c163e.LIZLLL(c0rqh2);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TranslationPrefetchTaskManagerImpl@2e5a.blockPrefetch$1$runnable$1");
                    }
                };
                c163e.LJ.put(c0rqh2, runnable2);
                C786410Ut5.LJLIIL(j, this.LL.LIZIZ, runnable2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TranslationPrefetchTaskManagerImpl@2e5a.blockPrefetch$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TranslationPrefetchTaskManagerImpl@2e5a.blockPrefetch$1");
            }
        });
    }

    public final void LJIIJ(Aweme aweme, boolean z) {
        C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS11S0210000_9(aweme, this, z, 0));
    }

    @Override // X.C162M
    public final void LIZJ(final String str, final boolean z, List list) {
        final boolean z2;
        if (C294250Bg7.LIZ() >= 1 && z && this.LJIIL == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (LJIIIZ(C0SKG.LIZ.maxPrefetchNumber) <= 0) {
            C0N5E c0n5eLJIIJJI = LJIIJJI();
            if (c0n5eLJIIJJI.LIZIZ()) {
                ((ArrayList) c0n5eLJIIJJI.LIZIZ).clear();
                return;
            } else {
                c0n5eLJIIJJI.LIZ.clear();
                return;
            }
        }
        if (((Boolean) C1E9C.LJ.getValue()).booleanValue() && !C161T.LIZ().LIZ()) {
            return;
        }
        final ArrayList arrayList = new ArrayList(list);
        C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.163G
            public final void LIZ() {
                int i;
                int i2;
                String aid;
                if (z) {
                    this.LJIIJJI().LIZJ(arrayList);
                } else {
                    C0N5E c0n5eLJIIJJI2 = this.LJIIJJI();
                    ArrayList<Aweme> arrayList2 = arrayList;
                    if (c0n5eLJIIJJI2.LIZIZ()) {
                        List<WeakReference<Aweme>> list2 = c0n5eLJIIJJI2.LIZIZ;
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        Iterator<Aweme> it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(new WeakReference(it2.next()));
                        }
                        ((ArrayList) list2).addAll(arrayList3);
                    } else {
                        c0n5eLJIIJJI2.LIZ.addAll(arrayList2);
                    }
                }
                if (C1E9C.LIZ()) {
                    if (z) {
                        ((ArrayList) this.LJIIIIZZ).clear();
                    }
                    ArrayList<Aweme> arrayList4 = arrayList;
                    C163E c163e = this;
                    for (Aweme aweme : arrayList4) {
                        if (aweme != null && (aid = aweme.getAid()) != null) {
                            ((ArrayList) c163e.LJIIIIZZ).add(aid);
                        }
                    }
                }
                C163E c163e2 = this;
                String str2 = str;
                if (str2 == null) {
                    str2 = "";
                }
                c163e2.LJFF = str2;
                if (!z2) {
                    c163e2.LJIILLIIL(false);
                    return;
                }
                ArrayList<Aweme> arrayList5 = arrayList;
                ClaPrefetchConfig claPrefetchConfig = C0SKG.LIZ;
                int iLJIIIZ = C163E.LJIIIZ(claPrefetchConfig.listReturnPrefetchCount);
                if (C294250Bg7.LIZ() < 1 || (i = claPrefetchConfig.prefetchScanWindow) < iLJIIIZ) {
                    i = iLJIIIZ;
                }
                if (iLJIIIZ > 0) {
                    int i3 = 0;
                    for (Aweme aweme2 : C13LP.LL(arrayList5, i)) {
                        if (i3 < iLJIIIZ) {
                            int size = c163e2.LJIIIZ.size();
                            if (C294250Bg7.LIZ() < 2 || (i2 = C0SKG.LIZ.maxConcurrentPrefetch) < 1) {
                                i2 = 1;
                            }
                            if (size < i2 && C163E.LJIIIIZZ(c163e2, aweme2)) {
                                c163e2.LJIILJJIL(aweme2);
                                i3++;
                            }
                        }
                    }
                }
                this.LJIILLIIL(true);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TranslationPrefetchTaskManagerImpl@2e5a.setAwemeLoadList$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TranslationPrefetchTaskManagerImpl@2e5a.setAwemeLoadList$1");
            }
        });
    }

    public final void LJIILL(Aweme aweme, EnumC1286370jZz enumC1286370jZz, final Integer num) {
        AnonymousClass0175 anonymousClass0175 = new AnonymousClass0175();
        final String str = this.LJFF;
        final String aid = aweme.getAid();
        final String strLIZJ = C0SKF.LIZJ(aweme);
        final String strLLIIZ = C161N.LIZIZ.LLIIZ();
        final String status = enumC1286370jZz.getStatus();
        C207069161b.LIZJ(PrefetchStatusDescTranslEvent.class, null, anonymousClass0175, Collections.singletonList(new InterfaceC0241006d(str, aid, strLIZJ, strLLIIZ, status, num) { // from class: X.006s
            public final String LL;
            public final String LLILLJJLI;
            public final String LLILLL;
            public final String LLILZ;
            public final String LLILZIL;
            public final Integer LLILZLL;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0256006s)) {
                    return false;
                }
                C0256006s c0256006s = (C0256006s) obj;
                return Intrinsics.LJFF(this.LL, c0256006s.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0256006s.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0256006s.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0256006s.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0256006s.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0256006s.LLILZLL);
            }

            public final int hashCode() {
                int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
                Integer num2 = this.LLILZLL;
                return iHashCode + (num2 == null ? 0 : num2.hashCode());
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", this.LL);
                linkedHashMap.put("group_id", this.LLILLJJLI);
                linkedHashMap.put("desc_lang", this.LLILLL);
                linkedHashMap.put("target_lang", this.LLILZ);
                linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LLILZIL);
                linkedHashMap.put("duration", this.LLILZLL);
                return linkedHashMap;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PrefetchDescParams(enterFrom=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", groupId=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", srcLang=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", targetLang=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(", status=");
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(", duration=");
                sbLIZ.append(this.LLILZLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> filteredParams() {
                return keyParams();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                return C2097608Jq.LJ();
            }

            {
                this.LL = str;
                this.LLILLJJLI = aid;
                this.LLILLL = strLIZJ;
                this.LLILZ = strLLIIZ;
                this.LLILZIL = status;
                this.LLILZLL = num;
            }
        }));
    }
}
