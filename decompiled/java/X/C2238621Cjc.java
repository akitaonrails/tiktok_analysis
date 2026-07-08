package X;

import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Cjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238621Cjc extends Message.Builder<PreviewerGetConversationInfoListRequestBody, C2238621Cjc> {
    public List<GetConversationInfoV2RequestBody> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PreviewerGetConversationInfoListRequestBody build() {
        return new PreviewerGetConversationInfoListRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
