package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_value_request;

/* JADX INFO: renamed from: X.1CAH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CAH extends Message.Builder<cai_sync_value_request, C1CAH> {
    public CaiValueReq LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final cai_sync_value_request build() {
        CaiValueReq caiValueReq = this.LIZLLL;
        if (caiValueReq != null) {
            return new cai_sync_value_request(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(caiValueReq, "value_req");
        throw null;
    }
}
