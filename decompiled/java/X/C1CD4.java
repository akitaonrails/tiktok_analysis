package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CD4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CD4 extends Message.Builder<C1CD2, C1CD4> {
    public String LIZLLL;
    public Double LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CD2 build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CD2(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "info", this.LJ, "ratio");
        throw null;
    }
}
