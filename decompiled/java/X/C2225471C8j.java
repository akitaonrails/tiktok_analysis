package X;

import com.bytedance.scalpel.protos.PerfData;
import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225471C8j extends Message.Builder<PerfData, C2225471C8j> {
    public Long LIZLLL;
    public Integer LJ;
    public ByteString LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PerfData build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new PerfData(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "timestamp", this.LJ, "data_type");
        throw null;
    }
}
