package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_all_response;

/* JADX INFO: renamed from: X.1CEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227021CEi extends Message.Builder<cai_sync_all_response, C2227021CEi> {
    public CaiBaseResp LIZLLL;
    public CaiStrategyResp LJ;
    public CaiFeatureResp LJFF;
    public CaiValueResp LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final cai_sync_all_response build() {
        CaiBaseResp caiBaseResp = this.LIZLLL;
        if (caiBaseResp != null) {
            return new cai_sync_all_response(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(caiBaseResp, "base_resp");
        throw null;
    }
}
