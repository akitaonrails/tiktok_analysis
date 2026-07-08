package X;

import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y15, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y15 extends Message.Builder<DeleteStrangerMessageRequestBody, C0Y15> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteStrangerMessageRequestBody build() {
        return new DeleteStrangerMessageRequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
