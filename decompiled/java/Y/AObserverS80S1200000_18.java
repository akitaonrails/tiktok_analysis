package Y;

import X.AbstractC1604130rqV;
import X.C09JN;
import X.C11JF;
import X.C11S5;
import X.C1206210hUh;
import X.C1206260hUm;
import X.C1206280hUo;
import X.C13LP;
import X.C1701940uOG;
import X.C19Y3;
import X.C19Y5;
import X.C20600815jK;
import X.C2188811AlT;
import X.C294880Bh8;
import X.C516201zk;
import X.C844470XAv;
import X.InterfaceC1206270hUn;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import androidx.lifecycle.Observer;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS134S1200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AObserverS80S1200000_18 implements Observer {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS80S1200000_18 aObserverS80S1200000_18, Object obj) {
        Object obj2;
        String str;
        boolean z;
        List list = (List) obj;
        if (!list.isEmpty()) {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).LLJJJ;
            C1206260hUm c1206260hUm = null;
            if (viewOnAttachStateChangeListenerC20631115oD == null) {
                viewOnAttachStateChangeListenerC20631115oD = null;
            }
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator().getState();
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).LLJJJ;
            if (viewOnAttachStateChangeListenerC20631115oD2 == null) {
                viewOnAttachStateChangeListenerC20631115oD2 = null;
            }
            int currentItem = viewOnAttachStateChangeListenerC20631115oD2.getCurrentItem();
            C19Y3 c19y3 = ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).LLILZ;
            if (c19y3 == null) {
                c19y3 = null;
            }
            C19Y5 c19y5LJIIIZ = c19y3.LJIIIZ(currentItem);
            if (c19y5LJIIIZ != null) {
                obj2 = c19y5LJIIIZ.LIZ;
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            List<InterfaceC1891350zJl> listLJII = state.LJII();
            if (C294880Bh8.LIZ()) {
                ArrayList arrayList = (ArrayList) listLJII;
                if (!arrayList.isEmpty()) {
                    if (arrayList.size() - list.size() == 1) {
                        FavoritesFragmentV2 favoritesFragmentV2 = (FavoritesFragmentV2) aObserverS80S1200000_18.l1;
                        if (currentItem != arrayList.size() - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        favoritesFragmentV2.LLJJIJI = z;
                        ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).LLJJIJIIJIL = "auto_slide";
                    } else if (list.size() - arrayList.size() == 1) {
                        ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).LLJJIJI = true;
                    }
                }
            }
            if (((FavoritesFragmentV2) aObserverS80S1200000_18.l1).NR().yQ2(str) == -1 && c19y5LJIIIZ != null) {
                ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).LLJJJJLIIL.getValue().getClass();
                state.LJIILL(C1206210hUh.LIZ(list), new ARunnableS24S0101000_13(currentItem, (FavoritesFragmentV2) aObserverS80S1200000_18.l1, 8));
            } else {
                ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).LLJJJJLIIL.getValue().getClass();
                state.LJIILL(C1206210hUh.LIZ(list), new ARunnableS113S0100000_13((FavoritesFragmentV2) aObserverS80S1200000_18.l1, 214));
            }
            FavoritesFragmentV2 favoritesFragmentV22 = (FavoritesFragmentV2) aObserverS80S1200000_18.l1;
            C1206260hUm c1206260hUm2 = favoritesFragmentV22.LLILZLL;
            if (c1206260hUm2 != null) {
                c1206260hUm = c1206260hUm2;
            }
            AwS134S1200000_18 awS134S1200000_18 = new AwS134S1200000_18(favoritesFragmentV22, (Integer) aObserverS80S1200000_18.l2, aObserverS80S1200000_18.s0, 2);
            AwS667S0100000_18 awS667S0100000_18 = new AwS667S0100000_18((FavoritesFragmentV2) aObserverS80S1200000_18.l1, 33);
            if (!c1206260hUm.LJFF) {
                c1206260hUm.LJFF = true;
                InterfaceC1206270hUn.LIZ.getClass();
                InterfaceC1206270hUn interfaceC1206270hUnLIZ = C1206280hUo.LIZ();
                C844470XAv.LIZ.getClass();
                String str3 = C844470XAv.LJIILLIIL;
                if (str3 != null) {
                    str2 = str3;
                }
                c1206260hUm.LIZJ = (C11JF) interfaceC1206270hUnLIZ.LIZ(str2, C1206260hUm.LIZIZ()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS68S0400000_18(list, awS134S1200000_18, c1206260hUm, awS667S0100000_18, 3)).LJJLL(new C09JN() { // from class: X.00O2
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj3) {
                        C1C7U.LIZ("FavoriteTabCountHelper@8c64.setupV2Removable$2");
                        C1C7U.LIZIZ("FavoriteTabCountHelper@8c64.setupV2Removable$2");
                    }
                }, new C09JN() { // from class: X.00O3
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj3) {
                        C1C7U.LIZ("FavoriteTabCountHelper@8c64.setupV2Removable$3");
                        C1C7U.LIZIZ("FavoriteTabCountHelper@8c64.setupV2Removable$3");
                    }
                });
            }
            AbstractC1604130rqV abstractC1604130rqVPR = ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).PR();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FavoritesFragmentV2 tabLiveData observe: ");
            sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS256S0000000_18.get$arr$(902), 30));
            abstractC1604130rqVPR.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).PR().LJ("FavoritesFragmentV2 tabLiveData observe empty");
    }

    public static final void onChanged$1(AObserverS80S1200000_18 aObserverS80S1200000_18, Object obj) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).LLJJJ;
            C1206260hUm c1206260hUm = null;
            if (viewOnAttachStateChangeListenerC20631115oD == null) {
                viewOnAttachStateChangeListenerC20631115oD = null;
            }
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator().getState();
            ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).LLJJJJLIIL.getValue().getClass();
            state.LJIILL(C1206210hUh.LIZ(list), null);
            FavoritesFragmentV2 favoritesFragmentV2 = (FavoritesFragmentV2) aObserverS80S1200000_18.l1;
            C1206260hUm c1206260hUm2 = favoritesFragmentV2.LLILZLL;
            if (c1206260hUm2 != null) {
                c1206260hUm = c1206260hUm2;
            }
            AwS134S1200000_18 awS134S1200000_18 = new AwS134S1200000_18(favoritesFragmentV2, (Integer) aObserverS80S1200000_18.l2, aObserverS80S1200000_18.s0, 3);
            AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18((FavoritesFragmentV2) aObserverS80S1200000_18.l1, 818);
            c1206260hUm.getClass();
            boolean zLJI = MethodIDManager.LJI(202159);
            InterfaceC1206270hUn.LIZ.getClass();
            InterfaceC1206270hUn interfaceC1206270hUnLIZ = C1206280hUo.LIZ();
            C844470XAv.LIZ.getClass();
            String str = C844470XAv.LJIILLIIL;
            if (str == null) {
                str = "";
            }
            c1206260hUm.LIZJ = (C11JF) interfaceC1206270hUnLIZ.LIZ(str, C1206260hUm.LIZIZ()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS68S0400000_18(list, awS134S1200000_18, awS597S0100000_18, c1206260hUm, 2)).LJJLL(new C09JN() { // from class: X.00O1
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                    C1C7U.LIZ("FavoriteTabCountHelper@8c64.setupV2$2");
                    C1C7U.LIZIZ("FavoriteTabCountHelper@8c64.setupV2$2");
                }
            }, new C516201zk(awS597S0100000_18, 201));
            if (zLJI) {
                MethodIDManager.LJ();
            }
            AbstractC1604130rqV abstractC1604130rqVPR = ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).PR();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FavoritesFragmentV2 tabLiveData observe: ");
            sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS256S0000000_18.get$arr$(903), 30));
            abstractC1604130rqVPR.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ((FavoritesFragmentV2) aObserverS80S1200000_18.l1).PR().LJ("FavoritesFragmentV2 tabLiveData observe empty");
    }

    public AObserverS80S1200000_18(FavoritesFragmentV2 favoritesFragmentV2, Integer num, String str, int i) {
        this.$t = i;
        this.l1 = favoritesFragmentV2;
        this.l2 = num;
        this.s0 = str;
    }
}
