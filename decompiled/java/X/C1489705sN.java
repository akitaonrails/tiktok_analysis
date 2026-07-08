package X;

import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05sN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.user.ChatListIMUserUpdater$observeDataChangeAfterFilter$2", f = "ChatListIMUserUpdater.kt", l = {266}, m = "invokeSuspend")
public final class C1489705sN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1490105sR LLILZ;
    public final /* synthetic */ Set<C879540Yeu<?>> LLILZIL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILZLL;
    public final /* synthetic */ Set<String> LLIZ;
    public final /* synthetic */ Map<String, Set<InterfaceC1491305sd>> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1489705sN(C1490105sR c1490105sR, Set<C879540Yeu<?>> set, InterfaceC879010Ye3 interfaceC879010Ye3, Set<String> set2, Map<String, Set<InterfaceC1491305sd>> map, InterfaceC1364105Vn<? super C1489705sN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1490105sR;
        this.LLILZIL = set;
        this.LLILZLL = interfaceC879010Ye3;
        this.LLIZ = set2;
        this.LLIZLLLIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1489705sN(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<? extends InterfaceC1491305sd> arrayList;
        Map map;
        String mobValue;
        C878950Ydx c878950Ydx;
        FilterTabType filterTabType;
        int iIntValue;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str;
        String str2;
        IMUserB2CAccountInfo userB2CAccountInfo2;
        IMUserB2CAccountInfo userB2CAccountInfo3;
        String str3;
        String str4;
        IMUserB2CAccountInfo userB2CAccountInfo4;
        Object objLJIJJ = obj;
        C1C7U.LIZ("ChatListIMUserUpdater@737c.observeDataChangeAfterFilter$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                Map map2 = (Map) this.LLILLJJLI;
                arrayList = (List) this.LL;
                C155000ia.LIZIZ(objLJIJJ);
                map = map2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJJ);
            arrayList = new ArrayList<>();
            Map<String, IMUser> map3 = this.LLILZ.LLJ;
            Set<String> set = this.LLIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, IMUser> entry : map3.entrySet()) {
                if (set.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            C1490105sR c1490105sR = this.LLILZ;
            Set<C879540Yeu<?>> set2 = this.LLILZIL;
            this.LL = arrayList;
            this.LLILLJJLI = linkedHashMap;
            this.LLILLL = 1;
            c1490105sR.getClass();
            objLJIJJ = c1490105sR.LJIJJ(set2, new C05L4(null), this);
            map = linkedHashMap;
            if (objLJIJJ == objLJFF) {
                C1C7U.LIZIZ("ChatListIMUserUpdater@737c.observeDataChangeAfterFilter$2");
                return objLJFF;
            }
        }
        List<IMUser> list = (List) objLJIJJ;
        C118300cf c118300cf = new C118300cf();
        C118300cf c118300cf2 = new C118300cf();
        C118300cf c118300cf3 = new C118300cf();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C1490105sR c1490105sR2 = this.LLILZ;
        for (IMUser iMUser : list) {
            String uid = iMUser.getUid();
            if (uid == null) {
                uid = "";
            }
            IMUser iMUser2 = (IMUser) map.get(uid);
            if (iMUser2 == null) {
                int i2 = c118300cf.element;
                c118300cf.element = i2 + 1;
                C2286608xc.LJ(i2);
            } else {
                c1490105sR2.getClass();
                if (!Intrinsics.LJFF(iMUser2.getDisplayAvatar(), iMUser.getDisplayAvatar())) {
                    c118300cf3.element++;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (!Intrinsics.LJFF(iMUser2.getSignature(), iMUser.getSignature())) {
                    linkedHashSet.add("_signature");
                }
                if (iMUser2.getFollowStatus() != iMUser.getFollowStatus()) {
                    linkedHashSet.add("_followStatus");
                }
                if (iMUser2.isBlock() != iMUser.isBlock()) {
                    linkedHashSet.add("_isBlock");
                }
                if (iMUser2.isBlocked() != iMUser.isBlocked()) {
                    linkedHashSet.add("_isBlocked");
                }
                if (!Intrinsics.LJFF(iMUser2.getRemarkName(), iMUser.getRemarkName())) {
                    linkedHashSet.add("_remarkName");
                }
                if (iMUser2.getFollowerStatus() != iMUser.getFollowerStatus()) {
                    linkedHashSet.add("_followerStatus");
                }
                if (!Intrinsics.LJFF(C1247000iYU.LIZ(iMUser2), C1247000iYU.LIZ(iMUser))) {
                    linkedHashSet.add("_alias");
                }
                if (!Intrinsics.LJFF(iMUser2.getNickName(), iMUser.getNickName())) {
                    linkedHashSet.add("_nickName");
                }
                if (!Intrinsics.LJFF(iMUser2.getDisplayName(), iMUser.getDisplayName())) {
                    linkedHashSet.add("_displayName");
                }
                if (!Intrinsics.LJFF(iMUser2.getCustomVerify(), iMUser.getCustomVerify())) {
                    linkedHashSet.add("_customVerify");
                }
                if (!Intrinsics.LJFF(iMUser2.getEnterpriseVerifyReason(), iMUser.getEnterpriseVerifyReason())) {
                    linkedHashSet.add("_enterpriseVerifyReason");
                }
                if (C19212010Ec.LIZJ.LIZJ() != C05RV.PERSONAL_INBOX) {
                    IMUserBizInfo imUserBizInfo = iMUser2.getImUserBizInfo();
                    if (imUserBizInfo != null && (userB2CAccountInfo3 = imUserBizInfo.getUserB2CAccountInfo()) != null && (str3 = userB2CAccountInfo3.userTags) != null) {
                        IMUserBizInfo imUserBizInfo2 = iMUser.getImUserBizInfo();
                        if (imUserBizInfo2 != null && (userB2CAccountInfo4 = imUserBizInfo2.getUserB2CAccountInfo()) != null) {
                            str4 = userB2CAccountInfo4.userTags;
                        } else {
                            str4 = null;
                        }
                        if (!Intrinsics.LJFF(str3, str4)) {
                            linkedHashSet.add("_userTags");
                        }
                    }
                    IMUserBizInfo imUserBizInfo3 = iMUser2.getImUserBizInfo();
                    if (imUserBizInfo3 != null && (userB2CAccountInfo = imUserBizInfo3.getUserB2CAccountInfo()) != null && (str = userB2CAccountInfo.fansTags) != null) {
                        IMUserBizInfo imUserBizInfo4 = iMUser.getImUserBizInfo();
                        if (imUserBizInfo4 != null && (userB2CAccountInfo2 = imUserBizInfo4.getUserB2CAccountInfo()) != null) {
                            str2 = userB2CAccountInfo2.fansTags;
                        } else {
                            str2 = null;
                        }
                        if (!Intrinsics.LJFF(str, str2)) {
                            linkedHashSet.add("_fansTags");
                        }
                    }
                }
                C1668706g9 c1668706g9 = IIMBusinessChatService.LIZ;
                if (C1668706g9.LIZ(c1668706g9).LJFF().LJIIIIZZ(iMUser2) != C1668706g9.LIZ(c1668706g9).LJFF().LJIIIIZZ(iMUser)) {
                    linkedHashSet.add("_isCreatorUser");
                }
                if (!linkedHashSet.isEmpty()) {
                    c118300cf2.element++;
                    for (Object obj2 : linkedHashSet) {
                        Integer num = (Integer) linkedHashMap2.get(obj2);
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        linkedHashMap2.put(obj2, C2286608xc.LJ(iIntValue + 1));
                    }
                }
            }
        }
        C885310YoD c885310YoD = C885310YoD.LIZ;
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILZLL;
        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null && (filterTabType = c878950Ydx.LLILLL) != null) {
            mobValue = filterTabType.getMobValue();
        } else {
            mobValue = null;
        }
        int i3 = c118300cf.element;
        int i4 = c118300cf3.element;
        int i5 = c118300cf2.element;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) entry2.getKey());
            sbLIZ.append(':');
            sbLIZ.append(((Number) entry2.getValue()).intValue());
            arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ";", null, null, 0, null, null, 62);
        c885310YoD.getClass();
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("page_key", mobValue), new Pair("new_user_count", String.valueOf(i3)), new Pair("avatar_only_changed_count", String.valueOf(i4)), new Pair("other_property_changed_count", String.valueOf(i5)), new Pair("total_fetched_count", String.valueOf(size)), new Pair("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue()), new Pair("changed_user_properties_map", strLJJLIIIJ));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_user_fetching_data", mapLJIIIIZZ);
        C1490105sR c1490105sR3 = this.LLILZ;
        Map<String, Set<InterfaceC1491305sd>> map4 = this.LLIZLLLIL;
        for (BaseContact baseContact : list) {
            String uid2 = baseContact.getUid();
            if (uid2 != null) {
                c1490105sR3.LLJ.put(uid2, (IMUser) baseContact);
                Set<InterfaceC1491305sd> set3 = map4.get(uid2);
                if (set3 != null) {
                    arrayList.addAll(set3);
                }
            }
        }
        this.LLILZ.LJIJJLI().addAll(this.LLIZ);
        this.LLILZ.LJIL().removeAll(this.LLIZ);
        if (arrayList.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatListIMUserUpdater@737c.observeDataChangeAfterFilter$2");
            return unit;
        }
        CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJJII = this.LLILZ.LJJII();
        InterfaceC879010Ye3 interfaceC879010Ye32 = this.LLILZLL;
        C1490105sR c1490105sR4 = this.LLILZ;
        Iterator<InterfaceC1482905rH> it2 = copyOnWriteArrayListLJJII.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(interfaceC879010Ye32, arrayList, c1490105sR4.LIZIZ(), c1490105sR4.LLILLJJLI);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListIMUserUpdater@737c.observeDataChangeAfterFilter$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
