package X;

import com.ss.android.ugc.IFcpTraceRecorderService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.aweme.feed.model.banner.StandardButtonContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentUi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS87S1200000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701350RfB implements InterfaceC702000RgE, InterfaceC695090ROh {
    public final String LL;
    public final InterfaceC700330RdX LLILLJJLI;
    public final InterfaceC702060RgK<?> LLILLL;
    public final InterfaceC702260Rge LLILZ;
    public final InterfaceC702040RgI LLILZIL;
    public final C704830Rkn LLILZLL;
    public final Function0<C0RXZ> LLIZ;
    public final InterfaceC700020Rd2<?> LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(430));
    public Function0<Unit> LLJI;
    public Function0<Unit> LLJIJIL;

    @Override // X.InterfaceC702000RgE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC702000RgE
    public final InterfaceC695090ROh LJFF() {
        return this;
    }

    @Override // X.InterfaceC702000RgE
    public final InterfaceC701260Rf2 vk() {
        return this;
    }

    @Override // X.InterfaceC702000RgE
    public final void LIZ() {
        this.LLILZIL.LJJJJZ();
        C0RXZ c0rxzInvoke = this.LLIZ.invoke();
        if (c0rxzInvoke != null) {
            c0rxzInvoke.reset();
        }
        Function0<Unit> function0 = this.LLJI;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLJI = null;
        Function0<Unit> function02 = this.LLJIJIL;
        if (function02 != null) {
            function02.invoke();
        }
        this.LLJIJIL = null;
    }

    @Override // X.InterfaceC702000RgE
    public final void LJI() {
        Map<String, ConditionData> map;
        Set<String> setKeySet;
        List<String> listLLIIII;
        Aweme aweme;
        StandardComponentInfo standardComponentInfo;
        StandardButtonContainerStruct standardButtonContainerStruct;
        List<StandardComponentStruct> list;
        String str;
        if (this.LLILLJJLI.getContext().LJFF.kn(this.LL) == null) {
            VideoItemParams videoItemParamsLIZ = this.LLIZLLLIL.LIZ();
            if ((videoItemParamsLIZ instanceof VideoItemParams) && videoItemParamsLIZ != null && (aweme = videoItemParamsLIZ.getAweme()) != null && (standardComponentInfo = aweme.getStandardComponentInfo()) != null) {
                Aweme aweme2 = videoItemParamsLIZ.getAweme();
                String strLIZ = C0RZ5.LIZ(this.LLIZLLLIL.getScene(), aweme2 != null ? AwemeExtKt.getGenreType(aweme2) : null);
                if (strLIZ != null && (standardButtonContainerStruct = standardComponentInfo.buttonContainer) != null && (list = standardButtonContainerStruct.buttons) != null) {
                    ClientStandardModel clientStandardModelLIZ = C721202ri.LIZ(list);
                    Map<String, ConditionData> map2 = clientStandardModelLIZ.componentsConditionMap;
                    if (map2 != null) {
                        Iterator<Map.Entry<String, ConditionData>> it2 = map2.entrySet().iterator();
                        while (it2.hasNext()) {
                            ConditionData value = it2.next().getValue();
                            value.setCanApplySlot(value.slotConsumeTimes > 0 && Intrinsics.LJFF(value.canDefaultApplySlot, Boolean.TRUE));
                            value.setCanApplyDisplay(Intrinsics.LJFF(value.canDefaultApplyDisplay, Boolean.TRUE));
                        }
                    }
                    Map<String, ConditionData> map3 = clientStandardModelLIZ.componentsConditionMap;
                    if (C19719512Dh.LJII(map3) && map3 != null) {
                        Map<String, FcpUiTemplate> map4 = clientStandardModelLIZ.componentsTemplateMap;
                        if (!C19719512Dh.LJII(map4)) {
                            map4 = null;
                        }
                        Map<String, Integer> map5 = clientStandardModelLIZ.componentsUiTypeMap;
                        if (!C19719512Dh.LJII(map5)) {
                            map5 = null;
                        }
                        Map<String, Map<String, String>> map6 = clientStandardModelLIZ.componentsMobMap;
                        if (!C19719512Dh.LJII(map6)) {
                            map6 = null;
                        }
                        Map<String, Map<String, Object>> map7 = clientStandardModelLIZ.componentsCustomInfoMap;
                        if (!C19719512Dh.LJII(map7)) {
                            map7 = null;
                        }
                        for (StandardComponentStruct standardComponentStruct : list) {
                            StandardComponentKey standardComponentKey = standardComponentStruct.key;
                            if (standardComponentKey != null && (str = standardComponentKey.componentKey) != null) {
                                if (!map3.containsKey(str)) {
                                    map3.put(str, C721202ri.LIZIZ(standardComponentStruct));
                                }
                                if (map4 != null) {
                                    StandardComponentUi standardComponentUi = standardComponentStruct.ui;
                                    map4.put(str, standardComponentUi != null ? standardComponentUi.template : null);
                                }
                                if (map5 != null) {
                                    StandardComponentUi standardComponentUi2 = standardComponentStruct.ui;
                                    map5.put(str, Integer.valueOf(standardComponentUi2 != null ? standardComponentUi2.uiType : -1));
                                }
                                if (map6 != null) {
                                    map6.put(str, C721202ri.LIZLLL(standardComponentStruct));
                                }
                                if (map7 != null) {
                                    map7.put(str, C721202ri.LIZJ(standardComponentStruct));
                                }
                            }
                        }
                    }
                    standardComponentInfo.putClientModel(strLIZ, "standardized_bottom_button", clientStandardModelLIZ);
                }
            }
        }
        ClientStandardModel clientStandardModelKn = this.LLILLJJLI.getContext().LJFF.kn(this.LL);
        if (clientStandardModelKn != null && (map = clientStandardModelKn.componentsConditionMap) != null && (setKeySet = map.keySet()) != null && (listLLIIII = C13LP.LLIIII(setKeySet)) != null) {
            for (String str2 : listLLIIII) {
                this.LLILZIL.OS(this.LLILZLL.LIZIZ(str2), str2);
            }
        }
        this.LLILZIL.rr(this.LLIZLLLIL.LIZ());
        Function0<Unit> function0 = this.LLJI;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLJI = null;
        Function0<Unit> function02 = this.LLJIJIL;
        if (function02 != null) {
            function02.invoke();
        }
        this.LLJIJIL = null;
        C0RXZ c0rxzInvoke = this.LLIZ.invoke();
        if (c0rxzInvoke != null) {
            this.LLJI = c0rxzInvoke.LJII(new C2217481Bqc(new C2217381BqS() { // from class: X.0Rgx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1447405lY) obj).LJ;
                }
            }), new AwS368S0200000_2(c0rxzInvoke, this, 121));
            this.LLJIJIL = c0rxzInvoke.LJII(new C2217481Bqc(new C2217381BqS() { // from class: X.0Rgz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1447405lY) obj).LIZLLL;
                }
            }), new AwS368S0200000_2(c0rxzInvoke, this, 122));
        }
    }

    @Override // X.InterfaceC695090ROh
    public final List<InterfaceC695090ROh> LJ() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC695090ROh
    public final List<InterfaceC700010Rd1> LJII(C701040Reg c701040Reg) {
        String str;
        String strKo = this.LLILLL.Ko();
        if (c701040Reg != null) {
            str = c701040Reg.LIZ;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(strKo, str)) {
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC702000RgE
    public final void LJIIIIZZ(C700950ReX c700950ReX) {
        C704830Rkn c704830Rkn = this.LLILZLL;
        c704830Rkn.LJ.LJFF++;
        Iterator it2 = ((LinkedHashMap) c704830Rkn.LJII).entrySet().iterator();
        while (it2.hasNext()) {
            ((C704830Rkn) ((Map.Entry) it2.next()).getValue()).LJ.LJFF++;
        }
    }

    @Override // X.InterfaceC701260Rf2
    public final List<String> LIZJ(List<String> list, C700760ReE c700760ReE) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC702000RgE
    public final void LIZIZ(String str, boolean z, boolean z2) {
        C0RXZ c0rxzInvoke = this.LLIZ.invoke();
        if (c0rxzInvoke == null) {
            return;
        }
        if (z) {
            c0rxzInvoke.LJI(C1697810uHb.LJIIL(str), C1697810uHb.LJIIJJI(new Pair("signal", null), new Pair("enable", null), new Pair("active", null), new Pair("density", null)), null);
        } else {
            c0rxzInvoke.LIZLLL(C1697810uHb.LJIIL(str));
        }
    }

    public final void LJIIIZ(C0RXZ c0rxz, String str, Boolean bool, Boolean bool2) {
        IFcpTraceRecorderService iFcpTraceRecorderService;
        Aweme aweme;
        String aid;
        boolean z;
        C0RZ2 c0rz2;
        VideoItemParams videoItemParamsLIZ = this.LLIZLLLIL.LIZ();
        if ((videoItemParamsLIZ instanceof VideoItemParams) && videoItemParamsLIZ != null && (aweme = videoItemParamsLIZ.getAweme()) != null && (aid = aweme.getAid()) != null) {
            Boolean bool3 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool3) && Intrinsics.LJFF(bool2, bool3)) {
                z = true;
            } else {
                z = false;
            }
            EnumC699110RbZ enumC699110RbZ = EnumC699110RbZ.FINALSHOW;
            if (z) {
                c0rz2 = C0RZ2.SUCCEED;
            } else {
                c0rz2 = C0RZ2.FAILED;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("KMP slot released / not shown (occupied=");
                sbLIZ.append(bool);
                sbLIZ.append(", show=");
                sbLIZ.append(bool2);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C697890RZb.LIZIZ(aid, str, enumC699110RbZ, c0rz2);
        }
        InterfaceC699620RcO interfaceC699620RcOLJIIJJI = c0rxz.LJIIJJI();
        if (interfaceC699620RcOLJIIJJI != null && (iFcpTraceRecorderService = (IFcpTraceRecorderService) this.LLJ.getValue()) != null) {
            iFcpTraceRecorderService.LIZLLL(interfaceC699620RcOLJIIJJI, new AwS87S1200000_2(str, bool, bool2, 8));
        }
    }

    public C701350RfB(String str, C701470RfN c701470RfN, C697740RYm c697740RYm, C701480RfO c701480RfO, C616040OEg c616040OEg, C704830Rkn c704830Rkn, AwS555S0100000_11 awS555S0100000_11) {
        this.LL = str;
        this.LLILLJJLI = c701470RfN;
        this.LLILLL = c697740RYm;
        this.LLILZ = c701480RfO;
        this.LLILZIL = c616040OEg;
        this.LLILZLL = c704830Rkn;
        this.LLIZ = awS555S0100000_11;
        this.LLIZLLLIL = c701470RfN.LJIIIIZZ;
    }
}
