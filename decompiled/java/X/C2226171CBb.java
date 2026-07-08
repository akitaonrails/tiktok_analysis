package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226171CBb extends Message.Builder<C1CBZ, C2226171CBb> {
    public List<C2226181CBc> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CBZ build() {
        return new C1CBZ(this.LIZLLL, buildUnknownFields());
    }
}
