package X;

import com.bytedance.im.core.proto.MessagesPerUserInboxRequest;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YKE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YKE extends Message.Builder<MessagesPerUserInboxRequest, C0YKE> {
    public Integer LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public C0YKB LJI;
    public C0YFV LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserInboxRequest build() {
        return new MessagesPerUserInboxRequest(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
