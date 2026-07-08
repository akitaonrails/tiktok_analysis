package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1D9J, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9J extends Message.Builder<C1D9K, C1D9J> {
    public Boolean LIZLLL;
    public List<C1D9L> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1D9K build() {
        return new C1D9K(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
