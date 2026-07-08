package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1COp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229691COp extends Message.Builder<C2229671COn, C2229691COp> {
    public Double LIZLLL;
    public Double LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229671COn build() {
        Double d = this.LIZLLL;
        if (d != null && this.LJ != null) {
            return new C2229671COn(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(d, "width", this.LJ, "height");
        throw null;
    }
}
