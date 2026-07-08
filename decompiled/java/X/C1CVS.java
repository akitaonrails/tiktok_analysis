package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CVS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVS extends Message.Builder<C1CVQ, C1CVS> {
    public String LIZLLL;
    public List<C1CW4> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CVQ build() {
        return new C1CVQ(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
