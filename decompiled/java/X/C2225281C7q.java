package X;

import com.bytedance.scalpel.protos.AttributionStageInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225281C7q extends Message.Builder<AttributionStageInfo, C2225281C7q> {
    public String LIZLLL;
    public Integer LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AttributionStageInfo build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new AttributionStageInfo(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "stage", this.LJ, "cpu_time_cost", this.LJFF, "wall_time_cost");
        throw null;
    }
}
