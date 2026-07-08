package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D9V, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9V extends Message.Builder<C1D9U, C1D9V> {
    public Integer LIZLLL;
    public Integer LJ;
    public C1D9R LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1D9U build() {
        return new C1D9U(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
