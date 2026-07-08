package X;

import com.bytedance.im.core.proto.GetStrangerConversationListRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CMC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMC extends Message.Builder<GetStrangerConversationListRequestBody, C1CMC> {
    public Long LIZLLL;
    public Long LJ;
    public Boolean LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetStrangerConversationListRequestBody build() {
        return new GetStrangerConversationListRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
