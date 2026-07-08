package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229961CPq extends Message.Builder<C2229941CPo, C2229961CPq> {
    public C1CQM LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229941CPo build() {
        C1CQM c1cqm = this.LIZLLL;
        if (c1cqm != null) {
            return new C2229941CPo(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cqm, "state");
        throw null;
    }
}
