package X;

import com.bytedance.im.core.proto.BatchGetMessagesResponseBody;
import com.bytedance.im.core.proto.GetMessageByKeyError;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Cjg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238661Cjg extends Message.Builder<BatchGetMessagesResponseBody, C2238661Cjg> {
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<GetMessageByKeyError> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchGetMessagesResponseBody build() {
        return new BatchGetMessagesResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
