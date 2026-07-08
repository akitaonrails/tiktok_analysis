package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CWV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CWV extends Message.Builder<C1CWT, C1CWV> {
    public C1CW4 LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;
    public Long LJI;
    public Boolean LJII;
    public Boolean LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CWT build() {
        C1CW4 c1cw4 = this.LIZLLL;
        if (c1cw4 != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C1CWT(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cw4, "identity", this.LJ, "audio_mute", this.LJFF, "video_mute", this.LJI, "online_user_state", this.LJII, "win_state", this.LJIIIIZZ, "audio_occupied");
        throw null;
    }
}
