package X;

import com.squareup.wire.Message;
import okio.ByteString;
import tt_c2pa_sdk.proto.TtC2paNetworkResponse;

/* JADX INFO: renamed from: X.1CI1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CI1 extends Message.Builder<TtC2paNetworkResponse, C1CI1> {
    public Long LIZLLL;
    public String LJ;
    public String LJFF;
    public ByteString LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final TtC2paNetworkResponse build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new TtC2paNetworkResponse(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "http_status", this.LJ, "error_message", this.LJFF, "content_type", this.LJI, "body");
        throw null;
    }
}
