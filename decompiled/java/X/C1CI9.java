package X;

import com.squareup.wire.Message;
import tt_c2pa_sdk.proto.TtC2paCheckCertResult;

/* JADX INFO: renamed from: X.1CI9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CI9 extends Message.Builder<TtC2paCheckCertResult, C1CI9> {
    public Long LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final TtC2paCheckCertResult build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new TtC2paCheckCertResult(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "cert_count", this.LJ, "error_message");
        throw null;
    }
}
