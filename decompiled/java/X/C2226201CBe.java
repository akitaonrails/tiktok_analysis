package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226201CBe extends Message.Builder<C2226181CBc, C2226201CBe> {
    public String LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226181CBc build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2226181CBc(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "link_mic_id", this.LJ, "position");
        throw null;
    }
}
