package X;

import com.bytedance.im.core.proto.GetMessagePreviewRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y8G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8G extends Message.Builder<GetMessagePreviewRequestBody, C0Y8G> {
    public Long LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagePreviewRequestBody build() {
        return new GetMessagePreviewRequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
