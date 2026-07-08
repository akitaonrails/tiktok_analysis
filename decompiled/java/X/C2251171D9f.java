package X;

import com.bytedance.im.core.proto.GetRecentMessageReqBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251171D9f extends Message.Builder<GetRecentMessageReqBody, C2251171D9f> {
    public Long LIZLLL;
    public String LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetRecentMessageReqBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new GetRecentMessageReqBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "conversation_version", this.LJ, "source");
        throw null;
    }
}
