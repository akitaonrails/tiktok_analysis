package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PullMarkMessageResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238521CjS extends Message.Builder<PullMarkMessageResponseBody, C2238521CjS> {
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PullMarkMessageResponseBody build() {
        return new PullMarkMessageResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
