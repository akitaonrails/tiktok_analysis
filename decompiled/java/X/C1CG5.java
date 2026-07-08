package X;

import com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CG5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CG5 extends Message.Builder<MarkMsgUnreadCountReportResponseBody, C1CG5> {
    public Boolean LIZLLL;
    public List<Long> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMsgUnreadCountReportResponseBody build() {
        return new MarkMsgUnreadCountReportResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
