package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231601CVy extends Message.Builder<C2231581CVw, C2231601CVy> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public String LJI;
    public List<Long> LJII = C1516540pZE.LJIIIIZZ();
    public C1CW2 LJIIIIZZ;
    public C1CW0 LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231581CVw build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJIIIIZZ != null && this.LJIIIZ != null) {
            return new C2231581CVw(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "channel_id", this.LJ, "group_channel_id", this.LJFF, "rtc_room_id", this.LJI, "self_link_mic_id", this.LJIIIIZZ, "finish_link_mic_reason", this.LJIIIZ, "linker_mode");
        throw null;
    }
}
