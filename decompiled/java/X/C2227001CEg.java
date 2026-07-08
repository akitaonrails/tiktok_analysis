package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp;

/* JADX INFO: renamed from: X.1CEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227001CEg extends Message.Builder<CaiBaseResp, C2227001CEg> {
    public Integer LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiBaseResp build() {
        Integer num = this.LIZLLL;
        if (num != null && this.LJ != null) {
            return new CaiBaseResp(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "status_code", this.LJ, "status_msg");
        throw null;
    }
}
