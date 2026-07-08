package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229221CMu extends Message.Builder<C2229201CMs, C2229221CMu> {
    public EnumC2229231CMv LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229201CMs build() {
        EnumC2229231CMv enumC2229231CMv = this.LIZLLL;
        if (enumC2229231CMv != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C2229201CMs(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2229231CMv, "codec", this.LJ, "stream_audio_channels", this.LJFF, "stream_audio_sample_rate", this.LJI, "stream_audio_bitrate", this.LJII, "stream_audio_aac_profile");
        throw null;
    }
}
