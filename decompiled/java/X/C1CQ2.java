package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CQ2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQ2 extends Message.Builder<C1CQ0, C1CQ2> {
    public C1CQD LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQ0 build() {
        C1CQD c1cqd = this.LIZLLL;
        if (c1cqd != null) {
            return new C1CQ0(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cqd, "ret");
        throw null;
    }
}
