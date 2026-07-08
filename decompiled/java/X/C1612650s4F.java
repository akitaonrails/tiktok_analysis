package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0s4F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612650s4F implements ISeriesCommonETService {
    public static final C1612650s4F LIZIZ = new C1612650s4F();

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final void clearFirstPlayStateForCollection(String str) {
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final Map<String, String> getPaidContentInnerFeedSourceParam(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final String getSeriesVideoType(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final C1612610s4B getCurrentContext() {
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null) {
            return iSeriesCommonETServiceLIZ.getCurrentContext();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final Pair<String, String> getDramaDNUVideoLoginContext() {
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null) {
            return iSeriesCommonETServiceLIZ.getDramaDNUVideoLoginContext();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final EnumC1612540s44 getPlayVideoType() {
        EnumC1612540s44 playVideoType;
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        return (iSeriesCommonETServiceLIZ == null || (playVideoType = iSeriesCommonETServiceLIZ.getPlayVideoType()) == null) ? EnumC1612540s44.DEFAULT : playVideoType;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final String getSeriesEnterEntrance() {
        String seriesEnterEntrance;
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        return (iSeriesCommonETServiceLIZ == null || (seriesEnterEntrance = iSeriesCommonETServiceLIZ.getSeriesEnterEntrance()) == null) ? "" : seriesEnterEntrance;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final void pushSeriesContext(C1612610s4B c1612610s4B) {
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null) {
            iSeriesCommonETServiceLIZ.pushSeriesContext(c1612610s4B);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final void removeSeriesContext(String str) {
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null) {
            iSeriesCommonETServiceLIZ.removeSeriesContext(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final void setCommonETParams(C1612610s4B c1612610s4B) {
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null) {
            iSeriesCommonETServiceLIZ.setCommonETParams(c1612610s4B);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final void setDramaTabETParam(Map<String, String> map) {
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null) {
            iSeriesCommonETServiceLIZ.setDramaTabETParam(map);
        }
    }

    public static final <T> T LIZ(T t, Aweme aweme) {
        T t2;
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null && (t2 = (T) iSeriesCommonETServiceLIZ.appendPaidContentFcpComponentParam(aweme, t)) != null) {
            return t2;
        }
        return t;
    }

    public static final <T> T LIZIZ(T t, Aweme aweme) {
        T t2;
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null && (t2 = (T) iSeriesCommonETServiceLIZ.appendPaidContentParam(aweme, t)) != null) {
            return t2;
        }
        return t;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final <T> T appendPaidContentFcpComponentParam(Aweme aweme, T t) {
        T t2;
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null && (t2 = (T) iSeriesCommonETServiceLIZ.appendPaidContentFcpComponentParam(aweme, t)) != null) {
            return t2;
        }
        return t;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final <T> T appendPaidContentParam(Aweme aweme, T t) {
        T t2;
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null && (t2 = (T) iSeriesCommonETServiceLIZ.appendPaidContentParam(aweme, t)) != null) {
            return t2;
        }
        return t;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final <T> T appendPaidContentParamForVideoPlay(Aweme aweme, T t) {
        T t2;
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null && (t2 = (T) iSeriesCommonETServiceLIZ.appendPaidContentParamForVideoPlay(aweme, t)) != null) {
            return t2;
        }
        return t;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final Map<String, Object> appendPaidContentParamForVideoRequest(Aweme aweme, String str) {
        Map<String, Object> mapAppendPaidContentParamForVideoRequest;
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ == null || (mapAppendPaidContentParamForVideoRequest = iSeriesCommonETServiceLIZ.appendPaidContentParamForVideoRequest(aweme, str)) == null) {
            return C2097608Jq.LJ();
        }
        return mapAppendPaidContentParamForVideoRequest;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final <T> T appendSeriesInnerFeedMobParam(Aweme aweme, T t) {
        T t2;
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null && (t2 = (T) iSeriesCommonETServiceLIZ.appendSeriesInnerFeedMobParam(null, t)) != null) {
            return t2;
        }
        return t;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final String getSeriesEnterEntrance(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2) {
        String seriesEnterEntrance;
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ == null || (seriesEnterEntrance = iSeriesCommonETServiceLIZ.getSeriesEnterEntrance(str, bool, bool2, bool3, bool4, bool5, str2)) == null) {
            return "";
        }
        return seriesEnterEntrance;
    }
}
