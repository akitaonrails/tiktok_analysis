package X;

import com.squareup.wire.Message;
import tt_c2pa_sdk.proto.FuncReturnX810b7d3a34ee8ade;
import tt_c2pa_sdk.proto.TtC2paResult;

/* JADX INFO: renamed from: X.1CI3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CI3 extends Message.Builder<FuncReturnX810b7d3a34ee8ade, C1CI3> {
    public TtC2paResult LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FuncReturnX810b7d3a34ee8ade build() {
        TtC2paResult ttC2paResult = this.LIZLLL;
        if (ttC2paResult != null) {
            return new FuncReturnX810b7d3a34ee8ade(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(ttC2paResult, "ret");
        throw null;
    }
}
