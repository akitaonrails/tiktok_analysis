package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CDU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDU extends Message.Builder<C1CDS, C1CDU> {
    public EnumC19363610pG LIZLLL;
    public List<C2240651Cmt> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CDS build() {
        return new C1CDS(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
