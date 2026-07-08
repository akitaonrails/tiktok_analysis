package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.087v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20669087v {
    public static final C20669087v LIZ = new C20669087v();

    public static List LIZIZ() {
        Keva repo = Keva.getRepo("upvote_publish_cache");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("upvote_publish_");
        sbLIZ.append(curUserId);
        return C08JS.LJ(String[].class, repo.getString(C2188811AlT.LIZIZ(sbLIZ), ""));
    }

    public static Map LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Keva repo = Keva.getRepo("upvote_publish_cache");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("upvote_publish_failed_3_times_");
        sbLIZ.append(curUserId);
        String string = repo.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        return (string == null || string.length() == 0) ? linkedHashMap : (Map) C08JS.LIZ(string, new LinkedHashMap().getClass());
    }

    public static void LIZ(String str) {
        ArrayList arrayList = new ArrayList(LIZIZ());
        arrayList.remove(str);
        LIZLLL(arrayList);
    }

    public static void LIZLLL(List list) {
        Keva repo = Keva.getRepo("upvote_publish_cache");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("upvote_publish_");
        sbLIZ.append(curUserId);
        repo.storeString(C2188811AlT.LIZIZ(sbLIZ), C08JS.LIZLLL(list));
    }
}
