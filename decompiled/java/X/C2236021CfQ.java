package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236021CfQ extends Message.Builder<C2236001CfO, C2236021CfQ> {
    public Long LIZLLL;
    public Long LJ;
    public String LJFF;
    public C1CNZ LJI;
    public Long LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236001CfO build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C2236001CfO(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "reply_status", this.LJ, "source_type", this.LJFF, "algo_request_id", this.LJI, "stream_config", this.LJII, "matched_preference_tag");
        throw null;
    }
}
