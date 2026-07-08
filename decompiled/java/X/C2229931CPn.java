package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229931CPn extends Message.Builder<C2229911CPl, C2229931CPn> {
    public C1CQM LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229911CPl build() {
        C1CQM c1cqm = this.LIZLLL;
        if (c1cqm != null) {
            return new C2229911CPl(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cqm, "ret");
        throw null;
    }
}
