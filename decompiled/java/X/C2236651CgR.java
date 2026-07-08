package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236651CgR extends Message.Builder<C2236631CgP, C2236651CgR> {
    public String LIZLLL;
    public C1CEH LJ;
    public Boolean LJFF;
    public EnumC2232081CXu LJI;
    public EnumC2231981CXk LJII;
    public Long LJIIIIZZ;
    public C2236721CgY LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236631CgP build() {
        String str = this.LIZLLL;
        if (str != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null) {
            return new C2236631CgP(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJFF, "check_perception_center", this.LJI, "apply_intent", this.LJII, "reply_status", this.LJIIIIZZ, "version", this.LJIIIZ, "biz_param");
        throw null;
    }
}
