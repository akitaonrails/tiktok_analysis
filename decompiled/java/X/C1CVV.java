package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CVV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVV extends Message.Builder<C1CVT, C1CVV> {
    public Long LIZLLL;
    public C1CW6 LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CVT build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C1CVT(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "change_state_type", this.LJ, "state_model");
        throw null;
    }
}
