package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeature;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import java.util.List;

/* JADX INFO: renamed from: X.1Ci6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237681Ci6 extends Message.Builder<CaiFeature, C2237681Ci6> {
    public String LIZLLL;
    public String LJ;
    public Integer LJFF;
    public String LJI;
    public String LJII;
    public List<CaiAppVersion> LJIIIIZZ = C1516540pZE.LJIIIIZZ();
    public CaiManager LJIIIZ;
    public Long LJIIJ;
    public Long LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeature build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIJ != null && this.LJIIJJI != null) {
            return new CaiFeature(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "feature_key", this.LJ, "feature_name", this.LJFF, "type", this.LJI, "producer_key", this.LJII, "value_type", this.LJIIJ, "created_timestamp", this.LJIIJJI, "updated_timestamp");
        throw null;
    }
}
