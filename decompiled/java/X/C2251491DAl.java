package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1DAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251491DAl extends Message.Builder<C2251481DAk, C2251491DAl> {
    public List<C1DCT> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2251481DAk build() {
        return new C2251481DAk(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
