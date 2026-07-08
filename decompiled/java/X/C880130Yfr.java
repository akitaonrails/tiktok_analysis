package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatlist.api.model.LastMessageProperty;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0Yfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880130Yfr implements InterfaceC882100Yj2 {
    public static final C01GW<C880140Yfs> LLJJ = C452501pT.LIZIZ(new C880220Yg0());
    public volatile Integer LLJI;
    public C880150Yft LLJIJIL;
    public boolean LLJILJILJ;
    public C886330Ypr LLJILLL;
    public final C1491005sa LL = C1491005sa.LIZ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C880210Yfz());
    public final String LLILLL = "ChatListUnreadInfoUpdater";
    public final String LLILZ = "unread_info_updater";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C880200Yfy(this));
    public final boolean LLILZLL = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(new C880180Yfw());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C880190Yfx());
    public final C01GW LLJ = C452501pT.LIZIZ(new C880170Yfv());
    public final Map<InterfaceC1491305sd, C350260DoG> LLJILJIL = new LinkedHashMap();

    @Override // X.InterfaceC882100Yj2
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        return null;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIZILJ(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJ() {
    }

    public static List LJIJJ() {
        List<FilterTabType> listLJIIIIZZ = C19212010Ec.LIZJ.LJIIIIZZ();
        ArrayList arrayList = new ArrayList();
        for (FilterTabType filterTabType : listLJIIIIZZ) {
            if (filterTabType != FilterTabType.REQUEST && filterTabType != FilterTabType.SPAM) {
                arrayList.add(filterTabType);
            }
        }
        return C0CYM.LIZJ.LJIIIIZZ() ? C13LP.LJLIL(Collections.singletonList(FilterTabType.ARCHIVE), arrayList) : arrayList;
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return (C884710YnF) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return (List) this.LLIZ.getValue();
    }

    public final Map<FilterTabType, Map<InterfaceC1491305sd, C880150Yft>> LJIJJLI() {
        return (Map) this.LLIZLLLIL.getValue();
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIL() {
        return (CopyOnWriteArrayList) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0445 A[EDGE_INSN: B:299:0x0445->B:224:0x0445 BREAK  A[LOOP:14: B:191:0x039b->B:306:0x039b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x039b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<X.05sd, X.0DoG>] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI() {
        /*
            Method dump skipped, instruction units count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880130Yfr.LJJI():void");
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        EventBus.LIZLLL().LJJI(this);
        LJIJJLI().clear();
        ((Map) this.LLJ.getValue()).clear();
        this.LLJILJILJ = false;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIL().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final void init() {
        EventBus.LIZLLL().LJIJJ(this);
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
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIL().addAll(list);
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onUserUpdateEvent(C1434905jX c1434905jX) {
        String uid = c1434905jX.LIZJ.getUid();
        if (uid == null) {
            return;
        }
        if (!C19212010Ec.LIZJ.LJJ() && !C0CYM.LIZJ.LJIIIIZZ()) {
            return;
        }
        Set set = (Set) ((Map) this.LLJ.getValue()).get(uid);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserUpdateEvent uid=");
        sbLIZ.append(uid);
        sbLIZ.append(", wrapperKeySet: ");
        sbLIZ.append(set);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        if (set == null) {
            return;
        }
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C1516205we(this, set, uid, null));
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, X.0Yft, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, X.0Yft, java.lang.Object] */
    @Override // X.InterfaceC882100Yj2
    public final C1490405sU LJIILL(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu c879540Yeu, AbstractC1491605sg abstractC1491605sg, C1490405sU c1490405sU) {
        Object obj;
        IMUser iMUser;
        C878950Ydx c878950Ydx;
        FilterTabType filterTabType;
        C878950Ydx c878950Ydx2;
        C879970Yfb c879970Yfb = C879970Yfb.LIZ;
        FilterTabType filterTabType2 = null;
        if (!Intrinsics.LJFF(abstractC1491605sg, c879970Yfb)) {
            return null;
        }
        Object obj2 = c879540Yeu.LIZ;
        if (Intrinsics.LJFF(obj2, C878910Ydt.INSTANCE)) {
            C880140Yfs value = LLJJ.getValue();
            InterfaceC1490905sZ<T> interfaceC1490905sZ = c879540Yeu.LIZ;
            T t = c879540Yeu.LIZJ;
            if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx2 = (C878950Ydx) interfaceC879010Ye3) != null) {
                filterTabType = c878950Ydx2.LLILLL;
            } else {
                filterTabType = null;
            }
            ?? LIZIZ = value.LIZIZ(new C880160Yfu(interfaceC1490905sZ, t, null, filterTabType));
            this.LLJIJIL = LIZIZ;
            this.LLJI = Integer.valueOf(LIZIZ.LIZJ);
            if (c1490405sU == null) {
                return new C1490405sU(c879970Yfb, LIZIZ);
            }
            c1490405sU.LIZIZ = LIZIZ;
            return c1490405sU;
        }
        if (!(obj2 instanceof InterfaceC1606206Qq)) {
            return null;
        }
        C1490405sU<?> c1490405sU2 = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
        if (c1490405sU2 != null) {
            obj = c1490405sU2.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof IMUser) {
            iMUser = (IMUser) obj;
        } else {
            iMUser = null;
        }
        C880140Yfs value2 = LLJJ.getValue();
        InterfaceC1490905sZ<T> interfaceC1490905sZ2 = c879540Yeu.LIZ;
        T t2 = c879540Yeu.LIZJ;
        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
            filterTabType2 = c878950Ydx.LLILLL;
        }
        ?? LIZIZ2 = value2.LIZIZ(new C880160Yfu(interfaceC1490905sZ2, t2, iMUser, filterTabType2));
        if (c1490405sU == null) {
            return new C1490405sU(c879970Yfb, LIZIZ2);
        }
        c1490405sU.LIZIZ = LIZIZ2;
        return c1490405sU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019e  */
    @Override // X.InterfaceC882100Yj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(X.InterfaceC879010Ye3 r17, java.util.Collection<? extends X.C879540Yeu<?>> r18, java.util.Collection<? extends X.InterfaceC1491305sd> r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C880130Yfr.LJIILLIIL(X.0Ye3, java.util.Collection, java.util.Collection, java.lang.String):void");
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
        Object obj;
        if ((interfaceC879010Ye3 instanceof C878950Ydx) && !C19212010Ec.LIZJ.LJJ()) {
            C878950Ydx c878950Ydx = (C878950Ydx) interfaceC879010Ye3;
            if (c878950Ydx.LLILLL == FilterTabType.OVERALL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("observeDataChange size=");
                sbLIZ.append(collection.size());
                sbLIZ.append(" page=");
                sbLIZ.append(interfaceC879010Ye3);
                C2188811AlT.LIZIZ(sbLIZ);
                C309160C9y.LIZ();
                ArrayList<C879540Yeu> arrayList = new ArrayList();
                Iterator<T> it2 = collection.iterator();
                while (true) {
                    Object obj2 = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    C1490405sU<?> c1490405sU = ((C879540Yeu) next).LIZLLL.get(C879970Yfb.LIZ);
                    if (c1490405sU != null) {
                        obj2 = c1490405sU.LIZIZ;
                    }
                    if ((obj2 instanceof C880150Yft) && obj2 != null) {
                        arrayList.add(next);
                    }
                }
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C879540Yeu c879540Yeu : arrayList) {
                    InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
                    C1490405sU<?> c1490405sU2 = c879540Yeu.LIZLLL.get(C879970Yfb.LIZ);
                    if (c1490405sU2 != null) {
                        obj = c1490405sU2.LIZIZ;
                    } else {
                        obj = null;
                    }
                    Pair pair = new Pair(interfaceC1491305sd, obj);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                LJIJJLI().put(c878950Ydx.LLILLL, new LinkedHashMap(linkedHashMap));
                LJJI();
            }
        }
    }

    public final void LJJ(FilterTabType filterTabType, InterfaceC1490905sZ<?> interfaceC1490905sZ, InterfaceC1491305sd interfaceC1491305sd, C0Y8T c0y8t, IMUser iMUser, String str) {
        LastMessageProperty lastMessagePropertyLIZ;
        IMUser iMUserLJIIL = iMUser;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleConversationWrapperUnreadInfo wrapperKey=");
        sbLIZ.append(interfaceC1491305sd);
        sbLIZ.append(", tab=");
        sbLIZ.append(filterTabType);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        Map<FilterTabType, Map<InterfaceC1491305sd, C880150Yft>> mapLJIJJLI = LJIJJLI();
        Map<InterfaceC1491305sd, C880150Yft> linkedHashMap = mapLJIJJLI.get(filterTabType);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            mapLJIJJLI.put(filterTabType, linkedHashMap);
        }
        Map<InterfaceC1491305sd, C880150Yft> map = linkedHashMap;
        if (iMUserLJIIL == null) {
            IMContactApi.LIZ.getClass();
            iMUserLJIIL = C069P.LIZ().LJ().LJIIL(str, null, "im_local_db");
        }
        C880150Yft c880150Yft = map.get(interfaceC1491305sd);
        C880150Yft c880150YftLIZIZ = LLJJ.getValue().LIZIZ(new C880160Yfu(interfaceC1490905sZ, c0y8t, iMUserLJIIL, filterTabType));
        Set<EnumC880480YgQ> set = C880490YgR.LLILLL;
        if (C880370YgF.LIZ(filterTabType, C19212010Ec.LIZJ.LJLIIIL().getSecond(), c0y8t, iMUserLJIIL, str, c880150YftLIZIZ)) {
            map.put(interfaceC1491305sd, c880150YftLIZIZ);
            if (filterTabType == FilterTabType.ARCHIVE) {
                IDmHelper iDmHelper = (IDmHelper) PluggableExtentionKt.pluggableSpi$default(IDmHelper.class, false, false, false, 14, null);
                if (iDmHelper != null) {
                    lastMessagePropertyLIZ = iDmHelper.LIZ(c0y8t);
                } else {
                    lastMessagePropertyLIZ = null;
                }
                long jLIZ = C879900YfU.LIZ(c0y8t, lastMessagePropertyLIZ, null);
                Map<InterfaceC1491305sd, C350260DoG> map2 = this.LLJILJIL;
                c0y8t.isMute();
                map2.put(interfaceC1491305sd, new C350260DoG(jLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleConversationWrapperUnreadInfo setUnreadInfo, tab=");
            sbLIZ2.append(filterTabType);
            sbLIZ2.append(", convid: ");
            sbLIZ2.append(c0y8t.getConversationId());
            sbLIZ2.append(", old: ");
            sbLIZ2.append(c880150Yft);
            sbLIZ2.append(", new: ");
            sbLIZ2.append(c880150YftLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            C309160C9y.LIZ();
            return;
        }
        map.remove(interfaceC1491305sd);
        if (filterTabType != FilterTabType.ARCHIVE) {
            return;
        }
        this.LLJILJIL.remove(interfaceC1491305sd);
    }
}
