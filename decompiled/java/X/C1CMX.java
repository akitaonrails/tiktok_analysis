package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CMX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMX extends Message.Builder<C1CMV, C1CMX> {
    public Long LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CMV build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C1CMV(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "err_code", this.LJ, "err_msg", this.LJFF, "prompts", this.LJI, "alert", this.LJII, "extra");
        throw null;
    }
}
