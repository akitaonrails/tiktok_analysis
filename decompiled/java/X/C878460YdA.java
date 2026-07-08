package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0YdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878460YdA implements InterfaceC884250YmV {
    public static final C01GW<InterfaceC497601wk> LJIIJJI = C452501pT.LIZIZ(new C878490YdD());
    public final String LIZ = "ChatListConversationDataSource";
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C878500YdE());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C878530YdH());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C878510YdF());
    public final C01GW LJ = C452501pT.LIZIZ(new C878520YdG());
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(15));
    public final C879040Ye6 LJI = new C879040Ye6(new AwS558S0100000_14(this, 20));
    public final ConcurrentHashMap<InterfaceC879010Ye3, Runnable> LJII = new ConcurrentHashMap<>();
    public final AtomicReference<Runnable> LJIIIIZZ = new AtomicReference<>(null);
    public boolean LJIIIZ;
    public boolean LJIIJ;

    @Override // X.InterfaceC884250YmV
    public final boolean LJIIIIZZ() {
        return true;
    }

    public final ConcurrentHashMap<C878470YdB, C878420Yd6> LJIILJJIL() {
        return (ConcurrentHashMap) this.LJ.getValue();
    }

    @Override // X.InterfaceC884250YmV
    public final ConcurrentHashMap<InterfaceC878560YdK, CopyOnWriteArrayList<InterfaceC878540YdI>> LJIILL() {
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC884250YmV
    public final void init() {
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (C881500Yi4.LJ() != null) {
            AbstractC883730Ylf.LJJI(Collections.singletonList(this.LJI));
        }
    }

    @Override // X.InterfaceC884250YmV
    public final void LIZJ() {
        C2296808zG.LIZJ(C878360Yd0.LIZ(), null);
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (C881500Yi4.LJ() != null) {
            AbstractC883730Ylf.LJJIFFI(Collections.singletonList(this.LJI));
        }
        ((ConcurrentHashMap) this.LIZJ.getValue()).clear();
        ((ConcurrentHashMap) this.LIZLLL.getValue()).clear();
        LJIILJJIL().clear();
        LJIILL().clear();
        ((ConcurrentHashMap) this.LJFF.getValue()).clear();
        this.LJII.clear();
        this.LJIIIIZZ.set(null);
    }

    @Override // X.InterfaceC884250YmV
    public final void LJIILIIL() {
        LJIILL().clear();
    }

    @Override // X.InterfaceC884250YmV
    public final String getTag() {
        return this.LIZ;
    }

    @Override // X.InterfaceC884250YmV
    public final void LJ(InterfaceC878560YdK interfaceC878560YdK) {
        if (!(interfaceC878560YdK instanceof C878470YdB)) {
            return;
        }
        C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
        C878470YdB c878470YdB = (C878470YdB) interfaceC878560YdK;
        C0YM2 c0ym2 = c878470YdB.LIZ.LL;
        c0ysq.getClass();
        InterfaceC876950Yaj interfaceC876950YajLIZ = C0YSQ.LIZ(c0ym2);
        C0Y6L c0y6l = (C0Y6L) ((ConcurrentHashMap) this.LIZJ.getValue()).remove(interfaceC878560YdK);
        if (c0y6l != null) {
            interfaceC876950YajLIZ.LJIIL(c0y6l);
        }
        InterfaceC866830XzV interfaceC866830XzV = (InterfaceC866830XzV) ((ConcurrentHashMap) this.LIZLLL.getValue()).remove(interfaceC878560YdK);
        if (interfaceC866830XzV != null) {
            interfaceC876950YajLIZ.LJJIJIIJIL(interfaceC866830XzV);
        }
        LJIILJJIL().remove(interfaceC878560YdK);
        ((ConcurrentHashMap) this.LJFF.getValue()).remove(c878470YdB.LIZ);
        this.LJII.remove(c878470YdB.LIZ);
    }

    @Override // X.InterfaceC884250YmV
    public final void LJII(InterfaceC878560YdK interfaceC878560YdK) {
        if (!(interfaceC878560YdK instanceof C878470YdB)) {
            return;
        }
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageShow, tab=");
        C878470YdB c878470YdB = (C878470YdB) interfaceC878560YdK;
        sbLIZ.append(c878470YdB.LIZ.LLILLL);
        sbLIZ.append(", page=");
        sbLIZ.append(c878470YdB.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str);
        if (C880900Yh6.LIZIZ()) {
            C1729806q0.LIZJ(c878470YdB.LIZ, new AwS415S0200000_14(this, interfaceC878560YdK, 1));
        }
    }

    @Override // X.InterfaceC884250YmV
    public final void LJIIIZ(InterfaceC878560YdK interfaceC878560YdK) {
        if (!(interfaceC878560YdK instanceof C878470YdB)) {
            return;
        }
        C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
        final C878470YdB c878470YdB = (C878470YdB) interfaceC878560YdK;
        C0YM2 c0ym2 = c878470YdB.LIZ.LL;
        c0ysq.getClass();
        InterfaceC876950Yaj interfaceC876950YajLIZ = C0YSQ.LIZ(c0ym2);
        C0Y6L c0y6l = new C0Y6L(this) { // from class: X.0Yd2
            public final /* synthetic */ C878460YdA LLILLJJLI;

            @Override // X.C0Y6L
            public final void LIZ() {
            }

            @Override // X.C0Y6L
            @InterfaceC1294060jmO
            public final void LIZJ() {
            }

            {
                this.LLILLJJLI = this;
            }

            @Override // X.C0Y6L
            public final void LIZLLL(C0Y6X c0y6x, C0Y69 c0y69) {
                C878390Yd3 c878390Yd3 = c878470YdB.LIZJ;
                String str = c0y6x.LIZ.LIZ;
                c878390Yd3.getClass();
                if (a0.LJJIIZI(str, "legacy", false)) {
                    C309160C9y.LIZIZ(this.LLILLJJLI.LIZ);
                    return;
                }
                C878390Yd3 c878390Yd32 = c878470YdB.LIZJ;
                String str2 = c0y6x.LIZ.LIZ;
                c878390Yd32.getClass();
                Set<String> set = C869290Y8h.LJIIL;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (a0.LJJIIZI(str2, (String) it2.next(), false)) {
                            C878460YdA c878460YdA = this.LLILLJJLI;
                            C878470YdB c878470YdB2 = c878470YdB;
                            c878460YdA.getClass();
                            C1729806q0.LIZ(c878470YdB2.LIZ, new C878340Ycy(c0y69, c0y6x, c878460YdA, c878470YdB2, null));
                            return;
                        }
                    }
                }
                if (Intrinsics.LJFF(c0y6x.LIZ.LIZ, "query_all_archive_for_entrance_info")) {
                    C878470YdB c878470YdB3 = c878470YdB;
                    C1729806q0.LIZ(c878470YdB3.LIZ, new C878400Yd4(this.LLILLJJLI, c0y6x, c878470YdB3, null));
                    return;
                }
                C878470YdB c878470YdB4 = c878470YdB;
                C878390Yd3 c878390Yd33 = c878470YdB4.LIZJ;
                String str3 = c0y6x.LIZ.LIZ;
                C878950Ydx c878950Ydx = c878470YdB4.LIZ;
                c878390Yd33.getClass();
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{":"}, 0, 6);
                if ((listLJJLIIIJILLIZJL instanceof Collection) && listLJJLIIIJILLIZJL.isEmpty()) {
                    return;
                }
                Iterator it3 = listLJJLIIIJILLIZJL.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(it3.next(), c878950Ydx.toString())) {
                        C878470YdB c878470YdB5 = c878470YdB;
                        C1729806q0.LIZ(c878470YdB5.LIZ, new C878410Yd5(c0y69, c0y6x, this.LLILLJJLI, c878470YdB5, null));
                        return;
                    }
                }
            }
        };
        ((ConcurrentHashMap) this.LIZJ.getValue()).put(interfaceC878560YdK, c0y6l);
        interfaceC876950YajLIZ.LJJIFFI(c0y6l);
        C878450Yd9 c878450Yd9 = new C878450Yd9(this, c878470YdB);
        ((ConcurrentHashMap) this.LIZLLL.getValue()).put(interfaceC878560YdK, c878450Yd9);
        interfaceC876950YajLIZ.LJI(c878450Yd9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC884250YmV
    public final void LJIIJJI(InterfaceC878560YdK interfaceC878560YdK) {
        C878420Yd6 c878420Yd6PutIfAbsent;
        if (!(interfaceC878560YdK instanceof C878470YdB)) {
            return;
        }
        ConcurrentHashMap<C878470YdB, C878420Yd6> concurrentHashMapLJIILJJIL = LJIILJJIL();
        C878420Yd6 c878420Yd6 = concurrentHashMapLJIILJJIL.get(interfaceC878560YdK);
        if (c878420Yd6 == null && (c878420Yd6PutIfAbsent = concurrentHashMapLJIILJJIL.putIfAbsent(interfaceC878560YdK, (c878420Yd6 = new C878420Yd6()))) != null) {
            c878420Yd6 = c878420Yd6PutIfAbsent;
        }
        C878420Yd6 c878420Yd62 = c878420Yd6;
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageHide, tab=");
        C878470YdB c878470YdB = (C878470YdB) interfaceC878560YdK;
        sbLIZ.append(c878470YdB.LIZ.LLILLL);
        sbLIZ.append(", page=");
        sbLIZ.append(c878470YdB.LIZ);
        sbLIZ.append(", loadingState: ");
        sbLIZ.append(c878420Yd62);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str);
        if (C880900Yh6.LIZIZ()) {
            c878420Yd62.LIZIZ = true;
        } else {
            if (c878420Yd62.LIZ == null) {
                return;
            }
            c878420Yd62.LIZIZ = true;
        }
    }

    @Override // X.InterfaceC884250YmV
    public final void LJIIL(InterfaceC878560YdK interfaceC878560YdK) {
        C878580YdM.LIZIZ(this, interfaceC878560YdK);
    }

    public static C879540Yeu LJIILLIIL(C0Y8T c0y8t, C0YM2 c0ym2) {
        InterfaceC1490905sZ interfaceC1490905sZ;
        if (C882340YjQ.LIZLLL(c0y8t)) {
            interfaceC1490905sZ = C1606106Qp.INSTANCE;
        } else if (c0y8t.isSingleChat()) {
            interfaceC1490905sZ = C882110Yj3.INSTANCE;
        } else {
            if (c0y8t.isGroupChat()) {
                interfaceC1490905sZ = C1606306Qr.INSTANCE;
            }
            return null;
        }
        if (interfaceC1490905sZ != null) {
            return new C879540Yeu(interfaceC1490905sZ, new AnonymousClass0617(c0ym2, c0y8t.getConversationId()), c0y8t);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C878470YdB r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C878370Yd1
            if (r0 == 0) goto L72
            r3 = r7
            X.0Yd1 r3 = (X.C878370Yd1) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L33
            if (r0 != r4) goto L78
            X.C155000ia.LIZIZ(r1)
        L22:
            java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> r1 = r5.LJIIIIZZ
            r0 = 0
            java.lang.Object r0 = r1.getAndSet(r0)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L30
            r0.run()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            X.C155000ia.LIZIZ(r1)
            X.0Ydx r1 = r6.LIZ
            X.0Yi4 r0 = X.AbstractC883730Ylf.LJIIIIZZ
            r0.getClass()
            X.0Ydx r0 = X.C881500Yi4.LIZLLL()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L4a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4a:
            Y.ARunnableS114S0100000_14 r1 = new Y.ARunnableS114S0100000_14
            r0 = 2
            r1.<init>(r6, r0)
            boolean r0 = r5.LJIIIZ
            if (r0 == 0) goto L58
            r1.run()
            goto L30
        L58:
            java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> r0 = r5.LJIIIIZZ
            r0.set(r1)
            X.01GW r0 = X.C0A35.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r3.LLILLL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r3)
            if (r0 != r2) goto L22
            return r2
        L72:
            X.0Yd1 r3 = new X.0Yd1
            r3.<init>(r5, r7)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C878460YdA.LIZ(X.0YdB, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC884250YmV
    public final void LIZLLL(InterfaceC878560YdK interfaceC878560YdK, List<? extends InterfaceC878540YdI> list) {
        C878580YdM.LIZ(this, interfaceC878560YdK, list);
    }

    @Override // X.InterfaceC884250YmV
    public final void LJFF(InterfaceC878560YdK interfaceC878560YdK, String str) {
        String str2 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh, page=");
        sbLIZ.append(interfaceC878560YdK.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        if (!(interfaceC878560YdK instanceof C878470YdB)) {
            return;
        }
        if (!Intrinsics.LJFF(str, "back_to_page_refresh")) {
            C0YOP.LIZ("inbox_refresh", false, 0, null, 30);
        }
        CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = LJIILL().get(interfaceC878560YdK);
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC878540YdI> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(((C878470YdB) interfaceC878560YdK).LIZ, C878360Yd0.LIZIZ(this.LIZ, "refresh"));
            }
        }
    }

    public final C878550YdJ LJIIJ(C878470YdB c878470YdB, C878550YdJ c878550YdJ) {
        Long lValueOf;
        AbstractC877620Ybo abstractC877620Ybo;
        C877610Ybn c877610Ybn;
        C877600Ybm c877600Ybm;
        C877610Ybn c877610Ybn2;
        C878550YdJ c878550YdJ2 = (C878550YdJ) ((ConcurrentHashMap) this.LJFF.getValue()).get(c878470YdB.LIZ);
        AbstractC877620Ybo abstractC877620Ybo2 = c878550YdJ.LIZIZ.LIZ;
        Long lValueOf2 = null;
        if ((abstractC877620Ybo2 instanceof C877610Ybn) && (c877610Ybn2 = (C877610Ybn) abstractC877620Ybo2) != null) {
            lValueOf = Long.valueOf(c877610Ybn2.LIZ);
        } else {
            lValueOf = null;
        }
        if (c878550YdJ2 != null && (c877600Ybm = c878550YdJ2.LIZIZ) != null) {
            abstractC877620Ybo = c877600Ybm.LIZ;
        } else {
            abstractC877620Ybo = null;
        }
        if ((abstractC877620Ybo instanceof C877610Ybn) && (c877610Ybn = (C877610Ybn) abstractC877620Ybo) != null) {
            lValueOf2 = Long.valueOf(c877610Ybn.LIZ);
        }
        if (lValueOf != null && lValueOf2 != null && lValueOf.longValue() > lValueOf2.longValue()) {
            String str = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip cursor regression on page=");
            sbLIZ.append(c878470YdB.LIZ);
            sbLIZ.append(", newCursor=");
            sbLIZ.append(lValueOf);
            sbLIZ.append(" > lastCursor=");
            sbLIZ.append(lValueOf2);
            sbLIZ.append(", newHasMore=");
            sbLIZ.append(c878550YdJ.LIZ);
            sbLIZ.append(", advancedHasMore=");
            sbLIZ.append(c878550YdJ2.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C309160C9y.LIZLLL(str);
            c878550YdJ = new C878550YdJ(c878550YdJ2.LIZ, c878550YdJ2.LIZIZ, false);
        }
        ((ConcurrentHashMap) this.LJFF.getValue()).put(c878470YdB.LIZ, c878550YdJ);
        return c878550YdJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.05Vn, X.099V, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final void LIZIZ(C0Y6X c0y6x, C878470YdB c878470YdB, C0Y6P c0y6p) {
        boolean z;
        boolean z2;
        ?? r6;
        int iIntValue;
        Map map;
        Map map2;
        Integer num;
        ArrayList arrayList;
        long sortOrder;
        long sortOrder2;
        C0Y8T c0y8t;
        C0Y8T c0y8t2;
        C878420Yd6 c878420Yd6PutIfAbsent;
        boolean z3 = c0y6x.LIZ.LJIIJJI;
        C878950Ydx c878950Ydx = c878470YdB.LIZ;
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (Intrinsics.LJFF(c878950Ydx, C881500Yi4.LIZLLL()) && C881500Yi4.LJFF(c0y6x.LIZ.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        C0Z79 c0z79LIZ = C1492305sn.LIZ();
        if (c0z79LIZ.LIZLLL(c878470YdB.LIZ, z3)) {
            c0z79LIZ.LJIJI(System.currentTimeMillis());
            int size = c0y6x.LIZIZ.size();
            if (!c0z79LIZ.LJIILJJIL().get()) {
                c0z79LIZ.LIZJ.LIZIZ = size;
            }
            Iterator<C0Y8T> it2 = c0y6x.LIZIZ.iterator();
            long unreadCount = 0;
            while (it2.hasNext()) {
                unreadCount += it2.next().getUnreadCount();
            }
            int i = (int) unreadCount;
            if (!c0z79LIZ.LJIILJJIL().get()) {
                c0z79LIZ.LIZJ.LIZJ = i;
            }
        }
        if (z) {
            C885850Yp5 c885850Yp5 = C885850Yp5.LIZ;
            int size2 = c0y6x.LIZIZ.size();
            c885850Yp5.getClass();
            ((C563400M7u) C885850Yp5.LJIIJ.getValue()).LJ(size2);
            C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
            C0YM2 c0ym2 = c878470YdB.LIZ.LL;
            c0ysq.getClass();
            C0YSQ.LIZ(c0ym2).LJJIJIIJI(c0y6x);
        }
        ConcurrentHashMap<C878470YdB, C878420Yd6> concurrentHashMapLJIILJJIL = LJIILJJIL();
        C878420Yd6 c878420Yd6 = concurrentHashMapLJIILJJIL.get(c878470YdB);
        if (c878420Yd6 == null && (c878420Yd6PutIfAbsent = concurrentHashMapLJIILJJIL.putIfAbsent(c878470YdB, (c878420Yd6 = new C878420Yd6()))) != null) {
            c878420Yd6 = c878420Yd6PutIfAbsent;
        }
        c878420Yd6.LIZ = null;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = c0y6x.LIZLLL;
        boolean z4 = false;
        int i2 = 0;
        for (C0Y8T c0y8t3 : c0y6x.LIZIZ) {
            if (!z4 && arrayList2.size() >= c878470YdB.LIZLLL) {
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    T t = ((C879540Yeu) it3.next()).LIZJ;
                    if ((t instanceof C0Y8T) && (c0y8t2 = (C0Y8T) t) != null) {
                        sortOrder = c0y8t2.getSortOrder();
                    } else {
                        sortOrder = Long.MAX_VALUE;
                    }
                    Long lValueOf = Long.valueOf(sortOrder);
                    while (it3.hasNext()) {
                        T t2 = ((C879540Yeu) it3.next()).LIZJ;
                        if ((t2 instanceof C0Y8T) && (c0y8t = (C0Y8T) t2) != null) {
                            sortOrder2 = c0y8t.getSortOrder();
                        } else {
                            sortOrder2 = Long.MAX_VALUE;
                        }
                        Long lValueOf2 = Long.valueOf(sortOrder2);
                        if (lValueOf.compareTo(lValueOf2) > 0) {
                            lValueOf = lValueOf2;
                        }
                    }
                    c238400w2.element = lValueOf.longValue();
                    z4 = true;
                } else {
                    throw new NoSuchElementException();
                }
            }
            C878670YdV.LIZ.getClass();
            if (!C878670YdV.LIZIZ(c0y8t3)) {
                if (arrayList2.size() < c878470YdB.LIZLLL) {
                    i2++;
                }
            } else if (C878670YdV.LIZ(c0y8t3)) {
                arrayList5.add(c0y8t3);
                C879540Yeu c879540YeuLJIILLIIL = LJIILLIIL(c0y8t3, c878470YdB.LIZ.LL);
                if (c879540YeuLJIILLIIL != null) {
                    arrayList4.add(c879540YeuLJIILLIIL);
                } else {
                    c879540YeuLJIILLIIL = null;
                }
                Set<EnumC880480YgQ> set = C880490YgR.LLILLL;
                C877210Yb9 c877210Yb9 = c878470YdB.LIZIZ;
                if (C880370YgF.LJFF(c0y8t3, c877210Yb9.LIZ, c877210Yb9.LIZIZ) && c879540YeuLJIILLIIL != null && arrayList2.size() < c878470YdB.LIZLLL) {
                    arrayList2.add(c879540YeuLJIILLIIL);
                    arrayList3.add(c0y8t3);
                }
            }
        }
        ((C0Y69) c0y6p).LIZ(arrayList3);
        if (z) {
            C885850Yp5 c885850Yp52 = C885850Yp5.LIZ;
            int size3 = arrayList3.size();
            c885850Yp52.getClass();
            ((C563400M7u) C885850Yp5.LJIIJJI.getValue()).LJ(size3);
            ((C563400M7u) C885850Yp5.LJIIL.getValue()).LJ(i2);
        }
        C0Z79 c0z79LIZ2 = C1492305sn.LIZ();
        if (c0z79LIZ2.LIZLLL(c878470YdB.LIZ, z3)) {
            c0z79LIZ2.LJIJ(System.currentTimeMillis());
        }
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("after solvePreloadResult, seqId=");
        sbLIZ.append(c0y6x.LIZ.LIZ);
        sbLIZ.append(", isInitPreload=");
        sbLIZ.append(z3);
        sbLIZ.append(", size=");
        sbLIZ.append(arrayList2.size());
        sbLIZ.append(", rawSize=");
        sbLIZ.append(arrayList4.size());
        sbLIZ.append(", invalidCount=");
        sbLIZ.append(i2);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(c238400w2.element);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(c0y6x.LIZJ);
        sbLIZ.append(", tab=");
        sbLIZ.append(c878470YdB.LIZ.LLILLL);
        sbLIZ.append(", page=");
        sbLIZ.append(c878470YdB.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str);
        if (((ConcurrentHashMap) this.LJFF.getValue()).get(c878470YdB.LIZ) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C878550YdJ c878550YdJLJIIJ = LJIIJ(c878470YdB, new C878550YdJ(c0y6x.LIZJ, new C877600Ybm((AbstractC877620Ybo) new C877610Ybn(c238400w2.element), 2), z2));
        CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = LJIILL().get(c878470YdB);
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC878540YdI> it4 = copyOnWriteArrayList.iterator();
            while (it4.hasNext()) {
                try {
                    arrayList4 = arrayList4;
                    arrayList = arrayList2;
                    try {
                        it4.next().LIZLLL(c878470YdB.LIZ, arrayList, arrayList4, c878550YdJLJIIJ, z3, true, C878360Yd0.LIZIZ(this.LIZ, c0y6x.LIZ.LIZ));
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        C309160C9y.LIZJ("ChatListConversationDataSource", th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    arrayList4 = arrayList4;
                    arrayList = arrayList2;
                }
                arrayList4 = arrayList4;
                arrayList2 = arrayList;
            }
        }
        if (z) {
            C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
            if (c19212010Ec.LJIIIIZZ().contains(FilterTabType.SPAM)) {
                C23250099c.LIZLLL(C878360Yd0.LIZ(), null, null, new C877440YbW(arrayList5, null), 3);
            }
            boolean zLJFF = Intrinsics.LJFF(c0y6x.LIZ.LIZ, "preload_all");
            if (!C0CYM.LIZJ.LJIIIIZZ()) {
                r6 = 0;
            } else {
                r6 = 0;
                C23250099c.LIZLLL(C878360Yd0.LIZ(), null, null, new C878720Yda(arrayList5, zLJFF, null), 3);
            }
            if (c19212010Ec.LJLLLLLL()) {
                C23250099c.LIZLLL(C878360Yd0.LIZ(), r6, r6, new C1489805sO(arrayList5.size(), c878470YdB.LIZ.LLILLL.getMobValue(), r6), 3);
            }
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
            if (abstractC883730YlfLJ != null && (map2 = (Map) abstractC883730YlfLJ.LIZJ.getValue()) != null && (num = (Integer) map2.get(c878470YdB.LIZ)) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            AbstractC883730Ylf abstractC883730YlfLJ2 = C881500Yi4.LJ();
            if (abstractC883730YlfLJ2 != null && (map = (Map) abstractC883730YlfLJ2.LIZJ.getValue()) != null) {
                map.put(c878470YdB.LIZ, Integer.valueOf(i2 + iIntValue));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC884250YmV
    public final void LJI(InterfaceC878560YdK interfaceC878560YdK, C877600Ybm c877600Ybm, int i, String str) {
        long j;
        C877610Ybn c877610Ybn;
        C878420Yd6 c878420Yd6PutIfAbsent;
        if (!(interfaceC878560YdK instanceof C878470YdB)) {
            return;
        }
        C878430Yd7 c878430Yd7 = new C878430Yd7(c877600Ybm, i);
        ConcurrentHashMap<C878470YdB, C878420Yd6> concurrentHashMapLJIILJJIL = LJIILJJIL();
        C878420Yd6 c878420Yd6 = concurrentHashMapLJIILJJIL.get(interfaceC878560YdK);
        if (c878420Yd6 == null && (c878420Yd6PutIfAbsent = concurrentHashMapLJIILJJIL.putIfAbsent(interfaceC878560YdK, (c878420Yd6 = new C878420Yd6()))) != null) {
            c878420Yd6 = c878420Yd6PutIfAbsent;
        }
        C878420Yd6 c878420Yd62 = c878420Yd6;
        String str2 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try loadMore, source=");
        sbLIZ.append(str);
        sbLIZ.append(", tab=");
        C878470YdB c878470YdB = (C878470YdB) interfaceC878560YdK;
        sbLIZ.append(c878470YdB.LIZ.LLILLL);
        sbLIZ.append(", page=");
        sbLIZ.append(c878470YdB.LIZ);
        sbLIZ.append(", loadingState: ");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("{stopLoadingFlag=");
        sbLIZ2.append(c878420Yd62.LIZIZ);
        sbLIZ2.append(", loadMoreParam=");
        sbLIZ2.append(c878420Yd62.LIZ);
        sbLIZ2.append('}');
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(c877600Ybm);
        sbLIZ.append(", nextPageSize=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        if (c878420Yd62.LIZIZ) {
            c878420Yd62.LIZJ = c878430Yd7;
            String str3 = this.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("conversationDataSource loadMore return(stopLoadingFlag == true). source=");
            sbLIZ3.append(str);
            sbLIZ3.append(", tab=");
            sbLIZ3.append(c878470YdB.LIZ.LLILLL);
            C2188811AlT.LIZIZ(sbLIZ3);
            C309160C9y.LIZLLL(str3);
            return;
        }
        if (c878420Yd62.LIZ != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("conversationDataSource loadMore return(loadingParam != null, isLoading). source=");
            sbLIZ4.append(str);
            sbLIZ4.append(", tab=");
            sbLIZ4.append(c878470YdB.LIZ.LLILLL);
            C2188811AlT.LIZIZ(sbLIZ4);
            C309160C9y.LIZ();
            return;
        }
        c878420Yd62.LIZ = c878430Yd7;
        AbstractC877620Ybo abstractC877620Ybo = c877600Ybm.LIZ;
        if ((abstractC877620Ybo instanceof C877610Ybn) && (c877610Ybn = (C877610Ybn) abstractC877620Ybo) != null) {
            j = c877610Ybn.LIZ;
        } else {
            j = Long.MAX_VALUE;
        }
        C877210Yb9 c877210Yb9 = c878470YdB.LIZIZ;
        C878950Ydx c878950Ydx = c878470YdB.LIZ;
        String str4 = this.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(c878950Ydx);
        sbLIZ5.append(':');
        sbLIZ5.append(str4);
        sbLIZ5.append(':');
        sbLIZ5.append(j);
        C869290Y8h c869290Y8hLIZIZ = c877210Yb9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ5));
        C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
        C0YM2 c0ym2 = c878470YdB.LIZ.LL;
        c0ysq.getClass();
        if (!C0YSQ.LIZ(c0ym2).LJIJJLI(j, i, c869290Y8hLIZIZ)) {
            String str5 = this.LIZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("conversationDataSource.loadMore loadConversationsWithQuery fail! query: ");
            sbLIZ6.append(c869290Y8hLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ6);
            C309160C9y.LIZIZ(str5);
            c878420Yd62.LIZ = null;
        }
    }
}
