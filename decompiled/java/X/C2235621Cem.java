package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235621Cem extends Message.Builder<C2235601Cek, C2235621Cem> {
    public String LIZLLL;
    public String LJ;
    public Long LJFF;
    public Long LJI;
    public String LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235601Cek build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C2235601Cek(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "app_data_json_string", this.LJ, "regions_json_string", this.LJFF, "canvas_width", this.LJI, "canvas_height", this.LJII, "background_color", this.LJIIIIZZ, "app_data_sei_mode");
        throw null;
    }
}
