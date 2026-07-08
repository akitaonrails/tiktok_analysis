package X;

import com.squareup.wire.Message;
import tt_c2pa_sdk.proto.FuncReturnX0b7c3c1d607dee34;
import tt_c2pa_sdk.proto.TtC2paNetworkResponse;

/* JADX INFO: renamed from: X.1CHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227971CHz extends Message.Builder<FuncReturnX0b7c3c1d607dee34, C2227971CHz> {
    public TtC2paNetworkResponse LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FuncReturnX0b7c3c1d607dee34 build() {
        TtC2paNetworkResponse ttC2paNetworkResponse = this.LIZLLL;
        if (ttC2paNetworkResponse != null) {
            return new FuncReturnX0b7c3c1d607dee34(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(ttC2paNetworkResponse, "ret");
        throw null;
    }
}
