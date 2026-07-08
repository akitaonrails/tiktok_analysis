package X;

import com.squareup.wire.Message;
import tt_c2pa_sdk.proto.FuncReturnXe4439ef9481e6022;
import tt_c2pa_sdk.proto.TtC2paCheckCertResult;

/* JADX INFO: renamed from: X.1CI7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CI7 extends Message.Builder<FuncReturnXe4439ef9481e6022, C1CI7> {
    public TtC2paCheckCertResult LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FuncReturnXe4439ef9481e6022 build() {
        TtC2paCheckCertResult ttC2paCheckCertResult = this.LIZLLL;
        if (ttC2paCheckCertResult != null) {
            return new FuncReturnXe4439ef9481e6022(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(ttC2paCheckCertResult, "ret");
        throw null;
    }
}
