package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEliminationStrategy;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEvent;
import java.util.List;

/* JADX INFO: renamed from: X.0paG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517180paG extends Message.Builder<CaiFeatureTTMEvent, C1517180paG> {
    public String LIZLLL;
    public List<CaiFeatureTTMEvent.relativeField> LJ = C1516540pZE.LJIIIIZZ();
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public Boolean LJIIIZ;
    public CaiFeatureTTMEliminationStrategy LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureTTMEvent build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiFeatureTTMEvent(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "event_name");
        throw null;
    }
}
