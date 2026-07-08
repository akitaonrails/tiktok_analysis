package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Cja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238601Cja extends Message.Builder<GetConversationInfoListByTopV2ResponseBody, C2238601Cja> {
    public List<ConversationInfoV2> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationInfoListByTopV2ResponseBody build() {
        return new GetConversationInfoListByTopV2ResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
