package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionStoreValueToFeatureCenter;

/* JADX INFO: renamed from: X.1Bzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223131Bzj extends Message.Builder<CaiActionStoreValueToFeatureCenter, C2223131Bzj> {
    public Integer LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiActionStoreValueToFeatureCenter build() {
        Integer num = this.LIZLLL;
        if (num != null && this.LJ != null && this.LJFF != null) {
            return new CaiActionStoreValueToFeatureCenter(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "source_type", this.LJ, "producer_key", this.LJFF, "feature_key");
        throw null;
    }
}
