package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.DetailLynxCardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680290QmJ {
    public static final C680290QmJ LIZ = new C680290QmJ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(522));

    public static C1D66 LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        return (C1D66) ((Map) LIZIZ.getValue()).get(str);
    }

    public static C1D66 LIZ(Aweme aweme, Context context, C2189821An6 c2189821An6, C725770SdT c725770SdT) {
        DetailLynxCardStruct lynxCardStruct;
        DynamicPatch dynamicPatch;
        String str;
        int height;
        String rawData;
        View viewFindViewById;
        View viewFindViewById2;
        if (aweme == null || (lynxCardStruct = aweme.getLynxCardStruct()) == null || lynxCardStruct.dynamicPatch == null || (dynamicPatch = lynxCardStruct.dynamicPatch) == null || (str = dynamicPatch.schema) == null) {
            return null;
        }
        C1D3S c1d3s = C1D3S.NORMAL;
        Map<String, List<String>> mapLIZ = C682060QpA.LIZ();
        int iLIZJ = C497820Jfg.LIZJ(context);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        int height2 = 0;
        if (c19egLIZIZ != null && (viewFindViewById2 = c19egLIZIZ.findViewById(R.id.ija)) != null) {
            height = viewFindViewById2.getHeight();
        } else {
            height = 0;
        }
        int iLJFF = C418440Gaw.LJFF(iLIZJ + height, context);
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ2 != null && (viewFindViewById = c19egLIZIZ2.findViewById(R.id.cbk)) != null) {
            height2 = viewFindViewById.getHeight();
        }
        int iLJFF2 = C418440Gaw.LJFF(height2, context);
        C1D66 c1d66 = new C1D66(context, str, c1d3s, mapLIZ);
        if (c725770SdT != null) {
            c725770SdT.LIZJ = System.currentTimeMillis();
            c1d66.LJ(C725770SdT.class, c725770SdT);
        }
        DynamicPatch dynamicPatch2 = lynxCardStruct.dynamicPatch;
        String str2 = "";
        if (dynamicPatch2 == null || (rawData = dynamicPatch2.getRawData()) == null) {
            rawData = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("log_extra", c2189821An6.getExtra());
        linkedHashMap.put("top_bar_height", Integer.valueOf(iLJFF));
        linkedHashMap.put("bottom_bar_height", Integer.valueOf(iLJFF2));
        linkedHashMap.put("is_search_inner_flow_page", Boolean.TRUE);
        linkedHashMap.put("search_id", ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL);
        String eventType = c2189821An6.getExtra().get("enter_from");
        if (eventType == null && (eventType = c2189821An6.getEventType()) == null) {
            eventType = "";
        }
        linkedHashMap.put("enter_from", eventType);
        String str3 = c2189821An6.getExtra().get("enter_method");
        if (str3 == null) {
            String enterMethodValue = c2189821An6.getEnterMethodValue();
            if (enterMethodValue != null) {
                str2 = enterMethodValue;
            }
        } else {
            str2 = str3;
        }
        linkedHashMap.put("enter_method", str2);
        c1d66.LIZJ(rawData, linkedHashMap);
        C680290QmJ c680290QmJ = LIZ;
        String strLIZ = C436190H8n.LIZ(aweme);
        c680290QmJ.getClass();
        if (strLIZ != null) {
            ((Map) LIZIZ.getValue()).put(strLIZ, c1d66);
        }
        return c1d66;
    }
}
