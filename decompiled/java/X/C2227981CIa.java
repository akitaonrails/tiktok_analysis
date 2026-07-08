package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227981CIa extends Message.Builder<C1CIY, C2227981CIa> {
    public Long LIZLLL;
    public Long LJ;
    public C1CIG LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CIY build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C1CIY(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "config", this.LJ, "channel_id", this.LJFF, "event_listener");
        throw null;
    }
}
