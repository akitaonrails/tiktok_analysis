package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236381Cg0 extends Message.Builder<C2236361Cfy, C2236381Cg0> {
    public C2236391Cg1 LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236361Cfy build() {
        C2236391Cg1 c2236391Cg1 = this.LIZLLL;
        if (c2236391Cg1 != null && this.LJ != null) {
            return new C2236361Cfy(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2236391Cg1, "param", this.LJ, "callback");
        throw null;
    }
}
