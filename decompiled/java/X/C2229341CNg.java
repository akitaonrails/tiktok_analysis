package X;

import com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229341CNg extends Message.Builder<ConversationsPerUserByTopV2RequestBody, C2229341CNg> {
    public Long LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationsPerUserByTopV2RequestBody build() {
        return new ConversationsPerUserByTopV2RequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
