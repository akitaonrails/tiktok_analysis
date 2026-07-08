package X;

import com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody;
import com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CKN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKN extends Message.Builder<CheckMessagesPerUserResponseBody, C1CKN> {
    public List<InboxMessagesPerUserResponseBody> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CheckMessagesPerUserResponseBody build() {
        return new CheckMessagesPerUserResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
