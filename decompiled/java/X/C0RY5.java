package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.IFcpReduxService;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.ab.FcpKmpDecisionExp;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS335S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RY5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RY5 implements InterfaceC697230RWn, InterfaceC702410Rgt {
    public final C0RYB LL;
    public final InterfaceC697220RWm LLILLJJLI;
    public final boolean LLILLL;
    public ViewGroup LLILZ;
    public C0RY9 LLILZIL;
    public boolean LLILZLL;
    public Function2<? super View, ? super String, Unit> LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(14));
    public Function0<Unit> LLJ;
    public List<String> LLJI;
    public C700950ReX LLJIJIL;
    public final ConcurrentHashMap<PriorityProtocol, Function2<PriorityProtocol, Boolean, Unit>> LLJILJIL;
    public final ConcurrentHashMap<PriorityProtocol, Boolean> LLJILJILJ;

    @Override // X.InterfaceC702410Rgt
    public final void hl() {
    }

    @Override // X.InterfaceC697230RWn
    public final void reset() {
        this.LLJI = null;
        if (!this.LLILLL) {
            C0RYB.LJII(this.LL);
            return;
        }
        this.LLILLJJLI.lm();
        this.LLJILJIL.clear();
        this.LLJILJILJ.clear();
    }

    @Override // X.InterfaceC697190RWj
    public final void xa(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC697190RWj
    public final Map<String, FcpNodeProtocol> Aa() {
        C701040Reg c701040Reg;
        ConcurrentHashMap<String, FcpNodeProtocol> concurrentHashMapLJFF;
        C1445005lA c1445005lALJIIJ;
        InterfaceC1444205l2 interfaceC1444205l2;
        InterfaceC1443605kw result;
        List<String> listLIZIZ;
        if (!this.LLILLL) {
            return this.LL.Aa();
        }
        if (!FcpKmpDecisionExp.LIZ(this.LLILLJJLI.o1())) {
            return this.LLILLJJLI.Td();
        }
        C700170RdH c700170RdHJ9 = this.LLILLJJLI.J9();
        if (c700170RdHJ9 == null || (c701040Reg = c700170RdHJ9.LIZ) == null || (concurrentHashMapLJFF = c701040Reg.LJFF()) == null) {
            return C2097608Jq.LJ();
        }
        C0RXZ c0rxzLi = this.LLILLJJLI.li();
        if (c0rxzLi == null || (c1445005lALJIIJ = c0rxzLi.LJIIJ()) == null || (interfaceC1444205l2 = c1445005lALJIIJ.LIZIZ) == null || (result = interfaceC1444205l2.getResult()) == null || (listLIZIZ = result.LIZIZ()) == null) {
            return C2097608Jq.LJ();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : listLIZIZ) {
            FcpNodeProtocol fcpNodeProtocol = concurrentHashMapLJFF.get(str);
            if (fcpNodeProtocol != null) {
                arrayList.add(new Pair(str, fcpNodeProtocol));
            }
        }
        return C2097608Jq.LJIILLIIL(arrayList);
    }

    @Override // X.InterfaceC697190RWj
    public final Map<String, FcpNodeProtocol> Ba() {
        C701040Reg c701040Reg;
        ConcurrentHashMap<String, FcpNodeProtocol> concurrentHashMapLJFF;
        C1445005lA c1445005lALJIIJ;
        InterfaceC1444205l2 interfaceC1444205l2;
        InterfaceC1443605kw result;
        List<String> listLIZ;
        if (!this.LLILLL) {
            return this.LL.Ba();
        }
        if (!FcpKmpDecisionExp.LIZ(this.LLILLJJLI.o1())) {
            return this.LLILLJJLI.Xh();
        }
        C700170RdH c700170RdHJ9 = this.LLILLJJLI.J9();
        if (c700170RdHJ9 == null || (c701040Reg = c700170RdHJ9.LIZ) == null || (concurrentHashMapLJFF = c701040Reg.LJFF()) == null) {
            return C2097608Jq.LJ();
        }
        C0RXZ c0rxzLi = this.LLILLJJLI.li();
        if (c0rxzLi == null || (c1445005lALJIIJ = c0rxzLi.LJIIJ()) == null || (interfaceC1444205l2 = c1445005lALJIIJ.LIZIZ) == null || (result = interfaceC1444205l2.getResult()) == null || (listLIZ = result.LIZ()) == null) {
            return C2097608Jq.LJ();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : listLIZ) {
            FcpNodeProtocol fcpNodeProtocol = concurrentHashMapLJFF.get(str);
            if (fcpNodeProtocol != null) {
                arrayList.add(new Pair(str, fcpNodeProtocol));
            }
        }
        return C2097608Jq.LJIILLIIL(arrayList);
    }

    @Override // X.InterfaceC697190RWj
    public final EnumC697700RYi Ca() {
        return this.LL.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac A[Catch: Exception -> 0x023c, TryCatch #0 {Exception -> 0x023c, blocks: (B:4:0x0019, B:6:0x0025, B:8:0x002d, B:10:0x0033, B:12:0x0039, B:14:0x003d, B:16:0x0043, B:18:0x0049, B:19:0x004f, B:21:0x0057, B:23:0x005b, B:24:0x005f, B:26:0x0063, B:46:0x00be, B:51:0x00d1, B:54:0x00da, B:56:0x00de, B:57:0x00e1, B:59:0x00e6, B:60:0x00f5, B:62:0x00fe, B:64:0x010d, B:65:0x0111, B:66:0x0115, B:68:0x011b, B:69:0x0127, B:71:0x012f, B:73:0x0133, B:75:0x0139, B:78:0x0140, B:80:0x0148, B:82:0x014e, B:84:0x0152, B:86:0x015a, B:89:0x0161, B:91:0x0165, B:93:0x016c, B:95:0x0173, B:96:0x0177, B:98:0x017b, B:36:0x0095, B:37:0x00a6, B:39:0x00ac, B:41:0x00b4, B:47:0x00c3, B:49:0x00cb, B:27:0x0066, B:28:0x0077, B:30:0x007d, B:32:0x0085, B:33:0x0089, B:35:0x0091), top: B:163:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb A[Catch: Exception -> 0x023c, TryCatch #0 {Exception -> 0x023c, blocks: (B:4:0x0019, B:6:0x0025, B:8:0x002d, B:10:0x0033, B:12:0x0039, B:14:0x003d, B:16:0x0043, B:18:0x0049, B:19:0x004f, B:21:0x0057, B:23:0x005b, B:24:0x005f, B:26:0x0063, B:46:0x00be, B:51:0x00d1, B:54:0x00da, B:56:0x00de, B:57:0x00e1, B:59:0x00e6, B:60:0x00f5, B:62:0x00fe, B:64:0x010d, B:65:0x0111, B:66:0x0115, B:68:0x011b, B:69:0x0127, B:71:0x012f, B:73:0x0133, B:75:0x0139, B:78:0x0140, B:80:0x0148, B:82:0x014e, B:84:0x0152, B:86:0x015a, B:89:0x0161, B:91:0x0165, B:93:0x016c, B:95:0x0173, B:96:0x0177, B:98:0x017b, B:36:0x0095, B:37:0x00a6, B:39:0x00ac, B:41:0x00b4, B:47:0x00c3, B:49:0x00cb, B:27:0x0066, B:28:0x0077, B:30:0x007d, B:32:0x0085, B:33:0x0089, B:35:0x0091), top: B:163:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RY5.LIZJ():void");
    }

    public final void LIZLLL() {
        C0RY9 c0ry9 = this.LLILZIL;
        if (c0ry9 != null) {
            c0ry9.LIZ(LJ());
        }
        if (this.LLJILJIL.isEmpty()) {
            return;
        }
        for (Map.Entry<PriorityProtocol, Function2<PriorityProtocol, Boolean, Unit>> entry : this.LLJILJIL.entrySet()) {
            LIZ(entry.getKey(), entry.getValue());
        }
    }

    public final PriorityProtocol LJ() {
        T t;
        PriorityProtocol priorityProtocol;
        if (this.LLILLL) {
            Iterator<Map.Entry<String, FcpNodeProtocol>> it2 = Ba().entrySet().iterator();
            while (it2.hasNext()) {
                FcpNodeProtocol value = it2.next().getValue();
                if ((value instanceof PriorityProtocol) && (priorityProtocol = (PriorityProtocol) value) != null) {
                    return priorityProtocol;
                }
            }
            return null;
        }
        C0RYB c0ryb = this.LL;
        c0ryb.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCurrentTargetPriorityTag() target: ");
        sbLIZ.append(c0ryb.LLJIJIL);
        sbLIZ.append("; priority: ");
        C0RYC<PriorityProtocol> c0ryc = c0ryb.LLJIJIL;
        sbLIZ.append(c0ryc != null ? c0ryc.LIZ : null);
        sbLIZ.append("; getPriorityTag: ");
        C0RYC<PriorityProtocol> c0ryc2 = c0ryb.LLJIJIL;
        sbLIZ.append((c0ryc2 == null || (t = c0ryc2.LIZ) == 0) ? null : t.zg());
        C2188811AlT.LIZIZ(sbLIZ);
        C0RYC<PriorityProtocol> c0ryc3 = c0ryb.LLJIJIL;
        if (c0ryc3 != null) {
            return c0ryc3.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC697230RWn
    public final ViewGroup LJJIJL() throws Exception {
        if (!this.LLILLL) {
            return this.LL.LIZLLL();
        }
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup == null) {
            throw new Exception("");
        }
        return viewGroup;
    }

    @Override // X.InterfaceC697230RWn
    public final List<String> is() {
        if (!this.LLILLL) {
            return this.LL.is();
        }
        Map<String, FcpNodeProtocol> mapAa = Aa();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, FcpNodeProtocol>> it2 = mapAa.entrySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            if (key != null) {
                arrayList.add(key);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC697230RWn
    public final void qs() {
        InterfaceC697220RWm interfaceC697220RWm = this.LLILLJJLI;
        IFcpReduxService iFcpReduxService = (IFcpReduxService) this.LLIZLLLIL.getValue();
        Function1<? super InterfaceC1449905lx<C701270Rf3>, ? extends Function1<? super Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>, ? extends Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>>> function1LIZJ = iFcpReduxService != null ? iFcpReduxService.LIZJ(AFwS335S0000000_11.get$arr$(0)) : null;
        interfaceC697220RWm.U(function1LIZJ != null ? new Function1[]{function1LIZJ} : new Function1[0], new C1452305mL(new C702220Rga()));
    }

    @Override // X.InterfaceC697190RWj
    public final void unBind() {
        if (!this.LLILLL) {
            this.LL.unBind();
            return;
        }
        this.LLJIJIL = null;
        this.LLILLJJLI.lm();
        this.LLILLJJLI.ol();
    }

    @Override // X.InterfaceC697190RWj
    public final void ya() {
        this.LLILLJJLI.xg();
        new C0RY7(this);
        C0T6L.LIZLLL();
        this.LLILZLL = false;
        if (this.LLILLL) {
            return;
        }
        this.LL.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.08CX] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC697190RWj
    public final Map<String, FcpNodeProtocol> za() {
        C701040Reg c701040Reg;
        ConcurrentHashMap<String, FcpNodeProtocol> concurrentHashMapLJFF;
        ?? arrayList;
        C1445005lA c1445005lALJIIJ;
        Map<String, InterfaceC1444205l2> map;
        Collection<InterfaceC1444205l2> collectionValues;
        if (!this.LLILLL) {
            return this.LL.za();
        }
        if (!FcpKmpDecisionExp.LIZ(this.LLILLJJLI.o1())) {
            return this.LLILLJJLI.q6();
        }
        C700170RdH c700170RdHJ9 = this.LLILLJJLI.J9();
        if (c700170RdHJ9 == null || (c701040Reg = c700170RdHJ9.LIZ) == null || (concurrentHashMapLJFF = c701040Reg.LJFF()) == null) {
            return C2097608Jq.LJ();
        }
        C0RXZ c0rxzLi = this.LLILLJJLI.li();
        if (c0rxzLi == null || (c1445005lALJIIJ = c0rxzLi.LJIIJ()) == null || (map = c1445005lALJIIJ.LIZJ) == null || (collectionValues = map.values()) == null) {
            arrayList = C08CX.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : collectionValues) {
                if (Intrinsics.LJFF(((InterfaceC1444305l3) obj).LJ().LJ("enable"), Boolean.FALSE)) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList2);
            arrayList = new ArrayList(C15438062q.LJIJJ(hashSetLLIFFJFJJ, 10));
            Iterator it2 = hashSetLLIFFJFJJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((InterfaceC1444105l1) it2.next()).getIdentifier());
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, FcpNodeProtocol> entry : concurrentHashMapLJFF.entrySet()) {
            if (arrayList.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC697230RWn
    public final String ns() {
        PriorityProtocol priorityProtocolLJ = LJ();
        if (priorityProtocolLJ != null) {
            return priorityProtocolLJ.zg();
        }
        return null;
    }

    @Override // X.InterfaceC697230RWn
    public final C0RYB ps() {
        return this.LL;
    }

    @Override // X.InterfaceC697230RWn
    public final InterfaceC697220RWm rs() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC697230RWn
    public final void ss(boolean z) {
        if (this.LLILLL) {
            this.LLILLJJLI.zf();
            LIZIZ(C701300Rf6.LIZ, null, z);
        } else {
            this.LL.LIZJ();
        }
    }

    @Override // X.InterfaceC702410Rgt
    public final void vg(C700950ReX c700950ReX) {
        List<C700970ReZ> list;
        C700950ReX c700950ReX2 = this.LLJIJIL;
        List<C700970ReZ> list2 = null;
        if (c700950ReX2 != null) {
            list = c700950ReX2.LIZIZ;
        } else {
            list = null;
        }
        if (c700950ReX != null) {
            list2 = c700950ReX.LIZIZ;
        }
        if (!Intrinsics.LJFF(list, list2)) {
            this.LLJIJIL = c700950ReX;
            LIZJ();
        }
        if (this.LLILZLL) {
            this.LLILLJJLI.xg();
            C0T6L.LIZLLL();
            LIZLLL();
        }
    }

    @Override // X.InterfaceC697190RWj
    public final void wa(boolean z) {
        this.LLILLJJLI.xg();
        new C0RY4(this);
        C0T6L.LIZLLL();
        this.LLILZLL = true;
        if (!this.LLILLL) {
            this.LL.getClass();
        }
    }

    public final void LIZ(PriorityProtocol priorityProtocol, Function2<? super PriorityProtocol, ? super Boolean, Unit> function2) {
        boolean z = !Intrinsics.LJFF(priorityProtocol.zg(), ns());
        this.LLJILJILJ.put(priorityProtocol, Boolean.valueOf(z));
        this.LLILLJJLI.xg();
        new C0RY6(this, priorityProtocol, z);
        C0T6L.LIZLLL();
        function2.invoke(priorityProtocol, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC697230RWn
    public final void ms(PriorityProtocol priorityProtocol, boolean z) {
        if (this.LLILLL) {
            this.LLJILJIL.remove(priorityProtocol);
            this.LLJILJILJ.remove(priorityProtocol);
            LIZIZ(C701320Rf8.LIZ, priorityProtocol.LLLII(), z);
            return;
        }
        this.LL.LJIIL(priorityProtocol);
    }

    public C0RY5(C0RYB c0ryb, InterfaceC697220RWm interfaceC697220RWm, boolean z) {
        this.LL = c0ryb;
        this.LLILLJJLI = interfaceC697220RWm;
        this.LLILLL = z;
        interfaceC697220RWm.Ah(this);
        this.LLJILJIL = new ConcurrentHashMap<>();
        this.LLJILJILJ = new ConcurrentHashMap<>();
    }

    public final void LIZIZ(AbstractC701310Rf7 abstractC701310Rf7, String str, boolean z) {
        if (C123100dR.LIZ(str)) {
            InterfaceC697220RWm interfaceC697220RWm = this.LLILLJJLI;
            interfaceC697220RWm.gg(new C700260RdQ(C0RXO.LIZ(str, "fallback", C0RY8.LIZ(interfaceC697220RWm.xg())), abstractC701310Rf7, z, null, 8));
        } else {
            this.LLILLJJLI.gg(new C700260RdQ(null, C701300Rf6.LIZ, z, null, 9));
        }
    }

    @Override // X.InterfaceC697230RWn
    public final void js(PriorityProtocol priorityProtocol, boolean z, boolean z2) {
        PriorityProtocol priorityProtocol2 = null;
        String strZg = null;
        if (this.LLILLL) {
            if (priorityProtocol != null) {
                strZg = priorityProtocol.zg();
            }
            LIZIZ(C701300Rf6.LIZ, strZg, z2);
            return;
        }
        C0RYB c0ryb = this.LL;
        if (!z && c0ryb.LLJIJIL != null && c0ryb.LLJI >= 2) {
            C0RY9 c0ry9LJ = c0ryb.LJ();
            C0RYC<PriorityProtocol> c0ryc = c0ryb.LLJIJIL;
            if (c0ryc != null) {
                priorityProtocol2 = c0ryc.LIZ;
            }
            c0ry9LJ.LIZ(priorityProtocol2);
            return;
        }
        c0ryb.LLJI = 0;
        c0ryb.LIZJ();
    }

    @Override // X.InterfaceC697230RWn
    public final void ls(PriorityProtocol priorityProtocol, Function2<? super PriorityProtocol, ? super Boolean, Unit> function2, Boolean bool) {
        if (this.LLILLL) {
            this.LLJILJIL.put(priorityProtocol, function2);
            LIZ(priorityProtocol, function2);
        } else {
            this.LL.ls(priorityProtocol, function2, bool);
        }
    }

    @Override // X.InterfaceC697230RWn
    public final void os(PriorityProtocol priorityProtocol, final C0RKR c0rkr, Boolean bool) {
        ls(priorityProtocol, new Function2<PriorityProtocol, Boolean, Unit>() { // from class: X.0RKS
            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(PriorityProtocol priorityProtocol2, Boolean bool2) {
                if (!bool2.booleanValue()) {
                    c0rkr.invoke(priorityProtocol2);
                }
                return Unit.LIZ;
            }
        }, bool);
    }

    @Override // X.InterfaceC697230RWn
    public final void ts(ViewGroup viewGroup, C0RY9 c0ry9, Function2<? super View, ? super String, Unit> function2) {
        this.LLILZ = viewGroup;
        this.LLILZIL = c0ry9;
        this.LL.LIZ(viewGroup, c0ry9);
        this.LLIZ = function2;
    }

    @Override // X.InterfaceC697230RWn
    public final void ks(PriorityProtocol priorityProtocol, boolean z, boolean z2, boolean z3) {
        AbstractC701310Rf7 abstractC701310Rf7;
        InterfaceC699970Rcx interfaceC699970Rcx;
        if (this.LLILLL) {
            if (z3 || (priorityProtocol.oh() && (priorityProtocol instanceof InterfaceC699970Rcx) && (interfaceC699970Rcx = (InterfaceC699970Rcx) priorityProtocol) != null && interfaceC699970Rcx.l5(z))) {
                String strH3 = priorityProtocol.H3();
                if (z) {
                    abstractC701310Rf7 = C701300Rf6.LIZ;
                } else {
                    abstractC701310Rf7 = C701320Rf8.LIZ;
                }
                LIZIZ(abstractC701310Rf7, strH3, z2);
                return;
            }
            return;
        }
        C0RYC<PriorityProtocol> c0ryc = this.LL.LJFF().get(priorityProtocol.zg());
        if (c0ryc == null || !Intrinsics.LJFF(c0ryc.LIZJ, Boolean.TRUE)) {
            return;
        }
        C0RYF.LIZIZ(c0ryc.LIZ(), Boolean.valueOf(z));
    }
}
