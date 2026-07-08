package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEliminationStrategy;

/* JADX INFO: renamed from: X.0pZR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516670pZR extends Message.Builder<CaiFeatureTTMEliminationStrategy, C1516670pZR> {
    public Integer LIZLLL;
    public Integer LJ;
    public String LJFF;
    public Boolean LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureTTMEliminationStrategy build() {
        return new CaiFeatureTTMEliminationStrategy(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
