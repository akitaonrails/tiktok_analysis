package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureResp;
import java.util.List;

/* JADX INFO: renamed from: X.0pZL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516610pZL extends Message.Builder<CaiFeatureResp, C1516610pZL> {
    public List<CaiFeatureResp.syncGroupFeatureData> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Integer LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureResp build() {
        return new CaiFeatureResp(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
