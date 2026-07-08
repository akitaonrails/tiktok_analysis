package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233811Cbr extends Message.Builder<C2233791Cbp, C2233811Cbr> {
    public C1CSP LIZLLL;
    public C2230371CRf LJ;
    public EnumC2182351Ab3 LJFF;
    public Boolean LJI;
    public C2233611CbX LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233791Cbp build() {
        C1CSP c1csp = this.LIZLLL;
        if (c1csp != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C2233791Cbp(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(c1csp, "parent_container_info", this.LJ, "container_rect_config", this.LJFF, "layout_scene", this.LJI, "refresh_layout", this.LJII, "biz_source");
        throw null;
    }
}
