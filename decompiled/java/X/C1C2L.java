package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C2L, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C2L extends Message.Builder<C1C2J, C1C2L> {
    public List<String> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C2J build() {
        return new C1C2J(this.LIZLLL, buildUnknownFields());
    }
}
