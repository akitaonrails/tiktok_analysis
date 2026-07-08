package X;

import com.bytedance.im.core.proto.GetMessageError;
import com.bytedance.im.core.proto.GetMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YU6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YU6 extends Message.Builder<GetMessagesResponseBody, C0YU6> {
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<GetMessageError> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesResponseBody build() {
        return new GetMessagesResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
