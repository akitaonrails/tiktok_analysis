package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ldX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365450ldX {
    public static final String LJFF(User user) {
        String str;
        String socialInfo = user.getSocialInfo();
        if (socialInfo != null && socialInfo.length() != 0) {
            return user.getSocialInfo();
        }
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct != null && (str = matchedFriendStruct.socialInfo) != null) {
            return str;
        }
        return "";
    }

    public static final void LIZ(AbstractC1386140mAu abstractC1386140mAu, Aweme aweme) {
        String str;
        if (aweme == null) {
            return;
        }
        String str2 = "1";
        if (aweme.getContentOriginalType() != 0) {
            int contentOriginalType = aweme.getContentOriginalType();
            if (contentOriginalType != 1) {
                if (contentOriginalType == 2) {
                    str = "1";
                } else if (contentOriginalType != 3) {
                    str = "";
                } else {
                    str = "2";
                }
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            abstractC1386140mAu.LJ("is_original", str);
        }
        String shootTabName = aweme.getShootTabName();
        if (shootTabName != null && shootTabName.length() != 0 && aweme.getContentOriginalType() == 2) {
            abstractC1386140mAu.LJ("shoot_tab_name", aweme.getShootTabName());
        }
        String contentType = aweme.getContentType();
        if (contentType != null && contentType.length() != 0) {
            abstractC1386140mAu.LJ("publish_content_type", aweme.getContentType());
        }
        if (aweme.getContentSizeType() != 0) {
            if (aweme.getContentSizeType() != 2) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            abstractC1386140mAu.LJ("is_multi_content", str2);
        }
    }

    public static final void LIZIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        String str;
        if (aweme == null) {
            return;
        }
        String str2 = "1";
        if (aweme.getContentOriginalType() != 0) {
            int contentOriginalType = aweme.getContentOriginalType();
            if (contentOriginalType != 1) {
                if (contentOriginalType == 2) {
                    str = "1";
                } else if (contentOriginalType != 3) {
                    str = "";
                } else {
                    str = "2";
                }
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("is_original", str);
        }
        String shootTabName = aweme.getShootTabName();
        if (shootTabName != null && shootTabName.length() != 0 && aweme.getContentOriginalType() == 2) {
            c2344009Gk.LJFF("shoot_tab_name", aweme.getShootTabName());
        }
        String contentType = aweme.getContentType();
        if (contentType != null && contentType.length() != 0) {
            c2344009Gk.LJFF("publish_content_type", aweme.getContentType());
        }
        if (aweme.getContentSizeType() != 0) {
            if (aweme.getContentSizeType() != 2) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("is_multi_content", str2);
        }
    }

    public static final void LIZJ(String str, JSONObject jSONObject) throws JSONException {
        Set<Map.Entry<String, k>> setEntrySet;
        if (str != null) {
            try {
                n nVar = (n) C08JS.LIZ(str, n.class);
                if (nVar != null && (setEntrySet = nVar.entrySet()) != null) {
                    Iterator<T> it2 = setEntrySet.iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("social_info_");
                        sbLIZ.append((String) entry.getKey());
                        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), ((k) entry.getValue()).LJIL());
                    }
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void LIZLLL(AbstractC1386130mAt abstractC1386130mAt, User user) {
        Set<Map.Entry<String, k>> setEntrySet;
        if (user != null) {
            try {
                n nVar = (n) C08JS.LIZ(LJFF(user), n.class);
                if (nVar != null && (setEntrySet = nVar.entrySet()) != null) {
                    Iterator<T> it2 = setEntrySet.iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("social_info_");
                        sbLIZ.append((String) entry.getKey());
                        abstractC1386130mAt.LJ(C2188811AlT.LIZIZ(sbLIZ), ((k) entry.getValue()).LJIL());
                    }
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void LJ(C2344009Gk c2344009Gk, User user) {
        Set<Map.Entry<String, k>> setEntrySet;
        if (user != null) {
            try {
                n nVar = (n) C08JS.LIZ(LJFF(user), n.class);
                if (nVar != null && (setEntrySet = nVar.entrySet()) != null) {
                    Iterator<T> it2 = setEntrySet.iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("social_info_");
                        sbLIZ.append((String) entry.getKey());
                        c2344009Gk.LJFF(C2188811AlT.LIZIZ(sbLIZ), ((k) entry.getValue()).LJIL());
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
