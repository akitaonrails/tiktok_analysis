package X;

import com.bytedance.im.core.proto.AckMessageResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226331CBr extends Message.Builder<AckMessageResponseBody, C2226331CBr> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AckMessageResponseBody build() {
        return new AckMessageResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
