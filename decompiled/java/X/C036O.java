package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.036O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C036O extends Message.Builder<C036N, C036O> {
    public final C1504900pGS LIZLLL = C1516540pZE.LJIIIIZZ();
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C036N build() {
        return new C036N(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
