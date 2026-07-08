package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D9S, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9S extends Message.Builder<C1D9R, C1D9S> {
    public Integer LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1D9R build() {
        return new C1D9R(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
