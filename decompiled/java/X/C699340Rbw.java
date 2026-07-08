package X;

import Y.AComparatorS30S0000000_11;
import Y.ARunnableS16S1200000_11;
import Y.ARunnableS80S0200000_11;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.FcpSlotConfig;
import com.ss.android.ugc.aweme.feed.model.FcpSlotStrategy;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Rbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699340Rbw {
    public final InterfaceC699310Rbt LIZ;
    public final Function1<String, C699090RbX<ComponentPriorityProtocol>> LIZIZ;
    public final InterfaceC1631620sYq<String, EnumC699470Rc9, EnumC699470Rc9, Unit> LIZJ;
    public final Function0<String> LIZLLL;
    public final Function0<String> LJ;
    public final Function2<Long, String, Boolean> LJFF;
    public final C698730Rax LJI;
    public final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1358));
    public final LinkedHashMap<String, InterfaceC699870Rcn> LJIIIZ = new LinkedHashMap<>();
    public final LinkedHashMap<String, Long> LJIIJ = new LinkedHashMap<>();
    public final LinkedHashMap<String, C699400Rc2> LJIIJJI = new LinkedHashMap<>();
    public final Object LJIIL;
    public Set<String> LJIILIIL;
    public C722702rx LJIILJJIL;
    public long LJIILL;
    public Map<String, String> LJIILLIIL;
    public volatile C698780Rb2 LJIIZILJ;
    public volatile boolean LJIJ;
    public volatile boolean LJIJI;

    public final void LIZLLL() {
        if (!this.LJIIIZ.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearObservers, observerCount=");
            sbLIZ.append(this.LJIIIZ.size());
            LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        }
        Iterator<T> it2 = this.LJIIIZ.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC699870Rcn) it2.next()).cancel();
        }
        this.LJIIIZ.clear();
        this.LJIIJ.clear();
    }

    public final void LJ() {
        if (this.LJIJ) {
            return;
        }
        this.LJIJ = true;
        LJIIL();
        LIZLLL();
        C698730Rax c698730Rax = this.LJI;
        if (c698730Rax != null) {
            Object obj = this.LJIIL;
            if (Intrinsics.LJFF(c698730Rax.LJ, obj)) {
                c698730Rax.LIZ(obj);
                c698730Rax.LJ = null;
                c698730Rax.LJFF = null;
            }
        }
        InterfaceC699310Rbt interfaceC699310Rbt = this.LIZ;
        if (interfaceC699310Rbt != null) {
            interfaceC699310Rbt.close();
        }
    }

    public final C699370Rbz LJIIIZ() {
        return (C699370Rbz) this.LJIIIIZZ.getValue();
    }

    public final void LJIIL() {
        T t;
        View viewXb;
        if (this.LJIILIIL.isEmpty()) {
            return;
        }
        C699370Rbz c699370RbzLJIIIZ = LJIIIZ();
        Set<String> set = this.LJIILIIL;
        c699370RbzLJIIIZ.getClass();
        for (String str : set) {
            C699090RbX<ComponentPriorityProtocol> c699090RbXInvoke = c699370RbzLJIIIZ.LIZ.invoke(str);
            if (c699090RbXInvoke == null || (t = c699090RbXInvoke.LL) == 0 || (viewXb = t.xb()) == null) {
                c699370RbzLJIIIZ.LIZIZ.remove(str);
            } else if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                c699370RbzLJIIIZ.LIZIZ.remove(str);
                c699370RbzLJIIIZ.LIZIZ(str);
                C699370Rbz.LJFF(viewXb);
            } else {
                C637920P0k.LIZ(viewXb, new ARunnableS16S1200000_11(viewXb, str, c699370RbzLJIIIZ, 7));
            }
        }
    }

    public static String LJIIIIZZ(List list) {
        if (list.isEmpty()) {
            return "[]";
        }
        return C13LP.LJJLIIIJ(C13LP.LJLLLL(new AComparatorS30S0000000_11(2), list), null, e3.e, e3.f, 0, null, AFwS243S0000000_11.get$arr$(609), 25);
    }

    public final List<C700060Rd6> LIZIZ(List<C699090RbX<ComponentPriorityProtocol>> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        HashMap map = new HashMap(list.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (C699090RbX<ComponentPriorityProtocol> c699090RbX : list) {
            String componentKey = c699090RbX.LLILLJJLI.getComponentKey();
            String matchedContainerKey = c699090RbX.LLILLJJLI.getMatchedContainerKey();
            if (Intrinsics.LJFF(matchedContainerKey, "standardized_bottom_button")) {
                matchedContainerKey = "bottom_button";
            }
            if (componentKey != null && componentKey.length() != 0 && matchedContainerKey != null && matchedContainerKey.length() != 0) {
                Object obj = map.get(componentKey);
                if (obj == null) {
                    map.put(componentKey, matchedContainerKey);
                } else if (!Intrinsics.LJFF(obj, matchedContainerKey)) {
                    linkedHashSet.add(componentKey);
                }
                if (!linkedHashMap.containsKey(componentKey)) {
                    linkedHashMap.put(componentKey, new C700060Rd6(componentKey, matchedContainerKey, componentKey));
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("slotId=");
                sbLIZ.append(componentKey);
                sbLIZ.append(",parentSlotId=");
                sbLIZ.append(matchedContainerKey);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("buildSlotCandidates skip invalidDecisions=");
            sbLIZ2.append(arrayList);
            LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (!linkedHashSet.isEmpty()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("SlotStrategyBridge#buildSlotCandidates parent conflict, slotIds=");
            sbLIZ3.append(linkedHashSet);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (!linkedHashSet.isEmpty()) {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                linkedHashMap.remove(it2.next());
            }
        }
        return C13LP.LLIIII(linkedHashMap.values());
    }

    public final void LJI(C699380Rc0 c699380Rc0) {
        InterfaceC1631620sYq<String, EnumC699470Rc9, EnumC699470Rc9, Unit> interfaceC1631620sYq;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            if (!LJIIJ(c699380Rc0.LJ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("runtime dispatch skipped, reason=stale_context stateSlotKey=");
                sbLIZ.append(c699380Rc0.LIZ);
                sbLIZ.append(", runtimeSlotKey=");
                sbLIZ.append(c699380Rc0.LIZIZ);
                sbLIZ.append(", generation=");
                sbLIZ.append(c699380Rc0.LJ.LIZIZ);
                sbLIZ.append(", executeSeq=");
                sbLIZ.append(c699380Rc0.LJ.LIZJ);
                LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            EnumC699420Rc4 enumC699420Rc4LJII = LJII(c699380Rc0.LIZ, c699380Rc0.LIZIZ, c699380Rc0.LIZJ, c699380Rc0.LIZLLL, true);
            EnumC699470Rc9 enumC699470Rc9 = c699380Rc0.LJFF;
            EnumC699470Rc9 enumC699470Rc92 = c699380Rc0.LJI;
            if (enumC699420Rc4LJII != EnumC699420Rc4.LL || enumC699470Rc9 == null || enumC699470Rc92 == null || (interfaceC1631620sYq = this.LIZJ) == null) {
                return;
            }
            interfaceC1631620sYq.invoke(c699380Rc0.LIZ, enumC699470Rc9, enumC699470Rc92);
            return;
        }
        C786410Ut5.LJJZZIII(this.LJII, new ARunnableS80S0200000_11(this, c699380Rc0, 35));
    }

    public final boolean LJIIJ(C698780Rb2 c698780Rb2) {
        if (this.LJIJ) {
            return false;
        }
        C698780Rb2 c698780Rb22 = this.LJIIZILJ;
        long j = c698780Rb2.LIZIZ;
        long j2 = c698780Rb22.LIZIZ;
        if (j < j2) {
            return false;
        }
        if (j == j2 && c698780Rb2.LIZJ < c698780Rb22.LIZJ) {
            return false;
        }
        Function2<Long, String, Boolean> function2 = this.LJFF;
        if (function2 != null && !function2.invoke(Long.valueOf(j), c698780Rb2.LIZ).booleanValue()) {
            return false;
        }
        return true;
    }

    public final void LJIIJJI(String str) {
        String strInvoke;
        Function0<String> function0 = this.LIZLLL;
        if (function0 == null || (strInvoke = function0.invoke()) == null) {
            strInvoke = "";
        }
        if (strInvoke.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[uniqueId=");
            sbLIZ.append(strInvoke);
            sbLIZ.append("] ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final C699210Rbj LJIILIIL(String str) {
        C722702rx c722702rx = this.LJIILJJIL;
        Map<String, String> map = this.LJIILLIIL;
        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 383);
        String strLIZ = C722702rx.LIZ(str, c722702rx.LIZIZ, map);
        if (strLIZ == null) {
            strLIZ = null;
        } else if (((Boolean) awS590S0100000_11.invoke(strLIZ)).booleanValue()) {
            strLIZ = C722702rx.LIZ(str, c722702rx.LIZ, map);
        }
        if (strLIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("slot protocol registered, dynamic rule not matched, executeId=");
            sbLIZ.append(this.LJIILL);
            sbLIZ.append(", candidateSlotKey=");
            sbLIZ.append(str);
            sbLIZ.append(", boundSlotKeys=");
            sbLIZ.append(C13LP.LLIIII(this.LJIILIIL));
            sbLIZ.append(", treeParent=");
            sbLIZ.append(this.LJIILLIIL.get(str));
            LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register replay ancestor resolved, executeId=");
        sbLIZ2.append(this.LJIILL);
        sbLIZ2.append(", candidateSlotKey=");
        sbLIZ2.append(str);
        sbLIZ2.append(", boundSlotKey=");
        sbLIZ2.append(strLIZ);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
        C699400Rc2 c699400Rc2 = this.LJIIJJI.get(strLIZ);
        if (c699400Rc2 == null) {
            return null;
        }
        if (c699400Rc2.LIZJ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("slot protocol registered, replay skipped because state already consumed, executeId=");
            sbLIZ3.append(this.LJIILL);
            sbLIZ3.append(", candidateSlotKey=");
            sbLIZ3.append(str);
            sbLIZ3.append(", boundSlotKey=");
            sbLIZ3.append(strLIZ);
            sbLIZ3.append(", state=");
            sbLIZ3.append(c699400Rc2.LIZ);
            sbLIZ3.append(", revision=");
            sbLIZ3.append(c699400Rc2.LIZIZ);
            LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
            return null;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("replay cached state on register, executeId=");
        sbLIZ4.append(this.LJIILL);
        sbLIZ4.append(", candidateSlotKey=");
        sbLIZ4.append(str);
        sbLIZ4.append(", boundSlotKey=");
        sbLIZ4.append(strLIZ);
        sbLIZ4.append(", state=");
        sbLIZ4.append(c699400Rc2.LIZ);
        sbLIZ4.append(", revision=");
        sbLIZ4.append(c699400Rc2.LIZIZ);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
        return new C699210Rbj(strLIZ, c699400Rc2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0Rbx] */
    public final void LJIILJJIL(InterfaceC699310Rbt interfaceC699310Rbt) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : this.LJIILIIL) {
            Long l = this.LJIIJ.get(obj);
            if (l != null) {
                linkedHashMap.put(obj, l);
            }
        }
        LIZLLL();
        this.LJIIJ.putAll(linkedHashMap);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.LJIILIIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncSlotRuntimeObserversWithKmp, executeId=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", observeSlotIds=");
        sbLIZ.append(C13LP.LLIIII(linkedHashSet));
        sbLIZ.append(", retainedRevisionSlotCount=");
        sbLIZ.append(linkedHashMap.size());
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        for (final String str : linkedHashSet) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("observer register, executeId=");
            sbLIZ2.append(this.LJIILL);
            sbLIZ2.append(", slotId=");
            sbLIZ2.append(str);
            LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
            this.LJIIIZ.put(str, interfaceC699310Rbt.LIZLLL(str, new InterfaceC699850Rcl() { // from class: X.0Rbx
                @Override // X.InterfaceC699850Rcl
                public final void LIZ(C699410Rc3 c699410Rc3) {
                    boolean z;
                    boolean z2;
                    EnumC699470Rc9 enumC699470Rc9;
                    InterfaceC1631620sYq<String, EnumC699470Rc9, EnumC699470Rc9, Unit> interfaceC1631620sYq;
                    InterfaceC1631620sYq<String, EnumC699470Rc9, EnumC699470Rc9, Unit> interfaceC1631620sYq2;
                    C698780Rb2 c698780Rb2 = this.LIZ.LJIIZILJ;
                    C699340Rbw c699340Rbw = this.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("observer callback, executeId=");
                    sbLIZ3.append(this.LIZ.LJIILL);
                    sbLIZ3.append(", slotId=");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", state=");
                    sbLIZ3.append(c699410Rc3.LIZIZ);
                    sbLIZ3.append(", revision=");
                    sbLIZ3.append(c699410Rc3.LIZJ);
                    sbLIZ3.append(", timingKey=");
                    sbLIZ3.append(c699410Rc3.LJ);
                    sbLIZ3.append(", candidateComponent=");
                    sbLIZ3.append(c699410Rc3.LIZLLL);
                    sbLIZ3.append(", generation=");
                    sbLIZ3.append(c698780Rb2.LIZIZ);
                    sbLIZ3.append(", executeSeq=");
                    sbLIZ3.append(c698780Rb2.LIZJ);
                    c699340Rbw.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
                    long jLongValue = 0;
                    if (c699410Rc3.LIZJ < 0) {
                        C699340Rbw c699340Rbw2 = this.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("observer callback ignored, executeId=");
                        sbLIZ4.append(this.LIZ.LJIILL);
                        sbLIZ4.append(", slotId=");
                        sbLIZ4.append(str);
                        sbLIZ4.append(", revision=");
                        sbLIZ4.append(c699410Rc3.LIZJ);
                        c699340Rbw2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
                        return;
                    }
                    Long l2 = this.LIZ.LJIIJ.get(str);
                    if (l2 != null) {
                        jLongValue = l2.longValue();
                    }
                    C699400Rc2 c699400Rc2 = this.LIZ.LJIIJJI.get(str);
                    long j = c699410Rc3.LIZJ;
                    if (j < jLongValue) {
                        C699340Rbw c699340Rbw3 = this.LIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("observer callback ignored, executeId=");
                        sbLIZ5.append(this.LIZ.LJIILL);
                        sbLIZ5.append(", slotId=");
                        sbLIZ5.append(str);
                        sbLIZ5.append(", revision=");
                        sbLIZ5.append(c699410Rc3.LIZJ);
                        sbLIZ5.append(", lastObservedRevision=");
                        sbLIZ5.append(jLongValue);
                        c699340Rbw3.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ5));
                        return;
                    }
                    if (c699400Rc2 != null && j == c699400Rc2.LIZIZ && c699410Rc3.LIZIZ == c699400Rc2.LIZ && c699400Rc2.LIZJ) {
                        C699340Rbw c699340Rbw4 = this.LIZ;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("observer callback ignored, executeId=");
                        sbLIZ6.append(this.LIZ.LJIILL);
                        sbLIZ6.append(", slotId=");
                        sbLIZ6.append(str);
                        sbLIZ6.append(", state=");
                        sbLIZ6.append(c699410Rc3.LIZIZ);
                        sbLIZ6.append(", revision=");
                        sbLIZ6.append(c699410Rc3.LIZJ);
                        sbLIZ6.append(", reason=already_dispatched");
                        c699340Rbw4.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ6));
                        return;
                    }
                    this.LIZ.LJIIJ.put(str, Long.valueOf(j));
                    if (c699400Rc2 == null && c699410Rc3.LIZIZ == EnumC699470Rc9.UNAVAILABLE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LinkedHashMap<String, C699400Rc2> linkedHashMap2 = this.LIZ.LJIIJJI;
                    String str2 = str;
                    EnumC699470Rc9 enumC699470Rc92 = c699410Rc3.LIZIZ;
                    long j2 = c699410Rc3.LIZJ;
                    if (c699400Rc2 != null && c699400Rc2.LJ) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    linkedHashMap2.put(str2, new C699400Rc2(enumC699470Rc92, j2, false, z, z2));
                    C699340Rbw c699340Rbw5 = this.LIZ;
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("state cached, executeId=");
                    sbLIZ7.append(this.LIZ.LJIILL);
                    sbLIZ7.append(", slotId=");
                    sbLIZ7.append(str);
                    sbLIZ7.append(", state=");
                    sbLIZ7.append(c699410Rc3.LIZIZ);
                    sbLIZ7.append(", revision=");
                    sbLIZ7.append(c699410Rc3.LIZJ);
                    c699340Rbw5.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ7));
                    EnumC699470Rc9 enumC699470Rc93 = c699410Rc3.LIZIZ;
                    if (c699400Rc2 != null) {
                        enumC699470Rc9 = c699400Rc2.LIZ;
                    } else if (enumC699470Rc93 == EnumC699470Rc9.AVAILABLE) {
                        enumC699470Rc9 = EnumC699470Rc9.UNAVAILABLE;
                    } else {
                        enumC699470Rc9 = enumC699470Rc93;
                    }
                    if (enumC699470Rc9 == enumC699470Rc93) {
                        C699340Rbw c699340Rbw6 = this.LIZ;
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("observer callback skipped for unchanged state, executeId=");
                        sbLIZ8.append(this.LIZ.LJIILL);
                        sbLIZ8.append(", slotId=");
                        sbLIZ8.append(str);
                        sbLIZ8.append(", state=");
                        sbLIZ8.append(enumC699470Rc93);
                        sbLIZ8.append(", revision=");
                        sbLIZ8.append(c699410Rc3.LIZJ);
                        c699340Rbw6.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ8));
                        return;
                    }
                    if (!this.LIZ.LJIJI) {
                        if (this.LIZ.LIZIZ.invoke(str) != null) {
                            if (this.LIZ.LJII(str, str, c699410Rc3.LIZIZ, c699410Rc3.LIZJ, false) == EnumC699420Rc4.LL && (interfaceC1631620sYq2 = this.LIZ.LIZJ) != null) {
                                interfaceC1631620sYq2.invoke(str, enumC699470Rc9, enumC699470Rc93);
                                return;
                            }
                            return;
                        }
                        C699340Rbw c699340Rbw7 = this.LIZ;
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append("dispatch skipped because protocol missing, executeId=");
                        sbLIZ9.append(this.LIZ.LJIILL);
                        sbLIZ9.append(", slotId=");
                        sbLIZ9.append(str);
                        sbLIZ9.append(", state=");
                        sbLIZ9.append(c699410Rc3.LIZIZ);
                        sbLIZ9.append(", revision=");
                        sbLIZ9.append(c699410Rc3.LIZJ);
                        c699340Rbw7.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ9));
                        if (enumC699470Rc93 == EnumC699470Rc9.UNAVAILABLE && (interfaceC1631620sYq = this.LIZ.LIZJ) != null) {
                            interfaceC1631620sYq.invoke(str, enumC699470Rc9, enumC699470Rc93);
                            return;
                        }
                        return;
                    }
                    C699340Rbw c699340Rbw8 = this.LIZ;
                    String str3 = str;
                    c699340Rbw8.LJI(new C699380Rc0(str3, str3, c699410Rc3.LIZIZ, c699410Rc3.LIZJ, c698780Rb2, enumC699470Rc9, enumC699470Rc93));
                }
            }));
        }
    }

    public static final void LJFF(C700400Rde c700400Rde, LinkedHashMap linkedHashMap) {
        Set setLLIIJI = C13LP.LLIIJI(C13LP.LLIIII(c700400Rde.LIZJ.keySet()));
        if (!setLLIIJI.isEmpty()) {
            linkedHashMap.put(c700400Rde.LIZ, setLLIIJI);
        }
        c700400Rde.LIZIZ(new C699330Rbv(linkedHashMap));
    }

    public final void LIZ(FcpSlotStrategy fcpSlotStrategy, Function2<? super List<C703160Ri6>, ? super Boolean, String> function2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        List<FcpSlotConfig> list;
        List<FcpSlotConfig> list2;
        if (fcpSlotStrategy != null && (list2 = fcpSlotStrategy.entranceConfigs) != null) {
            arrayList = new ArrayList(list2);
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            String str = ((FcpSlotConfig) obj).slotId;
            if (str != null && str.length() != 0) {
                arrayList3.add(obj);
            }
        }
        if (fcpSlotStrategy != null && (list = fcpSlotStrategy.exitConfigs) != null) {
            arrayList2 = new ArrayList(list);
        } else {
            arrayList2 = new ArrayList();
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList2) {
            String str2 = ((FcpSlotConfig) obj2).slotId;
            if (str2 != null && str2.length() != 0) {
                arrayList4.add(obj2);
            }
        }
        List listLJLIL = C13LP.LJLIL(arrayList4, arrayList3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : (ArrayList) listLJLIL) {
            String str3 = ((FcpSlotConfig) obj3).slotId;
            if (str3 == null) {
                str3 = "";
            }
            Object arrayList5 = linkedHashMap.get(str3);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(str3, arrayList5);
            }
            ((List) arrayList5).add(obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list3 = (List) entry.getValue();
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                z = false;
            } else {
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (((FcpSlotConfig) it2.next()).enableOneWayLifecycle) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            linkedHashMap2.put(key, Boolean.valueOf(z));
        }
        List listLJLIL2 = C13LP.LJLIL(LIZJ(arrayList4, EnumC703190Ri9.REMOVE, linkedHashMap2), LIZJ(arrayList3, EnumC703190Ri9.ADD, linkedHashMap2));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = ((ArrayList) listLJLIL2).iterator();
        while (it3.hasNext()) {
            linkedHashSet.add(((C703160Ri6) it3.next()).LIZ);
        }
        List<C722602rw> listLIZ = C722502rv.LIZ(arrayList3);
        this.LJIILJJIL = new C722702rx(listLIZ, C13LP.LJLIL(C722502rv.LIZ(arrayList4), listLIZ));
        boolean z2 = !Intrinsics.LJFF(linkedHashSet, this.LJIILIIL);
        C19719612Di.LJJIII(this.LJIIJJI.entrySet(), new C5183020f((Set) linkedHashSet, (Set<Integer>) 160), true);
        this.LJIILIIL = linkedHashSet;
        LJIIJJI(function2.invoke(listLJLIL2, Boolean.valueOf(z2)));
        InterfaceC699310Rbt interfaceC699310Rbt = this.LIZ;
        if (interfaceC699310Rbt != null) {
            interfaceC699310Rbt.LIZ(new C1937007iK(listLJLIL2));
            if (z2) {
                LJIILJJIL(interfaceC699310Rbt);
            }
        }
    }

    public final void LJIILL(C699130Rbb c699130Rbb, C702940Rhk c702940Rhk) {
        List listLJLLJ = C13LP.LJLLJ(c699130Rbb.LIZIZ);
        Set setLLIIJI = C13LP.LLIIJI(listLJLLJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeStrategy touchedSlots, executeId=");
        sbLIZ.append(c699130Rbb.LIZ);
        sbLIZ.append(", touchedSlotIds=");
        sbLIZ.append(listLJLLJ);
        sbLIZ.append(", snapshotVersion=");
        sbLIZ.append(c702940Rhk.LIZ);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        for (String str : C13LP.LJLLJ(C13LP.LLIIII(this.LJIILIIL))) {
            if (setLLIIJI.contains(str)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("executeStrategy slotTriggered, executeId=");
                sbLIZ2.append(c699130Rbb.LIZ);
                sbLIZ2.append(", slotId=");
                sbLIZ2.append(str);
                LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("executeStrategy slotNotTriggered, executeId=");
                sbLIZ3.append(c699130Rbb.LIZ);
                sbLIZ3.append(", slotId=");
                sbLIZ3.append(str);
                sbLIZ3.append(", reason=rule_not_matched_or_blocked");
                LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }

    public static List LIZJ(List list, EnumC703190Ri9 enumC703190Ri9, Map map) {
        Set setLLIIJI;
        List<String> list2;
        Set setLLIIJI2;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (FcpSlotConfig fcpSlotConfig : (ArrayList) list) {
            String str = fcpSlotConfig.slotId;
            if (str == null) {
                str = "";
            }
            List<String> list3 = fcpSlotConfig.whitelistComponentKeys;
            if (list3 == null || (setLLIIJI = C13LP.LLIIJI(list3)) == null) {
                setLLIIJI = C08CX.INSTANCE;
            }
            if ((!setLLIIJI.isEmpty()) || (list2 = fcpSlotConfig.blacklistComponentKeys) == null || (setLLIIJI2 = C13LP.LLIIJI(list2)) == null) {
                setLLIIJI2 = C08CX.INSTANCE;
            }
            Long l = fcpSlotConfig.delayMS;
            List<String> list4 = fcpSlotConfig.timingKeys;
            if (list4 != null) {
                arrayList = new ArrayList(list4);
            } else {
                arrayList = null;
            }
            arrayList2.add(new C703160Ri6(str, enumC703190Ri9, l, arrayList, setLLIIJI, setLLIIJI2, Intrinsics.LJFF(((LinkedHashMap) map).get(str), Boolean.TRUE)));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0258 A[PHI: r18
      0x0258: PHI (r18v1 X.0Rch) = (r18v0 X.0Rch), (r18v4 X.0Rch) binds: [B:83:0x024c, B:87:0x0256] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC699420Rc4 LJII(java.lang.String r29, java.lang.String r30, X.EnumC699470Rc9 r31, long r32, boolean r34) {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C699340Rbw.LJII(java.lang.String, java.lang.String, X.0Rc9, long, boolean):X.0Rc4");
    }

    public C699340Rbw(InterfaceC699310Rbt interfaceC699310Rbt, C698320RaI c698320RaI, C699900Rcq c699900Rcq, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112, C698260RaC c698260RaC, C698730Rax c698730Rax) {
        this.LIZ = interfaceC699310Rbt;
        this.LIZIZ = c698320RaI;
        this.LIZJ = c699900Rcq;
        this.LIZLLL = awS555S0100000_11;
        this.LJ = awS555S0100000_112;
        this.LJFF = c698260RaC;
        this.LJI = c698730Rax;
        Object obj = new Object();
        this.LJIIL = obj;
        this.LJIILIIL = C08CX.INSTANCE;
        this.LJIILJJIL = C722702rx.LIZJ;
        this.LJIILLIIL = C2097608Jq.LJ();
        this.LJIIZILJ = new C698780Rb2(null, 0L, 0L);
        if (c698730Rax != null) {
            C699360Rby c699360Rby = new C699360Rby(this);
            c698730Rax.LJ = obj;
            c698730Rax.LJFF = c699360Rby;
        }
    }
}
