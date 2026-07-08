package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.06fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1665206fa {
    public static final Type LIZ = new TypeToken<Map<String, ? extends List<? extends Integer>>>() { // from class: X.06fd
    }.getType();
    public static final Type LIZIZ = new TypeToken<Map<String, ? extends List<? extends Integer>>>() { // from class: X.06fc
    }.getType();

    public static final List<String> LIZ(IMUser iMUser) {
        Map<String, List<Integer>> mapLIZIZ = LIZIZ(iMUser, true);
        if (mapLIZIZ.isEmpty()) {
            return C13BV.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it2 = mapLIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            Iterator it3 = ((Iterable) entry.getValue()).iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Number) it3.next()).intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('{');
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(iIntValue);
                sbLIZ.append('}');
                linkedHashSet.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return C13LP.LLIIII(linkedHashSet);
    }

    public static final List<Integer> LIZJ(String str) {
        Map<String, String> ext;
        String str2;
        if (str != null && str.length() != 0) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(C0YNP.LJ(str));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (c0y8tLIZ != null) {
                linkedHashSet.addAll(C1665306fb.LIZ.LIZJ(c0y8tLIZ));
                C0Y8Y coreInfo = c0y8tLIZ.getCoreInfo();
                if (coreInfo != null && (ext = coreInfo.getExt()) != null && (str2 = ext.get("a:ad_creative_tags")) != null && str2.length() > 0) {
                    linkedHashSet.add(2);
                }
            }
            return C13LP.LLIIII(linkedHashSet);
        }
        return C13BV.INSTANCE;
    }

    public static final Map<String, List<Integer>> LIZLLL(IMUser iMUser) {
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str;
        boolean z;
        IMUserBizInfo imUserBizInfo = iMUser.getImUserBizInfo();
        if (imUserBizInfo != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (str = userB2CAccountInfo.relation) != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = null;
            }
            if (str != null) {
                try {
                    Map<String, List<Integer>> map = (Map) C051M.LIZJ(str, LIZIZ);
                    if (map == null) {
                        return C2097608Jq.LJ();
                    }
                    return map;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Log.getStackTraceString(e);
                    return C2097608Jq.LJ();
                }
            }
        }
        return C2097608Jq.LJ();
    }

    public static final Map<String, List<Integer>> LIZIZ(IMUser iMUser, boolean z) {
        boolean z2;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo2;
        IMUserB2CAccountInfo userB2CAccountInfo3;
        Map map;
        IMUserB2CAccountInfo userB2CAccountInfo4;
        Map<String, ? extends List<Integer>> map2;
        IMUserBizInfo imUserBizInfo2 = iMUser.getImUserBizInfo();
        boolean z3 = true;
        if (imUserBizInfo2 != null && (userB2CAccountInfo4 = imUserBizInfo2.getUserB2CAccountInfo()) != null && (map2 = userB2CAccountInfo4.userTagsMapCache) != null && (!map2.isEmpty())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            IMUserBizInfo imUserBizInfo3 = iMUser.getImUserBizInfo();
            if (imUserBizInfo3 == null || (userB2CAccountInfo3 = imUserBizInfo3.getUserB2CAccountInfo()) == null || (map = userB2CAccountInfo3.userTagsMapCache) == null) {
                return C2097608Jq.LJ();
            }
            return map;
        }
        IMUserBizInfo imUserBizInfo4 = iMUser.getImUserBizInfo();
        if (imUserBizInfo4 != null && (userB2CAccountInfo = imUserBizInfo4.getUserB2CAccountInfo()) != null && (str = userB2CAccountInfo.userTags) != null) {
            if (str.length() <= 0) {
                z3 = false;
            }
            if (!z3) {
                str = null;
            }
            if (str != null) {
                try {
                    Map<String, List<Integer>> mapLJ = (Map) C051M.LIZJ(str, LIZ);
                    if (mapLJ == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    if (z && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo2 = imUserBizInfo.getUserB2CAccountInfo()) != null) {
                        userB2CAccountInfo2.setUserTagsMapCache(mapLJ);
                    }
                    return mapLJ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Log.getStackTraceString(e);
                    return C2097608Jq.LJ();
                }
            }
        }
        return C2097608Jq.LJ();
    }
}
