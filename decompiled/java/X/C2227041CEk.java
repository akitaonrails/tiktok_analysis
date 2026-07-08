package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_strategy_response;

/* JADX INFO: renamed from: X.1CEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227041CEk extends Message.Builder<cai_sync_strategy_response, C2227041CEk> {
    public CaiBaseResp LIZLLL;
    public CaiStrategyResp LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final cai_sync_strategy_response build() {
        CaiBaseResp caiBaseResp = this.LIZLLL;
        if (caiBaseResp != null && this.LJ != null) {
            return new cai_sync_strategy_response(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(caiBaseResp, "base_resp", this.LJ, "strategy_resp");
        throw null;
    }
}
