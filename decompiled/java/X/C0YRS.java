package X;

import com.bytedance.im.core.proto.ConvCountReport;
import com.bytedance.im.core.proto.UnReadCountReportRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YRS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YRS extends Message.Builder<UnReadCountReportRequestBody, C0YRS> {
    public Long LIZLLL;
    public List<ConvCountReport> LJ = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJFF = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UnReadCountReportRequestBody build() {
        return new UnReadCountReportRequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
