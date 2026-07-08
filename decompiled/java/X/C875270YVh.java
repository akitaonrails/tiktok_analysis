package X;

import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.StrangerConversation;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875270YVh extends Message.Builder<GetStrangerConversationListResponseBody, C875270YVh> {
    public Long LIZLLL;
    public Boolean LJ;
    public Integer LJFF;
    public List<StrangerConversation> LJI = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetStrangerConversationListResponseBody build() {
        return new GetStrangerConversationListResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
