package X;

import com.bytedance.im.core.proto.GetMediaStatusRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YHA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YHA extends Message.Builder<GetMediaStatusRequestBody, C0YHA> {
    public List<GetMediaStatusRequestBody.MediaKey> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMediaStatusRequestBody build() {
        return new GetMediaStatusRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
