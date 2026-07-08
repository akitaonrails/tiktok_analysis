package X;

import com.bytedance.im.core.proto.GetCmdMessageReqBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251151D9d extends Message.Builder<GetCmdMessageReqBody, C2251151D9d> {
    public Long LIZLLL;
    public String LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetCmdMessageReqBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new GetCmdMessageReqBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "cmd_index", this.LJ, "source");
        throw null;
    }
}
