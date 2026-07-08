package X;

import com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1CG3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CG3 extends Message.Builder<MarkMsgGetUnreadCountResponseBody, C1CG3> {
    public Long LIZLLL;
    public Map<Long, Long> LJ = new LinkedHashMap();
    public List<Long> LJFF = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMsgGetUnreadCountResponseBody build() {
        return new MarkMsgGetUnreadCountResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
