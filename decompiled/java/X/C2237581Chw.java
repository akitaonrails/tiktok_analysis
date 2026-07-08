package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiScene;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategy;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;
import java.util.List;

/* JADX INFO: renamed from: X.1Chw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237581Chw extends Message.Builder<CaiScene, C2237581Chw> {
    public String LIZLLL;
    public Boolean LJFF;
    public Long LJIIJJI;
    public Long LJIIL;
    public CaiManager LJIILJJIL;
    public List<CaiStrategy> LJ = C1516540pZE.LJIIIIZZ();
    public List<CaiEventStream> LJI = C1516540pZE.LJIIIIZZ();
    public List<String> LJII = C1516540pZE.LJIIIIZZ();
    public List<CaiEventStream> LJIIIIZZ = C1516540pZE.LJIIIIZZ();
    public List<CaiEventStream> LJIIIZ = C1516540pZE.LJIIIIZZ();
    public List<CaiAppVersion> LJIIJ = C1516540pZE.LJIIIIZZ();
    public List<CaiTag> LJIILIIL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiScene build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new CaiScene(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "key");
        throw null;
    }
}
