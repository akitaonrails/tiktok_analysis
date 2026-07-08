package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Zgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906180Zgm extends Message.Builder<C906250Zgt, C906180Zgm> {
    public String LIZLLL;
    public Long LJ;
    public String LJFF;
    public Long LJI;
    public Integer LJII;
    public String LJIIIIZZ;
    public List<C906290Zgx> LJIIIZ = C1516540pZE.LJIIIIZZ();
    public Boolean LJIIJ;
    public Integer LJIIJJI;
    public Integer LJIIL;
    public Boolean LJIILIIL;
    public C906230Zgr LJIILJJIL;
    public Integer LJIILL;
    public String LJIILLIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C906250Zgt build() {
        String str = this.LJFF;
        if (str != null && this.LJI != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIIL != null && this.LJIILIIL != null) {
            return new C906250Zgt(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "reply_client_message_id", this.LJI, "reply_server_message_id", this.LJIIJ, "is_finish", this.LJIIJJI, "seq_id", this.LJIIL, "first_seq_id", this.LJIILIIL, "reset_content");
        throw null;
    }
}
