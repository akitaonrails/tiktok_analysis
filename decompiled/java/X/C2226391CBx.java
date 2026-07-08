package X;

import com.bytedance.im.core.proto.MessageByInitRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226391CBx extends Message.Builder<MessageByInitRequestBody, C2226391CBx> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageByInitRequestBody build() {
        return new MessageByInitRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
