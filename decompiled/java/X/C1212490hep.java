package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212490hep {
    public final C1255920ims<C1601380rm4> LIZ;
    public final C0VR0 LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final C11NJ LJ;
    public int LJFF;

    public final void LIZIZ() {
        AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) this.LIZ.LL;
        final List items = abstractC1255880imo != null ? abstractC1255880imo.getItems() : null;
        System.currentTimeMillis();
        if (items == null || items.isEmpty() || this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        this.LJ.LIZ(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0Vkc
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<List<Pair<Integer, Aweme>>> c09aj) {
                C1C7U.LIZ("FeedRecentGidFilterManager@757c.filterFYPByRecentGidAsync$task$1");
                c09aj.onNext(this.LIZ.LIZJ(items));
                c09aj.onComplete();
                C1C7U.LIZIZ("FeedRecentGidFilterManager@757c.filterFYPByRecentGidAsync$task$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0hen
            @Override // X.C09JN
            public final void accept(Object obj) {
                String nickname;
                C1C7U.LIZ("FeedRecentGidFilterManager@757c.filterFYPByRecentGidAsync$task$2");
                C1212490hep c1212490hep = this.LL;
                for (Pair pair : (List) obj) {
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    Aweme aweme = (Aweme) pair.getSecond();
                    if (iIntValue > c1212490hep.LJFF) {
                        C0OF0.LIZIZ(aweme, "filter_recent_gid");
                        boolean zDeleteItem = ((C1601380rm4) c1212490hep.LIZ.LL).deleteItem(aweme);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("! remove: isDeleted = ");
                        sbLIZ.append(zDeleteItem);
                        sbLIZ.append(", aweme nickname = ");
                        User author = aweme.getAuthor();
                        if (author == null || (nickname = author.getNickname()) == null) {
                            nickname = "null";
                        }
                        sbLIZ.append(nickname);
                        sbLIZ.append(", aid = ");
                        sbLIZ.append(aweme.getAid());
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                this.LL.LIZJ = false;
                C1C7U.LIZIZ("FeedRecentGidFilterManager@757c.filterFYPByRecentGidAsync$task$2");
            }
        }, new C09JN() { // from class: X.0VRL
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FeedRecentGidFilterManager@757c.filterFYPByRecentGidAsync$task$3");
                this.LL.LIZJ = false;
                C1C7U.LIZIZ("FeedRecentGidFilterManager@757c.filterFYPByRecentGidAsync$task$3");
            }
        }));
    }

    public C1212490hep(C1601390rm5 c1601390rm5) {
        this.LIZ = c1601390rm5;
        C0VR0 c0vr0 = new C0VR0(this);
        this.LIZIZ = c0vr0;
        this.LJ = new C11NJ();
        ((C1601380rm4) c1601390rm5.LL).LLILZLL = this;
        if (C162700jp.LIZ("filter_consumed_in_other_scene_video") == 0) {
            C1601060rlY.LIZ = new WeakReference<>(this);
        }
        C1216540hlM.LIZIZ.LIZIZ(c0vr0);
    }

    public final List<Pair<Integer, Aweme>> LIZJ(List<? extends Aweme> list) {
        boolean z;
        ArrayList arrayList;
        boolean z2;
        Object c098200Yq;
        boolean z3;
        boolean z4;
        ArrayList arrayList2 = new ArrayList();
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return arrayList2;
        }
        List listLIZ = C1216540hlM.LIZIZ.LIZ(10000, C278280AvS.LIZ());
        if (listLIZ != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : listLIZ) {
                if (((C0VNS) obj).LJII != 40) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C0VNS) it2.next()).LIZ);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            this.LIZJ = false;
            return arrayList2;
        }
        int i = this.LJFF;
        try {
            c098200Yq = list.subList(i + 1, list.size());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List list2 = (List) c098200Yq;
        list.size();
        if (list2 != null) {
            list2.size();
        }
        if (list2 != null) {
            int i2 = 0;
            for (Object obj2 : list2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Aweme aweme = (Aweme) obj2;
                    if (aweme != null && aweme.getAwemeType() != 101 && !C1017070cZd.LLJJIJIIJIL(aweme) && !C1017070cZd.LJLJLJ(aweme) && aweme.getAwemeType() != 4004 && !aweme.isPaidContent && AwemeBizExtKt.getCacheSourceType(aweme) != C0N9C.OFFLINE_MODE.ordinal()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 && aweme != null && arrayList.contains(aweme.getAid())) {
                        arrayList2.add(new Pair(Integer.valueOf(i2 + i + 1), aweme));
                        C0OF0.LIZIZ(aweme, "filter_consumed_in_other_scene_video");
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList2;
    }

    public final void LIZ(int i, List list) {
        if (i == 1) {
            this.LJFF = 0;
        }
        System.currentTimeMillis();
        if (list != null && !list.isEmpty() && !this.LIZJ) {
            this.LIZJ = true;
            List<Pair<Integer, Aweme>> listLIZJ = LIZJ(list);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
            Iterator it2 = ((ArrayList) listLIZJ).iterator();
            while (it2.hasNext()) {
                arrayList.add(((Pair) it2.next()).getSecond());
            }
            if (list != null) {
                list.removeAll(arrayList);
            }
            this.LIZJ = false;
        }
    }
}
