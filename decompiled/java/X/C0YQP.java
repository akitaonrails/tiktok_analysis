package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YQP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQP extends Message.Builder<MessageInfo, C0YQP> {
    public C0YUT LIZLLL;
    public MessageBody LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageInfo build() {
        return new MessageInfo(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
