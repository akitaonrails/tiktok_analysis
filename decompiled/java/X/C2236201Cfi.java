package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236201Cfi extends Message.Builder<C2236181Cfg, C2236201Cfi> {
    public C2236661CgS LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236181Cfg build() {
        C2236661CgS c2236661CgS = this.LIZLLL;
        if (c2236661CgS != null && this.LJ != null) {
            return new C2236181Cfg(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2236661CgS, "param", this.LJ, "callback");
        throw null;
    }
}
