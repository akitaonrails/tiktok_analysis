package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNA extends Message.Builder<C1CN8, C1CNA> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CN8 build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C1CN8(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "width", this.LJ, "height", this.LJFF, "bitrate");
        throw null;
    }
}
