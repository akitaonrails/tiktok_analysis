package X;

import com.squareup.wire.Message;
import tt_c2pa_sdk.proto.TtC2paResult;

/* JADX INFO: renamed from: X.1CI5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CI5 extends Message.Builder<TtC2paResult, C1CI5> {
    public Long LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final TtC2paResult build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new TtC2paResult(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "error_code", this.LJ, "error_desc", this.LJFF, "result_json");
        throw null;
    }
}
