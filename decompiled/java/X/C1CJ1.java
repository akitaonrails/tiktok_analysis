package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJ1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJ1 extends Message.Builder<C2228231CIz, C1CJ1> {
    public Long LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228231CIz build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2228231CIz(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "uid", this.LJ, "link_mic_id");
        throw null;
    }
}
