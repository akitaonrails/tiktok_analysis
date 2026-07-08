package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CO0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CO0 extends Message.Builder<C2229531CNz, C1CO0> {
    public List<C1CM2> LIZLLL = C1516540pZE.LJIIIIZZ();
    public C1D0V LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229531CNz build() {
        C1D0V c1d0v = this.LJ;
        if (c1d0v != null) {
            return new C2229531CNz(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1d0v, "biz_sei_config");
        throw null;
    }
}
