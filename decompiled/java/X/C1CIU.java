package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CIU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIU extends Message.Builder<C1CIS, C1CIU> {
    public C1CIG LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CIS build() {
        C1CIG c1cig = this.LIZLLL;
        if (c1cig != null) {
            return new C1CIS(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cig, "provider");
        throw null;
    }
}
