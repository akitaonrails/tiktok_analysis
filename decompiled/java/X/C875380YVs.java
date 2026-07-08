package X;

import com.bytedance.im.core.proto.CheckStatusMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875380YVs extends Message.Builder<CheckStatusMessagesResponseBody, C875380YVs> {
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CheckStatusMessagesResponseBody build() {
        return new CheckStatusMessagesResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
