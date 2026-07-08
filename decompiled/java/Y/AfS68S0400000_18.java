package Y;

import X.C09JN;
import X.C0OFL;
import X.C1171050gZz;
import X.C1171470gaf;
import X.C1171530gal;
import X.C1172580gcS;
import X.C1206260hUm;
import X.C1389890mGx;
import X.C1440005kM;
import X.C15438062q;
import X.C1697810uHb;
import X.C19EG;
import X.C1C7U;
import X.C20684815ws;
import X.C438720HIg;
import X.C742510TAr;
import X.InterfaceC1631620sYq;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.favorites.business.FavoriteCountResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AfS68S0400000_18 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        }
    }

    public static final void accept$0(AfS68S0400000_18 afS68S0400000_18, Object obj) {
        Integer num;
        long jLongValue;
        CollectionDetail.Statistic statistic;
        Long l;
        CollectionDetail.Status status;
        C1C7U.LIZ("CollectionContentFragment@3f31.onClickButtonToRemoveVideos$1$removeClickListener$1$doClick$1");
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair(((CollectionContentFragment) afS68S0400000_18.l0).LLJI, "enter_from");
        pairArr[1] = new Pair("remove", "enter_method");
        pairArr[2] = new Pair(((CollectionContentFragment) afS68S0400000_18.l0).LLJ, "collection_id");
        pairArr[3] = new Pair(null, "to_collection_id");
        pairArr[4] = new Pair(Integer.valueOf(((List) afS68S0400000_18.l1).size()), "video_cnt");
        List list = (List) afS68S0400000_18.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1171050gZz) it2.next()).LIZ.getAid());
        }
        pairArr[5] = new Pair(arrayList, "group_id_list");
        CollectionDetail collectionDetailQS = ((CollectionContentFragment) afS68S0400000_18.l0).qS();
        if (collectionDetailQS != null && (status = collectionDetailQS.status) != null) {
            num = status.state;
        } else {
            num = null;
        }
        pairArr[6] = new Pair(C1172580gcS.LIZ(num), "collection_type");
        C20684815ws.LJIJI("collection_move_videos", pairArr);
        C1440005kM.LIZ(new C742510TAr((CollectionManageRequest) afS68S0400000_18.l2, null));
        CollectionDetail collectionDetailQS2 = ((CollectionContentFragment) afS68S0400000_18.l0).qS();
        if (collectionDetailQS2 != null && (statistic = collectionDetailQS2.statistic) != null && (l = statistic.total) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        CollectionDetail.Statistic statistic2 = ((CollectionContentFragment) afS68S0400000_18.l0).qS().statistic;
        if (statistic2 != null) {
            statistic2.total = Long.valueOf(jLongValue - ((long) ((List) afS68S0400000_18.l1).size()));
        }
        C1440005kM.LIZ(new C438720HIg(((CollectionContentFragment) afS68S0400000_18.l0).qS()));
        ((CollectionContentFragment) afS68S0400000_18.l0).mS().vQ2(true);
        C1389890mGx c1389890mGx = new C1389890mGx((C19EG) afS68S0400000_18.l3);
        c1389890mGx.LJIIJ(((CollectionContentFragment) afS68S0400000_18.l0).getResources().getQuantityString(2131755311, ((List) afS68S0400000_18.l1).size(), Integer.valueOf(((List) afS68S0400000_18.l1).size())));
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("CollectionContentFragment@3f31.onClickButtonToRemoveVideos$1$removeClickListener$1$doClick$1");
    }

    public static final void accept$1(AfS68S0400000_18 afS68S0400000_18, Object obj) {
        int size;
        String str;
        C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.directShowFavoritesSheet$1");
        CollectionListResponse collectionListResponse = (CollectionListResponse) obj;
        List<CollectionDetail> list = collectionListResponse.items;
        if (list != null && !list.isEmpty()) {
            List<CollectionDetail> list2 = collectionListResponse.items;
            if (list2 != null && (size = list2.size()) > 0) {
                if (((Function1) afS68S0400000_18.l0) != null) {
                    str = "click_bubble";
                } else {
                    str = "click_fav_button";
                }
                C1171470gaf c1171470gaf = new C1171470gaf();
                c1171470gaf.LJIILLIIL = str;
                C1171530gal c1171530gal = (C1171530gal) afS68S0400000_18.l1;
                c1171470gaf.LJIIZILJ = c1171530gal.LL;
                c1171470gaf.LIZLLL = c1171530gal.LLILLJJLI;
                c1171470gaf.LJIILJJIL();
                ((C1171530gal) afS68S0400000_18.l1).LJFF((C19EG) afS68S0400000_18.l2, size, (Function1) afS68S0400000_18.l0);
            } else {
                ((C1171530gal) afS68S0400000_18.l1).LIZLLL((View) afS68S0400000_18.l3, (C19EG) afS68S0400000_18.l2);
            }
        } else {
            ((C1171530gal) afS68S0400000_18.l1).LIZLLL((View) afS68S0400000_18.l3, (C19EG) afS68S0400000_18.l2);
        }
        C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.directShowFavoritesSheet$1");
    }

    public static final void accept$2(AfS68S0400000_18 afS68S0400000_18, Object obj) {
        int iIntValue;
        HashMap<String, Integer> map;
        Integer num;
        C1C7U.LIZ("FavoriteTabCountHelper@8c64.setupV2$1");
        FavoriteCountResponse favoriteCountResponse = (FavoriteCountResponse) obj;
        List list = (List) afS68S0400000_18.l0;
        final C1206260hUm c1206260hUm = (C1206260hUm) afS68S0400000_18.l3;
        final int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                final C0OFL c0ofl = (C0OFL) obj2;
                if (favoriteCountResponse != null && (map = favoriteCountResponse.count) != null && (num = map.get(c0ofl.LIZ().tabCountKey)) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c1206260hUm.LJ.put(c0ofl.LIZ().mobKey, Integer.valueOf(iIntValue));
                MutableLiveData<Integer> mutableLiveData = c0ofl.LL;
                mutableLiveData.setValue(Integer.valueOf(iIntValue));
                mutableLiveData.observe(c1206260hUm.LIZIZ, new Observer() { // from class: X.0hUl
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj3) {
                        Integer num2 = (Integer) obj3;
                        C19Y5 c19y5LJIIIZ = c1206260hUm.LIZ.LJIIIZ(i);
                        if (c19y5LJIIIZ != null) {
                            C0OFL c0ofl2 = c0ofl;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(c0ofl2.LIZ().pageTitle);
                            sbLIZ.append(' ');
                            sbLIZ.append(C1843500y4a.LIZIZ(num2.intValue()));
                            c19y5LJIIIZ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        c1206260hUm.LJ.put(c0ofl.LIZ().mobKey, num2);
                    }
                });
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Function0 function0 = (Function0) afS68S0400000_18.l1;
        if (function0 != null) {
            function0.invoke();
        }
        Function1 function1 = (Function1) afS68S0400000_18.l2;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C1C7U.LIZIZ("FavoriteTabCountHelper@8c64.setupV2$1");
    }

    public static final void accept$3(AfS68S0400000_18 afS68S0400000_18, Object obj) {
        int iIntValue;
        HashMap<String, Integer> map;
        Integer num;
        C1C7U.LIZ("FavoriteTabCountHelper@8c64.setupV2Removable$1");
        FavoriteCountResponse favoriteCountResponse = (FavoriteCountResponse) obj;
        List list = (List) afS68S0400000_18.l0;
        final C1206260hUm c1206260hUm = (C1206260hUm) afS68S0400000_18.l2;
        final InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) afS68S0400000_18.l3;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                final C0OFL c0ofl = (C0OFL) obj2;
                if (favoriteCountResponse != null && (map = favoriteCountResponse.count) != null && (num = map.get(c0ofl.LIZ().tabCountKey)) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c1206260hUm.LJ.put(c0ofl.LIZ().mobKey, Integer.valueOf(iIntValue));
                MutableLiveData<Integer> mutableLiveData = c0ofl.LL;
                mutableLiveData.setValue(Integer.valueOf(iIntValue));
                mutableLiveData.observe(c1206260hUm.LIZIZ, new Observer() { // from class: X.0hUj
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj3) {
                        Object obj4 = ((LinkedHashMap) c1206260hUm.LJ).get(c0ofl.LIZ().mobKey);
                        c1206260hUm.LJ.put(c0ofl.LIZ().mobKey, obj3);
                        if (obj3 != null && obj4 != null && !Intrinsics.LJFF(obj4, obj3)) {
                            interfaceC1631620sYq.invoke(c0ofl.LIZ().mobKey, (Integer) obj4, (Integer) obj3);
                        }
                    }
                });
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ((Function0) afS68S0400000_18.l1).invoke();
        C1C7U.LIZIZ("FavoriteTabCountHelper@8c64.setupV2Removable$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS68S0400000_18(Object obj, CollectionContentFragment collectionContentFragment, List<C1171050gZz> list, CollectionManageRequest collectionManageRequest, C19EG c19eg) {
        this.$t = c19eg;
        this.l0 = obj;
        this.l1 = collectionContentFragment;
        this.l2 = list;
        this.l3 = collectionManageRequest;
    }
}
