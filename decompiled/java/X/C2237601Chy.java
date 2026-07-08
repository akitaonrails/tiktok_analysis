package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyMeta;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;
import java.util.List;

/* JADX INFO: renamed from: X.1Chy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237601Chy extends Message.Builder<CaiStrategyMeta, C2237601Chy> {
    public String LIZLLL;
    public Long LJI;
    public Long LJII;
    public CaiManager LJIIIZ;
    public List<String> LJ = C1516540pZE.LJIIIIZZ();
    public List<String> LJFF = C1516540pZE.LJIIIIZZ();
    public List<CaiTag> LJIIIIZZ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategyMeta build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiStrategyMeta(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "key");
        throw null;
    }
}
