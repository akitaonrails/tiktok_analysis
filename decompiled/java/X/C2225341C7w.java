package X;

import com.bytedance.scalpel.protos.AttributionJavaStackInfo;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225341C7w extends Message.Builder<AttributionJavaStackInfo.JavaStackItemInfo, C2225341C7w> {
    public Integer LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public List<Long> LJIIIZ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AttributionJavaStackInfo.JavaStackItemInfo build() {
        Integer num = this.LIZLLL;
        if (num != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new AttributionJavaStackInfo.JavaStackItemInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "type", this.LJ, "start_wall_time", this.LJFF, "end_wall_time", this.LJI, "start_cpu_time", this.LJII, "end_cpu_time", this.LJIIIIZZ, "memory_size");
        throw null;
    }
}
