package X;

import com.bytedance.common.wschannel.model.Frame;
import com.squareup.wire.Message;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pZF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516550pZF extends Message.Builder<Frame, C1516550pZF> {
    public Long LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Integer LJI;
    public List<C1516580pZI> LJII = C1516540pZE.LJIIIIZZ();
    public String LJIIIIZZ;
    public String LJIIIZ;
    public ByteString LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Frame build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new Frame(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "seqid", this.LJ, "logid", this.LJFF, "service", this.LJI, "method");
        throw null;
    }
}
