package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.ur.alias.AliasListResponse;
import com.ss.android.ugc.ur.alias.UserAlias;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0iSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243370iSd {
    public static final C1243370iSd LIZ = new C1243370iSd();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
    public static final Keva LIZLLL = Keva.getRepo("user_alias_general_info_repo");

    public static Keva LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user_alias_config_repo_");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Keva LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user_alias_repo_");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJ() {
        Set<String> stringSet;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null || (stringSet = LIZLLL.getStringSet(curUserId, null)) == null) {
            return;
        }
        for (String str : stringSet) {
            Keva kevaLIZLLL = LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("alias_of_");
            sbLIZ.append(str);
            String string = kevaLIZLLL.getString(C2188811AlT.LIZIZ(sbLIZ), null);
            if (string != null) {
                LIZ.getClass();
                LJFF(str, string);
            }
        }
    }

    public static void LIZ(String str) {
        LIZIZ.remove(str);
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("alias_of_");
        sbLIZ.append(str);
        kevaLIZLLL.erase(C2188811AlT.LIZIZ(sbLIZ));
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId != null) {
            Keva keva = LIZLLL;
            Set<String> stringSet = keva.getStringSet(curUserId, null);
            if (stringSet == null) {
                stringSet = new LinkedHashSet<>();
            }
            if (stringSet.contains(str)) {
                stringSet.remove(str);
            }
            keva.storeStringSet(curUserId, stringSet);
        }
        LJI(!r4.isEmpty());
    }

    public static void LJI(boolean z) {
        if (z) {
            LIZJ().storeInt("has_given_alias_status", 1);
        } else {
            LIZJ().storeInt("has_given_alias_status", 2);
        }
    }

    public static void LIZIZ(AliasListResponse aliasListResponse, boolean z) {
        List<UserAlias> list;
        List<UserAlias> list2;
        LIZIZ.clear();
        if (aliasListResponse != null && (list2 = aliasListResponse.userAlias) != null) {
            for (UserAlias userAlias : list2) {
                String str = userAlias.uid;
                String str2 = userAlias.alias;
                if (str != null && str2 != null) {
                    LIZ.getClass();
                    LJFF(str, str2);
                }
            }
            LIZ.getClass();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId != null) {
                LIZLLL.erase(curUserId);
                LIZLLL().clear();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (UserAlias userAlias2 : list2) {
                    String str3 = userAlias2.uid;
                    String str4 = userAlias2.alias;
                    if (str3 != null && str4 != null) {
                        linkedHashSet.add(str3);
                        LIZ.getClass();
                        Keva kevaLIZLLL = LIZLLL();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("alias_of_");
                        sbLIZ.append(str3);
                        kevaLIZLLL.storeString(C2188811AlT.LIZIZ(sbLIZ), str4);
                    }
                }
                LIZLLL.storeStringSet(curUserId, linkedHashSet);
            }
        } else {
            LJ();
        }
        if (z) {
            LIZJ().storeLong("alias_last_full_sync_timestamp", System.currentTimeMillis());
            LJI((aliasListResponse != null && (list = aliasListResponse.userAlias) != null) ? !list.isEmpty() : false);
        } else {
            LIZJ().erase("has_given_alias_status");
        }
        String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId2 != null) {
            LIZJ.put(curUserId2, Boolean.TRUE);
        }
    }

    public static void LJFF(String str, String str2) {
        LIZIZ.put(str, str2);
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("alias_of_");
        sbLIZ.append(str);
        kevaLIZLLL.storeString(C2188811AlT.LIZIZ(sbLIZ), str2);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId != null) {
            Keva keva = LIZLLL;
            Set<String> stringSet = keva.getStringSet(curUserId, null);
            if (stringSet == null) {
                stringSet = new LinkedHashSet<>();
            }
            stringSet.add(str);
            keva.storeStringSet(curUserId, stringSet);
        }
        LJI(!r3.isEmpty());
    }
}
