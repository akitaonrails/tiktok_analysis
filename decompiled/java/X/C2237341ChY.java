package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1ChY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237341ChY extends Message.Builder<C2237321ChW, C2237341ChY> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public ByteString LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237321ChW build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C2237321ChW(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "origin_layout_style", this.LJ, "current_layout_style", this.LJFF, "origin_max_position", this.LJI, "current_max_position", this.LJII, "enlarge_status", this.LJIIIIZZ, "current_panel_layout_type");
        throw null;
    }
}
