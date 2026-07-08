package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236441Cg6 extends Message.Builder<C2236421Cg4, C2236441Cg6> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236421Cg4 build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2236421Cg4(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "link_type", this.LJ, "is_turn_off_invitation");
        throw null;
    }
}
