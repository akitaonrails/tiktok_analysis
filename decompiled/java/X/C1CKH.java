package X;

import com.bytedance.im.core.proto.InboxMessagesPerUser;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CKH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKH extends Message.Builder<InboxMessagesPerUser, C1CKH> {
    public Integer LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final InboxMessagesPerUser build() {
        return new InboxMessagesPerUser(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
