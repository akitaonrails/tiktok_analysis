package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveAnchorToolbarTimeConsumingOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveAudienceToolbarTimeConsumingOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102680eni implements InterfaceC1088880eRS {
    public final C1102690enj LIZ;
    public final ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> LIZIZ = new ConcurrentHashMap<>();
    public final Map<EnumC1088870eRR, C1102730enn> LIZJ = new LinkedHashMap();

    @Override // X.InterfaceC1088880eRS
    public final void LIZ(DataChannel dataChannel, EnumC1102750enp enumC1102750enp, EnumC1088870eRR enumC1088870eRR) {
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIIIZ(EnumC1102640ene enumC1102640ene, DataChannel dataChannel) {
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIIJ(EnumC1102640ene enumC1102640ene, DataChannel dataChannel) {
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIJJLI(DataChannel dataChannel, EnumC1102750enp enumC1102750enp, EnumC1088870eRR enumC1088870eRR) {
    }

    @Override // X.InterfaceC1088880eRS
    public final void releaseAll() {
        Ok(null);
    }

    public C1102680eni(C1102690enj c1102690enj) {
        this.LIZ = c1102690enj;
    }

    @Override // X.InterfaceC1088880eRS
    public final boolean LIZIZ(EnumC1102750enp enumC1102750enp) {
        EnumC1102740eno.Companion.getClass();
        EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
        if (enumC1102740enoLIZ != null) {
            return this.LIZ.LJIIIZ(enumC1102740enoLIZ);
        }
        return false;
    }

    @Override // X.InterfaceC1088880eRS
    public final void Ok(DataChannel dataChannel) {
        this.LIZ.LIZ(null);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZJ;
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((C1102730enn) it2.next()).LJI();
        }
        linkedHashMap.clear();
        this.LIZIZ.clear();
    }

    @Override // X.InterfaceC1088880eRS
    public final void LIZLLL(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        C1102790ent c1102790ent;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu2;
        MutableLiveData<Boolean> mutableLiveData;
        EnumC1102740eno.Companion.getClass();
        EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
        if (enumC1102740enoLIZ != null) {
            TBViewModel tBViewModelLJII = this.LIZ.LJII(enumC1102740enoLIZ);
            if (tBViewModelLJII != null && (mutableLiveData = tBViewModelLJII.LLJ) != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
            InterfaceC1102810env interfaceC1102810envLIZIZ = this.LIZ.LIZIZ(enumC1102740enoLIZ);
            if ((interfaceC1102810envLIZIZ instanceof C1102790ent) && (c1102790ent = (C1102790ent) interfaceC1102810envLIZIZ) != null && (interfaceViewOnClickListenerC1102800enu2 = c1102790ent.LL) != null) {
                interfaceViewOnClickListenerC1102800enu2.dK(dataChannel);
                return;
            }
            return;
        }
        for (C1102730enn c1102730enn : ((LinkedHashMap) this.LIZJ).values()) {
            ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = c1102730enn.LJ;
            if (concurrentHashMap != null && (interfaceViewOnClickListenerC1102800enu = concurrentHashMap.get(enumC1102750enp)) != null) {
                interfaceViewOnClickListenerC1102800enu.dK(c1102730enn.LIZ);
            }
            ((EnumMap) c1102730enn.LJIIIIZZ).put(enumC1102750enp, Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final InterfaceViewOnClickListenerC1102800enu LJ(DataChannel dataChannel, String str) {
        InterfaceViewOnClickListenerC1102800enu c098200Yq;
        try {
            c098200Yq = this.LIZIZ.get(EnumC1102750enp.valueOf(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (InterfaceViewOnClickListenerC1102800enu) c098200Yq;
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJI(DataChannel dataChannel, EnumC951410arj enumC951410arj) {
        C1102690enj c1102690enj = this.LIZ;
        if (c1102690enj.LIZLLL != null) {
            AbstractC1102590enZ abstractC1102590enZ = c1102690enj.LJ;
            if (abstractC1102590enZ == null) {
                abstractC1102590enZ = null;
            }
            abstractC1102590enZ.LIZ = enumC951410arj;
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final boolean LJIIL(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        MutableLiveData<C1102510enR> mutableLiveData;
        C1102510enR value;
        EnumC1102740eno.Companion.getClass();
        EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
        if (enumC1102740enoLIZ != null) {
            TBViewModel tBViewModelLJII = this.LIZ.LJII(enumC1102740enoLIZ);
            if (tBViewModelLJII != null && (mutableLiveData = tBViewModelLJII.LLIZ) != null && (value = mutableLiveData.getValue()) != null && value.LIZ) {
                return true;
            }
            return false;
        }
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it2.hasNext()) {
            InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) ((EnumMap) ((C1102730enn) it2.next()).LJI).get(enumC1102750enp);
            if (interfaceC1103130eoR != null && interfaceC1103130eoR.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1088880eRS
    public final View LJIILIIL(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        View viewLJIIZILJ = LJIIZILJ(dataChannel, enumC1102750enp);
        if (viewLJIIZILJ != null) {
            return viewLJIIZILJ.findViewById(R.id.y7r);
        }
        return null;
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIILL(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        MutableLiveData<Boolean> mutableLiveData;
        C1102790ent c1102790ent;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu2;
        MutableLiveData<Boolean> mutableLiveData2;
        EnumC1102740eno.Companion.getClass();
        EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
        if (enumC1102740enoLIZ != null) {
            TBViewModel tBViewModelLJII = this.LIZ.LJII(enumC1102740enoLIZ);
            if (enumC1102740enoLIZ != EnumC1102740eno.MULTIGUEST) {
                if (tBViewModelLJII != null && (mutableLiveData2 = tBViewModelLJII.LLJ) != null) {
                    mutableLiveData2.setValue(Boolean.FALSE);
                }
            } else if (tBViewModelLJII != null && (mutableLiveData = tBViewModelLJII.LLJ) != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
            InterfaceC1102810env interfaceC1102810envLIZIZ = this.LIZ.LIZIZ(enumC1102740enoLIZ);
            if ((interfaceC1102810envLIZIZ instanceof C1102790ent) && (c1102790ent = (C1102790ent) interfaceC1102810envLIZIZ) != null && (interfaceViewOnClickListenerC1102800enu2 = c1102790ent.LL) != null) {
                interfaceViewOnClickListenerC1102800enu2.mx(dataChannel);
                return;
            }
            return;
        }
        for (C1102730enn c1102730enn : ((LinkedHashMap) this.LIZJ).values()) {
            ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = c1102730enn.LJ;
            if (concurrentHashMap != null && (interfaceViewOnClickListenerC1102800enu = concurrentHashMap.get(enumC1102750enp)) != null) {
                interfaceViewOnClickListenerC1102800enu.mx(c1102730enn.LIZ);
            }
            ((EnumMap) c1102730enn.LJIIIIZZ).put(enumC1102750enp, Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIILLIIL(EnumC1088870eRR enumC1088870eRR, DataChannel dataChannel) {
        this.LIZ.LIZ(enumC1088870eRR);
        C1102730enn c1102730enn = (C1102730enn) ((LinkedHashMap) this.LIZJ).get(enumC1088870eRR);
        if (c1102730enn != null) {
            c1102730enn.LJI();
        }
        this.LIZJ.remove(enumC1088870eRR);
        if (this.LIZ.LIZ.isEmpty() && this.LIZJ.isEmpty()) {
            this.LIZIZ.clear();
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final View LJIIZILJ(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        EnumC1102740eno.Companion.getClass();
        if (C1102850enz.LIZIZ(enumC1102750enp)) {
            EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
            if (enumC1102740enoLIZ == null) {
                return null;
            }
            return this.LIZ.LJI(enumC1102740enoLIZ);
        }
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it2.hasNext()) {
            InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) ((EnumMap) ((C1102730enn) it2.next()).LJI).get(enumC1102750enp);
            if (interfaceC1103130eoR != null) {
                return interfaceC1103130eoR.LJ();
            }
        }
        return null;
    }

    @Override // X.InterfaceC1088880eRS
    public final boolean LJIJ(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        EnumC1102740eno.Companion.getClass();
        EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
        if (enumC1102740enoLIZ != null) {
            return this.LIZ.LJIIIZ(enumC1102740enoLIZ);
        }
        return false;
    }

    @Override // X.InterfaceC1088880eRS
    public final boolean LJIJI(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        EnumC992450bvv value;
        EnumC1102740eno.Companion.getClass();
        EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
        if (enumC1102740enoLIZ != null) {
            TBViewModel tBViewModelLJII = this.LIZ.LJII(enumC1102740enoLIZ);
            if (tBViewModelLJII != null) {
                value = tBViewModelLJII.LLJI.getValue();
            } else {
                value = null;
            }
            if (value == EnumC992450bvv.REDDOT) {
                return true;
            }
            return false;
        }
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it2.hasNext()) {
            if (((C1102730enn) it2.next()).LIZLLL(enumC1102750enp)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIJJ(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        EnumC1102740eno.Companion.getClass();
        if (C1102850enz.LIZIZ(enumC1102750enp)) {
            EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
            if (enumC1102740enoLIZ != null) {
                this.LIZ.LJIIJJI(enumC1102740enoLIZ);
            }
            if (enumC1102750enp == EnumC1102750enp.INTERACTION_FEATURES || enumC1102750enp == EnumC1102750enp.SHARE) {
                this.LIZIZ.remove(enumC1102750enp);
                return;
            }
            return;
        }
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it2.hasNext()) {
            ((C1102730enn) it2.next()).LJIIJ(enumC1102750enp);
        }
        this.LIZIZ.remove(enumC1102750enp);
    }

    @Override // X.InterfaceC1088880eRS
    public final void LIZJ(EnumC1102750enp enumC1102750enp, DataChannel dataChannel, boolean z) {
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        EnumC992450bvv enumC992450bvv;
        EnumC1102740eno.Companion.getClass();
        EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
        if (enumC1102740enoLIZ != null) {
            TBViewModel tBViewModelLJII = this.LIZ.LJII(enumC1102740enoLIZ);
            if (tBViewModelLJII != null) {
                if (z) {
                    enumC992450bvv = EnumC992450bvv.REDDOT;
                } else {
                    enumC992450bvv = EnumC992450bvv.NONE;
                }
                tBViewModelLJII.LLJI.setValue(enumC992450bvv);
                tBViewModelLJII.LLJIJIL.setValue(null);
                tBViewModelLJII.LLJILJIL.setValue(null);
            }
            C1102790ent c1102790ent = (C1102790ent) this.LIZ.LIZIZ(enumC1102740enoLIZ);
            if (c1102790ent != null && (interfaceViewOnClickListenerC1102800enu = c1102790ent.LL) != null) {
                interfaceViewOnClickListenerC1102800enu.qG(z);
                return;
            }
            return;
        }
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it2.hasNext()) {
            ((C1102730enn) it2.next()).LJIIIIZZ(enumC1102750enp, z);
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJFF(EnumC1102750enp enumC1102750enp, DataChannel dataChannel, boolean z) {
        C1102790ent c1102790ent;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        MutableLiveData<C1102510enR> mutableLiveData;
        C1102510enR value;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show button ");
        sbLIZ.append(enumC1102750enp);
        sbLIZ.append(" stack:");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C20441214yg.LIZIZ("ToolbarManagerAdapter", C2188811AlT.LIZIZ(sbLIZ));
        EnumC1102740eno.Companion.getClass();
        if (C1102850enz.LIZIZ(enumC1102750enp)) {
            EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
            if (enumC1102740enoLIZ != null) {
                if (dataChannel != null) {
                    enumC1102740enoLIZ.show(dataChannel);
                }
                TBViewModel tBViewModelLJII = this.LIZ.LJII(enumC1102740enoLIZ);
                if ((tBViewModelLJII != null && (mutableLiveData = tBViewModelLJII.LLIZ) != null && (value = mutableLiveData.getValue()) != null && value.LIZ) || (c1102790ent = (C1102790ent) this.LIZ.LIZIZ(enumC1102740enoLIZ)) == null || (interfaceViewOnClickListenerC1102800enu = c1102790ent.LL) == null) {
                    return;
                }
                interfaceViewOnClickListenerC1102800enu.onShow();
                return;
            }
            return;
        }
        enumC1102750enp.isButtonVisible = true;
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it2.hasNext()) {
            if (((C1102730enn) it2.next()).LJIIIZ(enumC1102750enp)) {
                InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu2 = this.LIZIZ.get(enumC1102750enp);
                if (interfaceViewOnClickListenerC1102800enu2 == null) {
                    return;
                }
                interfaceViewOnClickListenerC1102800enu2.onShow();
                return;
            }
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJII(DataChannel dataChannel, EnumC1088870eRR enumC1088870eRR, ViewGroup viewGroup) {
        AbstractC1102590enZ abstractC1102590enZ;
        AbstractC1102590enZ abstractC1102590enZ2;
        AbstractC1102590enZ abstractC1102590enZ3;
        if (viewGroup == null) {
            return;
        }
        C1102690enj c1102690enj = this.LIZ;
        if (c1102690enj.LIZLLL != null) {
            C1094730eat c1094730eatLIZ = C1094720eas.LIZ(dataChannel);
            C1099960ejK c1099960ejK = c1102690enj.LIZLLL;
            AbstractC1102590enZ abstractC1102590enZ4 = null;
            if (c1099960ejK == null) {
                c1099960ejK = null;
            }
            if (C500260Jjc.LJIJI(c1099960ejK.LIZJ) && LiveAudienceToolbarTimeConsumingOptimizeSetting.INSTANCE.optimizeInit()) {
                C1099960ejK c1099960ejK2 = c1102690enj.LIZLLL;
                if (c1099960ejK2 == null) {
                    c1099960ejK2 = null;
                }
                List listLIZIZ = C1102540enU.LIZIZ(c1094730eatLIZ, enumC1088870eRR);
                if (Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE) && ((enumC1088870eRR == EnumC1088870eRR.LEFT || enumC1088870eRR == EnumC1088870eRR.RIGHT) && (abstractC1102590enZ3 = c1102690enj.LJ) != null)) {
                    abstractC1102590enZ4 = abstractC1102590enZ3;
                }
                C1102720enm c1102720enm = new C1102720enm(c1099960ejK2, viewGroup, listLIZIZ, abstractC1102590enZ4, c1102690enj.LIZIZ);
                c1102690enj.LIZ.put(enumC1088870eRR, c1102720enm);
                c1102720enm.LJFF();
                return;
            }
            C1099960ejK c1099960ejK3 = c1102690enj.LIZLLL;
            if (c1099960ejK3 == null) {
                c1099960ejK3 = null;
            }
            if (C500260Jjc.LJIIZILJ(c1099960ejK3.LIZJ) && LiveAnchorToolbarTimeConsumingOptimizeSetting.INSTANCE.optimizeInit()) {
                C1099960ejK c1099960ejK4 = c1102690enj.LIZLLL;
                if (c1099960ejK4 == null) {
                    c1099960ejK4 = null;
                }
                List listLIZIZ2 = C1102540enU.LIZIZ(c1094730eatLIZ, enumC1088870eRR);
                if (Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE) && ((enumC1088870eRR == EnumC1088870eRR.LEFT || enumC1088870eRR == EnumC1088870eRR.RIGHT) && (abstractC1102590enZ2 = c1102690enj.LJ) != null)) {
                    abstractC1102590enZ4 = abstractC1102590enZ2;
                }
                C1102720enm c1102720enm2 = new C1102720enm(c1099960ejK4, viewGroup, listLIZIZ2, abstractC1102590enZ4, c1102690enj.LIZIZ);
                c1102690enj.LIZ.put(enumC1088870eRR, c1102720enm2);
                c1102720enm2.LJFF();
                return;
            }
            C1099960ejK c1099960ejK5 = c1102690enj.LIZLLL;
            if (c1099960ejK5 == null) {
                c1099960ejK5 = null;
            }
            List listLIZIZ3 = C1102540enU.LIZIZ(c1094730eatLIZ, enumC1088870eRR);
            if (Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE) && ((enumC1088870eRR == EnumC1088870eRR.LEFT || enumC1088870eRR == EnumC1088870eRR.RIGHT) && (abstractC1102590enZ = c1102690enj.LJ) != null)) {
                abstractC1102590enZ4 = abstractC1102590enZ;
            }
            Map<EnumC1102740eno, InterfaceC1102810env> map = c1102690enj.LIZIZ;
            C1102710enl c1102710enl = new C1102710enl(c1099960ejK5, viewGroup, listLIZIZ3, abstractC1102590enZ4, enumC1088870eRR, map);
            c1102690enj.LIZ.put(enumC1088870eRR, c1102710enl);
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                c1102710enl.LIZ((EnumC1102740eno) entry.getKey(), (InterfaceC1102810env) entry.getValue());
            }
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIIIIZZ(EnumC1102750enp enumC1102750enp, DataChannel dataChannel, boolean z) {
        MutableLiveData<Boolean> mutableLiveData;
        enumC1102750enp.isEnableClick = z;
        EnumC1102740eno.Companion.getClass();
        EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
        if (enumC1102740enoLIZ != null) {
            TBViewModel tBViewModelLJII = this.LIZ.LJII(enumC1102740enoLIZ);
            if (tBViewModelLJII != null && (mutableLiveData = tBViewModelLJII.LLJ) != null) {
                mutableLiveData.setValue(Boolean.valueOf(z));
                return;
            }
            return;
        }
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it2.hasNext()) {
            ((C1102730enn) it2.next()).LJII(enumC1102750enp, z);
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIL(EnumC1102750enp enumC1102750enp, DataChannel dataChannel, boolean z) {
        TBViewModel tBViewModelLJII;
        C1102510enR value;
        C1102790ent c1102790ent;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hide button ");
        sbLIZ.append(enumC1102750enp);
        sbLIZ.append(" stack:");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C20441214yg.LIZIZ("ToolbarManagerAdapter", C2188811AlT.LIZIZ(sbLIZ));
        EnumC1102740eno.Companion.getClass();
        if (C1102850enz.LIZIZ(enumC1102750enp)) {
            EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
            if (enumC1102740enoLIZ != null && (tBViewModelLJII = this.LIZ.LJII(enumC1102740enoLIZ)) != null) {
                MutableLiveData<C1102510enR> mutableLiveData = tBViewModelLJII.LLIZ;
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(new C1102510enR(false, true));
                }
                MutableLiveData<C1102510enR> mutableLiveData2 = tBViewModelLJII.LLIZ;
                if (mutableLiveData2 != null && (value = mutableLiveData2.getValue()) != null && value.LIZ && (c1102790ent = (C1102790ent) this.LIZ.LIZIZ(enumC1102740enoLIZ)) != null && (interfaceViewOnClickListenerC1102800enu = c1102790ent.LL) != null) {
                    interfaceViewOnClickListenerC1102800enu.onHide();
                    return;
                }
                return;
            }
            return;
        }
        enumC1102750enp.isButtonVisible = false;
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it2.hasNext()) {
            ((C1102730enn) it2.next()).LIZIZ(enumC1102750enp);
        }
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu2 = this.LIZIZ.get(enumC1102750enp);
        if (interfaceViewOnClickListenerC1102800enu2 == null) {
            return;
        }
        interfaceViewOnClickListenerC1102800enu2.onHide();
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIIJJI(EnumC1102750enp enumC1102750enp, DataChannel dataChannel, InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu, boolean z) {
        EnumC1102740eno.Companion.getClass();
        if (C1102850enz.LIZIZ(enumC1102750enp)) {
            EnumC1102740eno enumC1102740enoLIZ = C1102850enz.LIZ(enumC1102750enp);
            if (enumC1102740enoLIZ != null) {
                this.LIZ.LJIIJ(enumC1102740enoLIZ, new C1102790ent(interfaceViewOnClickListenerC1102800enu), z);
                return;
            }
            return;
        }
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it2.hasNext()) {
            ((C1102730enn) it2.next()).LJ(enumC1102750enp, interfaceViewOnClickListenerC1102800enu);
        }
        this.LIZIZ.put(enumC1102750enp, interfaceViewOnClickListenerC1102800enu);
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIILJJIL(DataChannel dataChannel, View view, List<? extends EnumC1102750enp> list, EnumC1088900eRU enumC1088900eRU, EnumC1088870eRR enumC1088870eRR) {
        C1102730enn c1102730enn = new C1102730enn(dataChannel, (ViewGroup) view, list, enumC1088900eRU, this.LIZIZ);
        this.LIZJ.put(enumC1088870eRR, c1102730enn);
        c1102730enn.LIZJ();
    }
}
