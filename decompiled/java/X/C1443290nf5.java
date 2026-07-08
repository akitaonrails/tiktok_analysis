package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.creative.model.EditPostCheckResult;
import com.ss.android.ugc.aweme.creative.model.EditPostNewsAnchorChangeType;
import com.ss.android.ugc.aweme.creative.model.EditPostPoiChangeType;
import com.ss.android.ugc.aweme.editpost.EditDiffMessage;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.editpost.EditPostResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443290nf5 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(668));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(531));

    public static IAVPublishService LIZ() {
        return (IAVPublishService) LIZIZ.getValue();
    }

    public static final void LIZIZ(C19EG c19eg, Intent intent) {
        EditPostResponse editPostResponse;
        EditDiffMessage editDiffMessage;
        int i;
        EditPostCheckResult editPostCheckResult;
        Serializable serializableExtra = intent.getSerializableExtra("edit_post_response");
        if ((serializableExtra instanceof EditPostResponse) && (editPostResponse = (EditPostResponse) serializableExtra) != null && editPostResponse.statusCode == 0) {
            String str = editPostResponse.errorMsg;
            if (str == null) {
                str = "";
            }
            if (str.length() > 0 || (editDiffMessage = editPostResponse.editDiffMessage) == null) {
                return;
            }
            LIZJ(editDiffMessage.aid, editDiffMessage.permission);
            if (c19eg != null) {
                Serializable serializableExtra2 = intent.getSerializableExtra("edit_post_check_result");
                if ((serializableExtra2 instanceof EditPostCheckResult) && (editPostCheckResult = (EditPostCheckResult) serializableExtra2) != null && editPostCheckResult.getNewsAnchorChangedType() == EditPostNewsAnchorChangeType.DELETE && !editPostCheckResult.isTitleChanged() && !editPostCheckResult.isHashtagEdited() && !editPostCheckResult.isAtFriendEdited() && !editPostCheckResult.isMentionVideoEdited() && !editPostCheckResult.isCoverEdited() && editPostCheckResult.getPoiChangedType() == EditPostPoiChangeType.UNKNOWN && !editPostCheckResult.isHeadingChanged() && !editPostCheckResult.isAltTextChanged()) {
                    i = 2131848713;
                } else {
                    i = 2131833470;
                }
                String string = c19eg.getString(i);
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    public static final void LIZJ(String str, EditPostPermission editPostPermission) {
        if (str.length() == 0) {
            return;
        }
        C01GW c01gw = LIZ;
        Aweme awemeLLILZ = ((IAwemeService) c01gw.getValue()).LLILZ(str);
        if (awemeLLILZ == null) {
            return;
        }
        awemeLLILZ.setEditPostPermission(editPostPermission);
        ((IAwemeService) c01gw.getValue()).LLILLL(awemeLLILZ);
        C1440005kM.LIZ(new C737030Svd(70, awemeLLILZ));
    }
}
