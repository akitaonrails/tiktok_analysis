package X;

import Y.ARunnableS26S1100000_21;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.experiment.CommentPhotoControlExp;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0l6K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344860l6K {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final C01GW LIZJ;
    public static final Map<String, List<Long>> LIZLLL;

    static {
        C01GW c01gw = CommentPhotoControlExp.LIZIZ;
        LIZ = ((CommentPhotoControlExp.PhotoControlConfig) c01gw.getValue()).timeCircle * LSPassThroughRecordSizeConfig.DEFAULT;
        LIZIZ = ((CommentPhotoControlExp.PhotoControlConfig) c01gw.getValue()).samePhotoCount;
        LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(619));
        LIZLLL = new LinkedHashMap();
    }

    public static boolean LJ() {
        C01GW c01gw = CommentPhotoControlExp.LIZIZ;
        return ((CommentPhotoControlExp.PhotoControlConfig) c01gw.getValue()).timeCircle > 0 && ((CommentPhotoControlExp.PhotoControlConfig) c01gw.getValue()).samePhotoCount > 0;
    }

    public static String LIZJ(CommentImageModel commentImageModel) {
        String str;
        List<String> urlList = commentImageModel.getUrlList();
        if (urlList != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
            C844470XAv.LIZ.getClass();
            return C09N5.LIZ(C844470XAv.LIZ(), UriProtector.parse(str));
        }
        return null;
    }

    public static void LIZ(CommentImageModel commentImageModel, String str) {
        String strLIZJ;
        String strLIZ;
        if (!LJ() || commentImageModel == null || str == null || (strLIZJ = LIZJ(commentImageModel)) == null || (strLIZ = C08HL.LIZ(new C2215208m6(strLIZJ))) == null) {
            return;
        }
        List listLIZLLL = LIZLLL(str, strLIZ);
        if (listLIZLLL == null) {
            listLIZLLL = new ArrayList();
        }
        listLIZLLL.add(Long.valueOf(System.currentTimeMillis()));
        LJI(str, strLIZ, listLIZLLL);
    }

    public static boolean LIZIZ(CommentImageModel commentImageModel, String str) {
        String strLIZJ;
        String strLIZ;
        List listLIZLLL;
        if (!LJ() || str == null || commentImageModel == null || (strLIZJ = LIZJ(commentImageModel)) == null || (strLIZ = C08HL.LIZ(new C2215208m6(strLIZJ))) == null || (listLIZLLL = LIZLLL(str, strLIZ)) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) listLIZLLL;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            if (System.currentTimeMillis() - jLongValue > LIZ) {
                arrayList.add(Long.valueOf(jLongValue));
            }
        }
        arrayList2.removeAll(arrayList);
        LJI(str, strLIZ, listLIZLLL);
        if (arrayList2.isEmpty() || arrayList2.size() < LIZIZ || System.currentTimeMillis() - ((Number) ListProtector.get(listLIZLLL, 0)).longValue() >= LIZ) {
            return false;
        }
        return true;
    }

    public static List LIZLLL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("photo_comment_control_");
        sbLIZ.append(C461720I8s.LIZIZ());
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, List<Long>> map = LIZLLL;
        Collection collection = (Collection) ((LinkedHashMap) map).get(strLIZIZ);
        if (collection != null) {
            return new ArrayList(collection);
        }
        String string = ((Keva) LIZJ.getValue()).getString(strLIZIZ, null);
        if (string == null) {
            return null;
        }
        List<Long> listLIZ = C1344990l6X.LIZ(Long[].class, string);
        map.put(strLIZIZ, listLIZ);
        return new ArrayList(listLIZ);
    }

    public static void LJFF(CommentImageModel commentImageModel, String str) {
        if (LJ() && str != null && commentImageModel != null) {
            C333801Rg.LIZ(new ARunnableS26S1100000_21(commentImageModel, str, 8));
        }
    }

    public static void LJI(String str, String str2, List list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("photo_comment_control_");
        sbLIZ.append(C461720I8s.LIZIZ());
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ((Keva) LIZJ.getValue()).storeString(strLIZIZ, GsonProtectorUtils.toJson(C1344990l6X.LIZ, list));
        LIZLLL.put(strLIZIZ, list);
    }
}
