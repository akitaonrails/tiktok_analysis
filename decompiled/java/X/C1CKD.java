package X;

import com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1CKD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKD extends Message.Builder<MarkMsgUnreadCountReportRequestBody, C1CKD> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public Map<Long, Long> LJII = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMsgUnreadCountReportRequestBody build() {
        return new MarkMsgUnreadCountReportRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
