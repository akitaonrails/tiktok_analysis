package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05sS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1490205sS implements InterfaceC882100Yj2 {
    public final C1491005sa LL = C1491005sa.LIZ;
    public final String LLILLJJLI = "ChatListThoughtBubbleUpdater";
    public final String LLILLL = "thought_bubble_updater";
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1085));
    public final boolean LLILZIL = true;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1070));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1071));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1069));

    @Override // X.InterfaceC882100Yj2
    public final void LJIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU LJIILL(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu c879540Yeu, AbstractC1491605sg abstractC1491605sg, C1490405sU c1490405sU) {
        return null;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILLIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, Collection<? extends InterfaceC1491305sd> collection2, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIZILJ(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJ() {
    }

    @Override // X.InterfaceC882100Yj2
    public final void init() {
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return (C884710YnF) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return (List) this.LLILZLL.getValue();
    }

    public final ConcurrentHashMap<InterfaceC879010Ye3, C1482705rF> LJIJJ() {
        return (ConcurrentHashMap) this.LLIZLLLIL.getValue();
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJLI() {
        return (CopyOnWriteArrayList) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        Iterator<T> it2 = LJIJJ().values().iterator();
        while (it2.hasNext()) {
            ((C1482705rF) it2.next()).LIZ();
        }
        LJIJJ().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIJJLI().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LLILLJJLI;
    }

    public static boolean LJIL(C879540Yeu c879540Yeu) {
        Object obj;
        C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
        IMUser iMUser = null;
        if (c1490405sU != null) {
            obj = c1490405sU.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof IMUser) {
            iMUser = (IMUser) obj;
        }
        if (iMUser == null || iMUser.getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
        ConcurrentHashMap<InterfaceC879010Ye3, C1482705rF> concurrentHashMapLJIJJ = LJIJJ();
        if (concurrentHashMapLJIJJ.get(interfaceC879010Ye3) == null) {
            concurrentHashMapLJIJJ.putIfAbsent(interfaceC879010Ye3, new C1482705rF());
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
        C1482705rF c1482705rFRemove = LJIJJ().remove(interfaceC879010Ye3);
        if (c1482705rFRemove != null) {
            c1482705rFRemove.LIZ();
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIJJLI().addAll(list);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
        Object next;
        Object key;
        C1482705rF c1482705rF = LJIJJ().get(interfaceC879010Ye3);
        if (c1482705rF == null) {
            return;
        }
        Iterator<T> it2 = c1482705rF.LIZ.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((Map.Entry) next).getValue(), interfaceC1491305sd)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (key = entry.getKey()) != null) {
            c1482705rF.LIZ.remove(key);
            C09AE c09aeRemove = c1482705rF.LIZIZ.remove(key);
            if (c09aeRemove != null) {
                c09aeRemove.LIZIZ(null);
            }
            c1482705rF.LIZJ.remove(key);
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Object] */
    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        C0Y8T c0y8t;
        String string;
        ISocialThoughtDataCenterService iSocialThoughtDataCenterService;
        AnonymousClass0951 anonymousClass0951LJI;
        ?? value;
        if (!C343820Dds.LIZ()) {
            return null;
        }
        C1491405se c1491405se = C1491405se.LIZ;
        if (!Intrinsics.LJFF(abstractC1491605sg, c1491405se) || !(c879540Yeu.LIZ instanceof C882110Yj3) || !LJIL(c879540Yeu)) {
            return null;
        }
        T t = c879540Yeu.LIZJ;
        if (!(t instanceof C0Y8T) || (c0y8t = (C0Y8T) t) == null) {
            return null;
        }
        Long lValueOf = Long.valueOf(C0YNP.LJII(c0y8t.getConversationId()));
        if (lValueOf.longValue() == -1 || (string = lValueOf.toString()) == null || (iSocialThoughtDataCenterService = (ISocialThoughtDataCenterService) PluggableExtentionKt.pluggableSpiForReal(ISocialThoughtDataCenterService.class)) == null || (anonymousClass0951LJI = iSocialThoughtDataCenterService.LJI(string, false)) == null || (value = anonymousClass0951LJI.getValue()) == 0) {
            return null;
        }
        if (c1490405sU == null) {
            return new C1490405sU<>(c1491405se, value);
        }
        c1490405sU.LIZIZ = value;
        return c1490405sU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
        C0Y8T c0y8t;
        String string;
        C1482705rF c1482705rFPutIfAbsent;
        ConcurrentHashMap<InterfaceC879010Ye3, C1482705rF> concurrentHashMapLJIJJ = LJIJJ();
        C1482705rF c1482705rF = concurrentHashMapLJIJJ.get(interfaceC879010Ye3);
        if (c1482705rF == null && (c1482705rFPutIfAbsent = concurrentHashMapLJIJJ.putIfAbsent(interfaceC879010Ye3, (c1482705rF = new C1482705rF()))) != null) {
            c1482705rF = c1482705rFPutIfAbsent;
        }
        C1482705rF c1482705rF2 = c1482705rF;
        if (!C343820Dds.LIZ()) {
            c1482705rF2.LIZ();
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            C879540Yeu c879540Yeu = (C879540Yeu) it2.next();
            if (c879540Yeu.LIZ instanceof C882110Yj3) {
                T t = c879540Yeu.LIZJ;
                if ((t instanceof C0Y8T) && (c0y8t = (C0Y8T) t) != null) {
                    InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
                    if ((interfaceC1491305sd instanceof AnonymousClass0617) && interfaceC1491305sd != null) {
                        Long lValueOf = Long.valueOf(C0YNP.LJII(c0y8t.getConversationId()));
                        if (lValueOf.longValue() != -1 && (string = lValueOf.toString()) != null && LJIL(c879540Yeu)) {
                            linkedHashMap.put(string, interfaceC1491305sd);
                        }
                    }
                }
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(c1482705rF2.LIZIZ.keySet());
        Set<String> setLJII = C15442062u.LJII(linkedHashMap.keySet(), setLLIIJI);
        for (Object obj : C15442062u.LJII(setLLIIJI, linkedHashMap.keySet())) {
            C09AE c09aeRemove = c1482705rF2.LIZIZ.remove(obj);
            if (c09aeRemove != null) {
                c09aeRemove.LIZIZ(null);
            }
            c1482705rF2.LIZJ.remove(obj);
        }
        ConcurrentHashMap<String, AnonymousClass0617> concurrentHashMap = c1482705rF2.LIZ;
        concurrentHashMap.clear();
        concurrentHashMap.putAll(linkedHashMap);
        ISocialThoughtDataCenterService iSocialThoughtDataCenterService = (ISocialThoughtDataCenterService) PluggableExtentionKt.pluggableSpiForReal(ISocialThoughtDataCenterService.class);
        if (iSocialThoughtDataCenterService == null) {
            if (!setLJII.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("no ISocialThoughtDataCenterService SPI, skip subscribe userIds=");
                sbLIZ.append(setLJII.size());
                C2188811AlT.LIZIZ(sbLIZ);
                C309160C9y.LIZ();
                return;
            }
            return;
        }
        if (!setLJII.isEmpty()) {
            C1729806q0.LIZ(interfaceC879010Ye3, new C05MI(iSocialThoughtDataCenterService, setLJII, null));
        }
        for (String str2 : setLJII) {
            AnonymousClass0951 anonymousClass0951LJI = iSocialThoughtDataCenterService.LJI(str2, false);
            c1482705rF2.LIZJ.put(str2, anonymousClass0951LJI);
            c1482705rF2.LIZIZ.put(str2, C1729806q0.LIZ(interfaceC879010Ye3, new C05MJ(anonymousClass0951LJI, this, interfaceC879010Ye3, str2, null)));
        }
    }
}
