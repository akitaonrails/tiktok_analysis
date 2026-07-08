package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.ReplyResponse;
import java.util.List;
import kotlin.jvm.functions.Function2;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0bEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965620bEe extends C09AY implements Function2<String, C965950bFB, ReplyResult> {
    public C965620bEe() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ReplyResult invoke(String str, C965950bFB c965950bFB) {
        MicPositionData micPositionData;
        BizReplyResponse bizReplyResponse;
        List<SpotInfo> list;
        String str2 = str;
        ReplyResponse replyResponse = (ReplyResponse) C966250bFf.LIZ(c965950bFB.LIZ, ReplyResponse.class);
        String str3 = null;
        if (replyResponse != null) {
            micPositionData = replyResponse.position;
        } else {
            micPositionData = null;
        }
        OnLineMicInfo onLineMicInfoLIZJ = C954920axO.LIZJ(micPositionData);
        if (onLineMicInfoLIZJ == null) {
            onLineMicInfoLIZJ = new OnLineMicInfo.Builder().build();
        }
        if (replyResponse != null) {
            str3 = replyResponse.inviteeLinkMicId;
            bizReplyResponse = replyResponse.multiGuestRespExtra;
            list = replyResponse.spotList;
        } else {
            bizReplyResponse = null;
            list = null;
        }
        return new ReplyResult(str3, onLineMicInfoLIZJ, bizReplyResponse, str2, list, false);
    }
}
