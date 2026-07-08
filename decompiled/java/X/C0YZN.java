package X;

import com.bytedance.im.core.proto.SendInputStatusResponseBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YZN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YZN extends Message.Builder<SendInputStatusResponseBody, C0YZN> {
    public C0YZO LIZLLL;
    public Map<String, String> LJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendInputStatusResponseBody build() {
        return new SendInputStatusResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
