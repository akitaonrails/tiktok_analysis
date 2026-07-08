package X;

import com.squareup.wire.Message;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncParamsX111419d20c7a3f6d;
import tt_c2pa_sdk.proto.MoltenFfiInstanceMsg;

/* JADX INFO: renamed from: X.1CID, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CID extends Message.Builder<FuncParamsX111419d20c7a3f6d, C1CID> {
    public String LIZLLL;
    public ByteString LJ;
    public String LJFF;
    public String LJI;
    public Long LJII;
    public Boolean LJIIIIZZ;
    public MoltenFfiInstanceMsg LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FuncParamsX111419d20c7a3f6d build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null) {
            return new FuncParamsX111419d20c7a3f6d(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "manifest_json", this.LJ, "signcert", this.LJFF, "cert_fingerprint", this.LJI, "tsa_url", this.LJII, "tsa_timeout_ms", this.LJIIIIZZ, "write_directly", this.LJIIIZ, "network_caller");
        throw null;
    }
}
