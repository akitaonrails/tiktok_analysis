package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228011CId extends Message.Builder<C2228001CIc, C2228011CId> {
    public C2227561CGk LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228001CIc build() {
        C2227561CGk c2227561CGk = this.LIZLLL;
        if (c2227561CGk != null) {
            return new C2228001CIc(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2227561CGk, "param");
        throw null;
    }
}
