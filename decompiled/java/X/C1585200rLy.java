package X;

import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ITopicFeedService;
import com.ss.android.ugc.aweme.experiment.BottomTab;
import com.ss.android.ugc.aweme.experiment.Candidate;
import com.ss.android.ugc.aweme.experiment.Entrance;
import com.ss.android.ugc.aweme.experiment.TopTab;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.spi.HomeTabWrapperServiceImpl;
import com.ss.android.ugc.aweme.spi.HomeTabWrapperService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0rLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585200rLy {
    public final HomeTabWrapperService LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public boolean LJ;

    public final Map<String, C1585210rLz<AbstractC1585770rMt>> LIZIZ() {
        return (Map) this.LIZIZ.getValue();
    }

    public final void LJFF() {
        C1585210rLz<AbstractC1585770rMt> c1585210rLz;
        AbstractC1585770rMt value;
        List<Candidate> list;
        AbstractC1585770rMt value2;
        List<Candidate> list2;
        AbstractC1585770rMt value3;
        ArrayList<TopTabItem> arrayList;
        List<Candidate> list3;
        AbstractC1585770rMt value4;
        List<Candidate> list4;
        AbstractC1585770rMt value5;
        AbstractC1585770rMt value6;
        if (this.LJ) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.LJ) {
                    C1582020rGq.LIZJ("scene_init_protocol");
                    System.currentTimeMillis();
                    if (C286370BKh.LIZ()) {
                        C0CXN.LIZ.getClass();
                        TopTab topTab = C0CXN.LIZJ().topTab;
                        if (topTab != null && (arrayList = topTab.topTabList) != null) {
                            for (TopTabItem topTabItem : arrayList) {
                                C1585210rLz<AbstractC1585770rMt> c1585210rLz2 = LIZIZ().get(topTabItem.topTabKey);
                                if (c1585210rLz2 != null && (value6 = c1585210rLz2.getValue()) != null) {
                                }
                                Entrance entrance = topTabItem.leftEntrance;
                                if (entrance != null && (list4 = entrance.candidates) != null) {
                                    Iterator<Candidate> it2 = list4.iterator();
                                    while (it2.hasNext()) {
                                        C1585210rLz<AbstractC1585770rMt> c1585210rLz3 = LIZIZ().get(it2.next().entranceKey);
                                        if (c1585210rLz3 != null && (value5 = c1585210rLz3.getValue()) != null) {
                                            value5.LIZJ();
                                        }
                                    }
                                }
                                Entrance entrance2 = topTabItem.rightEntrance;
                                if (entrance2 != null && (list3 = entrance2.candidates) != null) {
                                    Iterator<Candidate> it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        C1585210rLz<AbstractC1585770rMt> c1585210rLz4 = LIZIZ().get(it3.next().entranceKey);
                                        if (c1585210rLz4 != null && (value4 = c1585210rLz4.getValue()) != null) {
                                            value4.LIZJ();
                                        }
                                    }
                                }
                            }
                        }
                        C0CXN.LIZ.getClass();
                        Entrance entrance3 = C0CXN.LIZJ().leftEntrance;
                        if (entrance3 != null && (list2 = entrance3.candidates) != null) {
                            Iterator<Candidate> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                C1585210rLz<AbstractC1585770rMt> c1585210rLz5 = LIZIZ().get(it4.next().entranceKey);
                                if (c1585210rLz5 != null && (value3 = c1585210rLz5.getValue()) != null) {
                                    value3.LIZJ();
                                }
                            }
                        }
                        C0CXN.LIZ.getClass();
                        Entrance entrance4 = C0CXN.LIZJ().rightEntrance;
                        if (entrance4 != null && (list = entrance4.candidates) != null) {
                            Iterator<Candidate> it5 = list.iterator();
                            while (it5.hasNext()) {
                                C1585210rLz<AbstractC1585770rMt> c1585210rLz6 = LIZIZ().get(it5.next().entranceKey);
                                if (c1585210rLz6 != null && (value2 = c1585210rLz6.getValue()) != null) {
                                    value2.LIZJ();
                                }
                            }
                        }
                        C0CXN.LIZ.getClass();
                        Map<String, ArrayList<BottomTab>> map = C0CXN.LIZJ().bottomTab;
                        if (map != null) {
                            Iterator<Map.Entry<String, ArrayList<BottomTab>>> it6 = map.entrySet().iterator();
                            while (it6.hasNext()) {
                                BottomTab bottomTab = (BottomTab) C13LP.LJJJLL(it6.next().getValue());
                                if (bottomTab != null && (c1585210rLz = LIZIZ().get(bottomTab.bottomTabKey)) != null && (value = c1585210rLz.getValue()) != null) {
                                }
                            }
                        }
                    } else {
                        for (AbstractC1585770rMt abstractC1585770rMt : (Set) this.LIZJ.getValue()) {
                            if (abstractC1585770rMt != null) {
                                ((ConcurrentHashMap) this.LIZLLL.getValue()).put(abstractC1585770rMt.LIZIZ().getKey(), abstractC1585770rMt);
                            }
                        }
                    }
                    C1582020rGq.LIZ("scene_init_protocol");
                    this.LJ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1585200rLy() {
        HomeTabWrapperService homeTabWrapperService;
        Object objLIZ = C04TD.LIZ(HomeTabWrapperService.class, false);
        if (objLIZ != null) {
            homeTabWrapperService = (HomeTabWrapperService) objLIZ;
        } else {
            if (C04TD.f2 == null) {
                synchronized (HomeTabWrapperService.class) {
                    if (C04TD.f2 == null) {
                        C04TD.f2 = new HomeTabWrapperServiceImpl();
                    }
                }
            }
            homeTabWrapperService = C04TD.f2;
        }
        this.LIZ = homeTabWrapperService;
        this.LIZIZ = C452501pT.LIZIZ(new C1585660rMi(this));
        this.LIZJ = C452501pT.LIZIZ(new C1585670rMj(this));
        this.LIZLLL = C452501pT.LIZIZ(new C1585220rM0());
    }

    public static AbstractC1585770rMt LJ(EnumC1584360rKc enumC1584360rKc) {
        Object objO7 = ((ITopicFeedService) ServiceManager.get().getService(ITopicFeedService.class)).O7(enumC1584360rKc);
        if (objO7 instanceof AbstractC1585770rMt) {
            return (AbstractC1585770rMt) objO7;
        }
        return null;
    }

    public final BottomTabProtocol LIZ(String str) {
        AbstractC1585770rMt value;
        LJFF();
        if (C286370BKh.LIZ()) {
            C1585210rLz<AbstractC1585770rMt> c1585210rLz = LIZIZ().get(str);
            if (c1585210rLz != null && (value = c1585210rLz.getValue()) != null) {
                return (BottomTabProtocol) value.LIZIZ.getValue();
            }
            return null;
        }
        AbstractC1585770rMt abstractC1585770rMt = (AbstractC1585770rMt) ((ConcurrentHashMap) this.LIZLLL.getValue()).get(str);
        if (abstractC1585770rMt != null) {
            return (BottomTabProtocol) abstractC1585770rMt.LIZIZ.getValue();
        }
        return null;
    }

    public final InterfaceC1570900qyu LIZJ(String str) {
        AbstractC1585770rMt value;
        LJFF();
        if (C286370BKh.LIZ()) {
            C1585210rLz<AbstractC1585770rMt> c1585210rLz = LIZIZ().get(str);
            if (c1585210rLz != null && (value = c1585210rLz.getValue()) != null) {
                return value.LIZJ();
            }
            return null;
        }
        AbstractC1585770rMt abstractC1585770rMt = (AbstractC1585770rMt) ((ConcurrentHashMap) this.LIZLLL.getValue()).get(str);
        if (abstractC1585770rMt != null) {
            return abstractC1585770rMt.LIZJ();
        }
        return null;
    }

    public final TopTabProtocol LIZLLL(String str) {
        AbstractC1585770rMt value;
        LJFF();
        if (C286370BKh.LIZ()) {
            C1585210rLz<AbstractC1585770rMt> c1585210rLz = LIZIZ().get(str);
            if (c1585210rLz == null || (value = c1585210rLz.getValue()) == null) {
                return null;
            }
            return (TopTabProtocol) value.LIZ.getValue();
        }
        AbstractC1585770rMt abstractC1585770rMt = (AbstractC1585770rMt) ((ConcurrentHashMap) this.LIZLLL.getValue()).get(str);
        if (abstractC1585770rMt == null) {
            return null;
        }
        return (TopTabProtocol) abstractC1585770rMt.LIZ.getValue();
    }
}
