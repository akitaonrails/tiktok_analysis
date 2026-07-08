package X;

import com.bytedance.scalpel.protos.PerfData;
import com.bytedance.scalpel.protos.PerfDataRequest;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225501C8m extends Message.Builder<PerfDataRequest, C2225501C8m> {
    public List<PerfData> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Long LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PerfDataRequest build() {
        return new PerfDataRequest(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
