package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CBB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBB extends Message.Builder<C1CB9, C1CBB> {
    public Long LIZLLL;
    public String LJ;
    public String LJFF;
    public C1CXP LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CB9 build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C1CB9(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "position", this.LJ, "link_mic_id", this.LJFF, "content_id", this.LJI, "content_type");
        throw null;
    }
}
