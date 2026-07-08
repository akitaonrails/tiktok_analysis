package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetUserConversationListResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875400YVu extends Message.Builder<GetUserConversationListResponseBody, C875400YVu> {
    public List<ConversationInfoV2> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetUserConversationListResponseBody build() {
        return new GetUserConversationListResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
