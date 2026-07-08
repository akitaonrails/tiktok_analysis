package X;

import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackage;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageFeatureProducer;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223781C1w extends Message.Builder<CaiStrategyPackage, C2223781C1w> {
    public String LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public String LJI;
    public Integer LJII;
    public ByteString LJIIIIZZ;
    public String LJIIIZ;
    public List<CaiStrategyPackageFeatureProducer> LJIIJ = C1516540pZE.LJIIIIZZ();
    public Integer LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategyPackage build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new CaiStrategyPackage(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, FollowStatusChangeMethod.PARAM_UID, this.LJ, "engine_type");
        throw null;
    }
}
