package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236471Cg9 extends Message.Builder<C2236451Cg7, C2236471Cg9> {
    public C2236511CgD LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236451Cg7 build() {
        C2236511CgD c2236511CgD = this.LIZLLL;
        if (c2236511CgD != null && this.LJ != null) {
            return new C2236451Cg7(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2236511CgD, "param", this.LJ, "callback");
        throw null;
    }
}
