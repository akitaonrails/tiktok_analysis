package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.tako.detail.communicate.TakoConsumeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644780PQu {
    public static boolean LIZIZ;
    public static final C644780PQu LIZ = new C644780PQu();
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static String LJ = "";
    public static final LruCache<String, String> LJFF = new LruCache<>(200);
    public static final LruCache<String, String> LJI = new LruCache<>(((Number) C078K.LIZ.getValue()).intValue());

    public static List LIZ(int i, String str) {
        C1D3B c1d3b;
        ArrayList<C2252061DCq> arrayListLIZIZ;
        C2252051DCp.LIZ.getClass();
        C1D36 c1d36LIZIZ = C2252051DCp.LIZJ.LIZIZ(C2252051DCp.LJ, str);
        if (c1d36LIZIZ != null && (c1d3b = c1d36LIZIZ.LIZJ) != null && (arrayListLIZIZ = c1d3b.LIZIZ(i)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C2252061DCq> it2 = arrayListLIZIZ.iterator();
            while (it2.hasNext()) {
                TakoConsumeModel takoConsumeModelLIZ = C2252131DCx.LIZ(it2.next());
                if (takoConsumeModelLIZ != null) {
                    arrayList.add(takoConsumeModelLIZ);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static String LIZIZ(Long l, String str) {
        Object obj;
        Object next;
        TakoConsumeModel takoConsumeModel;
        if (((Number) C1819707At.LIZ.getValue()).intValue() == 1) {
            if (C123100dR.LIZ(LJ)) {
                return LJ;
            }
            int iIntValue = ((Number) C078K.LIZ.getValue()).intValue();
            List listLIZ = LIZ(iIntValue, "homepage_hot");
            List listLIZ2 = LIZ(iIntValue, "general_search");
            Set<String> setKeySet = LJI.snapshot().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : setKeySet) {
                Iterator it2 = listLIZ.iterator();
                while (true) {
                    obj = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((TakoConsumeModel) next).docId, obj2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                TakoConsumeModel takoConsumeModel2 = (TakoConsumeModel) next;
                Iterator it3 = listLIZ2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (Intrinsics.LJFF(((TakoConsumeModel) next2).docId, obj2)) {
                        obj = next2;
                        break;
                    }
                }
                TakoConsumeModel takoConsumeModel3 = (TakoConsumeModel) obj;
                if (Intrinsics.LJFF(str, obj2) && C08A4.LIZIZ(l)) {
                    if (takoConsumeModel2 != null) {
                        takoConsumeModel2.playTimeMax = Long.valueOf(Math.max(C0R2Q.LIZIZ(takoConsumeModel2.playTimeMax), C0R2Q.LIZIZ(l)));
                    }
                    if (takoConsumeModel3 != null) {
                        takoConsumeModel3.playTimeMax = Long.valueOf(Math.max(C0R2Q.LIZIZ(takoConsumeModel3.playTimeMax), C0R2Q.LIZIZ(l)));
                    }
                }
                if (takoConsumeModel2 != null) {
                    if (takoConsumeModel3 != null) {
                        if (C0R2Q.LIZIZ(takoConsumeModel2.videoStartTime) > C0R2Q.LIZIZ(takoConsumeModel3.videoStartTime)) {
                            takoConsumeModel = takoConsumeModel2;
                        } else {
                            takoConsumeModel = takoConsumeModel3;
                        }
                        takoConsumeModel.playTimeMax = Long.valueOf(Math.max(C0R2Q.LIZIZ(takoConsumeModel2.playTimeMax), C0R2Q.LIZIZ(takoConsumeModel3.playTimeMax)));
                        takoConsumeModel2 = takoConsumeModel;
                    }
                } else {
                    takoConsumeModel2 = takoConsumeModel3;
                    if (takoConsumeModel3 != null) {
                    }
                }
                arrayList.add(takoConsumeModel2);
            }
            LJ = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), arrayList);
            return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), LJ);
        }
        return "";
    }
}
