package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iyQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263080iyQ extends C1263450iz1<InterfaceC1262230ix3> implements InterfaceC1263530iz9 {
    public final C1262300ixA LLILZ;
    public final InterfaceC497601wk LLILZIL;
    public final C2252321DDq LLILZLL;
    public final C2252321DDq LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final Set<String> LLJI;
    public final Set<String> LLJIJIL;
    public final Set<String> LLJILJIL;
    public final C01GW LLJILJILJ;
    public EnumC1263380iyu LLJILLL;
    public final C1263340iyq LLJJ;
    public boolean LLJJI;

    public final C1263260iyi LJIIIZ() {
        return (C1263260iyi) this.LLJ.getValue();
    }

    public final EnumC1263380iyu LJIIJJI() {
        C0XHV.LIZ.getClass();
        C0XHV.LIZIZ = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
        return C1262490ixT.LIZLLL(this.LLILZ) ? EnumC1263380iyu.STORAGE : EnumC1263380iyu.API;
    }

    public final C1263110iyT LJIIL() {
        return (C1263110iyT) this.LLIZLLLIL.getValue();
    }

    public final void LJIL() {
        C1264320j0Q.LIZ.getClass();
        C1264320j0Q.LIZLLL("DataSource", "reset All!");
        this.LLILLL.clear();
        ((CopyOnWriteArraySet) this.LLJI).clear();
        this.LLILZLL.setValue(new C1263200iyc(true, 14));
        C1263110iyT c1263110iyTLJIIL = LJIIL();
        c1263110iyTLJIIL.getClass();
        c1263110iyTLJIIL.LJI(new AwS598S0100000_19(c1263110iyTLJIIL, 908));
    }

    public final void LJJI() {
        C2252321DDq c2252321DDq = LJIIL().LJIIIZ;
        ArrayList arrayList = null;
        if (c2252321DDq == null) {
            c2252321DDq = null;
        }
        C1263210iyd c1263210iyd = (C1263210iyd) c2252321DDq.getValue();
        List<C1261860iwS> list = c1263210iyd.LJ;
        if (list != null) {
            arrayList = new ArrayList();
            for (C1261860iwS c1261860iwS : list) {
                if (!LJJ(c1261860iwS)) {
                    arrayList.add(c1261860iwS);
                }
            }
        }
        if (!(arrayList instanceof List) || arrayList == null) {
            return;
        }
        LJIIZILJ(c1263210iyd, LJFF(arrayList, ((C1263460iz2) LJIIIZ().LJII.getValue()).LIZ, c1263210iyd.LIZJ));
    }

    @Override // X.InterfaceC1263530iz9
    public final C05YD<C1263200iyc> getState() {
        return this.LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b A[PHI: r3 r5
      0x004b: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:26:0x0049, B:24:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r5v3 com.google.gson.n) = (r5v2 com.google.gson.n), (r5v4 com.google.gson.n) binds: [B:26:0x0049, B:24:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJ(X.C1261860iwS r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getSocialInfo()
            r6 = 0
            if (r0 == 0) goto L1f
            int r0 = r0.length()
            if (r0 == 0) goto L1f
            r0 = 0
        Le:
            r5 = 0
            java.lang.String r4 = ""
            if (r0 == 0) goto L21
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r8.getMatchedFriendStruct()
            if (r0 == 0) goto L1d
            java.lang.String r2 = r0.socialInfo
            if (r2 != 0) goto L25
        L1d:
            r2 = r4
            goto L25
        L1f:
            r0 = 1
            goto Le
        L21:
            java.lang.String r2 = r8.getSocialInfo()
        L25:
            com.google.gson.Gson r1 = X.C09C2.LIZ()     // Catch: java.lang.Exception -> L35
            java.lang.Class<com.google.gson.n> r0 = com.google.gson.n.class
            java.lang.Object r0 = r1.LJII(r2, r0)     // Catch: java.lang.Exception -> L35
            com.google.gson.n r0 = (com.google.gson.n) r0     // Catch: java.lang.Exception -> L35
            r5 = r0
            if (r0 == 0) goto L48
            goto L3a
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L48
        L3a:
            java.lang.String r0 = "cli_filter_inbox_first_page"
            com.google.gson.k r0 = r5.LJJIIZ(r0)
            if (r0 == 0) goto L48
            java.lang.String r3 = r0.LJIL()
            if (r3 != 0) goto L4b
        L48:
            r3 = r4
            if (r5 == 0) goto L5a
        L4b:
            java.lang.String r0 = "cli_filter_inbox_activities"
            com.google.gson.k r0 = r5.LJJIIZ(r0)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r0.LJIL()
            if (r0 == 0) goto L5a
            r4 = r0
        L5a:
            X.0ixA r0 = r7.LLILZ
            X.0ixd r0 = r0.apiConfig
            java.lang.Integer r1 = r0.LJIJ
            java.lang.String r2 = "1"
            if (r1 == 0) goto L7e
            int r0 = r1.intValue()
            if (r0 != 0) goto L70
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r2)
            if (r0 != 0) goto L7d
        L70:
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L7e
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r2)
            if (r0 == 0) goto L7e
        L7d:
            r6 = 1
        L7e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263080iyQ.LJJ(X.0iwS):boolean");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        "not support action".toString();
        throw new IllegalStateException("not support action");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends InterfaceC1262230ix3> collection) {
        "not support action".toString();
        throw new IllegalStateException("not support action");
    }

    @Override // X.C1263450iz1, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof InterfaceC1262230ix3)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // X.C1263450iz1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof InterfaceC1262230ix3)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    @Override // X.C1263450iz1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof InterfaceC1262230ix3)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof InterfaceC1262230ix3)) {
            return false;
        }
        InterfaceC1262230ix3 interfaceC1262230ix3 = (InterfaceC1262230ix3) obj;
        Iterator<InterfaceC1262230ix3> it2 = iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getElementId(), interfaceC1262230ix3.getElementId())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        interfaceC1262230ix3.setRemoved(true);
        if (i < 0 || i >= this.LLILLL.size()) {
            return false;
        }
        InterfaceC1262230ix3 interfaceC1262230ix32 = get(i);
        interfaceC1262230ix32.setRemoved(true);
        set(i, interfaceC1262230ix32);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        "not support action".toString();
        throw new IllegalStateException("not support action");
    }

    public C1263080iyQ(C1262300ixA c1262300ixA, InterfaceC497601wk interfaceC497601wk) {
        super(0);
        this.LLILZ = c1262300ixA;
        this.LLILZIL = interfaceC497601wk;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1263200iyc(false, 31));
        this.LLILZLL = c2252321DDqLIZ;
        this.LLIZ = c2252321DDqLIZ;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3401));
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3399));
        this.LLJI = new CopyOnWriteArraySet();
        this.LLJIJIL = new CopyOnWriteArraySet();
        this.LLJILJIL = new LinkedHashSet();
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3400));
        this.LLJILLL = LJIIJJI();
        this.LLJJ = new C1263340iyq();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJIIZILJ(C1263210iyd c1263210iyd, List<? extends InterfaceC1262230ix3> list) {
        Integer numValueOf;
        List<? extends InterfaceC1262230ix3> list2 = list;
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("calling publish, source update to new state. old data size: ");
        List<InterfaceC1262230ix3> list3 = ((C1263200iyc) this.LLILZLL.getValue()).LJ;
        Integer numValueOf2 = null;
        if (list3 != null) {
            numValueOf = Integer.valueOf(list3.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", new data size: ");
        if (list2 != null) {
            numValueOf2 = Integer.valueOf(list2.size());
        }
        sbLIZ.append(numValueOf2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1264320j0Q.getClass();
        C1264320j0Q.LIZLLL("DataSource", strLIZIZ);
        Object value = this.LLILZLL.getValue();
        boolean z = c1263210iyd.LIZ;
        C1263190iyb c1263190iyb = c1263210iyd.LIZIZ;
        boolean z2 = c1263210iyd.LIZJ;
        if (list2 == null) {
            list2 = ((C1263200iyc) this.LLILZLL.getValue()).LJ;
        }
        value.getClass();
        C1263200iyc c1263200iyc = new C1263200iyc(true, z, c1263190iyb, z2, list2);
        this.LLILLL.clear();
        List<V> list4 = this.LLILLL;
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        list4.addAll(list2);
        this.LLILZLL.setValue(c1263200iyc);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        "not support action".toString();
        throw new IllegalStateException("not support action");
    }

    public static List LJFF(List list, List list2, boolean z) {
        C1262150iwv c1262150iwv = new C1262150iwv(list, z);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c1262150iwv = new C1262150iwv(((InterfaceC1262160iww) it2.next()).LIZ(c1262150iwv), c1262150iwv.LIZIZ);
        }
        return c1262150iwv.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030a A[LOOP:2: B:110:0x0304->B:112:0x030a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[LOOP:0: B:14:0x005b->B:16:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C1261860iwS r20, boolean r21, X.InterfaceC1364105Vn<? super java.util.List<X.C1261860iwS>> r22) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263080iyQ.LJIIIIZZ(X.0iwS, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(boolean r15, X.C1263190iyb r16, X.InterfaceC1364105Vn<? super X.C1263310iyn> r17) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263080iyQ.LJIILIIL(boolean, X.0iyb, X.05Vn):java.lang.Object");
    }

    public final void LJJIFFI(String str, String str2, List list) {
        String str3 = str2;
        String str4 = str;
        List list2 = list;
        C1264320j0Q.LIZ.getClass();
        C1264320j0Q.LIZLLL("DataSource", "update request params.");
        C2252321DDq c2252321DDq = LJIIL().LJIIIZ;
        if (c2252321DDq == null) {
            c2252321DDq = null;
        }
        C1263190iyb c1263190iybLIZIZ = ((C1263210iyd) c2252321DDq.getValue()).LIZIZ;
        if (c1263190iybLIZIZ == null) {
            c1263190iybLIZIZ = LJIIL().LIZIZ();
        }
        if (list2 == null) {
            list2 = c1263190iybLIZIZ.LIZJ;
        }
        if (str4 == null) {
            str4 = c1263190iybLIZIZ.LJ;
        }
        if (str3 == null) {
            str3 = c1263190iybLIZIZ.LIZLLL;
        }
        C1263190iyb c1263190iybLIZ = C1263190iyb.LIZ(c1263190iybLIZIZ, null, list2, str3, str4, false, 483);
        C1263110iyT c1263110iyTLJIIL = LJIIL();
        c1263110iyTLJIIL.getClass();
        c1263110iyTLJIIL.LJIIL = C1263190iyb.LIZ(c1263190iybLIZ, "", null, null, null, false, 509);
        c1263110iyTLJIIL.LJI(new AwS598S0100000_19(c1263190iybLIZ, 909));
    }
}
