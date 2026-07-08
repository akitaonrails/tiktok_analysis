package X;

import Y.AComparatorS21S0000000_2;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.05sR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1490105sR implements InterfaceC882100Yj2, InterfaceC15414061s {
    public final C1491005sa LL = C1491005sa.LIZ;
    public final String LLILLJJLI = "ChatListIMUserUpdater";
    public final String LLILLL = "im_user_updater";
    public final C01GW LLILZ = C452501pT.LIZIZ(new C881490Yi3(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1490505sV());
    public final boolean LLILZLL = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1490805sY());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1490305sT());
    public Map<String, IMUser> LLJ = new ConcurrentHashMap();
    public final C01GW LLJI = C452501pT.LIZIZ(new C1490705sX());
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1490605sW());

    @Override // X.InterfaceC15414061s
    public final void Ap2(List<IMAIBotInfo> list) {
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
    }

    @Override // X.InterfaceC882100Yj2
    public final C1490405sU<?> LJIIIIZZ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC1491605sg<?> abstractC1491605sg, C1490405sU<?> c1490405sU) {
        return null;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJ() {
    }

    @Override // X.InterfaceC882100Yj2
    public final C884710YnF LIZIZ() {
        return (C884710YnF) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final List<AbstractC1491605sg<?>> LJIILIIL() {
        return (List) this.LLILZIL.getValue();
    }

    public final ConcurrentHashSet<String> LJIJJLI() {
        return (ConcurrentHashSet) this.LLJIJIL.getValue();
    }

    public final ConcurrentHashSet<String> LJIL() {
        return (ConcurrentHashSet) this.LLJI.getValue();
    }

    public final ConcurrentHashMap<InterfaceC879010Ye3, Map<String, Set<InterfaceC1491305sd>>> LJJIFFI() {
        return (ConcurrentHashMap) this.LLIZLLLIL.getValue();
    }

    public final CopyOnWriteArrayList<InterfaceC1482905rH> LJJII() {
        return (CopyOnWriteArrayList) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LIZJ() {
        C622680Oba.LIZLLL(this);
        IMAIServiceAPI.LIZ.getClass();
        AnonymousClass0629.LIZ().LIZIZ().LIZLLL(this);
        LJIJJLI().clear();
        LJJIFFI().clear();
        this.LLJ.clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILJJIL() {
        LJJII().clear();
    }

    @Override // X.InterfaceC882100Yj2
    public final void init() {
        C622680Oba.LIZJ(this);
        IMAIServiceAPI.LIZ.getClass();
        AnonymousClass0629.LIZ().LIZIZ().LJFF(this);
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
        return this.LLILZLL;
    }

    @Override // X.InterfaceC882100Yj2
    public final String getTag() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LJJI(C879540Yeu c879540Yeu) {
        C0Y8T c0y8t;
        C869590Y9l lastShowMessage;
        T t = c879540Yeu.LIZJ;
        if (!(t instanceof C0Y8T) || (c0y8t = (C0Y8T) t) == null) {
            return null;
        }
        Object obj = c879540Yeu.LIZ;
        if (!Intrinsics.LJFF(obj, C1606106Qp.INSTANCE) && !Intrinsics.LJFF(obj, C882110Yj3.INSTANCE)) {
            if (!Intrinsics.LJFF(obj, C1606306Qr.INSTANCE) || (lastShowMessage = c0y8t.getLastShowMessage()) == null) {
                return null;
            }
            return Long.valueOf(lastShowMessage.getSender()).toString();
        }
        return String.valueOf(C0YNP.LJII(c0y8t.getConversationId()));
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
        LJJIFFI().remove(interfaceC879010Ye3);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJ(List<? extends InterfaceC1482905rH> list) {
        LJJII().addAll(list);
    }

    @Override // X.InterfaceC15414061s
    public final void ez0(List<IMAIBotInfo> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receiveBotInfoUpdateEvent botCount=");
        sbLIZ.append(((ArrayList) list).size());
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        C1729806q0.LIZJ(C881500Yi4.LIZLLL(), new AwS403S0200000_2((List) list, (List<IMAIBotInfo>) this, (C1490105sR) 76));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onUserUpdate(C1434905jX c1434905jX) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receiveUserUpdateEvent uid=");
        sbLIZ.append(c1434905jX.LIZJ.getUid());
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        C1729806q0.LIZJ(C881500Yi4.LIZLLL(), new AwS403S0200000_2(c1434905jX, this, 77));
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C881320Yhm.LIZIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection) {
        Map<String, Set<InterfaceC1491305sd>> mapPutIfAbsent;
        ConcurrentHashMap<InterfaceC879010Ye3, Map<String, Set<InterfaceC1491305sd>>> concurrentHashMapLJJIFFI = LJJIFFI();
        Map<String, Set<InterfaceC1491305sd>> linkedHashMap = concurrentHashMapLJJIFFI.get(interfaceC879010Ye3);
        if (linkedHashMap == null && (mapPutIfAbsent = concurrentHashMapLJJIFFI.putIfAbsent(interfaceC879010Ye3, (linkedHashMap = new LinkedHashMap<>()))) != null) {
            linkedHashMap = mapPutIfAbsent;
        }
        Map<String, Set<InterfaceC1491305sd>> map = linkedHashMap;
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            C879540Yeu c879540Yeu = (C879540Yeu) it2.next();
            String strLJJI = LJJI(c879540Yeu);
            if (strLJJI != null) {
                Set<InterfaceC1491305sd> linkedHashSet2 = map.get(strLJJI);
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = new LinkedHashSet<>();
                    map.put(strLJJI, linkedHashSet2);
                }
                linkedHashSet2.add(c879540Yeu.LIZIZ);
                if (!this.LLJ.containsKey(strLJJI) && !LJIL().contains(strLJJI) && linkedHashSet.add(strLJJI)) {
                    arrayList.add(c879540Yeu);
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        LJIL().addAll(linkedHashSet);
        C1729806q0.LIZ(interfaceC879010Ye3, new C1482505rD(this, arrayList, linkedHashSet, new ArrayList(), map, interfaceC879010Ye3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJ(X.C879540Yeu<?> r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.contacts.api.model.IMUser> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C05O4
            if (r0 == 0) goto L3f
            r5 = r8
            X.05O4 r5 = (X.C05O4) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L45
            X.C155000ia.LIZIZ(r1)
        L22:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = X.C13LP.LJJJLL(r1)
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            java.util.List r2 = java.util.Collections.singletonList(r7)
            X.05Kq r1 = new X.05Kq
            r0 = 0
            r1.<init>(r0)
            r5.LLILLL = r3
            java.lang.Object r1 = r6.LJIJJ(r2, r1, r5)
            if (r1 != r4) goto L22
            return r4
        L3f:
            X.05O4 r5 = new X.05O4
            r5.<init>(r6, r8)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1490105sR.LJJ(X.0Yeu, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIII(java.util.Collection<? extends X.C879540Yeu<?>> r5, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r6) {
        /*
            r4 = this;
            X.10Ec r0 = X.C19212010Ec.LIZJ
            X.05RV r1 = r0.LIZJ()
            X.05RV r0 = X.C05RV.BUSINESS_INBOX
            if (r1 != r0) goto L3b
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r1 = "enable_fetch_im_user_for_new_chat"
            r0 = 1
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r0)
            if (r0 == 0) goto L3b
            java.lang.String r3 = "im_chat"
        L1c:
            java.lang.String r2 = r4.LLILLJJLI
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getUserListByWrapperList source: "
            r1.append(r0)
            r1.append(r3)
            X.C2188811AlT.LIZIZ(r1)
            X.C309160C9y.LIZLLL(r2)
            X.05Kj r1 = new X.05Kj
            r0 = 0
            r1.<init>(r3, r0)
            java.lang.Object r0 = r4.LJIJJ(r5, r1, r6)
            return r0
        L3b:
            java.lang.String r3 = "user_updater_batch"
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1490105sR.LJJIII(java.util.Collection, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1491305sd interfaceC1491305sd, String str) {
        Map<String, Set<InterfaceC1491305sd>> map;
        Collection<Set<InterfaceC1491305sd>> collectionValues;
        if (!Intrinsics.LJFF(str, this.LLILLJJLI) && (map = LJJIFFI().get(interfaceC879010Ye3)) != null && (collectionValues = map.values()) != null) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                ((Set) it2.next()).remove(interfaceC1491305sd);
            }
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        C881320Yhm.LIZ(this, interfaceC879010Ye3, c879540Yeu, interfaceC879770YfH);
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIIZILJ(InterfaceC879010Ye3 interfaceC879010Ye3, Collection collection, String str) {
        Set<String> set = C869290Y8h.LJIIL;
        if ((set instanceof Collection) && set.isEmpty()) {
            return;
        }
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            if (u.LJIIZILJ(str, (String) it2.next(), false)) {
                if (!(interfaceC879010Ye3 instanceof C878950Ydx)) {
                    return;
                }
                AbstractC883730Ylf.LJIIIIZZ.getClass();
                if (!Intrinsics.LJFF(interfaceC879010Ye3, C881500Yi4.LIZLLL())) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterable iterable = (Iterable) C23250099c.LJ(C23271099x.INSTANCE, new C1335305Kl(this, collection, null));
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(iterable, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Object obj : iterable) {
                    String uid = ((BaseContact) obj).getUid();
                    if (uid == null) {
                        uid = "";
                    }
                    linkedHashMap.put(uid, obj);
                }
                this.LLJ = new LinkedHashMap(linkedHashMap);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preloadUser result size=");
                sbLIZ.append(this.LLJ.size());
                C2188811AlT.LIZIZ(sbLIZ);
                C309160C9y.LIZ();
                C0Z79 c0z79LIZ = C1492305sn.LIZ();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (!c0z79LIZ.LJIILJJIL().get()) {
                    c0z79LIZ.LIZJ.LIZLLL = jCurrentTimeMillis2;
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJ(java.util.Collection<? extends X.C879540Yeu<?>> r10, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>>, ? extends java.lang.Object> r11, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r12) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1490105sR.LJIJJ(java.util.Collection, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, com.ss.android.ugc.aweme.im.common.model.BaseContact, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC882100Yj2
    public final C1490405sU LJIILL(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu c879540Yeu, AbstractC1491605sg abstractC1491605sg, C1490405sU c1490405sU) throws Throwable {
        String strLJJI;
        IMUserBizInfo imUserBizInfo;
        C1491505sf c1491505sf = C1491505sf.LIZ;
        if (!Intrinsics.LJFF(abstractC1491605sg, c1491505sf) || (strLJJI = LJJI(c879540Yeu)) == null) {
            return null;
        }
        IMUser iMUser = this.LLJ.get(strLJJI);
        ?? r5 = iMUser;
        if (iMUser == null) {
            C309160C9y.LIZ();
            IMUser iMUser2 = (IMUser) C23250099c.LJ(C23271099x.INSTANCE, new C1335705Kp(this, c879540Yeu, strLJJI, null));
            r5 = iMUser2;
            if (iMUser2 == null) {
                return null;
            }
        }
        if (C19212010Ec.LIZJ.LJLLLLLL() && ((imUserBizInfo = r5.getImUserBizInfo()) == null || imUserBizInfo.getUserB2CAccountInfo() == null)) {
            C23250099c.LJ(C23271099x.INSTANCE, new C1334405Kc(r5, null));
            this.LLJ.put(strLJJI, (IMUser) r5);
        }
        if (Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE)) {
            InterfaceC1252250igx imSayHiService = C1336205Ku.LIZ(false).getImSayHiService();
            int followStatus = r5.getFollowStatus();
            int followerStatus = r5.getFollowerStatus();
            String uid = r5.getUid();
            if (uid == null) {
                uid = "";
            }
            imSayHiService.LJI(followStatus, followerStatus, uid);
        }
        if (c1490405sU == null) {
            return new C1490405sU(c1491505sf, r5);
        }
        c1490405sU.LIZIZ = r5;
        return c1490405sU;
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIILLIIL(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, Collection<? extends InterfaceC1491305sd> collection2, String str) {
        if (!(interfaceC879010Ye3 instanceof C878950Ydx)) {
            return;
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("enable_fetch_im_user_for_new_chat", true)) {
            return;
        }
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (!Intrinsics.LJFF(interfaceC879010Ye3, C881500Yi4.LIZLLL()) || !u.LJIIZILJ(str, "preload_all", false) || C19212010Ec.LIZJ.LIZJ() != C05RV.BUSINESS_INBOX) {
            return;
        }
        C309160C9y.LIZLLL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collection) {
            if (Intrinsics.LJFF(((C879540Yeu) obj).LIZ, C882110Yj3.INSTANCE)) {
                arrayList2.add(obj);
            }
        }
        for (C879540Yeu c879540Yeu : C13LP.LL(C13LP.LJLLLL(new AComparatorS21S0000000_2(25), arrayList2), 500)) {
            String strLJJI = LJJI(c879540Yeu);
            if (strLJJI != null && !this.LLJ.containsKey(strLJJI) && !LJIL().contains(strLJJI) && !LJIJJLI().contains(strLJJI) && linkedHashSet.add(strLJJI)) {
                arrayList.add(c879540Yeu);
            }
        }
        if (linkedHashSet.isEmpty()) {
            C309160C9y.LIZ();
        } else {
            LJIL().addAll(linkedHashSet);
            C1729806q0.LIZ(interfaceC879010Ye3, new C1482405rC(this, arrayList, linkedHashSet, new LinkedHashSet(), null));
        }
    }

    @Override // X.InterfaceC882100Yj2
    public final void LJIJI(InterfaceC879010Ye3 interfaceC879010Ye3, Collection<? extends C879540Yeu<?>> collection, String str, boolean z) {
        Map<String, Set<InterfaceC1491305sd>> mapPutIfAbsent;
        if (((Boolean) C1491805si.LIZ.getValue()).booleanValue()) {
            ConcurrentHashMap<InterfaceC879010Ye3, Map<String, Set<InterfaceC1491305sd>>> concurrentHashMapLJJIFFI = LJJIFFI();
            Map<String, Set<InterfaceC1491305sd>> linkedHashMap = concurrentHashMapLJJIFFI.get(interfaceC879010Ye3);
            if (linkedHashMap == null && (mapPutIfAbsent = concurrentHashMapLJJIFFI.putIfAbsent(interfaceC879010Ye3, (linkedHashMap = new LinkedHashMap<>()))) != null) {
                linkedHashMap = mapPutIfAbsent;
            }
            Map<String, Set<InterfaceC1491305sd>> map = linkedHashMap;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                C879540Yeu c879540Yeu = (C879540Yeu) it2.next();
                String strLJJI = LJJI(c879540Yeu);
                if (strLJJI != null) {
                    Set<InterfaceC1491305sd> linkedHashSet3 = map.get(strLJJI);
                    if (linkedHashSet3 == null) {
                        linkedHashSet3 = new LinkedHashSet<>();
                        map.put(strLJJI, linkedHashSet3);
                    }
                    linkedHashSet3.add(c879540Yeu.LIZIZ);
                    if (!LJIJJLI().contains(strLJJI) && !LJIL().contains(strLJJI) && linkedHashSet.add(strLJJI)) {
                        linkedHashSet2.add(c879540Yeu);
                    }
                }
            }
            if (linkedHashSet.isEmpty()) {
                return;
            }
            LJIL().addAll(linkedHashSet);
            C1729806q0.LIZ(interfaceC879010Ye3, new C1489705sN(this, linkedHashSet2, interfaceC879010Ye3, linkedHashSet, map, null));
        }
    }
}
