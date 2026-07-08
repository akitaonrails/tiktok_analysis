package X;

import com.bytedance.im.core.proto.ClientMetric;
import com.bytedance.im.core.proto.ReportClientMetricsRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CK7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CK7 extends Message.Builder<ReportClientMetricsRequestBody, C1CK7> {
    public List<ClientMetric> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ReportClientMetricsRequestBody build() {
        return new ReportClientMetricsRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
