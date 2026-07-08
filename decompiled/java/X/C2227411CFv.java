package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_strategy_request;

/* JADX INFO: renamed from: X.1CFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227411CFv extends Message.Builder<cai_sync_strategy_request, C2227411CFv> {
    public CaiStrategyReq LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final cai_sync_strategy_request build() {
        CaiStrategyReq caiStrategyReq = this.LIZLLL;
        if (caiStrategyReq != null) {
            return new cai_sync_strategy_request(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(caiStrategyReq, "strategy_req");
        throw null;
    }
}
