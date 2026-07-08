package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CBH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBH extends Message.Builder<C1CBF, C1CBH> {
    public List<C1CB9> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CBF build() {
        return new C1CBF(this.LIZLLL, buildUnknownFields());
    }
}
