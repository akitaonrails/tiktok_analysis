package X;

import com.squareup.wire.Message;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncParamsXb0a419649fe6caae;

/* JADX INFO: renamed from: X.1CCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226481CCg extends Message.Builder<FuncParamsXb0a419649fe6caae, C2226481CCg> {
    public ByteString LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FuncParamsXb0a419649fe6caae build() {
        ByteString byteString = this.LIZLLL;
        if (byteString != null) {
            return new FuncParamsXb0a419649fe6caae(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(byteString, "request_body");
        throw null;
    }
}
