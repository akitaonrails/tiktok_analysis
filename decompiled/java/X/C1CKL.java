package X;

import com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CKL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKL extends Message.Builder<InboxMessagesPerUserResponseBody, C1CKL> {
    public Integer LIZLLL;
    public Boolean LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final InboxMessagesPerUserResponseBody build() {
        return new InboxMessagesPerUserResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
