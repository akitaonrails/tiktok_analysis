package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238581CjY extends Message.Builder<GetConversationInfoListByFavoriteV2ResponseBody, C2238581CjY> {
    public List<ConversationInfoV2> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationInfoListByFavoriteV2ResponseBody build() {
        return new GetConversationInfoListByFavoriteV2ResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
