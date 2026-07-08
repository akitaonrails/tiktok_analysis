package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226741CDg extends Message.Builder<C2226721CDe, C2226741CDg> {
    public Boolean LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226721CDe build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null) {
            return new C2226721CDe(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "is_video_mute", this.LJ, "link_mic_id");
        throw null;
    }
}
