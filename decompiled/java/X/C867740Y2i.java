package X;

import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Y2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867740Y2i extends Message.Builder<GetConversationInfoListV2RequestBody, C867740Y2i> {
    public List<GetConversationInfoV2RequestBody> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationInfoListV2RequestBody build() {
        return new GetConversationInfoListV2RequestBody(this.LIZLLL, buildUnknownFields());
    }
}
