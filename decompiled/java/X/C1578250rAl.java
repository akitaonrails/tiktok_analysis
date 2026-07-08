package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0rAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578250rAl extends Message.Builder<C1578240rAk, C1578250rAl> {
    public List<C1578180rAe> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1578240rAk build() {
        return new C1578240rAk(this.LIZLLL, buildUnknownFields());
    }
}
