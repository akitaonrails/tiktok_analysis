package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEliminationStrategy;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEvent;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMRule;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMTable;
import java.util.List;

/* JADX INFO: renamed from: X.0paI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517200paI extends Message.Builder<CaiFeatureTTMRule, C1517200paI> {
    public String LIZLLL;
    public CaiFeatureTTMEliminationStrategy LJ;
    public String LJI;
    public Integer LJII;
    public CaiFeatureTTMTable LJIIIIZZ;
    public Long LJIIJ;
    public String LJIIJJI;
    public Boolean LJIIL;
    public Boolean LJIILIIL;
    public List<CaiFeatureTTMEvent> LJFF = C1516540pZE.LJIIIIZZ();
    public List<CaiEventStream> LJIIIZ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureTTMRule build() {
        return new CaiFeatureTTMRule(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, buildUnknownFields());
    }
}
