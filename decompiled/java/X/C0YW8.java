package X;

import com.bytedance.im.core.proto.status_message.UpdateMessageExtValue;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YW8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YW8 extends Message.Builder<UpdateMessageExtValue, C0YW8> {
    public Map<String, String> LIZLLL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateMessageExtValue build() {
        return new UpdateMessageExtValue(this.LIZLLL, buildUnknownFields());
    }
}
