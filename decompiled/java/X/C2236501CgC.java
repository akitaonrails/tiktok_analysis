package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236501CgC extends Message.Builder<C2236481CgA, C2236501CgC> {
    public C2236511CgD LIZLLL;
    public String LJ;
    public ByteString LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236481CgA build() {
        C2236511CgD c2236511CgD = this.LIZLLL;
        if (c2236511CgD != null) {
            return new C2236481CgA(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(c2236511CgD, "param");
        throw null;
    }
}
