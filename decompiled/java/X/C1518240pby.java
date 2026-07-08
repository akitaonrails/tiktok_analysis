package X;

import com.squareup.wire.Message;
import com.ss.android.websocket.internal.proto.Frame;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518240pby extends Message.Builder<Frame, C1518240pby> {
    public Long LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Integer LJI;
    public List<C1518250pbz> LJII = C1516540pZE.LJIIIIZZ();
    public String LJIIIIZZ;
    public String LJIIIZ;
    public ByteString LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Frame build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new Frame(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "seqid", this.LJ, "logid", this.LJFF, "service", this.LJI, "method");
        throw null;
    }
}
