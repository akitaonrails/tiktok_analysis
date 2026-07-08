package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D9I, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9I extends Message.Builder<C1D9L, C1D9I> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1D9L build() {
        return new C1D9L(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
