package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.commercialize.model.Ad4adModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Rof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707230Rof {
    public static final C707230Rof LIZ = new C707230Rof();

    public static final JSONObject LIZ(Aweme aweme) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        HashMap<String, Object> mapLIZIZ = LIZIZ(aweme);
        if (mapLIZIZ != null) {
            for (Map.Entry<String, Object> entry : mapLIZIZ.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    public static final HashMap<String, Object> LIZIZ(Aweme aweme) {
        String uid;
        Integer numValueOf = null;
        if (aweme == null || !LIZLLL(aweme)) {
            return null;
        }
        HashMap<String, Object> map = new HashMap<>();
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        map.put("author_id", uid);
        map.put("item_id", aweme.getAid());
        Ad4adModel ad4adModelLIZJ = LIZJ(aweme);
        if (ad4adModelLIZJ != null) {
            numValueOf = Integer.valueOf(ad4adModelLIZJ.getPromoteUserType(aweme));
        }
        map.put("promote_new_user", numValueOf);
        map.put("promote_user_account_type", Integer.valueOf(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getAccountType()));
        return map;
    }

    public static final Ad4adModel LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getAd4adModel();
        }
        return null;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isAd4ad() && LIZJ(aweme) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(Aweme aweme) {
        String str;
        Ad4adModel ad4adModelLIZJ = LIZJ(aweme);
        if (LIZLLL(aweme)) {
            String str2 = null;
            if (ad4adModelLIZJ != null) {
                str = ad4adModelLIZJ.notInterestedButtonText;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                if (ad4adModelLIZJ != null) {
                    str2 = ad4adModelLIZJ.promoteButtonText;
                }
                if (TextUtils.isEmpty(str2)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
