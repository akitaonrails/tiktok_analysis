package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.model.message.linkcore.JoinDirectResp;
import java.util.List;
import kotlin.jvm.functions.Function2;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0bFA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965940bFA extends C09AY implements Function2<String, C965950bFB, DirectJoinResult> {
    public C965940bFA() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final DirectJoinResult invoke(String str, C965950bFB c965950bFB) {
        List<SpotInfo> list;
        C965950bFB c965950bFB2 = c965950bFB;
        JoinDirectResp joinDirectResp = (JoinDirectResp) C966250bFf.LIZ(c965950bFB2.LIZ, JoinDirectResp.class);
        BizJoinDirectResponse bizJoinDirectResponse = (BizJoinDirectResponse) C966250bFf.LIZ(c965950bFB2.LIZIZ, BizJoinDirectResponse.class);
        if (joinDirectResp != null) {
            list = joinDirectResp.spotList;
        } else {
            list = null;
        }
        return new DirectJoinResult(bizJoinDirectResponse, list);
    }
}
