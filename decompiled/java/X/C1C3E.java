package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiConsoleBaseReq;

/* JADX INFO: renamed from: X.1C3E, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3E extends Message.Builder<CaiConsoleBaseReq, C1C3E> {
    public Long LIZLLL;
    public Integer LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiConsoleBaseReq build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new CaiConsoleBaseReq(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "app_id", this.LJ, "app_platform", this.LJFF, "operator");
        throw null;
    }
}
