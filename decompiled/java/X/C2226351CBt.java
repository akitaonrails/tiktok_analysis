package X;

import com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226351CBt extends Message.Builder<GetStrangerUnreadCountResponseBody, C2226351CBt> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetStrangerUnreadCountResponseBody build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new GetStrangerUnreadCountResponseBody(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "user_unread_count");
        throw null;
    }
}
