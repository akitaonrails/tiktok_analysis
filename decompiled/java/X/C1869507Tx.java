package X;

import com.bytedance.keva.Keva;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.07Tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1869507Tx {
    public static final HashMap<String, Keva> LIZ = new HashMap<>();

    public static Keva LIZ(String str) {
        HashMap<String, Keva> map = LIZ;
        if (!map.containsKey(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("local_sorted_storage_repo_");
            sbLIZ.append(str);
            map.put(str, Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)));
        }
        return map.get(str);
    }

    public static List LIZIZ(String str) {
        String[] stringArray;
        List listLJJLL;
        Keva kevaLIZ = LIZ(str);
        if (kevaLIZ == null || (stringArray = kevaLIZ.getStringArray("key_local_sorted_uid_list", new String[0])) == null || (listLJJLL = C13LQ.LJJLL(stringArray)) == null) {
            return C13BV.INSTANCE;
        }
        return listLJJLL;
    }
}
