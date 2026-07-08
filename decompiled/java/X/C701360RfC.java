package X;

import com.ss.android.ugc.IFcpTraceRecorderService;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.feed.platform.ab.FcpKmpCrossValidationExp;
import com.ss.android.ugc.feed.platform.cell.interact.next.ability.FcpAbilityKt$createFcpComponentProtocol$1;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS94S0210000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701360RfC implements InterfaceC702000RgE, InterfaceC695090ROh, InterfaceC702410Rgt {
    public final String LL;
    public final InterfaceC700330RdX LLILLJJLI;
    public final InterfaceC702060RgK<?> LLILLL;
    public final InterfaceC702260Rge LLILZ;
    public final C701670Rfh LLILZIL;
    public final InterfaceC702040RgI LLILZLL;
    public final InterfaceC702380Rgq<WeakReference<C704830Rkn>> LLIZ;
    public final C704830Rkn LLIZLLLIL;
    public final boolean LLJ;
    public final Function0<InterfaceC699620RcO> LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(349));
    public final C701860Rg0 LLJILJIL;
    public Function0<Unit> LLJILJILJ;
    public Function0<Unit> LLJILLL;
    public final InterfaceC700020Rd2<?> LLJJ;
    public Map<String, InterfaceC700010Rd1> LLJJI;

    @Override // X.InterfaceC702000RgE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC702000RgE
    public final InterfaceC695090ROh LJFF() {
        return this;
    }

    @Override // X.InterfaceC702410Rgt
    public final void hl() {
    }

    @Override // X.InterfaceC702000RgE
    public final InterfaceC701260Rf2 vk() {
        return this;
    }

    @Override // X.InterfaceC702000RgE
    public final void LIZ() {
        this.LLJJ.LJLI();
        C0T6L.LIZLLL();
        this.LLJJ.LJLI();
        C0T6L.LIZLLL();
        this.LLILLL.LIZLLL();
        this.LLILLL.LIZ();
        C701860Rg0 c701860Rg0 = this.LLJILJIL;
        if (c701860Rg0 != null) {
            c701860Rg0.LIZ(null, "update_unbind_handle_action");
        }
        Function0<Unit> function0 = this.LLJILJILJ;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function02 = this.LLJILLL;
        if (function02 != null) {
            function02.invoke();
        }
        Map<String, InterfaceC700010Rd1> map = this.LLJJI;
        if (map != null) {
            map.clear();
        }
        this.LLJJI = null;
        this.LLIZ.clear();
    }

    @Override // X.InterfaceC702000RgE
    public final void LJI() {
        Map<String, ConditionData> map;
        Set<String> setKeySet;
        List<String> listLLIIII;
        Map<String, ConditionData> map2;
        Set<String> setKeySet2;
        List listLLIIII2;
        ClientStandardModel clientStandardModelKn;
        Map<String, Integer> map3;
        Function0<Unit> function0 = this.LLJILJILJ;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function02 = this.LLJILLL;
        if (function02 != null) {
            function02.invoke();
        }
        C701610Rfb c701610Rfb = new C701610Rfb(this);
        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 397);
        C701860Rg0 c701860Rg0 = this.LLJILJIL;
        LinkedHashMap linkedHashMap = null;
        this.LLJILJILJ = c701860Rg0 != null ? c701860Rg0.LIZJ(new C2217381BqS() { // from class: X.0Rgw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C700730ReB) obj).LJ;
            }
        }, c701610Rfb, awS590S0100000_11) : null;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1374);
        AwS590S0100000_11 awS590S0100000_112 = new AwS590S0100000_11(this, 396);
        C701860Rg0 c701860Rg02 = this.LLJILJIL;
        this.LLJILLL = c701860Rg02 != null ? c701860Rg02.LIZJ(new C2217381BqS() { // from class: X.0Rgy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C700730ReB) obj).LIZLLL;
            }
        }, awS555S0100000_11, awS590S0100000_112) : null;
        this.LLJJ.LJLI();
        C0T6L.LIZLLL();
        this.LLILLL.LIZIZ();
        C701860Rg0 c701860Rg03 = this.LLJILJIL;
        if (c701860Rg03 != null) {
            c701860Rg03.LIZ(null, "update_bind_handle_action");
        }
        C701860Rg0 store = this.LLILLJJLI.getStore();
        C701670Rfh c701670Rfh = this.LLILZIL;
        final C700920ReU c700920ReU = new C700920ReU(this, store);
        final C700300RdU c700300RdU = new C700300RdU(this);
        ClientStandardModel clientStandardModelKn2 = this.LLILLJJLI.getContext().LJFF.kn(this.LL);
        if (clientStandardModelKn2 != null && (map2 = clientStandardModelKn2.componentsConditionMap) != null && (setKeySet2 = map2.keySet()) != null && (listLLIIII2 = C13LP.LLIIII(setKeySet2)) != null) {
            linkedHashMap = new LinkedHashMap();
            if (!listLLIIII2.isEmpty()) {
                ListIterator listIterator = listLLIIII2.listIterator(listLLIIII2.size());
                while (listIterator.hasPrevious()) {
                    String str = (String) listIterator.previous();
                    FcpKmpCrossValidationExp fcpKmpCrossValidationExp = FcpKmpCrossValidationExp.LIZ;
                    String strKo = this.LLILLL.Ko();
                    fcpKmpCrossValidationExp.getClass();
                    if (!FcpKmpCrossValidationExp.LIZ(strKo) || ((clientStandardModelKn = this.LLILLJJLI.getContext().LJFF.kn(this.LL)) != null && (map3 = clientStandardModelKn.componentsUiTypeMap) != null && map3.get(str) != null)) {
                        InterfaceC702540Rh6 interfaceC702540Rh6LIZ = this.LLIZ.LIZ(new WeakReference(this.LLIZLLLIL), str);
                        if (interfaceC702540Rh6LIZ != null) {
                            interfaceC702540Rh6LIZ.D6(this.LLILLJJLI.LIZ().LIZ());
                        }
                        final InterfaceC700020Rd2<?> interfaceC700020Rd2 = this.LLJJ;
                        final FcpAbilityKt$createFcpComponentProtocol$1 fcpAbilityKt$createFcpComponentProtocol$1 = new FcpAbilityKt$createFcpComponentProtocol$1(c701670Rfh.invoke(str), this.LLILLJJLI, this.LLILZ, interfaceC702540Rh6LIZ, str, this.LL);
                        linkedHashMap.put(str, new InterfaceC700010Rd1() { // from class: X.0ReV
                            public final EnumC696040RRy LIZ = EnumC696040RRy.CUSTOM;

                            @Override // X.InterfaceC700010Rd1
                            public final boolean LJ() {
                                return true;
                            }

                            @Override // X.InterfaceC700010Rd1
                            public final FcpNodeProtocol LIZJ() {
                                return fcpAbilityKt$createFcpComponentProtocol$1;
                            }

                            @Override // X.InterfaceC700010Rd1
                            public final EnumC696040RRy getType() {
                                return this.LIZ;
                            }

                            @Override // X.InterfaceC700010Rd1
                            public final boolean LIZIZ(C700170RdH c700170RdH) {
                                Map<InterfaceC700010Rd1, C699980Rcy> map4;
                                Object obj = null;
                                if ((c700170RdH instanceof C700170RdH) && c700170RdH != null && (map4 = c700170RdH.LJIILL) != null) {
                                    obj = ((LinkedHashMap) map4).get(this);
                                }
                                return c700300RdU.invoke(fcpAbilityKt$createFcpComponentProtocol$1.LLLII(), (C699980Rcy) obj).booleanValue();
                            }

                            @Override // X.InterfaceC700010Rd1
                            public final void LJFF(C701040Reg c701040Reg) {
                                interfaceC700020Rd2.LJLI();
                                new AwS412S0200000_11(this, fcpAbilityKt$createFcpComponentProtocol$1, 56);
                                C0T6L.LIZLLL();
                            }

                            @Override // X.InterfaceC700010Rd1
                            public final boolean LIZ(C698680Ras c698680Ras, C700170RdH c700170RdH) {
                                C699980Rcy c699980Rcy;
                                List<String> list;
                                Map<InterfaceC700010Rd1, C699980Rcy> map4;
                                List<String> list2 = null;
                                if ((c700170RdH instanceof C700170RdH) && c700170RdH != null && (map4 = c700170RdH.LJIILL) != null) {
                                    c699980Rcy = (C699980Rcy) ((LinkedHashMap) map4).get(this);
                                } else {
                                    c699980Rcy = null;
                                }
                                interfaceC700020Rd2.LJLI();
                                new AwS255S0300000_11(this, fcpAbilityKt$createFcpComponentProtocol$1, c698680Ras, 5);
                                C0T6L.LIZLLL();
                                if (c698680Ras != null) {
                                    list2 = c698680Ras.LIZIZ;
                                }
                                if (C866950Xzh.LIZIZ(list2) && c698680Ras != null && (list = c698680Ras.LIZIZ) != null && C13LP.LJJJJ(fcpAbilityKt$createFcpComponentProtocol$1.LLLII(), list)) {
                                    if (c699980Rcy != null) {
                                        c699980Rcy.LJ = Boolean.TRUE;
                                    }
                                    return true;
                                }
                                return c700920ReU.invoke(fcpAbilityKt$createFcpComponentProtocol$1.LLLII(), c698680Ras, c699980Rcy).booleanValue();
                            }

                            @Override // X.InterfaceC700010Rd1
                            public final void LIZLLL(boolean z, C701040Reg c701040Reg) {
                                interfaceC700020Rd2.LJLI();
                                new AwS94S0210000_11(this, fcpAbilityKt$createFcpComponentProtocol$1, z, 1);
                                C0T6L.LIZLLL();
                            }
                        });
                    }
                }
            }
        }
        this.LLJJI = linkedHashMap;
        ClientStandardModel clientStandardModelKn3 = this.LLILLJJLI.getContext().LJFF.kn(this.LL);
        if (clientStandardModelKn3 != null && (map = clientStandardModelKn3.componentsConditionMap) != null && (setKeySet = map.keySet()) != null && (listLLIIII = C13LP.LLIIII(setKeySet)) != null) {
            for (String str2 : listLLIIII) {
                this.LLILZLL.OS(this.LLIZLLLIL.LIZIZ(str2), str2);
            }
        }
        this.LLILZLL.rr(this.LLJJ.LIZ());
    }

    @Override // X.InterfaceC695090ROh
    public final List<InterfaceC695090ROh> LJ() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC695090ROh
    public final List<InterfaceC700010Rd1> LJII(C701040Reg c701040Reg) {
        String str;
        Collection<InterfaceC700010Rd1> collectionValues;
        List<InterfaceC700010Rd1> listLLIIII;
        String strKo = this.LLILLL.Ko();
        if (c701040Reg != null) {
            str = c701040Reg.LIZ;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(strKo, str)) {
            return C13BV.INSTANCE;
        }
        Map<String, InterfaceC700010Rd1> map = this.LLJJI;
        if (map == null || (collectionValues = map.values()) == null || (listLLIIII = C13LP.LLIIII(collectionValues)) == null) {
            return C13BV.INSTANCE;
        }
        return listLLIIII;
    }

    @Override // X.InterfaceC702000RgE
    public final void LJIIIIZZ(C700950ReX c700950ReX) {
        if (!this.LLJ) {
            return;
        }
        LJIIIZ(c700950ReX);
    }

    public final void LJIIIZ(C700950ReX c700950ReX) {
        if (c700950ReX != null) {
            this.LLJJ.LJLI();
            C0T6L.LIZLLL();
            this.LLJJ.LJLI();
            C0T6L.LIZLLL();
            C701860Rg0 c701860Rg0 = this.LLJILJIL;
            if (c701860Rg0 != null) {
                c701860Rg0.LIZ(c700950ReX, "update_result_slot_action");
            }
        }
        C704830Rkn c704830Rkn = this.LLIZLLLIL;
        c704830Rkn.LJ.LJFF++;
        Iterator it2 = ((LinkedHashMap) c704830Rkn.LJII).entrySet().iterator();
        while (it2.hasNext()) {
            ((C704830Rkn) ((Map.Entry) it2.next()).getValue()).LJ.LJFF++;
        }
    }

    @Override // X.InterfaceC702410Rgt
    public final void vg(C700950ReX c700950ReX) {
        this.LLJJ.LJLI();
        new AwS555S0100000_11(c700950ReX, 1373);
        C0T6L.LIZLLL();
        if (this.LLJ) {
            return;
        }
        LJIIIZ(c700950ReX);
    }

    @Override // X.InterfaceC701260Rf2
    public final List<String> LIZJ(List<String> list, C700760ReE c700760ReE) {
        List<String> list2;
        C700730ReB c700730ReBLIZIZ;
        this.LLJJ.LJLI();
        new C701680Rfi(list);
        C0T6L.LIZLLL();
        this.LLJJ.LJLI();
        C0T6L.LIZLLL();
        this.LLJJ.LJLI();
        C0T6L.LIZLLL();
        C701860Rg0 c701860Rg0 = this.LLJILJIL;
        if (c701860Rg0 != null) {
            c701860Rg0.LIZ(new Pair(list, c700760ReE), "update_calculate_slot_component_action");
        }
        C701860Rg0 c701860Rg02 = this.LLJILJIL;
        if (c701860Rg02 == null || (c700730ReBLIZIZ = c701860Rg02.LIZIZ()) == null || (list2 = c700730ReBLIZIZ.LIZJ) == null) {
            list2 = C13BV.INSTANCE;
        }
        this.LLJJ.LJLI();
        new C701690Rfj(list2);
        C0T6L.LIZLLL();
        return list2;
    }

    @Override // X.InterfaceC702000RgE
    public final void LIZIZ(String str, boolean z, boolean z2) {
        boolean zLJJJJ;
        C700730ReB c700730ReBLIZIZ;
        List<String> list;
        C700730ReB c700730ReBLIZIZ2;
        List<String> list2;
        boolean zLJJJJ2 = false;
        if (z) {
            this.LLJJ.LJLI();
            C0T6L.LIZLLL();
            this.LLJJ.LJLI();
            C0T6L.LIZLLL();
            C701860Rg0 c701860Rg0 = this.LLJILJIL;
            if (c701860Rg0 != null && (c700730ReBLIZIZ2 = c701860Rg0.LIZIZ()) != null && (list2 = c700730ReBLIZIZ2.LIZJ) != null) {
                zLJJJJ = C13LP.LJJJJ(str, list2);
            } else {
                zLJJJJ = false;
            }
            C701860Rg0 c701860Rg02 = this.LLJILJIL;
            if (c701860Rg02 != null) {
                c701860Rg02.LIZ(str, "update_mount_slot_component_action");
            }
            C701860Rg0 c701860Rg03 = this.LLJILJIL;
            if (c701860Rg03 != null && (c700730ReBLIZIZ = c701860Rg03.LIZIZ()) != null && (list = c700730ReBLIZIZ.LIZJ) != null) {
                zLJJJJ2 = C13LP.LJJJJ(str, list);
            }
            if (!zLJJJJ && zLJJJJ2) {
                this.LLILLL.LIZJ(C701300Rf6.LIZ, str, z2);
                return;
            }
            return;
        }
        if (str == null || str.length() == 0) {
            return;
        }
        this.LLJJ.LJLI();
        C0T6L.LIZLLL();
        this.LLJJ.LJLI();
        C0T6L.LIZLLL();
        C701860Rg0 c701860Rg04 = this.LLJILJIL;
        if (c701860Rg04 == null) {
            return;
        }
        c701860Rg04.LIZ(str, "update_unmount_slot_handle_action");
    }

    public final void LJIIJJI(String str, boolean z, boolean z2) {
        InterfaceC699620RcO interfaceC699620RcOInvoke;
        Function0<InterfaceC699620RcO> function0 = this.LLJI;
        if (function0 != null && (interfaceC699620RcOInvoke = function0.invoke()) != null) {
            IFcpTraceRecorderService iFcpTraceRecorderService = (IFcpTraceRecorderService) this.LLJIJIL.getValue();
            if (iFcpTraceRecorderService != null) {
                iFcpTraceRecorderService.LIZLLL(interfaceC699620RcOInvoke, new C701790Rft(str, z, z2));
            }
            IFcpTraceRecorderService iFcpTraceRecorderService2 = (IFcpTraceRecorderService) this.LLJIJIL.getValue();
            if (iFcpTraceRecorderService2 != null) {
                iFcpTraceRecorderService2.LIZ(interfaceC699620RcOInvoke);
            }
        }
    }

    public final boolean LJIIJ(C701860Rg0 c701860Rg0, ClientStandardModel clientStandardModel, String str, C698680Ras c698680Ras, C699980Rcy c699980Rcy) {
        Map<String, ConditionData> map;
        ConditionData conditionData;
        Set setLJJL;
        boolean z;
        if (str == null || clientStandardModel == null || (map = clientStandardModel.componentsConditionMap) == null || (conditionData = map.get(str)) == null) {
            return false;
        }
        new AwS127S1200000_11(str, c698680Ras, this, 6);
        C0T6L.LIZLLL();
        Function2<C698680Ras, String, Boolean> function2 = this.LLILLJJLI.getContext().LIZLLL;
        List<String> list = conditionData.outreachTimings;
        if (list != null) {
            Iterable iterable = c698680Ras.LIZ;
            if (iterable == null) {
                iterable = C13BV.INSTANCE;
            }
            setLJJL = C13LP.LJJL(list, iterable);
        } else {
            setLJJL = null;
        }
        if (C866950Xzh.LIZIZ(setLJJL) && function2.invoke(c698680Ras, str).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (c699980Rcy != null) {
            c699980Rcy.LJ = Boolean.valueOf(z);
        }
        if (!z) {
            if (c699980Rcy != null) {
                c699980Rcy.LJFF = "don't handle signal";
                c699980Rcy.LJI = C2097608Jq.LJIIIIZZ(new Pair("incoming_signal", c698680Ras.LIZ), new Pair("is_accepted", Boolean.FALSE));
            }
            return z;
        }
        if (c701860Rg0 != null) {
            c701860Rg0.LIZ(str, "update_mount_slot_component_action");
        }
        this.LLJJ.LJLI();
        return z;
    }

    public C701360RfC(String str, C701470RfN c701470RfN, C697740RYm c697740RYm, C701480RfO c701480RfO, C701670Rfh c701670Rfh, C616040OEg c616040OEg, C701500RfQ c701500RfQ, C704830Rkn c704830Rkn, boolean z, AwS555S0100000_11 awS555S0100000_11) {
        this.LL = str;
        this.LLILLJJLI = c701470RfN;
        this.LLILLL = c697740RYm;
        this.LLILZ = c701480RfO;
        this.LLILZIL = c701670Rfh;
        this.LLILZLL = c616040OEg;
        this.LLIZ = c701500RfQ;
        this.LLIZLLLIL = c704830Rkn;
        this.LLJ = z;
        this.LLJI = awS555S0100000_11;
        this.LLJILJIL = c701470RfN.getStore();
        this.LLJJ = c701470RfN.LJIIIIZZ;
        if (!z) {
            c697740RYm.LJ(this);
        }
    }
}
