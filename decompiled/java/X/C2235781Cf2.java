package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235781Cf2 extends Message.Builder<C2235761Cf0, C2235781Cf2> {
    public C2235791Cf3 LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235761Cf0 build() {
        C2235791Cf3 c2235791Cf3 = this.LIZLLL;
        if (c2235791Cf3 != null) {
            return new C2235761Cf0(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2235791Cf3, "param");
        throw null;
    }
}
