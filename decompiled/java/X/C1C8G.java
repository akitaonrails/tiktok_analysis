package X;

import com.bytedance.otis.protos.PerfData;
import com.bytedance.otis.protos.PerfDataRequest;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C8G, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C8G extends Message.Builder<PerfDataRequest, C1C8G> {
    public List<PerfData> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Long LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PerfDataRequest build() {
        return new PerfDataRequest(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
