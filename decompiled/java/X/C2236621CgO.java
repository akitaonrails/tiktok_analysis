package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236621CgO extends Message.Builder<C2236601CgM, C2236621CgO> {
    public C2236631CgP LIZLLL;
    public String LJ;
    public ByteString LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236601CgM build() {
        C2236631CgP c2236631CgP = this.LIZLLL;
        if (c2236631CgP != null) {
            return new C2236601CgM(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(c2236631CgP, "param");
        throw null;
    }
}
