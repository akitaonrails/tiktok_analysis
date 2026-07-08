package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CFN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFN extends Message.Builder<C1CFL, C1CFN> {
    public Long LIZLLL;
    public Boolean LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CFL build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C1CFL(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "channel_id", this.LJ, "is_pre_join");
        throw null;
    }
}
