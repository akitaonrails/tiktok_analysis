package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241241Cnq extends Message.Builder<C2241211Cnn, C2241241Cnq> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241211Cnn build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2241211Cnn(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "code", this.LJ, "message");
        throw null;
    }
}
