package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiPackageFeature;

/* JADX INFO: renamed from: X.1Ci8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237701Ci8 extends Message.Builder<CaiPackageFeature, C2237701Ci8> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public Integer LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiPackageFeature build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new CaiPackageFeature(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "feature_key", this.LJ, "feature_name", this.LJFF, "producer_key", this.LJI, "producer_name", this.LJII, "source_type", this.LJIIIIZZ, "value_type");
        throw null;
    }
}
