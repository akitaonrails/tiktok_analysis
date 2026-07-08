package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.api.bean.LinkBusinessExtra;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zjs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907540zjs {
    public static final LinkBusinessExtra LIZ(MusNotice musNotice) {
        try {
            JSONObject jSONObjectLIZIZ = LIZIZ(musNotice);
            if (jSONObjectLIZIZ == null) {
                return null;
            }
            return new LinkBusinessExtra(jSONObjectLIZIZ.optString("type"), jSONObjectLIZIZ.optString("link_id"), jSONObjectLIZIZ.optString("item_id"), jSONObjectLIZIZ.optInt("share_type"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final JSONObject LIZIZ(MusNotice musNotice) {
        JSONObject jSONObject;
        String str;
        try {
            GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
            if (generalTemplateNotice != null && (str = generalTemplateNotice.messageExtra) != null) {
                jSONObject = new JSONObject(str);
            } else {
                jSONObject = new JSONObject();
            }
            return new JSONObject(jSONObject.optString("business_extra"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final User LIZJ(MusNotice musNotice) {
        TitleTemplate titleTemplate;
        List<User> list;
        NoticeUITemplate noticeUITemplate = musNotice.templateNotice.uiTemplate;
        if (noticeUITemplate != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null) {
            return (User) C13LP.LJJJLL(list);
        }
        return null;
    }

    public static final Map<String, String> LIZLLL(MusNotice musNotice) {
        int followFrom;
        String string;
        Map<String, String> mapLJIIIIZZ;
        LinkBusinessExtra linkBusinessExtraLIZ = LIZ(musNotice);
        EnumC1234280iDy enumC1234280iDyLJII = null;
        if (linkBusinessExtraLIZ != null) {
            enumC1234280iDyLJII = C1234220iDs.LJII(linkBusinessExtraLIZ.shareType);
        }
        if (enumC1234280iDyLJII != null) {
            followFrom = enumC1234280iDyLJII.getFollowFrom();
            string = Integer.valueOf(enumC1234280iDyLJII.getRawValue()).toString();
            if (string == null) {
            }
            if (linkBusinessExtraLIZ != null || (mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("video_link_id", linkBusinessExtraLIZ.linkId), new Pair("video_link_item_id", linkBusinessExtraLIZ.itemId), new Pair("video_link_share_type", string), new Pair("link_sharer", String.valueOf(Intrinsics.LJFF(linkBusinessExtraLIZ.type, "video_sharer") ? 1 : 0)), new Pair("from", String.valueOf(followFrom)))) == null) {
                return C2097608Jq.LJ();
            }
            return mapLJIIIIZZ;
        }
        followFrom = 0;
        string = "";
        if (linkBusinessExtraLIZ != null) {
        }
        return C2097608Jq.LJ();
    }
}
