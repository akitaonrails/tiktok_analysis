package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQ5 extends Message.Builder<C1CQ3, C1CQ5> {
    public C1CQC LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQ3 build() {
        C1CQC c1cqc = this.LIZLLL;
        if (c1cqc != null) {
            return new C1CQ3(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cqc, "ret");
        throw null;
    }
}
