package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228101CIm extends Message.Builder<C2228081CIk, C2228101CIm> {
    public C2227501CGe LIZLLL;
    public String LJ;
    public ByteString LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228081CIk build() {
        C2227501CGe c2227501CGe = this.LIZLLL;
        if (c2227501CGe != null) {
            return new C2228081CIk(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(c2227501CGe, "param");
        throw null;
    }
}
