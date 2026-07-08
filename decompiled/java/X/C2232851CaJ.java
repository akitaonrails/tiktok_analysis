package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232851CaJ extends Message.Builder<C2232831CaH, C2232851CaJ> {
    public Boolean LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public Boolean LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232831CaH build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C2232831CaH(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "remote_joined", this.LJ, "remote_audio_data", this.LJFF, "remote_video_data", this.LJI, "first_frame_render", this.LJII, "remote_leaved", this.LJIIIIZZ, "desc");
        throw null;
    }
}
