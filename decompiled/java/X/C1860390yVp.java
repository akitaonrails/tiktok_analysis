package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAdditonalPanelListResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNewActionBarListResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0yVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860390yVp {
    public static final TakoAdditonalPanelListResponse LIZ(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new TakoAdditonalPanelListResponse(null, null, null, null, null, null, 63, null);
            }
            return (TakoAdditonalPanelListResponse) C597040NbK.LIZ().LJII(str, TakoAdditonalPanelListResponse.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new TakoAdditonalPanelListResponse(null, null, null, null, null, null, 63, null);
        }
    }

    public static final BaseVideo LIZIZ(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (BaseVideo) C597040NbK.LIZ().LJII(str, BaseVideo.class);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final String LIZJ(TakoMixFeed takoMixFeed) {
        return GsonProtectorUtils.toJson(C597040NbK.LIZ(), takoMixFeed);
    }

    public static final TakoNewActionBarListResponse LIZLLL(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new TakoNewActionBarListResponse(null, null, null, null, null, null, null, 127, null);
            }
            return (TakoNewActionBarListResponse) C597040NbK.LIZ().LJII(str, TakoNewActionBarListResponse.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new TakoNewActionBarListResponse(null, null, null, null, null, null, null, 127, null);
        }
    }

    public static final TakoPlaceholderSource LJ(String str) {
        try {
            return (TakoPlaceholderSource) C597040NbK.LIZ().LJII(str, TakoPlaceholderSource.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Map<String, Object> LJFF(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new LinkedHashMap();
            }
            return (Map) C597040NbK.LIZ().LJIIIIZZ(str, new TypeToken<Map<String, Object>>() { // from class: X.0yVq
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new LinkedHashMap();
        }
    }

    public static final TakoMixFeed LJI(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new TakoMixFeed(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, -1, 1023, null);
            }
            return (TakoMixFeed) C597040NbK.LIZ().LJII(str, TakoMixFeed.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new TakoMixFeed(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, -1, 1023, null);
        }
    }
}
