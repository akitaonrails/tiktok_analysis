package X;

import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232551CZp extends Message.Builder<C2232531CZn, C2232551CZp> {
    public String LIZLLL;
    public Double LJ;
    public Double LJFF;
    public Double LJI;
    public Double LJII;
    public Long LJIIIIZZ;
    public Double LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public C1CW4 LJIIL;
    public C2233181Caq LJIILIIL;
    public String LJIILJJIL;
    public Long LJIILL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232531CZn build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIILIIL != null && this.LJIILL != null) {
            return new C2232531CZn(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, FollowStatusChangeMethod.PARAM_UID, this.LJ, "left", this.LJFF, "top", this.LJI, "right", this.LJII, "bottom", this.LJIIIIZZ, "z_order", this.LJIIIZ, "radius", this.LJIIJ, "business_id", this.LJIIJJI, "config_id", this.LJIILIIL, "spot_extra", this.LJIILL, "spot_id");
        throw null;
    }
}
