package X;

import com.bytedance.scalpel.protos.AttributionRunnableInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C7S, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C7S extends Message.Builder<AttributionRunnableInfo, C1C7S> {
    public String LIZLLL;
    public String LJ;
    public Integer LJFF;
    public String LJI;
    public String LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AttributionRunnableInfo build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new AttributionRunnableInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "name", this.LJ, "work_thread_name", this.LJFF, "cpu_time_cost");
        throw null;
    }
}
