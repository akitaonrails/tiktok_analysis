package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Ca4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232701Ca4 extends Message.Builder<C2232681Ca2, C2232701Ca4> {
    public C2232561CZq LIZLLL;
    public C2232561CZq LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232681Ca2 build() {
        C2232561CZq c2232561CZq = this.LIZLLL;
        if (c2232561CZq != null && this.LJ != null) {
            return new C2232681Ca2(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232561CZq, "player_frame", this.LJ, "layout_container_frame");
        throw null;
    }
}
