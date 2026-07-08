package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_all_request;

/* JADX INFO: renamed from: X.1CFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227431CFx extends Message.Builder<cai_sync_all_request, C2227431CFx> {
    public CaiStrategyReq LIZLLL;
    public CaiFeatureReq LJ;
    public CaiValueReq LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final cai_sync_all_request build() {
        CaiStrategyReq caiStrategyReq = this.LIZLLL;
        if (caiStrategyReq != null && this.LJ != null && this.LJFF != null) {
            return new cai_sync_all_request(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(caiStrategyReq, "strategy_req", this.LJ, "feature_req", this.LJFF, "value_req");
        throw null;
    }
}
