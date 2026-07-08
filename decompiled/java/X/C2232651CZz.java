package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232651CZz extends Message.Builder<C2232591CZt, C2232651CZz> {
    public String LIZLLL;
    public Boolean LJ;
    public C2228421CJs LJFF;
    public List<C1CZJ> LJI = C1516540pZE.LJIIIIZZ();
    public C2232561CZq LJII;
    public String LJIIIIZZ;
    public C2233351Cb7 LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232591CZt build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJII != null && this.LJIIIZ != null) {
            return new C2232591CZt(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "layout_key", this.LJ, "has_split_line", this.LJFF, "layout_container_view_info", this.LJII, "player_frame", this.LJIIIZ, "layout_extra");
        throw null;
    }
}
