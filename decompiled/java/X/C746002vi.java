package X;

import com.ss.android.ugc.aweme.feed.model.banner.ActionCondition;
import com.ss.android.ugc.aweme.feed.model.banner.TaskFilter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.02vi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C746002vi {
    public static final C01GW LIZ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(8));
        LIZ = c01gwLIZIZ;
        TaskFilter taskFilter = new TaskFilter("&&", Collections.singletonList(new ActionCondition("property_value_match_check", "{\"property_name\":\"buttons.button1.is_clicked\",\"operator\": \"!=\", \"property_value\":\"true\"}")));
        taskFilter.prepare();
        List listSingletonList = Collections.singletonList(taskFilter);
        Map map = (Map) c01gwLIZIZ.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("update_vo", listSingletonList);
        map.put("bottom_button_local_alliance_post_earn", linkedHashMap);
    }
}
