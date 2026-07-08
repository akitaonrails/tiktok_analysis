package X;

import com.bytedance.im.core.proto.GetTicketResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CER, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CER extends Message.Builder<GetTicketResponseBody, C1CER> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetTicketResponseBody build() {
        return new GetTicketResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
