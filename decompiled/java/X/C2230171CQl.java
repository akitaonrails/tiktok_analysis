package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230171CQl extends Message.Builder<C2230151CQj, C2230171CQl> {
    public String LIZLLL;
    public List<C2230191CQn> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230151CQj build() {
        return new C2230151CQj(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
