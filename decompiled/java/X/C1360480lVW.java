package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS104S1200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lVW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360480lVW implements InterfaceC1361740lXY<C1361600lXK> {
    public final C1362160lYE LIZ;

    public final void LIZJ() {
        Bundle bundle;
        String string;
        RecReasonEntry recReasonTag;
        RecReasonsStruct recReasonsStruct;
        List<UpvoteStruct> list;
        String requestId;
        SharePackage sharePackage = this.LIZ.LIZIZ;
        if (sharePackage == null || (bundle = sharePackage.extras) == null || (string = bundle.getString("aid")) == null) {
            return;
        }
        Aweme awemeLJJIJIL = C621180OYa.LIZ.LJJIJIL(this.LIZ.LIZIZ);
        String str = "";
        String string2 = bundle.getString("enter_from", "");
        String string3 = bundle.getString("author_id", "");
        String strValueOf = String.valueOf(bundle.getInt("follow_status", -1));
        String string4 = bundle.getString("panel_source", "");
        String strValueOf2 = String.valueOf(bundle.getInt("aweme_type", -1));
        boolean z = bundle.getBoolean("is_text_mode", false);
        if (awemeLJJIJIL != null) {
            recReasonTag = awemeLJJIJIL.getRecReasonTag();
            recReasonsStruct = awemeLJJIJIL.getRecReasonsStruct();
        } else {
            recReasonTag = null;
            recReasonsStruct = null;
        }
        String string5 = bundle.getString("from_page", "");
        String string6 = bundle.getString("tab_name", "");
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        String strLLIFFJFJJ = iPoiService != null ? iPoiService.LLIFFJFJJ(awemeLJJIJIL) : null;
        if (awemeLJJIJIL != null && (requestId = awemeLJJIJIL.getRequestId()) != null) {
            str = requestId;
        }
        UpvotePublishMobParam upvotePublishMobParam = new UpvotePublishMobParam(string2, null, string, string3, strValueOf, null, string4, false, null, strValueOf2, z, recReasonTag, recReasonsStruct, string5, strLLIFFJFJJ, 0.0d, false, null, null, null, 0, null, null, string6, false, null, null, null, null, null, str, null, null, 0, null, null, null, -1076949534, 65023);
        if (C123100dR.LIZ(bundle.getString("search_type"))) {
            upvotePublishMobParam.searchId = bundle.getString("search_id", null);
            upvotePublishMobParam.searchResultId = bundle.getString("search_result_id", null);
            upvotePublishMobParam.searchKeyword = bundle.getString("search_keyword", null);
            upvotePublishMobParam.searchType = bundle.getString("search_type", null);
        }
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZJ().LIZJ();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        UpvoteList upvoteListLJIIIIZZ = C1360460lVU.LIZIZ.LJIIIIZZ(string);
        if (upvoteListLJIIIIZZ != null && (list = upvoteListLJIIIIZZ.upvotes) != null) {
            Iterator<UpvoteStruct> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                UpvoteStruct next = it2.next();
                User user = next.user;
                if (Intrinsics.LJFF(user != null ? user.getUid() : null, curUserId)) {
                    if (next != null) {
                        upvotePublishMobParam.enterMethod = "button";
                        C1360460lVU.LIZIZ.LJ(string, upvotePublishMobParam, false, new AwS565S0100000_21(this, 1219), null, null, null, null, false);
                        return;
                    }
                }
            }
        }
        UpvotePublishExtraData upvotePublishExtraData = new UpvotePublishExtraData(awemeLJJIJIL, bundle.getInt("page_type", -1));
        upvotePublishMobParam.enterMethod = "share_panel";
        C1360460lVU.LIZIZ.LJJJ(null, null, null, upvotePublishExtraData, upvotePublishMobParam, 0, string, null, null, null, null, new AwS565S0100000_21(this, 1220), new AwS104S1200000_21(upvotePublishExtraData, upvotePublishMobParam, string, 8), true);
    }

    public C1360480lVW(C1362160lYE c1362160lYE) {
        this.LIZ = c1362160lYE;
    }

    @Override // X.InterfaceC1361740lXY
    public final void LIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
        LIZJ();
    }

    @Override // X.InterfaceC1361740lXY
    public final /* bridge */ /* synthetic */ void LIZIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
    }
}
