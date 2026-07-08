package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C3N, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3N extends Message.Builder<C1C3L, C1C3N> {
    public List<C1C3O> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C3L build() {
        return new C1C3L(this.LIZLLL, buildUnknownFields());
    }
}
