package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageBind;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;
import java.util.List;

/* JADX INFO: renamed from: X.1CiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237741CiC extends Message.Builder<CaiStrategyVersion, C2237741CiC> {
    public String LIZLLL;
    public Integer LJ;
    public String LJFF;
    public Integer LJI;
    public Integer LJIIIIZZ;
    public Integer LJIIJ;
    public Integer LJIIJJI;
    public Integer LJIIL;
    public String LJIILL;
    public String LJIILLIIL;
    public Boolean LJIJI;
    public Boolean LJIJJ;
    public Long LJIJJLI;
    public Long LJIL;
    public CaiManager LJJI;
    public List<CaiStrategyPackageBind> LJII = C1516540pZE.LJIIIIZZ();
    public List<String> LJIIIZ = C1516540pZE.LJIIIIZZ();
    public List<String> LJIILIIL = C1516540pZE.LJIIIIZZ();
    public List<String> LJIILJJIL = C1516540pZE.LJIIIIZZ();
    public List<CaiEventStream> LJIIZILJ = C1516540pZE.LJIIIIZZ();
    public List<CaiEventStream> LJIJ = C1516540pZE.LJIIIIZZ();
    public List<CaiTag> LJJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategyVersion build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJI != null) {
            return new CaiStrategyVersion(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, this.LJJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "key", this.LJ, "version", this.LJI, "type");
        throw null;
    }
}
