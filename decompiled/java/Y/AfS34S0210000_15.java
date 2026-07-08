package Y;

import X.AbstractC945220ahk;
import X.C01GW;
import X.C09JN;
import X.C15438062q;
import X.C1C7U;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C307001Gy;
import X.C470590Icr;
import X.C918650a0t;
import X.C921640a5i;
import X.C925600aC6;
import X.C927600aFK;
import X.C943830afV;
import X.C943840afW;
import X.C945230ahl;
import X.C950220apo;
import X.C958010b2N;
import X.C970280bMA;
import X.C974490bSx;
import X.EnumC918970a1P;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class AfS34S0210000_15 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS34S0210000_15 afS34S0210000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.toggleSetting$1");
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS34S0210000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.cS((C958010b2N) afS34S0210000_15.l1, !afS34S0210000_15.z2, true, null);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.toggleSetting$1");
    }

    public static final void accept$1(AfS34S0210000_15 afS34S0210000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.toggleSetting$2");
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS34S0210000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.cS((C958010b2N) afS34S0210000_15.l1, !afS34S0210000_15.z2, false, th);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.toggleSetting$2");
    }

    public static final void accept$2(AfS34S0210000_15 afS34S0210000_15, Object obj) {
        C1C7U.LIZ("MatchPrepareFetchService@e592.doRequestPrepareApi$tempDisposable$1");
        C470590Icr<MultiMatchPrepareResponse> c470590Icr = (C470590Icr) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doRequestPrepareApi");
        sbLIZ.append(", prepare api success, isOnlyOnce=");
        sbLIZ.append(afS34S0210000_15.z2);
        C20441214yg.LIZIZ("MatchPrepareFetchService", C2188811AlT.LIZIZ(sbLIZ));
        ((C974490bSx) afS34S0210000_15.l0).LJJIIJ(c470590Icr);
        ((Function1) afS34S0210000_15.l1).invoke(c470590Icr.data);
        C1C7U.LIZIZ("MatchPrepareFetchService@e592.doRequestPrepareApi$tempDisposable$1");
    }

    public static final void accept$3(AfS34S0210000_15 afS34S0210000_15, Object obj) {
        C1C7U.LIZ("MatchPrepareFetchService@e592.doRequestPrepareApi$tempDisposable$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doRequestPrepareApi");
        sbLIZ.append(", prepare api failed, final, isOnlyOnce=");
        sbLIZ.append(afS34S0210000_15.z2);
        sbLIZ.append(", throwable=");
        sbLIZ.append(th.getMessage());
        C20441214yg.LIZIZ("MatchPrepareFetchService", C2188811AlT.LIZIZ(sbLIZ));
        C974490bSx c974490bSx = (C974490bSx) afS34S0210000_15.l0;
        c974490bSx.LJIIJJI(th);
        c974490bSx.LJIJJLI("prepare_failed");
        ((Function1) afS34S0210000_15.l1).invoke(th);
        C1C7U.LIZIZ("MatchPrepareFetchService@e592.doRequestPrepareApi$tempDisposable$2");
    }

    public static final void accept$4(AfS34S0210000_15 afS34S0210000_15, Object obj) {
        C1C7U.LIZ("MultiHostSettingApiTask@7861.invoke$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invoke; success; setting=");
        sbLIZ.append(((AbstractC945220ahk) afS34S0210000_15.l0).LIZIZ);
        C20441214yg.LJIIIZ("MultiHostSettingHelper", C2188811AlT.LIZIZ(sbLIZ));
        ((AbstractC945220ahk) afS34S0210000_15.l0).LIZJ.LJFF(Boolean.valueOf(afS34S0210000_15.z2));
        C945230ahl c945230ahl = (C945230ahl) afS34S0210000_15.l1;
        AbstractC945220ahk abstractC945220ahk = (AbstractC945220ahk) afS34S0210000_15.l0;
        boolean z = afS34S0210000_15.z2;
        c945230ahl.getClass();
        if (Intrinsics.LJFF(abstractC945220ahk, C943840afW.LIZLLL)) {
            C943830afV.LIZLLL.getClass();
            boolean z2 = !z;
            if (z2) {
                C943830afV.LJ.LJFF(Long.valueOf(C950220apo.LIZLLL()));
            } else {
                C943830afV.LJ.LJFF(0L);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onMuteRoom, isMute=");
            sbLIZ2.append(z2);
            sbLIZ2.append(", cache=");
            sbLIZ2.append(C943830afV.LJ.LIZIZ());
            C20441214yg.LJIIIZ("AnchorSettingItem", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1C7U.LIZIZ("MultiHostSettingApiTask@7861.invoke$1");
    }

    public static final void accept$5(AfS34S0210000_15 afS34S0210000_15, Object obj) {
        long jLongValue;
        String strLJIILIIL;
        C1C7U.LIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.shareToUsers$1$1");
        if (Intrinsics.LJFF(obj, Boolean.TRUE) && afS34S0210000_15.z2) {
            C918650a0t c918650a0t = (C918650a0t) afS34S0210000_15.l0;
            List list = (List) afS34S0210000_15.l1;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (true) {
                long jLongValue2 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
                if (lLJIILIIL != null) {
                    jLongValue2 = lLJIILIIL.longValue();
                }
                arrayList.add(Long.valueOf(jLongValue2));
            }
            c918650a0t.LJIIJJI(((C918650a0t) afS34S0210000_15.l0).LIZ.getId(), arrayList);
            List list2 = (List) afS34S0210000_15.l1;
            C918650a0t c918650a0t2 = (C918650a0t) afS34S0210000_15.l0;
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL((String) it3.next());
                if (lLJIILIIL2 != null) {
                    jLongValue = lLJIILIIL2.longValue();
                } else {
                    jLongValue = 0;
                }
                C921640a5i.LIZ(0, "chat_mutual_notice", jLongValue, "room");
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
                MultiGuestDataHolder multiGuestDataHolderLJI = c918650a0t2.LJI();
                if (multiGuestDataHolderLJI != null) {
                    strLJIILIIL = multiGuestDataHolderLJI.LJIILIIL();
                } else {
                    strLJIILIIL = null;
                }
                C925600aC6.LJIIJ(jLongValue, enumC918970a1PLJII, "chat_live", "", "", 0, 0, false, -1, strLJIILIIL, false, false, CardStruct.IStatusCode.DEFAULT, false, null, null, false);
            }
        }
        C1C7U.LIZIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.shareToUsers$1$1");
    }

    public AfS34S0210000_15(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
