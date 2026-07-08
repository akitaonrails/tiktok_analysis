package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings.IMMessageRequestPeerUserUpdateSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS65S0301000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.06oB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1718506oB implements InterfaceC882100Yj2 {
    public final String LL = "MessageRequestIMUserUpdater";
    public final String LLILLJJLI = "message_request_im_user_updater";
    public final List<AbstractC1491605sg<?>> LLILLL = C1697810uHb.LJIIJJI(C1718806oE.LIZ, C1718706oD.LIZ);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(900));
    public final ConcurrentHashMap<InterfaceC879010Ye3, Map<String, InterfaceC1491305sd>> LLILZIL = new ConcurrentHashMap<>();
    public final ConcurrentHashSet LLILZLL = new ConcurrentHashSet();
    public final ConcurrentHashMap<InterfaceC879010Ye3, Map<String, Boolean>> LLIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<InterfaceC879010Ye3, Map<String, Long>> LLIZLLLIL = new ConcurrentHashMap<>();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(899));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(901));
    public final ConcurrentHashSet LLJIJIL = new ConcurrentHashSet();
    public final C054G LLJILJIL = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));

    @Override // X.InterfaceC882100Yj2
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
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
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return new C884710YnF(this.LL, false, true, false, true, false, false, Collections.singleton(C13LE.LIZ(C1718506oB.class)), C13LQ.LJLIIL(new C13IQ[]{C13LE.LIZ(C881250Yhf.class), C13LE.LIZ(C879550Yev.class), C13LE.LIZ(C879610Yf1.class), C13LE.LIZ(C880440YgM.class), C13LE.LIZ(C879600Yf0.class)}), 106);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        C2296808zG.LIZJ(this.LLJILJIL, null);
        this.LLILZIL.clear();
        this.LLIZ.clear();
        this.LLIZLLLIL.clear();
        this.LLJIJIL.clear();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        this.LLILZLL.clear();
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJIJJ() {
        return (CopyOnWriteArrayList) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJIJJ().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final void init() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC882100Yj2
    public final String LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC882100Yj2
    public final InterfaceC1517005wm LIZLLL() {
        return C1491005sa.LIZ;
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LL;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
        this.LLILZIL.put(interfaceC879010Ye3, new LinkedHashMap());
        this.LLIZ.put(interfaceC879010Ye3, new LinkedHashMap());
        this.LLIZLLLIL.put(interfaceC879010Ye3, new LinkedHashMap());
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
        this.LLILZIL.remove(interfaceC879010Ye3);
        this.LLIZ.remove(interfaceC879010Ye3);
        this.LLIZLLLIL.remove(interfaceC879010Ye3);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJIJJ().addAll(list);
    }

    @C14EU
    public final void onUserUpdate(C1434905jX c1434905jX) {
        int i = 0;
        if (C880900Yh6.LIZ()) {
            for (Object obj : Collections.list(this.LLILZIL.keys())) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC879010Ye3 interfaceC879010Ye3 = (InterfaceC879010Ye3) obj;
                    C1729806q0.LIZJ(interfaceC879010Ye3, new AwS65S0301000_2(i, c1434905jX, this, interfaceC879010Ye3, 1));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        InterfaceC879010Ye3 interfaceC879010Ye32 = (InterfaceC879010Ye3) ListProtector.get(Collections.list(this.LLILZIL.keys()), 0);
        if (interfaceC879010Ye32 == null) {
            return;
        }
        C1729806q0.LIZJ(interfaceC879010Ye32, new AwS403S0200000_2(c1434905jX, this, 54));
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    @Override // X.InterfaceC882100Yj2
    public final void LJIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection) {
        ?? arrayList;
        C878630YdR c878630YdR;
        String conversationId;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, Boolean> map = this.LLIZ.get(interfaceC879010Ye3);
        if (map != null) {
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                if (entry.getValue().booleanValue()) {
                    linkedHashSet.add(entry.getKey());
                    Map<String, Boolean> map2 = this.LLIZ.get(interfaceC879010Ye3);
                    if (map2 != null) {
                        map2.put(entry.getKey(), Boolean.FALSE);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            InterfaceC1491305sd interfaceC1491305sd = ((C879540Yeu) it2.next()).LIZIZ;
            if ((interfaceC1491305sd instanceof C878630YdR) && (c878630YdR = (C878630YdR) interfaceC1491305sd) != null && (conversationId = c878630YdR.getConversationId()) != null) {
                arrayList2.add(conversationId);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(String.valueOf(C0YNP.LJII((String) it3.next())));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!Intrinsics.LJFF(obj, "-1") && !((Set) this.LLJ.getValue()).contains(obj)) {
                arrayList4.add(obj);
            }
        }
        linkedHashSet.addAll(arrayList4);
        if (!linkedHashSet.isEmpty()) {
            ((Set) this.LLJ.getValue()).addAll(linkedHashSet);
            C23250099c.LIZLLL(this.LLJILJIL, null, null, new C05LX(this, interfaceC879010Ye3, linkedHashSet, null), 3);
        }
        if (C19212010Ec.LIZJ.LJLLLLLL()) {
            IMMessageRequestPeerUserUpdateSetting.LIZ.getClass();
            C01GW c01gw = IMMessageRequestPeerUserUpdateSetting.LIZJ;
            if (((IMMessageRequestPeerUserUpdateSetting.MessageRequestPeerUserFetchStrategy) c01gw.getValue()).batchUpdateStrategy.enableBatchUpdate && ((IMMessageRequestPeerUserUpdateSetting.MessageRequestPeerUserFetchStrategy) c01gw.getValue()).batchUpdateStrategy.updateIntervalInSecond * ((long) LSPassThroughRecordSizeConfig.DEFAULT) > 0) {
                Map<String, Long> map3 = this.LLIZLLLIL.get(interfaceC879010Ye3);
                if (map3 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Long> entry2 : map3.entrySet()) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - entry2.getValue().longValue();
                        IMMessageRequestPeerUserUpdateSetting.LIZ.getClass();
                        if (jCurrentTimeMillis > ((IMMessageRequestPeerUserUpdateSetting.MessageRequestPeerUserFetchStrategy) IMMessageRequestPeerUserUpdateSetting.LIZJ.getValue()).batchUpdateStrategy.updateIntervalInSecond * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    arrayList = new ArrayList(linkedHashMap.size());
                    Iterator it4 = linkedHashMap.entrySet().iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((Map.Entry) it4.next()).getKey());
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                Map<String, Long> map4 = this.LLIZLLLIL.get(interfaceC879010Ye3);
                if (map4 != null) {
                    map4.clear();
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!this.LLJIJIL.contains(obj2)) {
                        arrayList5.add(obj2);
                    }
                }
                this.LLJIJIL.addAll(arrayList5);
                if (!arrayList5.isEmpty()) {
                    C23250099c.LIZLLL(this.LLJILJIL, null, null, new C05LW(this, interfaceC879010Ye3, arrayList5, null), 3);
                }
            }
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC882100Yj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1490405sU LJIILL(X.InterfaceC879010Ye3 r15, X.C879540Yeu r16, X.AbstractC1491605sg r17, X.C1490405sU r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1718506oB.LJIILL(X.0Ye3, X.0Yeu, X.05sg, X.05sU):X.05sU");
    }
}
