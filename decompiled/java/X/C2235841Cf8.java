package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235841Cf8 extends Message.Builder<C2235821Cf6, C2235841Cf8> {
    public C2235851Cf9 LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235821Cf6 build() {
        C2235851Cf9 c2235851Cf9 = this.LIZLLL;
        if (c2235851Cf9 != null && this.LJ != null) {
            return new C2235821Cf6(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2235851Cf9, "param", this.LJ, "callback");
        throw null;
    }
}
