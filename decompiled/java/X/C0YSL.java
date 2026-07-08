package X;

import com.bytedance.im.core.proto.MessagesPerUserComboRequestBody;
import com.bytedance.im.core.proto.MessagesPerUserInboxRequest;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YSL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSL extends Message.Builder<MessagesPerUserComboRequestBody, C0YSL> {
    public List<MessagesPerUserInboxRequest> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Long LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserComboRequestBody build() {
        return new MessagesPerUserComboRequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
