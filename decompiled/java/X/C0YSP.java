package X;

import com.bytedance.im.core.proto.GetMessagePreviewResponseBody;
import com.squareup.wire.Message;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YSP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSP extends Message.Builder<GetMessagePreviewResponseBody, C0YSP> {
    public List<ByteString> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagePreviewResponseBody build() {
        return new GetMessagePreviewResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
