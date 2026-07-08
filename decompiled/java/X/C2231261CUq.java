package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231261CUq extends Message.Builder<C2231241CUo, C2231261CUq> {
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();
    public C1CV7 LJ;
    public C2231461CVk LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231241CUo build() {
        C1CV7 c1cv7 = this.LJ;
        if (c1cv7 != null) {
            return new C2231241CUo(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cv7, "source");
        throw null;
    }
}
