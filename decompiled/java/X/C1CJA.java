package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJA extends Message.Builder<C1CJ8, C1CJA> {
    public Long LIZLLL;
    public Long LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CJ8 build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C1CJ8(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "uid", this.LJ, "timestamp");
        throw null;
    }
}
