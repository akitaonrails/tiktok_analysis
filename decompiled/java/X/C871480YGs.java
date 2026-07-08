package X;

import com.bytedance.im.core.proto.DissolveConversationRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871480YGs extends Message.Builder<DissolveConversationRequestBody, C871480YGs> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DissolveConversationRequestBody build() {
        return new DissolveConversationRequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
