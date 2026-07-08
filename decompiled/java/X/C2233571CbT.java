package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233571CbT extends Message.Builder<C2233521CbO, C2233571CbT> {
    public C2233611CbX LIZLLL;
    public C2233581CbU LJ;
    public List<C2233171Cap> LJFF = C1516540pZE.LJIIIIZZ();
    public List<C1CW4> LJI = C1516540pZE.LJIIIIZZ();
    public List<Long> LJII = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233521CbO build() {
        C2233611CbX c2233611CbX = this.LIZLLL;
        if (c2233611CbX != null) {
            return new C2233521CbO(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(c2233611CbX, "biz_source");
        throw null;
    }
}
