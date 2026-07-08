package X;

import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y14, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y14 extends Message.Builder<DeleteMessageRequestBody, C0Y14> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteMessageRequestBody build() {
        return new DeleteMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
