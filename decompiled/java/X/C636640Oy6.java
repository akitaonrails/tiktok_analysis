package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.SearchProsConsJSBRequestModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.Tag;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Oy6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636640Oy6 {
    public static SearchProsConsJSBRequestModel LIZ(Map map, Map map2, Map map3, Map map4) {
        Object c098200Yq;
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String strJ3 = C786410Ut5.J3(new JSONObject(map));
            c1227904rF.getClass();
            c098200Yq = (SearchProsConsJSBRequestModel) C1227904rF.LIZIZ(strJ3, SearchProsConsJSBRequestModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            SearchProsConsJSBRequestModel searchProsConsJSBRequestModel = (SearchProsConsJSBRequestModel) c098200Yq;
            Iterator<Tag> it2 = searchProsConsJSBRequestModel.pros.iterator();
            while (it2.hasNext()) {
                it2.next().categoryName = searchProsConsJSBRequestModel.columnText.pros;
            }
            Iterator<Tag> it3 = searchProsConsJSBRequestModel.cons.iterator();
            while (it3.hasNext()) {
                it3.next().categoryName = searchProsConsJSBRequestModel.columnText.cons;
            }
            searchProsConsJSBRequestModel.logParams = map2;
            searchProsConsJSBRequestModel.takoMediaParams = map3;
            searchProsConsJSBRequestModel.userContentMap = map4;
            return searchProsConsJSBRequestModel;
        }
        return null;
    }
}
