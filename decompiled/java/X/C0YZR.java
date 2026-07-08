package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YZR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YZR extends Message.Builder<PreviewerGetConversationInfoListResponseBody, C0YZR> {
    public List<ConversationInfoV2> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Integer LJ;
    public Long LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PreviewerGetConversationInfoListResponseBody build() {
        return new PreviewerGetConversationInfoListResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
