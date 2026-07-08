package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiPackageFeature;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiRawInput;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageMeta;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;
import java.util.List;

/* JADX INFO: renamed from: X.1Ci2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237641Ci2 extends Message.Builder<CaiStrategyPackageMeta, C2237641Ci2> {
    public String LIZLLL;
    public Integer LJ;
    public String LJFF;
    public Integer LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public Boolean LJIIL;
    public String LJIILIIL;
    public Integer LJIILJJIL;
    public CaiRawInput LJIILL;
    public Long LJIILLIIL;
    public Long LJIIZILJ;
    public CaiManager LJIJI;
    public List<CaiAppVersion> LJI = C1516540pZE.LJIIIIZZ();
    public List<CaiPackageFeature> LJIIJJI = C1516540pZE.LJIIIIZZ();
    public List<CaiTag> LJIJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiStrategyPackageMeta build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new CaiStrategyPackageMeta(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "key", this.LJ, "engine_type");
        throw null;
    }
}
