package X;

import com.bytedance.im.core.proto.CheckMessagePerUserRequestBody;
import com.bytedance.im.core.proto.InboxMessagesPerUser;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CKJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKJ extends Message.Builder<CheckMessagePerUserRequestBody, C1CKJ> {
    public List<InboxMessagesPerUser> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CheckMessagePerUserRequestBody build() {
        return new CheckMessagePerUserRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
