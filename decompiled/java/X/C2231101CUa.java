package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231101CUa extends Message.Builder<C1CUY, C2231101CUa> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CUY build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CUY(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "link_mic_id", this.LJ, "source");
        throw null;
    }
}
