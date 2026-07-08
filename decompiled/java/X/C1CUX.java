package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CUX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CUX extends Message.Builder<C1CUV, C1CUX> {
    public String LIZLLL;
    public List<String> LJ = C1516540pZE.LJIIIIZZ();
    public Integer LJFF;
    public Integer LJI;
    public Integer LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CUV build() {
        return new C1CUV(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
