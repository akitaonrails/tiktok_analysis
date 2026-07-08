package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CO3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CO3 extends Message.Builder<C1CO1, C1CO3> {
    public List<C1CM2> LIZLLL = C1516540pZE.LJIIIIZZ();
    public C1D0T LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CO1 build() {
        C1D0T c1d0t = this.LJ;
        if (c1d0t != null) {
            return new C1CO1(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1d0t, "biz_sei_config");
        throw null;
    }
}
