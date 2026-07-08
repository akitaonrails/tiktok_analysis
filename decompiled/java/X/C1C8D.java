package X;

import com.bytedance.otis.protos.PerfData;
import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C8D, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C8D extends Message.Builder<PerfData, C1C8D> {
    public Long LIZLLL;
    public Integer LJ;
    public ByteString LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PerfData build() {
        return new PerfData(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
