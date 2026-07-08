package X;

import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YQR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQR extends Message.Builder<GetMessageByIdResponseBody, C0YQR> {
    public MessageInfo LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageByIdResponseBody build() {
        return new GetMessageByIdResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
