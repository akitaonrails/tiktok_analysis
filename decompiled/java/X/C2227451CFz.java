package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_feature_request;

/* JADX INFO: renamed from: X.1CFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227451CFz extends Message.Builder<cai_sync_feature_request, C2227451CFz> {
    public CaiFeatureReq LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final cai_sync_feature_request build() {
        CaiFeatureReq caiFeatureReq = this.LIZLLL;
        if (caiFeatureReq != null) {
            return new cai_sync_feature_request(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(caiFeatureReq, "feature_req");
        throw null;
    }
}
