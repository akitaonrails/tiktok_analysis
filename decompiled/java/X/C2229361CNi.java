package X;

import com.bytedance.im.core.proto.GetStrangerMessagesRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229361CNi extends Message.Builder<GetStrangerMessagesRequestBody, C2229361CNi> {
    public Long LIZLLL;
    public Boolean LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetStrangerMessagesRequestBody build() {
        return new GetStrangerMessagesRequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
