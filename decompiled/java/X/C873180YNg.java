package X;

import com.bytedance.im.core.proto.PrefetchConversationIdRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873180YNg extends Message.Builder<PrefetchConversationIdRequestBody, C873180YNg> {
    public Boolean LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PrefetchConversationIdRequestBody build() {
        return new PrefetchConversationIdRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
