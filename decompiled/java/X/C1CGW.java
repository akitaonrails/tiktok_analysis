package X;

import com.bytedance.im.core.proto.GetMediaStatusResponseBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1CGW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGW extends Message.Builder<GetMediaStatusResponseBody, C1CGW> {
    public Map<String, GetMediaStatusResponseBody.MediaStatusInfo> LIZLLL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMediaStatusResponseBody build() {
        return new GetMediaStatusResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
