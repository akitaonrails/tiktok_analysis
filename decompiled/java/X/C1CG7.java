package X;

import com.bytedance.im.core.proto.UnReadCountReportResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CG7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CG7 extends Message.Builder<UnReadCountReportResponseBody, C1CG7> {
    public Boolean LIZLLL;
    public List<Long> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UnReadCountReportResponseBody build() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return new UnReadCountReportResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "set_total_status");
        throw null;
    }
}
