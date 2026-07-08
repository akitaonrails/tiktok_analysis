package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageFeatureProducer;

/* JADX INFO: renamed from: X.1C20, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C20 extends Message.Builder<CaiStrategyPackageFeatureProducer.Feature, C1C20> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategyPackageFeatureProducer.Feature build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiStrategyPackageFeatureProducer.Feature(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "feature_key");
        throw null;
    }
}
