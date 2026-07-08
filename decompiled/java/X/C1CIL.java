package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CIL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIL extends Message.Builder<C1CIJ, C1CIL> {
    public Boolean LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CIJ build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null) {
            return new C1CIJ(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "enable_multi_guest_moderator", this.LJ, "log_provider");
        throw null;
    }
}
