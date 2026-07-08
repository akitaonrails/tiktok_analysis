package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CVJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVJ extends Message.Builder<C1CVI, C1CVJ> {
    public Boolean LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public Boolean LJII;
    public C1CW2 LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CVI build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C1CVI(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "is_joining_or_joined_rtc", this.LJ, "had_start_interactive", this.LJFF, "had_setup_live_core", this.LJI, "will_start_join_channel", this.LJII, "is_local_float_layout", this.LJIIIIZZ, "finish_link_mic_reason");
        throw null;
    }
}
