package X;

import com.bytedance.im.core.proto.MessagesPerUserRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YTW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YTW extends Message.Builder<MessagesPerUserRequestBody, C0YTW> {
    public Long LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Integer LJI;
    public List<String> LJII = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserRequestBody build() {
        return new MessagesPerUserRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
