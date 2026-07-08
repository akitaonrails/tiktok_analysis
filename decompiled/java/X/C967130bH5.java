package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCohostWillJoinCrashFix;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUserPoolFix;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicSyncUpdateLocalLinkedList;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bH5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C967130bH5 implements InterfaceC958070b2T {
    public final Function0<Long> LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public InterfaceC966930bGl LIZLLL;
    public boolean LJ;
    public Function0<Boolean> LJFF;
    public final C967220bHE LJI;
    public final C967220bHE LJII;
    public final C967220bHE LJIIIIZZ;
    public final C967220bHE LJIIIZ;
    public final C967220bHE LJIIJ;
    public final C967220bHE LJIIJJI;
    public final C967220bHE LJIIL;
    public final C967220bHE LJIILIIL;
    public final C967220bHE LJIILJJIL;
    public final ConcurrentHashMap<Long, Long> LJIILL;
    public final C11NJ LJIILLIIL;
    public final CopyOnWriteArrayList<LinkUser> LJIIZILJ;
    public volatile int LJIJ;
    public volatile List<LinkUser> LJIJI;
    public volatile List<LinkUser> LJIJJ;
    public final CopyOnWriteArrayList<InterfaceC967450bHb> LJIJJLI;
    public final Map<String, Long> LJIL;
    public final C01GW LJJ;

    @Override // X.InterfaceC958070b2T
    @InterfaceC1294060jmO
    public final void LJJJIL() {
    }

    @Override // X.InterfaceC958070b2T
    public final String LJJJJI() {
        return "";
    }

    @Override // X.InterfaceC958070b2T
    public final void LJJJJIZL() {
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> Kh() {
        return LIZ(false);
    }

    public final boolean LJ() {
        Function0<Boolean> function0;
        return (this.LJ || (function0 = this.LJFF) == null || !function0.invoke().booleanValue()) ? false : true;
    }

    @Override // X.InterfaceC920370a3f
    public final int LJJIL() {
        C965900bF6.LIZ(new C967490bHf(this));
        return this.LJIJ;
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LJJJJL() {
        return LIZ(false);
    }

    @Override // X.InterfaceC958070b2T
    public final Long LJJJJLI() {
        Function0<Long> function0 = this.LIZ;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LJJJJLL() {
        List<LinkUser> listLIZ = LIZ(false);
        ArrayList arrayList = new ArrayList();
        for (LinkUser linkUser : listLIZ) {
            Long l = linkUser.userId;
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            if (l == null || l.longValue() != currentUserId) {
                arrayList.add(linkUser);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LJJJJZI() {
        return LIZ(false);
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LIZLLL() {
        return LJ() ? this.LJIJI : LIZ(false);
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LJIIIZ() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC920370a3f
    public final List<LinkUser> LJJJ() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC920370a3f
    public final C13BV LJJJI() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC958070b2T
    public final List<LinkUser> LJJJJJL() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC920370a3f
    public final C13BV LJJJLL() {
        return C13BV.INSTANCE;
    }

    public final void LIZ(int i) {
        C500260Jjc.LJJLIIIJILLIZJL(new C967430bHZ(this, i));
    }

    public final LinkUser LIZJ(Function1<? super LinkUser, Boolean> function1) {
        LinkUser next;
        LinkUser next2;
        LinkUser next3;
        LinkUser linkUser = null;
        if (LJ()) {
            Iterator<LinkUser> it2 = this.LJIJI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                LinkUser next4 = it2.next();
                if (function1.invoke(next4).booleanValue()) {
                    linkUser = next4;
                    break;
                }
            }
            return linkUser;
        }
        Iterator<LinkUser> it3 = LIZ(false).iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (function1.invoke(next).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LinkUser linkUser2 = next;
        if (linkUser2 == null) {
            Iterator<LinkUser> it4 = LIZ(false).iterator();
            while (true) {
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (function1.invoke(next2).booleanValue()) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            linkUser2 = next2;
            if (linkUser2 == null) {
                Iterator<LinkUser> it5 = LIZ(false).iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next3 = it5.next();
                        if (function1.invoke(next3).booleanValue()) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                linkUser2 = next3;
                if (linkUser2 == null) {
                    if (!this.LIZIZ) {
                        return null;
                    }
                    Iterator<LinkUser> it6 = LIZ(false).iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        LinkUser next5 = it6.next();
                        if (function1.invoke(next5).booleanValue()) {
                            linkUser = next5;
                            break;
                        }
                    }
                    return linkUser;
                }
            }
        }
        return linkUser2;
    }

    public final void LJI(List<LinkUser> list) {
        if (C954920axO.LIZ(this.LJIJJ, list)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("liveUsersListFromGroupIM updated value = ");
        sbLIZ.append(list);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), this.LIZJ);
        this.LJIJJ = list;
        if (this.LIZIZ) {
            LIZ(8);
        }
    }

    public final void LJII(List<LinkUser> list) {
        if (C954920axO.LIZ(this.LJIJI, list)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("liveUsersListFromSei updated value = ");
        sbLIZ.append(list);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), this.LIZJ);
        this.LJIJI = LJIIJJI(list, (C967380bHU) this.LJJ.getValue());
        C473410IhP.LIZIZ(new Runnable() { // from class: X.0bHI
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RustUserManager@8cf6.liveUsersListFromSei$1");
                try {
                    C967130bH5 c967130bH5 = this.LL;
                    Iterator<InterfaceC967450bHb> it2 = c967130bH5.LJIJJLI.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJJJJZI(c967130bH5.LJIJI);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RustUserManager@8cf6.liveUsersListFromSei$1");
            }
        });
    }

    public final void LJIIIIZZ(LinkUser linkUser) {
        this.LJIIZILJ.add(linkUser);
    }

    @Override // X.InterfaceC958070b2T
    public final LinkUser LJIIJ(String str) {
        C967180bHA c967180bHALJJLL;
        LinkUser linkUserLJJIFFI = LJJIFFI(str);
        if (linkUserLJJIFFI == null) {
            InterfaceC966930bGl interfaceC966930bGl = this.LIZLLL;
            if (interfaceC966930bGl != null && (c967180bHALJJLL = interfaceC966930bGl.LJJLL(str)) != null) {
                return C1282000jSw.LJ(c967180bHALJJLL);
            }
            return null;
        }
        return linkUserLJJIFFI;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    @Override // X.InterfaceC958070b2T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.InterfaceC940430aa1 r10) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C967130bH5.LJIL(X.0aa1):void");
    }

    @Override // X.InterfaceC958070b2T
    public final LinkUser LJJIFFI(String str) {
        return LIZJ(new C967400bHW(str));
    }

    @Override // X.InterfaceC958070b2T
    public final LinkUser LJJIJL(long j) {
        return LIZJ(new C967410bHX(j));
    }

    @Override // X.InterfaceC958070b2T
    public final LinkUser LJJIZ(String str) {
        LinkUser next;
        List<LinkUser> list = this.LJIJI;
        if (list != null) {
            Iterator<LinkUser> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.linkMicId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LinkUser linkUser = next;
            if (linkUser != null) {
                return linkUser;
            }
        }
        return LJJIFFI(str);
    }

    @Override // X.InterfaceC958070b2T
    public final LinkUser LJJJJ(long j) {
        LinkUser next;
        List<LinkUser> list = this.LJIJI;
        if (list != null) {
            Iterator<LinkUser> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Long l = next.userId;
                    if (l != null && l.longValue() == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LinkUser linkUser = next;
            if (linkUser != null) {
                return linkUser;
            }
        }
        return LJJIJL(j);
    }

    @Override // X.InterfaceC958070b2T
    public final void LJJJJZ(List<LinkUser> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLocalLinkedListForAudience linkedList:");
        sbLIZ.append(list);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), this.LIZJ);
        if (!this.LJIJJ.isEmpty()) {
            list = LJIIJJI(list, new C967340bHQ());
        }
        LJI(list);
    }

    @Override // X.InterfaceC958070b2T
    public final long LJJJLIIL(long j) {
        Long lLJLJJL;
        if (LinkMicCohostWillJoinCrashFix.INSTANCE.enable()) {
            Long l = this.LJIILL.get(Long.valueOf(j));
            if (l == null) {
                return 0L;
            }
            return l.longValue();
        }
        InterfaceC966930bGl interfaceC966930bGl = this.LIZLLL;
        if (interfaceC966930bGl == null || (lLJLJJL = interfaceC966930bGl.LJLJJL(j)) == null) {
            return 0L;
        }
        return lLJLJJL.longValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0bHE] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0bHE] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0bHE] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0bHE] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0bHE] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0bHE] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0bHE] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0bHE] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.0bHE] */
    public C967130bH5(int i, C966880bGg c966880bGg) {
        boolean z;
        this.LIZ = c966880bGg;
        if (i != 2 && i != 0) {
            z = false;
        } else {
            z = true;
        }
        this.LIZIZ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1283930jW3.LJI(i));
        sbLIZ.append("UserManager[Biz]");
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        final C967110bH3 c967110bH3 = new C967110bH3(this);
        this.LJI = new AbstractC967230bHF<LinkUser>(c967110bH3) { // from class: X.0bHE
            public final Function0<List<C967180bHA>> LIZJ;

            @Override // X.AbstractC967230bHF
            public final List<LinkUser> LIZJ() {
                Collection<? extends LinkUser> collection = this.LIZIZ;
                List<C967180bHA> listInvoke = this.LIZJ.invoke();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                Iterator<T> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1282000jSw.LJ((C967180bHA) it2.next()));
                }
                if (!LinkMicUserPoolFix.INSTANCE.enable()) {
                    synchronized (C967420bHY.LIZ) {
                        C967420bHY.LIZIZ.addAll(collection);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZJ = c967110bH3;
            }
        };
        final C967120bH4 c967120bH4 = new C967120bH4(this);
        this.LJII = new AbstractC967230bHF<LinkUser>(c967120bH4) { // from class: X.0bHE
            public final Function0<List<C967180bHA>> LIZJ;

            @Override // X.AbstractC967230bHF
            public final List<LinkUser> LIZJ() {
                Collection<? extends LinkUser> collection = this.LIZIZ;
                List<C967180bHA> listInvoke = this.LIZJ.invoke();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                Iterator<T> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1282000jSw.LJ((C967180bHA) it2.next()));
                }
                if (!LinkMicUserPoolFix.INSTANCE.enable()) {
                    synchronized (C967420bHY.LIZ) {
                        C967420bHY.LIZIZ.addAll(collection);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZJ = c967120bH4;
            }
        };
        final C966960bGo c966960bGo = new C966960bGo(this);
        this.LJIIIIZZ = new AbstractC967230bHF<LinkUser>(c966960bGo) { // from class: X.0bHE
            public final Function0<List<C967180bHA>> LIZJ;

            @Override // X.AbstractC967230bHF
            public final List<LinkUser> LIZJ() {
                Collection<? extends LinkUser> collection = this.LIZIZ;
                List<C967180bHA> listInvoke = this.LIZJ.invoke();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                Iterator<T> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1282000jSw.LJ((C967180bHA) it2.next()));
                }
                if (!LinkMicUserPoolFix.INSTANCE.enable()) {
                    synchronized (C967420bHY.LIZ) {
                        C967420bHY.LIZIZ.addAll(collection);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZJ = c966960bGo;
            }
        };
        final C967050bGx c967050bGx = new C967050bGx(this);
        this.LJIIIZ = new AbstractC967230bHF<LinkUser>(c967050bGx) { // from class: X.0bHE
            public final Function0<List<C967180bHA>> LIZJ;

            @Override // X.AbstractC967230bHF
            public final List<LinkUser> LIZJ() {
                Collection<? extends LinkUser> collection = this.LIZIZ;
                List<C967180bHA> listInvoke = this.LIZJ.invoke();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                Iterator<T> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1282000jSw.LJ((C967180bHA) it2.next()));
                }
                if (!LinkMicUserPoolFix.INSTANCE.enable()) {
                    synchronized (C967420bHY.LIZ) {
                        C967420bHY.LIZIZ.addAll(collection);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZJ = c967050bGx;
            }
        };
        final C967070bGz c967070bGz = new C967070bGz(this);
        this.LJIIJ = new AbstractC967230bHF<LinkUser>(c967070bGz) { // from class: X.0bHE
            public final Function0<List<C967180bHA>> LIZJ;

            @Override // X.AbstractC967230bHF
            public final List<LinkUser> LIZJ() {
                Collection<? extends LinkUser> collection = this.LIZIZ;
                List<C967180bHA> listInvoke = this.LIZJ.invoke();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                Iterator<T> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1282000jSw.LJ((C967180bHA) it2.next()));
                }
                if (!LinkMicUserPoolFix.INSTANCE.enable()) {
                    synchronized (C967420bHY.LIZ) {
                        C967420bHY.LIZIZ.addAll(collection);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZJ = c967070bGz;
            }
        };
        final C967060bGy c967060bGy = new C967060bGy(this);
        this.LJIIJJI = new AbstractC967230bHF<LinkUser>(c967060bGy) { // from class: X.0bHE
            public final Function0<List<C967180bHA>> LIZJ;

            @Override // X.AbstractC967230bHF
            public final List<LinkUser> LIZJ() {
                Collection<? extends LinkUser> collection = this.LIZIZ;
                List<C967180bHA> listInvoke = this.LIZJ.invoke();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                Iterator<T> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1282000jSw.LJ((C967180bHA) it2.next()));
                }
                if (!LinkMicUserPoolFix.INSTANCE.enable()) {
                    synchronized (C967420bHY.LIZ) {
                        C967420bHY.LIZIZ.addAll(collection);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZJ = c967060bGy;
            }
        };
        final C967090bH1 c967090bH1 = new C967090bH1(this);
        this.LJIIL = new AbstractC967230bHF<LinkUser>(c967090bH1) { // from class: X.0bHE
            public final Function0<List<C967180bHA>> LIZJ;

            @Override // X.AbstractC967230bHF
            public final List<LinkUser> LIZJ() {
                Collection<? extends LinkUser> collection = this.LIZIZ;
                List<C967180bHA> listInvoke = this.LIZJ.invoke();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                Iterator<T> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1282000jSw.LJ((C967180bHA) it2.next()));
                }
                if (!LinkMicUserPoolFix.INSTANCE.enable()) {
                    synchronized (C967420bHY.LIZ) {
                        C967420bHY.LIZIZ.addAll(collection);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZJ = c967090bH1;
            }
        };
        final C967080bH0 c967080bH0 = new C967080bH0(this);
        this.LJIILIIL = new AbstractC967230bHF<LinkUser>(c967080bH0) { // from class: X.0bHE
            public final Function0<List<C967180bHA>> LIZJ;

            @Override // X.AbstractC967230bHF
            public final List<LinkUser> LIZJ() {
                Collection<? extends LinkUser> collection = this.LIZIZ;
                List<C967180bHA> listInvoke = this.LIZJ.invoke();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                Iterator<T> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1282000jSw.LJ((C967180bHA) it2.next()));
                }
                if (!LinkMicUserPoolFix.INSTANCE.enable()) {
                    synchronized (C967420bHY.LIZ) {
                        C967420bHY.LIZIZ.addAll(collection);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZJ = c967080bH0;
            }
        };
        final C967100bH2 c967100bH2 = new C967100bH2(this);
        this.LJIILJJIL = new AbstractC967230bHF<LinkUser>(c967100bH2) { // from class: X.0bHE
            public final Function0<List<C967180bHA>> LIZJ;

            @Override // X.AbstractC967230bHF
            public final List<LinkUser> LIZJ() {
                Collection<? extends LinkUser> collection = this.LIZIZ;
                List<C967180bHA> listInvoke = this.LIZJ.invoke();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                Iterator<T> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1282000jSw.LJ((C967180bHA) it2.next()));
                }
                if (!LinkMicUserPoolFix.INSTANCE.enable()) {
                    synchronized (C967420bHY.LIZ) {
                        C967420bHY.LIZIZ.addAll(collection);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZJ = c967100bH2;
            }
        };
        final C967030bGv c967030bGv = new C967030bGv(this);
        new AbstractC967230bHF<LinkUser>(c967030bGv) { // from class: X.0bHE
            public final Function0<List<C967180bHA>> LIZJ;

            @Override // X.AbstractC967230bHF
            public final List<LinkUser> LIZJ() {
                Collection<? extends LinkUser> collection = this.LIZIZ;
                List<C967180bHA> listInvoke = this.LIZJ.invoke();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                Iterator<T> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1282000jSw.LJ((C967180bHA) it2.next()));
                }
                if (!LinkMicUserPoolFix.INSTANCE.enable()) {
                    synchronized (C967420bHY.LIZ) {
                        C967420bHY.LIZIZ.addAll(collection);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZJ = c967030bGv;
            }
        };
        final C967040bGw c967040bGw = new C967040bGw(this);
        new AbstractC967230bHF<LinkUser>(c967040bGw) { // from class: X.0bHE
            public final Function0<List<C967180bHA>> LIZJ;

            @Override // X.AbstractC967230bHF
            public final List<LinkUser> LIZJ() {
                Collection<? extends LinkUser> collection = this.LIZIZ;
                List<C967180bHA> listInvoke = this.LIZJ.invoke();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                Iterator<T> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C1282000jSw.LJ((C967180bHA) it2.next()));
                }
                if (!LinkMicUserPoolFix.INSTANCE.enable()) {
                    synchronized (C967420bHY.LIZ) {
                        C967420bHY.LIZIZ.addAll(collection);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZJ = c967040bGw;
            }
        };
        this.LJIILL = new ConcurrentHashMap<>();
        this.LJIILLIIL = new C11NJ();
        this.LJIIZILJ = new CopyOnWriteArrayList<>();
        C13BV c13bv = C13BV.INSTANCE;
        this.LJIJI = c13bv;
        this.LJIJJ = c13bv;
        this.LJIJJLI = new CopyOnWriteArrayList<>();
        this.LJIL = new ConcurrentHashMap();
        this.LJJ = C452501pT.LIZIZ(new C968240bIs());
    }

    public final void LIZIZ(EnumC2231411CVf enumC2231411CVf, List<LinkUser> list) {
        if (enumC2231411CVf == EnumC2231411CVf.GroupListChangeIm && LJ() && enumC2231411CVf != null) {
            LJI(LJIIJJI(list, new C967480bHe()));
        }
    }

    public final void LJFF(String str, boolean z) {
        LinkUser next;
        Iterator<LinkUser> it2 = LIZ(false).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.linkMicId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LinkUser linkUser = next;
        if (linkUser != null) {
            linkUser.setAudioSwitchOn(!z);
        }
    }

    public final List<LinkUser> LJIIJJI(List<LinkUser> list, Function2<? super LinkUser, ? super LinkUser, LinkUser> function2) {
        if (this.LIZIZ) {
            List<LinkUser> list2 = this.LJIJJ;
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (LinkUser linkUser : list2) {
                linkedHashMap.put(linkUser.linkMicId, linkUser);
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (LinkUser linkUser2 : list) {
                arrayList.add(function2.invoke(linkUser2, linkedHashMap.get(linkUser2.linkMicId)));
            }
            return arrayList;
        }
        return list;
    }

    @Override // X.InterfaceC958070b2T
    public final void LJJJJJ(List list, InterfaceC967450bHb interfaceC967450bHb) {
        ArrayList arrayList = new ArrayList(LIZ(false));
        String str = this.LIZJ;
        StringBuilder sb = new StringBuilder("updateLocalLinkedList, old:");
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((LinkUser) it2.next()).linkMicId);
        }
        sb.append(arrayList2);
        sb.append(", new:");
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((LinkUser) it3.next()).linkMicId);
        }
        sb.append(arrayList3);
        C969080bKE.LIZIZ(str, sb.toString());
        C500260Jjc.LJJLIIIJILLIZJL(new C967350bHR(this, arrayList, list));
        final C967190bHB c967190bHB = new C967190bHB(this, list, interfaceC967450bHb, arrayList);
        if (!LinkMicSyncUpdateLocalLinkedList.isEnable()) {
            C19487311Lz.LIZ(new C11IW(C11NZ.LJLJJLL(0, TimeUnit.SECONDS).LJL(C1701940uOG.LIZIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0bHy
                @Override // X.InterfaceC781210Ukh
                public final /* synthetic */ void run() {
                    c967190bHB.invoke();
                }
            }).LJJIJIIJI(new C09JN() { // from class: X.0bDf
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("RustUserManager@8cf6.updateLocalLinkedList$4");
                    try {
                        new RunnableC964990bDd(this.LL.LIZJ, (Throwable) obj).run();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1CC2.LIZ("LinkMicSdkLogger Error", th);
                    }
                    C1C7U.LIZIZ("RustUserManager@8cf6.updateLocalLinkedList$4");
                }
            })).LJIILL(), this.LJIILLIIL, null, null, 30);
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(new C968230bIr(c967190bHB));
        }
    }
}
