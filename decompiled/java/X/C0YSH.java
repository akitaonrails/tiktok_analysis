package X;

import com.bytedance.im.core.proto.MessagePerUserInboxResponse;
import com.bytedance.im.core.proto.MessagesPerUserComboResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YSH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSH extends Message.Builder<MessagesPerUserComboResponseBody, C0YSH> {
    public List<MessagePerUserInboxResponse> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;
    public C0YGM LJI;
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserComboResponseBody build() {
        return new MessagesPerUserComboResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
