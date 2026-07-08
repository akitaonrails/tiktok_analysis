package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Yb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877140Yb2 extends Message.Builder<GetConversationInfoV2ResponseBody, C877140Yb2> {
    public ConversationInfoV2 LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationInfoV2ResponseBody build() {
        return new GetConversationInfoV2ResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
