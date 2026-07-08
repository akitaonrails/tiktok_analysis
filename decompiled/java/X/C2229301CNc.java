package X;

import com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229301CNc extends Message.Builder<ConversationsPerUserByFavoriteV2RequestBody, C2229301CNc> {
    public Long LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationsPerUserByFavoriteV2RequestBody build() {
        return new ConversationsPerUserByFavoriteV2RequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
