package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243401CrK extends Message.Builder<C2243331CrD, C2243401CrK> {
    public C2243521CrW LIZLLL;
    public List<C2243521CrW> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243331CrD build() {
        return new C2243331CrD(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
