package X;

import com.bytedance.im.core.proto.GetStrangerMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YQT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQT extends Message.Builder<GetStrangerMessagesResponseBody, C0YQT> {
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetStrangerMessagesResponseBody build() {
        return new GetStrangerMessagesResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
