package X;

import Y.AComparatorS23S0000000_4;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.api.IPoiRecommendService;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data.PoiVideoUnderstandData;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data.PoiVideoUnderstandResponse;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS0S2010000_18;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hHJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197910hHJ {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C443120HZe<String, String, String> LIZLLL(PoiSearchVM poiSearchVM) {
        String str;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        String str2 = poiSearchVM.LLILZLL;
        String strValueOf = String.valueOf(poiSearchVM.LLJL);
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = ((C1197490hGd) poiSearchVM.getState()).LLILZ;
        if (poiSearchResultWrapper != null && (poiSearchResult = poiSearchResultWrapper.poiSearchResult) != null) {
            str = poiSearchResult.logId;
        } else {
            str = null;
        }
        return new C443120HZe<>(str2, strValueOf, str);
    }

    public static final void LIZ(Map<String, String> map, PoiMobParam poiMobParam) {
        String str;
        String str2;
        String str3;
        Map<String, String> map2 = null;
        if (poiMobParam != null) {
            str = poiMobParam.creationId;
        } else {
            str = null;
        }
        C1189060h32.LJIJI(map, "creation_id", str);
        if (poiMobParam != null) {
            str2 = poiMobParam.contentType;
        } else {
            str2 = null;
        }
        C1189060h32.LJIJI(map, "content_type", str2);
        if (poiMobParam != null) {
            str3 = poiMobParam.shootWay;
        } else {
            str3 = null;
        }
        C1189060h32.LJIJI(map, "shoot_way", str3);
        if (poiMobParam != null) {
            map2 = poiMobParam.creationExtraData;
        }
        C1189060h32.LJIJJ(map, map2);
    }

    public static final void LIZJ(JSONObject jSONObject, JSONObject jSONObject2) {
        Pair<String, PoiVideoUnderstandResponse> pair;
        PoiVideoUnderstandData poiVideoUnderstandData;
        String strOptString = jSONObject2.optString("creation_id");
        String strOptString2 = jSONObject2.optString("content_type");
        boolean zIsSuccess = false;
        IPoiRecommendService iPoiRecommendService = (IPoiRecommendService) PluggableExtentionKt.pluggableSpi$default(IPoiRecommendService.class, false, false, false, 14, null);
        if (iPoiRecommendService == null || (pair = iPoiRecommendService.LIZIZ(strOptString)) == null) {
            pair = new Pair<>(null, null);
        }
        String first = pair.getFirst();
        PoiVideoUnderstandResponse second = pair.getSecond();
        C1173100gdI c1173100gdI = C1173100gdI.LIZ;
        if (second != null) {
            zIsSuccess = second.isSuccess();
        }
        c1173100gdI.getClass();
        if (C289320BVq.LIZ()) {
            c1173100gdI.LIZJ("request_poi_recommend", new AwS0S2010000_18(zIsSuccess, strOptString, strOptString2, 0));
        }
        if (second != null && (poiVideoUnderstandData = second.data) != null) {
            C1189060h32.LJIL(jSONObject, "frame_uri", first);
            C1189060h32.LJIL(jSONObject, "video_understanding_result", C2365509Or.LJ(poiVideoUnderstandData));
        }
    }

    public static final void LJ(C1182980gtE c1182980gtE, String str) {
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("poi_server_stream_time", -1);
                if (iOptInt >= 0 && c1182980gtE != null) {
                    c1182980gtE.LJIIIZ = Integer.valueOf(iOptInt);
                }
                int iOptInt2 = jSONObject.optInt("server_stream_time", -1);
                if (iOptInt2 >= 0 && c1182980gtE != null) {
                    c1182980gtE.LJIIJ = Integer.valueOf(iOptInt2);
                }
                int iOptInt3 = jSONObject.optInt("federation_stream_time", -1);
                if (iOptInt3 >= 0 && c1182980gtE != null) {
                    c1182980gtE.LJIIJJI = Integer.valueOf(iOptInt3);
                }
                C189200o6.m2constructorimpl(jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static final void LIZIZ(Map<String, String> map, C443120HZe<String, String, String> c443120HZe, String str) {
        String first = c443120HZe.getFirst();
        if (first != null) {
            map.put("search_id", first);
        }
        String second = c443120HZe.getSecond();
        if (second != null && C123100dR.LIZ(str)) {
            map.put("search_session_id", second);
        }
        String third = c443120HZe.getThird();
        if (third != null) {
            map.put("log_id", third);
        }
    }

    public static final void LJFF(TuxTextView tuxTextView, String str, List<? extends Position> list, Integer num) {
        int iLIZ;
        List<Position> listSingletonList;
        Context context = tuxTextView.getContext();
        InterfaceC682070QpB interfaceC682070QpBLLIILZL = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLIILZL();
        SpannableString spannableString = new SpannableString(str);
        if (!TextUtils.isEmpty(str)) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
            if (numLIZJ != null) {
                iLIZ = numLIZJ.intValue();
            } else {
                iLIZ = C960203pA.LIZ(R.attr.a1k, context);
            }
            if (num != null && num.intValue() == 0) {
                spannableString = interfaceC682070QpBLLIILZL.LJFF(context, str, list);
            } else {
                int length = str.length();
                if (list != null && !list.isEmpty()) {
                    List<Position> listLJLLLL = C13LP.LJLLLL(new AComparatorS23S0000000_4(5), list);
                    ArrayList arrayList = new ArrayList();
                    int end = 0;
                    for (Position position : listLJLLLL) {
                        if (end < position.getBegin()) {
                            arrayList.add(new Position(end, position.getBegin() - 1));
                        }
                        end = position.getEnd() + 1;
                    }
                    int i = length - 1;
                    listSingletonList = arrayList;
                    if (end <= i) {
                        arrayList.add(new Position(end, i));
                        listSingletonList = arrayList;
                    }
                } else {
                    listSingletonList = Collections.singletonList(new Position(0, length - 1));
                }
                if (context != null && !TextUtils.isEmpty(str) && !C086I.LIZIZ(listSingletonList) && listSingletonList != null && !listSingletonList.isEmpty()) {
                    for (Position position2 : listSingletonList) {
                        int begin = position2.getBegin();
                        int end2 = position2.getEnd() + 1;
                        int iMax = Math.max(0, begin);
                        if (!TextUtils.isEmpty(spannableString) && iMax <= end2 && iMax < spannableString.length() && end2 <= spannableString.length()) {
                            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iLIZ), iMax, end2, 33);
                        }
                    }
                }
            }
        }
        tuxTextView.setText(spannableString);
    }
}
