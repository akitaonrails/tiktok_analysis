package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233721Cbi extends Message.Builder<C2233701Cbg, C2233721Cbi> {
    public C2233461CbI LIZLLL;
    public C2233761Cbm LJ;
    public Double LJFF;
    public C2230371CRf LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233701Cbg build() {
        C2233461CbI c2233461CbI = this.LIZLLL;
        if (c2233461CbI != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2233701Cbg(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(c2233461CbI, "container_info", this.LJ, "resolution", this.LJFF, "device_screen_scale", this.LJI, "container_rect_config");
        throw null;
    }
}
