package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategy;
import java.util.List;

/* JADX INFO: renamed from: X.1C0B, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C0B extends Message.Builder<CaiStrategy, C1C0B> {
    public String LIZLLL;
    public String LJ;
    public String LJI;
    public Integer LJIIIIZZ;
    public List<CaiEventStream> LJFF = C1516540pZE.LJIIIIZZ();
    public List<CaiAction> LJII = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategy build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new CaiStrategy(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "key", this.LJ, "strategy_package");
        throw null;
    }
}
