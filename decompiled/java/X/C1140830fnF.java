package X;

import Y.AComparatorS36S0000000_17;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140830fnF implements InterfaceC1138060fim, InterfaceC465240IMg {
    public final C1140340fmS LL;
    public final WeakHandler LLILLJJLI = new WeakHandler(Looper.getMainLooper(), this);
    public final Set<AbstractC1140160fmA> LLILLL;
    public final LinkedHashMap<AbstractC1140160fmA, InterfaceC1140400fmY> LLILZ;
    public final Set<AbstractC1140160fmA> LLILZIL;
    public final Set<AbstractC1140160fmA> LLILZLL;
    public final Set<AbstractC1140160fmA> LLIZ;
    public final Set<AbstractC1140160fmA> LLIZLLLIL;
    public final Set<AbstractC1140160fmA> LLJ;
    public final Set<AbstractC1140160fmA> LLJI;
    public boolean LLJIJIL;
    public final int LLJILJIL;
    public boolean LLJILJILJ;
    public final List<C1140980fnU> LLJILLL;

    @Override // X.InterfaceC1140400fmY
    public final EnumC1138990fkH LIZ() {
        Iterator<InterfaceC1140400fmY> it2 = this.LLILZ.values().iterator();
        return it2.hasNext() ? it2.next().LIZ() : EnumC1138990fkH.NONE;
    }

    public final void LIZLLL() {
        this.LLJI.addAll(this.LLILLL);
        this.LLILLL.clear();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.LLILZ.keySet());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(this.LLILZ.values());
        this.LLILZ.clear();
        this.LLJ.addAll(linkedHashSet);
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1140400fmY) it2.next()).stop();
        }
        this.LLILLJJLI.removeCallbacksAndMessages(null);
        this.LLJILJILJ = false;
        if (!this.LLILLL.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unit miss handled: ");
            sbLIZ.append(this.LLILLL);
            C1141240fnu.LIZIZ("CompositionCall_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1141280fny interfaceC1141280fnyLIZIZ = C1141290fnz.LIZIZ();
        if (interfaceC1141280fnyLIZIZ != null && interfaceC1141280fnyLIZIZ.isOffline()) {
            int size = this.LLIZ.size();
            int size2 = this.LLIZLLLIL.size();
            int size3 = this.LLJ.size();
            int size4 = this.LLJI.size();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initialTotalCnt:");
            sbLIZ2.append(this.LLJILJIL);
            sbLIZ2.append(", successCnt:");
            sbLIZ2.append(size);
            sbLIZ2.append(", errorCnt:");
            sbLIZ2.append(size2);
            sbLIZ2.append(", cancelledCnt:");
            sbLIZ2.append(size3);
            sbLIZ2.append(", notStartCnt:");
            sbLIZ2.append(size4);
            sbLIZ2.append(", liftCycleEvents:");
            sbLIZ2.append(this.LLJILLL);
            C1141240fnu.LIZLLL("CompositionCall_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LLIZ.clear();
        this.LLIZLLLIL.clear();
        this.LLJ.clear();
        this.LLJI.clear();
        ((ArrayList) this.LLJILLL).clear();
    }

    @Override // X.InterfaceC1140400fmY
    public final void start() {
        if (this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = true;
        if (this.LL.LJII.isEmpty()) {
            this.LL.LIZ.LJI(EnumC1138990fkH.NONE, new C1141050fnb(-20, "there is no initial request", null));
            return;
        }
        long j = this.LL.LIZIZ;
        if (j > 0) {
            this.LLILLJJLI.sendEmptyMessageDelayed(LSPassThroughRecordSizeConfig.DEFAULT, j);
        }
        Iterator<AbstractC1140160fmA> it2 = this.LL.LJII.iterator();
        while (it2.hasNext()) {
            LJII(it2.next());
        }
    }

    @Override // X.InterfaceC1140400fmY
    public final void stop() {
        C1141240fnu.LIZLLL("CompositionCall_ttlive_gift_render", "stop");
        if (!(!this.LLILZ.isEmpty())) {
            LJFF(LIZ());
            return;
        }
        this.LLJI.addAll(this.LLILLL);
        this.LLILLL.clear();
        Iterator<Map.Entry<AbstractC1140160fmA, InterfaceC1140400fmY>> it2 = this.LLILZ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().stop();
        }
    }

    @Override // X.InterfaceC1140400fmY
    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerComplete, runningUnits.size=");
        sbLIZ.append(this.LLILZ.size());
        C1141240fnu.LIZLLL("CompositionCall_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<T> it2 = this.LLILZ.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1140400fmY) it2.next()).LIZJ();
        }
    }

    public C1140830fnF(C1140340fmS c1140340fmS) {
        this.LL = c1140340fmS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LLILLL = linkedHashSet;
        this.LLILZ = new LinkedHashMap<>();
        this.LLILZIL = new LinkedHashSet();
        this.LLILZLL = new LinkedHashSet();
        this.LLIZ = new LinkedHashSet();
        this.LLIZLLLIL = new LinkedHashSet();
        this.LLJ = new LinkedHashSet();
        this.LLJI = new LinkedHashSet();
        this.LLJILLL = new ArrayList();
        linkedHashSet.addAll(c1140340fmS.LJII);
        linkedHashSet.addAll(c1140340fmS.LJIIIIZZ);
        Iterator<C1140360fmU> it2 = c1140340fmS.LJIIIZ.iterator();
        while (it2.hasNext()) {
            this.LLILLL.addAll(it2.next().LIZIZ);
        }
        this.LLJILJIL = this.LLILLL.size();
        for (AbstractC1140350fmT abstractC1140350fmT : this.LLILLL) {
            C1140340fmS c1140340fmS2 = this.LL;
            if (abstractC1140350fmT.LIZLLL == -10241024) {
                abstractC1140350fmT.LIZLLL = c1140340fmS2.LIZLLL;
            }
            if (abstractC1140350fmT.LJ == -10241024) {
                abstractC1140350fmT.LJ = c1140340fmS2.LJ;
            }
            for (Map.Entry entry : ((LinkedHashMap) c1140340fmS2.LJFF).entrySet()) {
                if (!abstractC1140350fmT.LJFF.containsKey(entry.getKey())) {
                    abstractC1140350fmT.LJFF.put((Class<?>) entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : ((LinkedHashMap) c1140340fmS2.LJI).entrySet()) {
                if (!abstractC1140350fmT.LJI.containsKey(entry2.getKey())) {
                    abstractC1140350fmT.LJI.put((String) entry2.getKey(), (String) entry2.getValue());
                }
            }
        }
    }

    @Override // X.InterfaceC1140400fmY
    public final void LIZIZ(JSONObject jSONObject) {
        Iterator<T> it2 = this.LLILZ.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1140400fmY) it2.next()).LIZIZ(jSONObject);
        }
    }

    public final void LJFF(EnumC1138990fkH enumC1138990fkH) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleCompositionOnStop engine:");
        sbLIZ.append(enumC1138990fkH.getTypeString());
        C1141240fnu.LIZIZ("CompositionCall_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL();
        this.LL.LIZ.LIZIZ(enumC1138990fkH);
    }

    public final boolean LJI(AbstractC1140160fmA abstractC1140160fmA) {
        return this.LLJ.contains(abstractC1140160fmA);
    }

    public final void LJII(final AbstractC1140160fmA abstractC1140160fmA) {
        InterfaceC1140400fmY interfaceC1140400fmYCreate;
        if (!this.LLILLL.remove(abstractC1140160fmA)) {
            return;
        }
        if (!this.LLILZIL.add(abstractC1140160fmA)) {
            this.LLIZLLLIL.add(abstractC1140160fmA);
            abstractC1140160fmA.LIZ.LJI(EnumC1138990fkH.NONE, new C1141050fnb(-18, "this UnitRequest instance was already used, should create a new one", null));
            return;
        }
        InterfaceC1140880fnK interfaceC1140880fnK = (InterfaceC1140880fnK) C2043807zY.LIZ(InterfaceC1140880fnK.class);
        if (interfaceC1140880fnK != null && (interfaceC1140400fmYCreate = interfaceC1140880fnK.create(abstractC1140160fmA)) != null) {
            this.LLILZ.put(abstractC1140160fmA, interfaceC1140400fmYCreate);
            ((ArrayList) abstractC1140160fmA.LIZ.LIZ).add(new InterfaceC1140870fnJ(abstractC1140160fmA) { // from class: X.0fnG
                public final AbstractC1140160fmA LIZ;

                @Override // X.InterfaceC1140870fnJ
                public final void LIZIZ(EnumC1138990fkH enumC1138990fkH) {
                    if (this.LIZIZ.LLILZ.containsKey(this.LIZ) || this.LIZIZ.LLILLL.contains(this.LIZ)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("unit call onStop, engine:");
                        sbLIZ.append(enumC1138990fkH);
                        C1141240fnu.LIZIZ("CompositionCall_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
                        if (this.LIZIZ.LLILZ.remove(this.LIZ) != null) {
                            this.LIZIZ.LLJ.add(this.LIZ);
                        }
                        if (this.LIZIZ.LLILLL.remove(this.LIZ)) {
                            this.LIZIZ.LLJI.add(this.LIZ);
                        }
                        if (!LJIIJ(enumC1138990fkH, "onStop", null) && this.LIZ.LJII == 0) {
                            this.LIZIZ.LJFF(enumC1138990fkH);
                        }
                    }
                }

                @Override // X.InterfaceC1140870fnJ
                public final void LIZJ(EnumC1138990fkH enumC1138990fkH) {
                    if (LJIIJ(enumC1138990fkH, "onPrepare", null)) {
                        return;
                    }
                    this.LIZIZ.LL.LIZ.LIZJ(enumC1138990fkH);
                }

                @Override // X.InterfaceC1140870fnJ
                public final void LIZLLL(EnumC1138990fkH enumC1138990fkH) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unit call onFirstFrame, engine:");
                    sbLIZ.append(enumC1138990fkH);
                    C1141240fnu.LIZLLL("CompositionCall_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZIZ.LLILZLL.add(this.LIZ);
                    if (LJIIJ(enumC1138990fkH, "onFirstFrame", null)) {
                        return;
                    }
                    this.LIZIZ.LL.LIZ.LIZLLL(enumC1138990fkH);
                    C1140830fnF c1140830fnF = this.LIZIZ;
                    if (!c1140830fnF.LLJILJILJ) {
                        c1140830fnF.LLJILJILJ = true;
                        long j = c1140830fnF.LL.LIZJ;
                        if (j > 0) {
                            c1140830fnF.LLILLJJLI.sendEmptyMessageDelayed(1001, j);
                        }
                    }
                }

                @Override // X.InterfaceC1140870fnJ
                public final void LJFF(EnumC1138990fkH enumC1138990fkH) {
                    if (LJIIJ(enumC1138990fkH, "onPrepared", null)) {
                        return;
                    }
                    this.LIZIZ.LL.LIZ.LJFF(enumC1138990fkH);
                }

                @Override // X.InterfaceC1140870fnJ
                public final void LJII(EnumC1138990fkH enumC1138990fkH) {
                    if (LJIIJ(enumC1138990fkH, "onLoad", null)) {
                        return;
                    }
                    this.LIZIZ.LL.LIZ.LJII(enumC1138990fkH);
                }

                @Override // X.InterfaceC1140870fnJ
                public final void LJIIIIZZ(EnumC1138990fkH enumC1138990fkH) {
                    View view;
                    InterfaceC1140970fnT interfaceC1140970fnT = this.LIZ.LJIIIIZZ.LIZ;
                    if (interfaceC1140970fnT != null && interfaceC1140970fnT.getView() != null && C1139060fkO.LIZ(enumC1138990fkH) != -1) {
                        Set<Map.Entry<AbstractC1140160fmA, InterfaceC1140400fmY>> setEntrySet = this.LIZIZ.LLILZ.entrySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : setEntrySet) {
                            Map.Entry entry = (Map.Entry) obj;
                            if (C1139060fkO.LIZ(((InterfaceC1140400fmY) entry.getValue()).LIZ()) != -1) {
                                InterfaceC1140970fnT interfaceC1140970fnT2 = ((AbstractC1140160fmA) entry.getKey()).LJIIIIZZ.LIZ;
                                if (interfaceC1140970fnT2 != null) {
                                    view = interfaceC1140970fnT2.getView();
                                } else {
                                    view = null;
                                }
                                if (Intrinsics.LJFF(view, interfaceC1140970fnT.getView()) && ((AbstractC1140160fmA) entry.getKey()).LJIIIIZZ.LIZIZ >= 0) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                        List listLJLLLL = C13LP.LJLLLL(new AComparatorS36S0000000_17(13), arrayList);
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                        Iterator it2 = listLJLLLL.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Integer.valueOf(C1139060fkO.LIZ(((InterfaceC1140400fmY) ((Map.Entry) it2.next()).getValue()).LIZ())));
                        }
                        interfaceC1140970fnT.LIZIZ(arrayList2);
                    }
                    if (LJIIJ(enumC1138990fkH, "onLoaded", null)) {
                        return;
                    }
                    this.LIZIZ.LL.LIZ.LJIIIIZZ(enumC1138990fkH);
                }

                {
                    this.LIZ = abstractC1140160fmA;
                }

                @Override // X.InterfaceC1140870fnJ
                public final void LIZ(EnumC1138990fkH enumC1138990fkH, boolean z) {
                    if (LJIIJ(enumC1138990fkH, "onSecondFrame", Boolean.valueOf(z))) {
                        return;
                    }
                    this.LIZIZ.LL.LIZ.LIZ(enumC1138990fkH, z);
                }

                @Override // X.InterfaceC1140870fnJ
                public final void LJ(EnumC1138990fkH enumC1138990fkH, Message message) {
                    if (LJIIJ(enumC1138990fkH, "onPlayInfo", message)) {
                        return;
                    }
                    this.LIZIZ.LL.LIZ.LJ(enumC1138990fkH, message);
                }

                @Override // X.InterfaceC1140870fnJ
                public final void LJI(EnumC1138990fkH enumC1138990fkH, C1141050fnb c1141050fnb) {
                    if (this.LIZIZ.LLILZ.remove(this.LIZ) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("unit call onError, engine:");
                        sbLIZ.append(enumC1138990fkH);
                        sbLIZ.append(", errorCode:");
                        sbLIZ.append(c1141050fnb.LIZ);
                        sbLIZ.append(", errorMsg:");
                        sbLIZ.append(c1141050fnb.LIZIZ);
                        C1141240fnu.LIZJ("CompositionCall_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ), c1141050fnb.LIZJ);
                        this.LIZIZ.LLIZLLLIL.add(this.LIZ);
                        if (!LJIIJ(enumC1138990fkH, "onError", c1141050fnb) && this.LIZ.LJII == 0) {
                            this.LIZIZ.LJ(enumC1138990fkH, c1141050fnb);
                        }
                    }
                }

                @Override // X.InterfaceC1140870fnJ
                public final void LJIIIZ(EnumC1138990fkH enumC1138990fkH, C1138610fjf c1138610fjf) {
                    if (this.LIZIZ.LLILZ.remove(this.LIZ) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("unit call onComplete, engine:");
                        sbLIZ.append(enumC1138990fkH);
                        C1141240fnu.LIZLLL("CompositionCall_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
                        this.LIZIZ.LLIZ.add(this.LIZ);
                        if (LJIIJ(enumC1138990fkH, "onComplete", c1138610fjf)) {
                            return;
                        }
                        Set<AbstractC1140160fmA> setKeySet = this.LIZIZ.LLILZ.keySet();
                        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                            Iterator<T> it2 = setKeySet.iterator();
                            while (it2.hasNext()) {
                                if (((AbstractC1140160fmA) it2.next()).LJII == 0) {
                                    return;
                                }
                            }
                        }
                        C1141240fnu.LIZLLL("CompositionCall_ttlive_gift_render", "handleCompositionOnSuccess, last engine:" + enumC1138990fkH.getTypeString());
                        this.LIZIZ.LIZLLL();
                        this.LIZIZ.LL.LIZ.LJIIIZ(enumC1138990fkH, c1138610fjf);
                    }
                }

                public final boolean LJIIJ(EnumC1138990fkH enumC1138990fkH, String str, Object obj) {
                    InterfaceC1140400fmY interfaceC1140400fmY;
                    ((ArrayList) this.LIZIZ.LLJILLL).add(new Object(this.LIZ.LJI) { // from class: X.0fnU
                        public final Map<String, String> LIZ;

                        {
                            this.LIZ = map;
                        }
                    });
                    Set<C1140360fmU> set = this.LIZIZ.LL.LJIIIZ;
                    ArrayList<C1140360fmU> arrayList = new ArrayList();
                    for (C1140360fmU c1140360fmU : set) {
                        if (((ArrayList) c1140360fmU.LIZ).contains(this.LIZ)) {
                            arrayList.add(c1140360fmU);
                        }
                    }
                    C1140830fnF c1140830fnF = this.LIZIZ;
                    for (C1140360fmU c1140360fmU2 : arrayList) {
                        Pair pair = (Pair) ((LinkedHashMap) c1140360fmU2.LIZLLL).get(str);
                        if (pair != null && ((InterfaceC1139160fkY) pair.getFirst()).LIZ(c1140830fnF, this.LIZ, obj)) {
                            for (Object obj2 : (ArrayList) c1140360fmU2.LIZJ) {
                                if (c1140830fnF.LLILLL.remove(obj2)) {
                                    c1140830fnF.LLJ.add((AbstractC1140160fmA) obj2);
                                } else if (c1140830fnF.LLILZ.containsKey(obj2) && (interfaceC1140400fmY = c1140830fnF.LLILZ.get(obj2)) != null) {
                                    interfaceC1140400fmY.stop();
                                }
                            }
                            Iterator it2 = ((ArrayList) c1140360fmU2.LIZIZ).iterator();
                            while (it2.hasNext()) {
                                c1140830fnF.LJII((AbstractC1140160fmA) it2.next());
                            }
                            if (((Boolean) pair.getSecond()).booleanValue()) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            });
            interfaceC1140400fmYCreate.start();
            return;
        }
        this.LLIZLLLIL.add(abstractC1140160fmA);
        int i = abstractC1140160fmA.LJII;
        C1141050fnb c1141050fnb = new C1141050fnb(-20, "call is null", null);
        C1140850fnH c1140850fnH = abstractC1140160fmA.LIZ;
        EnumC1138990fkH enumC1138990fkH = EnumC1138990fkH.NONE;
        c1140850fnH.LJI(enumC1138990fkH, c1141050fnb);
        if (i == 0) {
            LJ(enumC1138990fkH, c1141050fnb);
        }
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        int i = message.what;
        if (i != 1000) {
            if (i == 1001) {
                InterfaceC1141190fnp interfaceC1141190fnp = (InterfaceC1141190fnp) C2043807zY.LIZ(InterfaceC1141190fnp.class);
                if (interfaceC1141190fnp != null) {
                    interfaceC1141190fnp.LIZLLL("effect_composition_play_complete_timeout", this.LL.LJI);
                }
                LJ(LIZ(), new C1141050fnb(-32, "composition complete timeout", null));
                this.LLJILJILJ = false;
                return;
            }
            return;
        }
        InterfaceC1141190fnp interfaceC1141190fnp2 = (InterfaceC1141190fnp) C2043807zY.LIZ(InterfaceC1141190fnp.class);
        if (interfaceC1141190fnp2 != null) {
            interfaceC1141190fnp2.LIZLLL("effect_composition_play_first_frame_timeout", this.LL.LJI);
        }
        LJ(LIZ(), new C1141050fnb(-31, "composition first frame timeout", null));
    }

    public final void LJ(EnumC1138990fkH enumC1138990fkH, C1141050fnb c1141050fnb) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleCompositionOnError engine:");
        sbLIZ.append(enumC1138990fkH.getTypeString());
        sbLIZ.append(", errorCode:");
        sbLIZ.append(c1141050fnb.LIZ);
        sbLIZ.append(", errorMsg:");
        sbLIZ.append(c1141050fnb.LIZIZ);
        C1141240fnu.LIZIZ("CompositionCall_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL();
        this.LL.LIZ.LJI(enumC1138990fkH, c1141050fnb);
    }
}
