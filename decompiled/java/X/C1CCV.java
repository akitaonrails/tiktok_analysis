package X;

import com.squareup.wire.Message;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncParamsXa4a5c3f29571f109;

/* JADX INFO: renamed from: X.1CCV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CCV extends Message.Builder<FuncParamsXa4a5c3f29571f109, C1CCV> {
    public ByteString LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FuncParamsXa4a5c3f29571f109 build() {
        ByteString byteString = this.LIZLLL;
        if (byteString != null) {
            return new FuncParamsXa4a5c3f29571f109(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(byteString, "signcert");
        throw null;
    }
}
