package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236051CfT extends Message.Builder<C2236031CfR, C2236051CfT> {
    public Long LIZLLL;
    public Boolean LJ;
    public Long LJFF;
    public String LJI;
    public Boolean LJII;
    public String LJIIIIZZ;
    public C1CNZ LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236031CfR build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null) {
            return new C2236031CfR(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "source_type", this.LJ, "check_perception_center", this.LJFF, "tag_type", this.LJI, "tag_value", this.LJII, "need_withdraw", this.LJIIIIZZ, "algo_request_id", this.LJIIIZ, "stream_config");
        throw null;
    }
}
