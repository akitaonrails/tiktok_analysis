package X;

import com.bytedance.scalpel.protos.GCRecord;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9B, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C9B extends Message.Builder<GCRecord, C1C9B> {
    public Integer LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public String LJII;
    public TimeInfo LJIIIIZZ;
    public TimeStampRange LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GCRecord build() {
        Integer num = this.LIZLLL;
        if (num != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new GCRecord(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "gc_type", this.LJ, "alloc_size", this.LJFF, "start_time", this.LJI, "end_time");
        throw null;
    }
}
