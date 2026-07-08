package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229191CMr extends Message.Builder<C2229171CMp, C2229191CMr> {
    public Boolean LIZLLL;
    public String LJ;
    public C1CN5 LJFF;
    public C2229201CMs LJI;
    public C1CJK LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229171CMp build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2229171CMp(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "should_sync_independent_config", this.LJ, "server_mix_task_id", this.LJFF, "mix_video_stream_config", this.LJI, "mix_audio_stream_config");
        throw null;
    }
}
