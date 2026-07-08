package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.ToolbarTipEvent;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0enj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102690enj implements InterfaceC1102930eo7 {
    public final Map<EnumC1088870eRR, InterfaceC1102870eo1> LIZ = new LinkedHashMap();
    public final Map<EnumC1102740eno, InterfaceC1102810env> LIZIZ = new LinkedHashMap();
    public final Map<EnumC1102740eno, TBViewModel> LIZJ = new LinkedHashMap();
    public C1099960ejK LIZLLL;
    public AbstractC1102590enZ LJ;
    public C1102700enk LJFF;

    public final List<InterfaceC484670IzZ> LIZJ() {
        C1102790ent c1102790ent;
        C1102790ent c1102790ent2;
        Map<EnumC1102740eno, InterfaceC1102810env> map = this.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (true) {
            InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            InterfaceC1102810env interfaceC1102810env = (InterfaceC1102810env) entry.getValue();
            if (!(interfaceC1102810env instanceof InterfaceC484670IzZ)) {
                if ((interfaceC1102810env instanceof C1102790ent) && (c1102790ent2 = (C1102790ent) interfaceC1102810env) != null) {
                    interfaceViewOnClickListenerC1102800enu = c1102790ent2.LL;
                }
                if (interfaceViewOnClickListenerC1102800enu instanceof InterfaceC484670IzZ) {
                }
            }
            TBViewModel tBViewModel = (TBViewModel) ((LinkedHashMap) this.LIZJ).get(key);
            if (tBViewModel != null && tBViewModel.isVisible()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (it3.hasNext()) {
            Object obj = (InterfaceC1102810env) ((Map.Entry) it3.next()).getValue();
            if (!(obj instanceof InterfaceC484670IzZ) || obj == null) {
                obj = (!(obj instanceof C1102790ent) || (c1102790ent = (C1102790ent) obj) == null) ? null : c1102790ent.LL;
                if (!(obj instanceof InterfaceC484670IzZ) || obj == null) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final List<EnumC1102740eno> LIZLLL() {
        TBViewModel tBViewModel;
        Set setKeySet = ((LinkedHashMap) this.LIZJ).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            EnumC1102740eno enumC1102740eno = (EnumC1102740eno) obj;
            if (LJI(enumC1102740eno) != null && (tBViewModel = (TBViewModel) ((LinkedHashMap) this.LIZJ).get(enumC1102740eno)) != null && tBViewModel.isVisible()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1102930eo7
    public final void LIZ(EnumC1088870eRR enumC1088870eRR) {
        C1102700enk c1102700enk;
        if (enumC1088870eRR == null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZ;
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                ((InterfaceC1102870eo1) it2.next()).release();
            }
            linkedHashMap.clear();
            Map<EnumC1102740eno, TBViewModel> map = this.LIZJ;
            if (this.LIZLLL != null) {
                for (TBViewModel tBViewModel : ((LinkedHashMap) map).values()) {
                    C1099960ejK c1099960ejK = this.LIZLLL;
                    if (c1099960ejK == null) {
                        c1099960ejK = null;
                    }
                    tBViewModel.vQ2(c1099960ejK.LIZIZ);
                }
            }
            ((LinkedHashMap) map).clear();
            ((LinkedHashMap) this.LIZIZ).clear();
        } else {
            InterfaceC1102870eo1 interfaceC1102870eo1 = (InterfaceC1102870eo1) ((LinkedHashMap) this.LIZ).get(enumC1088870eRR);
            if (interfaceC1102870eo1 != null) {
                interfaceC1102870eo1.release();
            }
            this.LIZ.remove(enumC1088870eRR);
            if (this.LIZ.isEmpty()) {
                Map<EnumC1102740eno, TBViewModel> map2 = this.LIZJ;
                if (this.LIZLLL != null) {
                    for (TBViewModel tBViewModel2 : ((LinkedHashMap) map2).values()) {
                        C1099960ejK c1099960ejK2 = this.LIZLLL;
                        if (c1099960ejK2 == null) {
                            c1099960ejK2 = null;
                        }
                        tBViewModel2.vQ2(c1099960ejK2.LIZIZ);
                    }
                }
                ((LinkedHashMap) map2).clear();
                ((LinkedHashMap) this.LIZIZ).clear();
            }
        }
        C1099960ejK c1099960ejK3 = this.LIZLLL;
        if (c1099960ejK3 != null && c1099960ejK3.LJFF == EnumC1102980eoC.HIGHLIGHT && (c1102700enk = this.LJFF) != null) {
            c1102700enk.LIZLLL.removeCallbacksAndMessages(null);
            DataChannel dataChannel = c1102700enk.LIZ.LIZJ;
            C13BV c13bv = C13BV.INSTANCE;
            dataChannel.SX0(C749550Taj.class, c13bv);
            c1102700enk.LIZ.LIZJ.SX0(C1102520enS.class, c13bv);
            c1102700enk.LJ = false;
        }
    }

    public final InterfaceC1102810env LIZIZ(EnumC1102740eno enumC1102740eno) {
        return (InterfaceC1102810env) ((LinkedHashMap) this.LIZIZ).get(enumC1102740eno);
    }

    public final InterfaceViewOnClickListenerC1102800enu LJ(EnumC1102740eno enumC1102740eno) {
        C1102790ent c1102790ent;
        Object obj = ((LinkedHashMap) this.LIZIZ).get(enumC1102740eno);
        if (!(obj instanceof C1102790ent) || (c1102790ent = (C1102790ent) obj) == null) {
            return null;
        }
        return c1102790ent.LL;
    }

    public final EnumC1088870eRR LJFF(EnumC1102740eno enumC1102740eno) {
        Map<EnumC1088870eRR, InterfaceC1102870eo1> map = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((InterfaceC1102870eo1) entry.getValue()).getButtons().contains(enumC1102740eno)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (EnumC1088870eRR) C13LP.LJJJLIIL(linkedHashMap.keySet());
    }

    public final View LJI(EnumC1102740eno enumC1102740eno) {
        Iterator it2 = ((LinkedHashMap) this.LIZ).values().iterator();
        while (it2.hasNext()) {
            InterfaceC1103130eoR interfaceC1103130eoRLIZIZ = ((InterfaceC1102870eo1) it2.next()).LIZIZ(enumC1102740eno);
            if (interfaceC1103130eoRLIZIZ != null) {
                return interfaceC1103130eoRLIZIZ.LJ();
            }
        }
        return null;
    }

    public final TBViewModel LJII(EnumC1102740eno enumC1102740eno) {
        return (TBViewModel) ((LinkedHashMap) this.LIZJ).get(enumC1102740eno);
    }

    public final void LJIIIIZZ(C1099960ejK c1099960ejK) {
        AbstractC1102590enZ c1102530enT;
        this.LIZLLL = c1099960ejK;
        if (Intrinsics.LJFF(c1099960ejK.LIZJ.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            c1102530enT = new C1102500enQ(c1099960ejK);
        } else {
            c1102530enT = new C1102530enT(c1099960ejK);
        }
        this.LJ = c1102530enT;
        c1099960ejK.LIZJ.BQ2(c1099960ejK.LIZIZ, ToolbarTipEvent.class, AFwS254S0000000_17.get$arr$(435));
        if (c1099960ejK.LJFF == EnumC1102980eoC.HIGHLIGHT) {
            this.LJFF = new C1102700enk(c1099960ejK, this.LIZIZ, this.LIZJ);
        }
    }

    public final boolean LJIIIZ(EnumC1102740eno enumC1102740eno) {
        if (this.LIZLLL != null) {
            AbstractC1102590enZ abstractC1102590enZ = this.LJ;
            if (abstractC1102590enZ == null) {
                abstractC1102590enZ = null;
            }
            return abstractC1102590enZ.LIZ(enumC1102740eno);
        }
        return false;
    }

    public final void LJIIJJI(EnumC1102740eno enumC1102740eno) {
        MutableLiveData<C1102510enR> mutableLiveData;
        TBViewModel tBViewModel = (TBViewModel) ((LinkedHashMap) this.LIZJ).get(enumC1102740eno);
        if (tBViewModel != null && (mutableLiveData = tBViewModel.LLIZ) != null) {
            mutableLiveData.setValue(new C1102510enR(false, true));
        }
        Iterator it2 = ((LinkedHashMap) this.LIZ).values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1102870eo1) it2.next()).LIZJ(enumC1102740eno);
        }
        this.LIZIZ.remove(enumC1102740eno);
        C1099960ejK c1099960ejK = this.LIZLLL;
        if (c1099960ejK != null && tBViewModel != null) {
            tBViewModel.vQ2(c1099960ejK.LIZIZ);
        }
        this.LIZJ.remove(enumC1102740eno);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.EnumC1102740eno r7, X.InterfaceC1102810env r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102690enj.LJIIJ(X.0eno, X.0env, boolean):void");
    }
}
