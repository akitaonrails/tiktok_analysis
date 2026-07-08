package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMRule;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureResp;
import java.util.List;

/* JADX INFO: renamed from: X.0pZP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516650pZP extends Message.Builder<CaiFeatureResp.syncFeatureData, C1516650pZP> {
    public String LIZLLL;
    public Integer LJ;
    public CaiFeatureTTMRule LJFF;
    public String LJI;
    public List<String> LJII = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureResp.syncFeatureData build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiFeatureResp.syncFeatureData(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "name");
        throw null;
    }
}
