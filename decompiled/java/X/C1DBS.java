package X;

import com.bytedance.im.core.proto.MarkMessageResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBS, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBS extends Message.Builder<MarkMessageResponseBody, C1DBS> {
    public Long LIZLLL;
    public Long LJ;
    public String LJFF;
    public C0YIG LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMessageResponseBody build() {
        return new MarkMessageResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
