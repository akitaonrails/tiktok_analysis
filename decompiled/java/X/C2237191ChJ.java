package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1ChJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237191ChJ extends Message.Builder<C2237171ChH, C2237191ChJ> {
    public Long LIZLLL;
    public Long LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237171ChH build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C2237171ChH(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "app_id", this.LJ, "live_id", this.LJFF, "channel");
        throw null;
    }
}
