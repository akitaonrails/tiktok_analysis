package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDD extends Message.Builder<C1CDB, C1CDD> {
    public Boolean LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public ByteString LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CDB build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C1CDB(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "is_enlarged", this.LJ, "is_single_zoom_enabled", this.LJFF, "is_double_zoom_enabled", this.LJI, "is_switch_spot_enabled", this.LJII, "spot_rank", this.LJIIIIZZ, "content_position_type");
        throw null;
    }
}
