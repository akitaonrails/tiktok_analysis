package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DB6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DB6 extends Message.Builder<C1DB5, C1DB6> {
    public Integer LIZLLL;
    public Double LJ;
    public Double LJFF;
    public Double LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1DB5 build() {
        return new C1DB5(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
