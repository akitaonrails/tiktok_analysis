package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageFeatureProducer;
import java.util.List;

/* JADX INFO: renamed from: X.1C1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223801C1y extends Message.Builder<CaiStrategyPackageFeatureProducer, C2223801C1y> {
    public Integer LIZLLL;
    public String LJ;
    public List<CaiStrategyPackageFeatureProducer.Feature> LJFF = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategyPackageFeatureProducer build() {
        Integer num = this.LIZLLL;
        if (num != null && this.LJ != null) {
            return new CaiStrategyPackageFeatureProducer(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "source_type", this.LJ, "group_key");
        throw null;
    }
}
