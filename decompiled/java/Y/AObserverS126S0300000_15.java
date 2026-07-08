package Y;

import X.C013C;
import X.C09JN;
import X.C11QJ;
import X.C12ES;
import X.C1701940uOG;
import X.C19487111Lx;
import X.C1954807lC;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C754530Til;
import X.C930360aJm;
import X.C936030aSv;
import X.C936210aTD;
import X.C936410aTX;
import X.C954460awe;
import X.C973070bQf;
import X.C987100bnI;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.inviter.view.TeamMatchInviterFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class AObserverS126S0300000_15 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS126S0300000_15 aObserverS126S0300000_15, Object obj) {
        C930360aJm c930360aJm = (C930360aJm) aObserverS126S0300000_15.l0;
        c930360aJm.LIZIZ((Boolean) ((LiveData) aObserverS126S0300000_15.l1).getValue(), "videoSwitchOnLiveData", (Boolean) ((LiveData) aObserverS126S0300000_15.l2).getValue(), c930360aJm.LIZ());
    }

    public static final void onChanged$1(AObserverS126S0300000_15 aObserverS126S0300000_15, Object obj) {
        C930360aJm c930360aJm = (C930360aJm) aObserverS126S0300000_15.l0;
        c930360aJm.LIZIZ((Boolean) ((LiveData) aObserverS126S0300000_15.l1).getValue(), "useBackCameraLiveData", (Boolean) ((LiveData) aObserverS126S0300000_15.l2).getValue(), c930360aJm.LIZ());
    }

    public static final void onChanged$2(AObserverS126S0300000_15 aObserverS126S0300000_15, Object obj) {
        Integer numValueOf;
        Map map = (Map) obj;
        List list = (List) map.get(Boolean.TRUE);
        List list2 = (List) map.get(Boolean.FALSE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observe, selfSize = ");
        Integer numValueOf2 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" and rivalSize = ");
        if (list2 != null) {
            numValueOf2 = Integer.valueOf(list2.size());
        }
        sbLIZ.append(numValueOf2);
        C20441214yg.LIZIZ("TeamMatchInvitePanel", C2188811AlT.LIZIZ(sbLIZ));
        C973070bQf c973070bQf = ((TeamMatchInviterFragment) aObserverS126S0300000_15.l0).LLJ;
        if (c973070bQf != null) {
            c973070bQf.n0(false, list, list2, (Map) aObserverS126S0300000_15.l1);
        }
        TeamMatchInviterFragment teamMatchInviterFragment = (TeamMatchInviterFragment) aObserverS126S0300000_15.l0;
        C754530Til c754530Til = teamMatchInviterFragment.LLJJIJI;
        if (c754530Til != null) {
            List list3 = (List) aObserverS126S0300000_15.l2;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list3) {
                long j = ((C954460awe) obj2).LJ;
                Long l = teamMatchInviterFragment.LLJJIJIIJIL;
                if (l == null || j != l.longValue()) {
                    arrayList.add(obj2);
                }
            }
            c754530Til.notifyItemRangeChanged(0, arrayList.size());
        }
    }

    public static final void onChanged$3(AObserverS126S0300000_15 aObserverS126S0300000_15, Object obj) {
        long jLongValue;
        C936030aSv c936030aSv = (C936030aSv) obj;
        C013C c013c = (C013C) aObserverS126S0300000_15.l0;
        if (c013c.element) {
            c013c.element = false;
            return;
        }
        if (c936030aSv == null) {
            C936410aTX c936410aTX = (C936410aTX) aObserverS126S0300000_15.l1;
            Long l = c936410aTX.LLJIJIL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c936410aTX.LJIIJJI(jLongValue);
            return;
        }
        View viewLJIIIZ = ((C936410aTX) aObserverS126S0300000_15.l1).LJIIIZ(true);
        if (viewLJIIIZ != null) {
            C12ES.LJIILL(0, viewLJIIIZ);
        }
        int i = C936210aTD.LIZ[c936030aSv.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LiveIconView liveIconView = ((C936410aTX) aObserverS126S0300000_15.l1).LLJILJILJ;
                    if (liveIconView != null) {
                        liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.e7k, (Context) aObserverS126S0300000_15.l2));
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                LiveIconView liveIconView2 = ((C936410aTX) aObserverS126S0300000_15.l1).LLJILJILJ;
                if (liveIconView2 != null) {
                    liveIconView2.setIcon(C20736316Cj.LIZLLL(R.attr.e8e, (Context) aObserverS126S0300000_15.l2));
                }
            }
            ((C936410aTX) aObserverS126S0300000_15.l1).LLJILLL = (C19487111Lx) C11QJ.LL.LJ(20L, TimeUnit.SECONDS).LJIILJJIL(C1701940uOG.LIZIZ()).LJII(new C987100bnI((C936410aTX) aObserverS126S0300000_15.l1, 22)).LJIIIIZZ(new C09JN() { // from class: X.00LH
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                    C1C7U.LIZ("AvatarTagBizViewElement@bb43.generatingProgressObserver$2$1$2");
                    C1C7U.LIZIZ("AvatarTagBizViewElement@bb43.generatingProgressObserver$2$1$2");
                }
            }).LJIIZILJ();
            return;
        }
        C936410aTX c936410aTX2 = (C936410aTX) aObserverS126S0300000_15.l1;
        if (c936410aTX2.LLJI) {
            return;
        }
        c936410aTX2.LLJI = true;
        LiveIconView liveIconView3 = c936410aTX2.LLJILJILJ;
        if (liveIconView3 == null) {
            return;
        }
        liveIconView3.setIcon(C20736316Cj.LIZLLL(R.attr.e89, (Context) aObserverS126S0300000_15.l2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS126S0300000_15(Object obj, TeamMatchInviterFragment teamMatchInviterFragment, Map<Long, Boolean> map, List<C954460awe> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = teamMatchInviterFragment;
        this.l2 = map;
    }
}
