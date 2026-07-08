package X;

import com.bytedance.im.core.proto.GetConversationsCheckInfoV2RequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873320YNu extends Message.Builder<GetConversationsCheckInfoV2RequestBody, C873320YNu> {
    public Integer LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationsCheckInfoV2RequestBody build() {
        return new GetConversationsCheckInfoV2RequestBody(this.LIZLLL, buildUnknownFields());
    }
}
