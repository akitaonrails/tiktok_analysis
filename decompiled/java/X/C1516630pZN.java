package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureResp;
import java.util.List;

/* JADX INFO: renamed from: X.0pZN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516630pZN extends Message.Builder<CaiFeatureResp.syncGroupFeatureData, C1516630pZN> {
    public String LIZLLL;
    public List<CaiFeatureResp.syncFeatureData> LJ = C1516540pZE.LJIIIIZZ();
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureResp.syncGroupFeatureData build() {
        String str = this.LIZLLL;
        if (str != null && this.LJFF != null) {
            return new CaiFeatureResp.syncGroupFeatureData(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "group", this.LJFF, "source_type");
        throw null;
    }
}
