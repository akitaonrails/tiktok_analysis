package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Crt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243751Crt extends Message.Builder<C2243651Crj, C2243751Crt> {
    public List<C2243641Cri> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243651Crj build() {
        return new C2243651Crj(this.LIZLLL, buildUnknownFields());
    }
}
