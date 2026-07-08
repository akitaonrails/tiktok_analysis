package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0YhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881110YhR implements InterfaceC882100Yj2 {
    public static final /* synthetic */ int LLJJI = 0;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public Boolean LLJILLL;
    public final C1491005sa LL = C1491005sa.LIZ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C881180YhY());
    public final String LLILLL = "ChatListUnreadMUFUpdater";
    public final String LLILZ = "unread_muf_updater";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C881160YhW(this));
    public final boolean LLILZLL = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(new C881170YhX());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(480));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(479));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C881190YhZ());
    public final C879040Ye6 LLJJ = new C879040Ye6(new AwS558S0100000_14(this, 1503));

    @Override // X.InterfaceC882100Yj2
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU LJIILL(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu c879540Yeu, AbstractC1491605sg abstractC1491605sg, C1490405sU c1490405sU) {
        return null;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIZILJ(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJ() {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return (C884710YnF) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        ((ConcurrentHashMap) this.LLIZLLLIL.getValue()).clear();
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (C881500Yi4.LJ() != null) {
            AbstractC883730Ylf.LJJIFFI(Collections.singletonList(this.LLJJ));
        }
        this.LLJILLL = null;
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return (List) this.LLIZ.getValue();
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJ() {
        return (CopyOnWriteArrayList) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void init() {
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (C881500Yi4.LJ() != null) {
            AbstractC883730Ylf.LJJI(Collections.singletonList(this.LLJJ));
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIJJ().clear();
    }

    public final boolean LJIJJLI() {
        if (C310690CFv.LIZ().raisingFrequencyControlDay == 0) {
            this.LLJILLL = Boolean.FALSE;
            return false;
        }
        if (C310690CFv.LIZ().raisingFrequencyControlDay == -1) {
            this.LLJILLL = Boolean.TRUE;
            return true;
        }
        Boolean bool = this.LLJILLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        Keva keva = (Keva) this.LLJILJILJ.getValue();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        long j = 24;
        long j2 = 60;
        long j3 = ((keva.getLong(curUserId, -1L) / j) / j2) / j2;
        long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
        boolean z = ((((System.currentTimeMillis() / j) / j2) / j2) / j4) - (j3 / j4) >= ((long) C310690CFv.LIZ().raisingFrequencyControlDay);
        this.LLJILLL = Boolean.valueOf(z);
        return z;
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
        C878950Ydx c878950Ydx;
        FilterTabType filterTabType;
        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null && (filterTabType = c878950Ydx.LLILLL) != null) {
            ((ConcurrentHashMap) this.LLIZLLLIL.getValue()).remove(filterTabType);
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIJJ().addAll(list);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Long] */
    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        C878950Ydx c878950Ydx;
        FilterTabType filterTabType;
        Object objPutIfAbsent;
        if (!Intrinsics.LJFF(abstractC1491605sg, C881200Yha.LIZ) || !Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE) || !(interfaceC879010Ye3 instanceof C878950Ydx) || (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) == null || (filterTabType = c878950Ydx.LLILLL) == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LLIZLLLIL.getValue();
        Object c881130YhT = concurrentHashMap.get(filterTabType);
        if (c881130YhT == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(filterTabType, (c881130YhT = new C881130YhT()))) != null) {
            c881130YhT = objPutIfAbsent;
        }
        C881130YhT c881130YhT2 = (C881130YhT) c881130YhT;
        int i = 0;
        for (C879540Yeu<?> c879540Yeu2 : c881130YhT2.LIZLLL) {
            if (i >= 0) {
                if (Intrinsics.LJFF(c879540Yeu2.LIZIZ, c879540Yeu.LIZIZ)) {
                    long j = c881130YhT2.LIZIZ - ((long) i);
                    if (c1490405sU == null) {
                        return new C1490405sU<>(C881200Yha.LIZ, Long.valueOf(j));
                    }
                    c1490405sU.LIZIZ = Long.valueOf(j);
                    return c1490405sU;
                }
                i++;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC882100Yj2
    public final void LJIILLIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, Collection<? extends InterfaceC1491305sd> collection2, String str) {
        boolean z;
        C0Y8T c0y8t;
        C0Y8W settingInfo;
        Object obj;
        IMUser iMUserLJIIL;
        Object objPutIfAbsent;
        List<? extends InterfaceC1491305sd> list;
        C878950Ydx c878950YdxLIZIZ;
        AbstractC883730Ylf abstractC883730YlfLJ;
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (!Intrinsics.LJFF(interfaceC879010Ye3, C881500Yi4.LIZLLL())) {
            return;
        }
        Set<String> set = C869290Y8h.LJIIL;
        if ((set instanceof Collection) && set.isEmpty()) {
            z = false;
        } else {
            for (String str2 : set) {
                if (u.LJIIZILJ(str, str2, false)) {
                    AbstractC883730Ylf.LJIIIIZZ.getClass();
                    if (C881500Yi4.LJFF(str2)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        if (collection.isEmpty() && collection2.isEmpty()) {
            if (z) {
                this.LLJIJIL = true;
                return;
            }
            return;
        }
        List<FilterTabType> listLJIIIIZZ = C19212010Ec.LIZJ.LJIIIIZZ();
        ArrayList<FilterTabType> arrayList = new ArrayList();
        for (FilterTabType filterTabType : listLJIIIIZZ) {
            if (filterTabType != FilterTabType.REQUEST && filterTabType != FilterTabType.SPAM) {
                arrayList.add(filterTabType);
            }
        }
        for (FilterTabType filterTabType2 : arrayList) {
            String.valueOf(filterTabType2);
            C309160C9y.LIZ();
            if (!this.LLJIJIL || !this.LLJI || !((Set) this.LLJ.getValue()).contains(filterTabType2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("batchProduceUnreadMUF size=");
                sbLIZ.append(collection.size());
                sbLIZ.append(", tab=");
                sbLIZ.append(filterTabType2);
                C2188811AlT.LIZIZ(sbLIZ);
                C309160C9y.LIZ();
                if (!LJIJJLI()) {
                    list = C13BV.INSTANCE;
                } else {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LLIZLLLIL.getValue();
                    Object c881130YhT = concurrentHashMap.get(filterTabType2);
                    if (c881130YhT == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(filterTabType2, (c881130YhT = new C881130YhT()))) != null) {
                        c881130YhT = objPutIfAbsent;
                    }
                    C881130YhT c881130YhT2 = (C881130YhT) c881130YhT;
                    ArrayList arrayList2 = new ArrayList();
                    for (C879540Yeu<?> c879540Yeu : collection) {
                        T t = c879540Yeu.LIZJ;
                        if ((t instanceof C0Y8T) && (c0y8t = (C0Y8T) t) != null && (settingInfo = c0y8t.getSettingInfo()) != null && !settingInfo.isStickTop() && c0y8t.getUnreadCount() > 0 && c0y8t.getConversationType() == AbstractC1711506n3.LIZ && !c0y8t.isMute()) {
                            C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
                            if (c1490405sU != null) {
                                obj = c1490405sU.LIZIZ;
                            } else {
                                obj = null;
                            }
                            if (!(obj instanceof IMUser) || (iMUserLJIIL = (IMUser) obj) == null) {
                                IMContactApi.LIZ.getClass();
                                iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(C0YNP.LJII(c0y8t.getConversationId())), null, "im_local_db");
                            }
                            Set<EnumC880480YgQ> set2 = C880490YgR.LLILLL;
                            if (C880370YgF.LIZ(filterTabType2, C19212010Ec.LIZJ.LJLIIIL().getSecond(), c0y8t, iMUserLJIIL, null, null)) {
                                if (iMUserLJIIL != null && iMUserLJIIL.getFollowStatus() == 2) {
                                    if (c881130YhT2.LIZ > c881130YhT2.LIZJ.size()) {
                                        arrayList2.add(c879540Yeu.LIZIZ);
                                        c881130YhT2.LIZJ.put(c879540Yeu.LIZIZ, c879540Yeu);
                                        c881130YhT2.LIZLLL.add(c879540Yeu);
                                    }
                                } else if (c881130YhT2.LIZJ.containsKey(c879540Yeu.LIZIZ)) {
                                    arrayList2.add(c879540Yeu.LIZIZ);
                                    c881130YhT2.LIZJ.remove(c879540Yeu.LIZIZ);
                                    c881130YhT2.LIZLLL.remove(c879540Yeu);
                                }
                            } else if (c881130YhT2.LIZJ.containsKey(c879540Yeu.LIZIZ)) {
                                arrayList2.add(c879540Yeu.LIZIZ);
                                c881130YhT2.LIZJ.remove(c879540Yeu.LIZIZ);
                                c881130YhT2.LIZLLL.remove(c879540Yeu);
                            }
                        }
                    }
                    for (Object obj2 : collection2) {
                        if (c881130YhT2.LIZJ.containsKey(obj2)) {
                            arrayList2.add(obj2);
                            C879540Yeu<?> c879540YeuRemove = c881130YhT2.LIZJ.remove(obj2);
                            if (c879540YeuRemove != null) {
                                c881130YhT2.LIZLLL.remove(c879540YeuRemove);
                            }
                        }
                    }
                    c881130YhT2.LIZIZ = System.currentTimeMillis();
                    list = arrayList2;
                    if (!this.LLJILJIL) {
                        list = arrayList2;
                        if (this.LLJI) {
                            list = arrayList2;
                            if (!c881130YhT2.LIZLLL.isEmpty()) {
                                this.LLJILJIL = true;
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                Keva keva = (Keva) this.LLJILJILJ.getValue();
                                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                                if (curUserId == null) {
                                    curUserId = "";
                                }
                                keva.storeLong(curUserId, jCurrentTimeMillis);
                                list = arrayList2;
                            }
                        }
                    }
                }
                AbstractC883730Ylf.LJIIIIZZ.getClass();
                AbstractC883730Ylf abstractC883730YlfLJ2 = C881500Yi4.LJ();
                if (abstractC883730YlfLJ2 != null && (c878950YdxLIZIZ = abstractC883730YlfLJ2.LIZIZ(filterTabType2, C19212010Ec.LIZJ.LJLIIIL().getSecond())) != null && (abstractC883730YlfLJ = C881500Yi4.LJ()) != null && abstractC883730YlfLJ.LJIIZILJ().containsKey(c878950YdxLIZIZ)) {
                    ((Set) this.LLJ.getValue()).add(filterTabType2);
                    Iterator<InterfaceC1482905rH> it2 = LJIJJ().iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(c878950YdxLIZIZ, list, LIZIZ(), this.LLILLL);
                    }
                }
            }
        }
        if (z) {
            this.LLJIJIL = true;
        }
    }
}
