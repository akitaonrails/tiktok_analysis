package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMGroupChatPermissionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0i2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227320i2k {
    public static final C1223780hx2 LIZJ() {
        return new C1223780hx2(null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 42, Integer.valueOf(R.attr.a1h), 5);
    }

    public static final boolean LIZ(IMUser iMUser) {
        List<Integer> canMessageFollowStatusList;
        if (iMUser.forbidSendMessage() || ((canMessageFollowStatusList = iMUser.getCanMessageFollowStatusList()) != null && !canMessageFollowStatusList.contains(Integer.valueOf(iMUser.getFollowStatus())))) {
            return true;
        }
        return false;
    }

    public static final List<String> LIZIZ(AbstractC1225770i0F abstractC1225770i0F) {
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        InterfaceC1226510i1R interfaceC1226510i1R = abstractC1225770i0F.LLILLL;
        if (interfaceC1226510i1R != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null) {
            ArrayList arrayList = new ArrayList();
            for (C1224840hyk c1224840hyk : list) {
                if (!c1224840hyk.LLJILJILJ) {
                    arrayList.add(c1224840hyk);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C1224840hyk) it2.next()).LLILZ);
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }

    public static final boolean LIZLLL(IMUser iMUser) {
        IMGroupChatPermissionInfo groupChatPermissionInfo;
        IMUserBizInfo imUserBizInfo;
        if (iMUser != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null) {
            groupChatPermissionInfo = imUserBizInfo.getGroupChatPermissionInfo();
        } else {
            groupChatPermissionInfo = null;
        }
        return !C1382110m4P.LIZ(groupChatPermissionInfo);
    }

    public static final boolean LJ(IMUser iMUser, C1227380i2q c1227380i2q) {
        Iterable iterable = c1227380i2q.LIZJ;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        if (!C13LP.LJJJJ(iMUser.getUid(), iterable)) {
            if (!LIZLLL(iMUser)) {
                C2201941BFw c2201941BFw = IMUser.Companion;
                int followStatus = iMUser.getFollowStatus();
                c2201941BFw.getClass();
                if (!C2201941BFw.LIZLLL(followStatus) && LIZ(iMUser)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean LJFF(IMUser iMUser, C1227380i2q c1227380i2q) {
        Iterable iterable = c1227380i2q.LIZJ;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        if (!C13LP.LJJJJ(iMUser.getUid(), iterable) && !LIZLLL(iMUser)) {
            C2201941BFw c2201941BFw = IMUser.Companion;
            int followStatus = iMUser.getFollowStatus();
            c2201941BFw.getClass();
            if (!C2201941BFw.LIZLLL(followStatus) && LIZ(iMUser)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static C1224840hyk LJI(IMUser iMUser, C1224850hyl c1224850hyl, AbstractC1227310i2j abstractC1227310i2j, C1227120i2Q c1227120i2Q, Map map, int i) {
        C1227380i2q c1227380i2q;
        EnumC1226150i0r enumC1226150i0r;
        boolean z;
        boolean z2;
        List<String> list;
        List<String> list2;
        Map mapLJ = map;
        C1227120i2Q c1227120i2Q2 = c1227120i2Q;
        C1224850hyl c1224850hyl2 = c1224850hyl;
        if ((i & 1) != 0) {
            c1224850hyl2 = new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, EnumC1226540i1U.TAB_KEY_FRIENDS.getValue());
        }
        List<String> list3 = null;
        if ((i & 2) != 0) {
            abstractC1227310i2j = null;
        }
        if ((i & 4) != 0) {
            c1227120i2Q2 = null;
        }
        if ((i & 8) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        if (abstractC1227310i2j == null) {
            if (c1227120i2Q2 != null) {
                if (c1227120i2Q2 != null) {
                    list = c1227120i2Q2.LJIIIIZZ;
                    list2 = c1227120i2Q2.LJIIIZ;
                    list3 = c1227120i2Q2.LJIIJJI;
                } else {
                    list = null;
                    list2 = null;
                }
                c1227380i2q = new C1227380i2q(list, list2, list3);
            } else {
                "dataSourceConfig and dataInteractConfig cannot both be null".toString();
                throw new IllegalArgumentException("dataSourceConfig and dataInteractConfig cannot both be null");
            }
        } else {
            c1227380i2q = new C1227380i2q(abstractC1227310i2j.LJFF(), abstractC1227310i2j.LJ(), abstractC1227310i2j.LIZLLL());
        }
        List<String> list4 = c1227380i2q.LIZJ;
        if (list4 != null && C13LP.LJJJJ(iMUser.getUid(), list4)) {
            enumC1226150i0r = EnumC1226150i0r.IN_GROUP;
        } else if (LIZLLL(iMUser)) {
            enumC1226150i0r = EnumC1226150i0r.NO_GROUP_PERMISSION;
        } else {
            C2201941BFw c2201941BFw = IMUser.Companion;
            int followStatus = iMUser.getFollowStatus();
            c2201941BFw.getClass();
            if (!C2201941BFw.LIZLLL(followStatus) && LIZ(iMUser)) {
                enumC1226150i0r = EnumC1226150i0r.NO_CHAT_PERMISSION;
            } else {
                enumC1226150i0r = EnumC1226150i0r.DEFAULT;
            }
        }
        EnumC1224830hyj enumC1224830hyj = EnumC1224830hyj.NORMAL;
        UrlModel displayAvatar = iMUser.getDisplayAvatar();
        String strLIZ = C1226140i0q.LIZ(iMUser);
        String uid = iMUser.getUid();
        if (uid == null) {
            uid = "";
        }
        String uniqueId = iMUser.getUniqueId();
        Iterable iterable = c1227380i2q.LIZJ;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        Iterable iterable2 = c1227380i2q.LIZ;
        if (iterable2 == null) {
            iterable2 = C13BV.INSTANCE;
        }
        if (C13LP.LJJJJ(iMUser.getUid(), iterable) || (C13LP.LJJJJ(iMUser.getUid(), iterable2) && !LIZLLL(iMUser))) {
            z = true;
        } else {
            z = false;
        }
        Iterable iterable3 = c1227380i2q.LIZIZ;
        if (iterable3 == null) {
            iterable3 = C13BV.INSTANCE;
        }
        if (!C13LP.LJJJJ(iMUser.getUid(), iterable3) && !LJFF(iMUser, c1227380i2q)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean zLJFF = LJFF(iMUser, c1227380i2q);
        boolean z3 = !LJ(iMUser, c1227380i2q);
        boolean zLJ = LJ(iMUser, c1227380i2q);
        boolean zLJ2 = C1908030zkf.LJ(iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(mapLJ);
        linkedHashMap.put("contact", iMUser);
        linkedHashMap.put("item_disable_reason", enumC1226150i0r);
        return new C1224840hyk(c1224850hyl2, enumC1224830hyj, "private", uid, displayAvatar, strLIZ, uniqueId, true, z3, (Map) linkedHashMap, z, z2, zLJFF, zLJ, zLJ2, 1024);
    }
}
