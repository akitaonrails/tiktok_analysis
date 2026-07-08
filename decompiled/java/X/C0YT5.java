package X;

import com.bytedance.im.core.proto.GetMediaUploadConfigResponseBody;
import com.bytedance.im.core.proto.MediaUploadConfig;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YT5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YT5 extends Message.Builder<GetMediaUploadConfigResponseBody, C0YT5> {
    public List<MediaUploadConfig> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMediaUploadConfigResponseBody build() {
        return new GetMediaUploadConfigResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
