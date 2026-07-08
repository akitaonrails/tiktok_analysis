package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D9H, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9H extends Message.Builder<C1D9M, C1D9H> {
    public Integer LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1D9M build() {
        return new C1D9M(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
