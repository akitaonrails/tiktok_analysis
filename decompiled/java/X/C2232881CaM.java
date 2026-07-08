package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CaM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232881CaM extends Message.Builder<C2232861CaK, C2232881CaM> {
    public Boolean LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public Boolean LJII;
    public Boolean LJIIIIZZ;
    public Boolean LJIIIZ;
    public Boolean LJIIJ;
    public String LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232861CaK build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIJJI != null) {
            return new C2232861CaK(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "joining_rtc", this.LJ, "joined_rtc", this.LJFF, "push_stream", this.LJI, "forward_stream", this.LJII, "mix_stream", this.LJIIIIZZ, "rtc_error", this.LJIIIZ, "rtc_lost", this.LJIIJ, "forward_stream_error", this.LJIIJJI, "desc");
        throw null;
    }
}
