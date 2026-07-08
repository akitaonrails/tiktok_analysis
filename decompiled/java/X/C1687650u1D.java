package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.nearby.network.ConnectNowNetworkAPI;
import com.ss.android.ugc.aweme.relation.ffp.nearby.vm.ConnectNowMatchVM;
import com.ss.android.ugc.aweme.relation.model.MutualRelationListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0u1D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.vm.ConnectNowMatchVM$fetchLatestMatches$2$3", f = "ConnectNowMatchVM.kt", l = {203}, m = "invokeSuspend")
public final class C1687650u1D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C1687730u1L> LLILLJJLI;
    public final /* synthetic */ ConnectNowMatchVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687650u1D(List<C1687730u1L> list, ConnectNowMatchVM connectNowMatchVM, InterfaceC1364105Vn<? super C1687650u1D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = connectNowMatchVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1687650u1D(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        List<Integer> selfFollowTier;
        List<User> userList;
        List<Integer> detectBy;
        List<User> userList2;
        Integer num;
        Object matchedUsers = obj;
        C1C7U.LIZ("ConnectNowMatchVM@ebf0.fetchLatestMatches$2$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(matchedUsers);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(matchedUsers);
            ConnectNowNetworkAPI connectNowNetworkAPI = ConnectNowNetworkAPI.INSTANCE;
            List<C1687730u1L> list = this.LLILLJJLI;
            this.LL = 1;
            matchedUsers = connectNowNetworkAPI.getMatchedUsers(list, this);
            if (matchedUsers == objLJFF) {
                C1C7U.LIZIZ("ConnectNowMatchVM@ebf0.fetchLatestMatches$2$3");
                return objLJFF;
            }
        }
        MutualRelationListResponse mutualRelationListResponse = (MutualRelationListResponse) matchedUsers;
        List<Integer> otherFollowTier = null;
        if (mutualRelationListResponse != null && (userList2 = mutualRelationListResponse.getUserList()) != null) {
            ConnectNowMatchVM connectNowMatchVM = this.LLILLL;
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (User user : userList2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    User user2 = user;
                    List<Integer> detectBy2 = mutualRelationListResponse.getDetectBy();
                    if (detectBy2 != null) {
                        num = (Integer) ListProtector.get(detectBy2, i2);
                    } else {
                        num = null;
                    }
                    Object obj2 = ListProtector.get(mutualRelationListResponse.getSelfFollowTier(), i2);
                    Object obj3 = ListProtector.get(mutualRelationListResponse.getOtherFollowTier(), i2);
                    if (num != null && obj2 != null && obj3 != null && user2 != null) {
                        int iIntValue = ((Number) obj3).intValue();
                        int iIntValue2 = ((Number) obj2).intValue();
                        int iIntValue3 = num.intValue();
                        EnumC1687690u1H.Companion.getClass();
                        EnumC1687690u1H enumC1687690u1HLIZ = C1687710u1J.LIZ(iIntValue3);
                        EnumC1687680u1G.Companion.getClass();
                        EnumC1687680u1G enumC1687680u1GLIZ = C1687720u1K.LIZ(iIntValue2);
                        EnumC1687680u1G enumC1687680u1GLIZ2 = C1687720u1K.LIZ(iIntValue);
                        Map<String, Long> mapWQ2 = connectNowMatchVM.wQ2();
                        String secUid = user2.getSecUid();
                        Long lLJFF = C2286608xc.LJFF(0L);
                        Long l = mapWQ2.get(secUid);
                        if (l != null) {
                            lLJFF = l;
                        }
                        arrayList2.add(new C1687730u1L(user2, enumC1687690u1HLIZ, enumC1687680u1GLIZ, enumC1687680u1GLIZ2, lLJFF.longValue()));
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            ConnectNowMatchVM connectNowMatchVM2 = this.LLILLL;
            arrayList = new ArrayList();
            for (Object obj4 : arrayList2) {
                C1687730u1L c1687730u1L = (C1687730u1L) obj4;
                if (!((ConcurrentHashMap) connectNowMatchVM2.LLILZ).containsKey(c1687730u1L.LIZ.getUid())) {
                    String uid = c1687730u1L.LIZ.getUid();
                    String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    if (curUserId == null) {
                        curUserId = "";
                    }
                    if (!Intrinsics.LJFF(uid, curUserId)) {
                        arrayList.add(obj4);
                    }
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        ArrayList arrayList3 = new ArrayList(this.LLILLL.getState().LLILLJJLI);
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C1687730u1L) it2.next()).LIZ.getUid());
        }
        Set setLLIIIZ = C13LP.LLIIIZ(arrayList4);
        ConnectNowMatchVM connectNowMatchVM3 = this.LLILLL;
        if (mutualRelationListResponse != null) {
            otherFollowTier = mutualRelationListResponse.getOtherFollowTier();
            selfFollowTier = mutualRelationListResponse.getSelfFollowTier();
            userList = mutualRelationListResponse.getUserList();
            detectBy = mutualRelationListResponse.getDetectBy();
        } else {
            selfFollowTier = null;
            userList = null;
            detectBy = null;
        }
        connectNowMatchVM3.getClass();
        if (otherFollowTier != null && selfFollowTier != null && userList != null && detectBy != null) {
            int iLJI = C626640Ohy.LJI(otherFollowTier.size(), selfFollowTier.size(), userList.size(), detectBy.size());
            ArrayList<C1660260tJ2> arrayList5 = new ArrayList(iLJI);
            for (int i4 = 0; i4 < iLJI; i4++) {
                arrayList5.add(new C1660260tJ2(ListProtector.get(otherFollowTier, i4), ListProtector.get(selfFollowTier, i4), ListProtector.get(userList, i4), ListProtector.get(detectBy, i4)));
            }
            ConnectNowMatchVM connectNowMatchVM4 = this.LLILLL;
            for (C1660260tJ2 c1660260tJ2 : arrayList5) {
                int iIntValue4 = ((Number) c1660260tJ2.LIZ).intValue();
                int iIntValue5 = ((Number) c1660260tJ2.LIZIZ).intValue();
                User user3 = (User) c1660260tJ2.LIZJ;
                int iIntValue6 = ((Number) c1660260tJ2.LIZLLL).intValue();
                if (iIntValue4 == EnumC1687680u1G.NEW.getValue() && !setLLIIIZ.contains(user3.getUid())) {
                    EnumC1687690u1H.Companion.getClass();
                    EnumC1687690u1H enumC1687690u1HLIZ2 = C1687710u1J.LIZ(iIntValue6);
                    EnumC1687680u1G.Companion.getClass();
                    EnumC1687680u1G enumC1687680u1GLIZ3 = C1687720u1K.LIZ(iIntValue5);
                    EnumC1687680u1G enumC1687680u1GLIZ4 = C1687720u1K.LIZ(iIntValue4);
                    Map<String, Long> mapWQ22 = connectNowMatchVM4.wQ2();
                    String secUid2 = user3.getSecUid();
                    Long lLJFF2 = C2286608xc.LJFF(0L);
                    Long l2 = mapWQ22.get(secUid2);
                    if (l2 != null) {
                        lLJFF2 = l2;
                    }
                    arrayList3.add(new C1687730u1L(user3, enumC1687690u1HLIZ2, enumC1687680u1GLIZ3, enumC1687680u1GLIZ4, lLJFF2.longValue()));
                    setLLIIIZ.add(user3.getUid());
                } else if (iIntValue4 == EnumC1687680u1G.NO_RELATION.getValue() && setLLIIIZ.contains(user3.getUid())) {
                    Iterator it3 = arrayList3.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(((C1687730u1L) it3.next()).LIZ.getUid(), user3.getUid())) {
                            if (i5 != -1) {
                                ListProtector.remove(arrayList3, i5);
                                setLLIIIZ.remove(user3.getUid());
                            }
                        } else {
                            i5++;
                        }
                    }
                }
            }
        }
        final ConnectNowMatchVM connectNowMatchVM5 = this.LLILLL;
        arrayList3.removeIf(new Predicate() { // from class: X.0u1F
            @Override // java.util.function.Predicate
            public final boolean test(Object obj5) {
                C1687730u1L c1687730u1L2 = (C1687730u1L) obj5;
                if (!((ConcurrentHashMap) connectNowMatchVM5.LLILZ).containsKey(c1687730u1L2.LIZ.getUid())) {
                    String uid2 = c1687730u1L2.LIZ.getUid();
                    String curUserId2 = C0XQ7.LJFF().getCurUserId();
                    if (curUserId2 == null) {
                        curUserId2 = "";
                    }
                    if (!Intrinsics.LJFF(uid2, curUserId2)) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
        });
        ConnectNowMatchVM connectNowMatchVM6 = this.LLILLL;
        ConcurrentMap<String, Boolean> concurrentMap = connectNowMatchVM6.getState().LLILZIL;
        C19719612Di.LJJIII(concurrentMap.keySet(), new AwS588S0100000_9((List) arrayList, (List<InterfaceC1891350zJl>) 633), false);
        for (C1687730u1L c1687730u1L2 : arrayList) {
            if (!concurrentMap.containsKey(c1687730u1L2.LIZ.getUid())) {
                concurrentMap.put(c1687730u1L2.LIZ.getUid(), Boolean.FALSE);
            }
        }
        C1910880zpG c1910880zpG = C1910890zpH.LIZLLL;
        EnumC1910860zpE enumC1910860zpE = EnumC1910860zpE.CONNECT_NOW;
        C1910890zpH c1910890zpHLIZ = c1910880zpG.LIZ(enumC1910860zpE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("connect_now_friend_banner map after update: ");
        sbLIZ.append(concurrentMap);
        c1910890zpHLIZ.LIZ("ConnectNowMatchVM", C2188811AlT.LIZIZ(sbLIZ));
        connectNowMatchVM6.setState(new AwS604S0100000_25((ConcurrentMap) concurrentMap, (ConcurrentMap<String, Boolean>) 790));
        c1910880zpG.LIZ(enumC1910860zpE).LIZ("ConnectNowMatchVM", "[response] new server result: " + mutualRelationListResponse);
        c1910880zpG.LIZ(enumC1910860zpE).LIZ("ConnectNowMatchVM", "[response] new state resultUserList: " + arrayList);
        c1910880zpG.LIZ(enumC1910860zpE).LIZ("ConnectNowMatchVM", "[response] new state newFollowerList: " + arrayList3);
        ConnectNowMatchVM connectNowMatchVM7 = this.LLILLL;
        connectNowMatchVM7.setState(new AwS234S0300000_25((List) arrayList, (List<C1687730u1L>) arrayList3, (List<C1687730u1L>) connectNowMatchVM7, (ConnectNowMatchVM) 51));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConnectNowMatchVM@ebf0.fetchLatestMatches$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
