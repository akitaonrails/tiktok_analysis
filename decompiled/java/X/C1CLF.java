package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLF extends Message.Builder<C1CLD, C1CLF> {
    public C1CZR LIZLLL;
    public Double LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CLD build() {
        C1CZR c1czr = this.LIZLLL;
        if (c1czr != null && this.LJ != null) {
            return new C1CLD(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1czr, "config", this.LJ, "ratio");
        throw null;
    }
}
