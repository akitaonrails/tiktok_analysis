package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876240YZa extends Message.Builder<GetConversationInfoListV2ResponseBody, C876240YZa> {
    public List<ConversationInfoV2> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationInfoListV2ResponseBody build() {
        return new GetConversationInfoListV2ResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
