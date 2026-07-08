package X;

import com.bytedance.im.core.proto.BroadcastUserCounterResponseBody;
import com.bytedance.im.core.proto.BroadcastUserInfo;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CSW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSW extends Message.Builder<BroadcastUserCounterResponseBody, C1CSW> {
    public List<BroadcastUserInfo> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BroadcastUserCounterResponseBody build() {
        return new BroadcastUserCounterResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
