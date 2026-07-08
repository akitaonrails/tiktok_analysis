package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CP4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CP4 extends Message.Builder<C1CP2, C1CP4> {
    public C2229791COz LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CP2 build() {
        C2229791COz c2229791COz = this.LIZLLL;
        if (c2229791COz != null) {
            return new C1CP2(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2229791COz, "ret");
        throw null;
    }
}
