package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyReq;

/* JADX INFO: renamed from: X.1CFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227391CFt extends Message.Builder<CaiStrategyReq, C2227391CFt> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategyReq build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiStrategyReq(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "cookie");
        throw null;
    }
}
