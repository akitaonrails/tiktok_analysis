package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureItem;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMRule;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTemplateItem;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;
import java.util.List;

/* JADX INFO: renamed from: X.1CiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237801CiI extends Message.Builder<CaiFeatureItem, C2237801CiI> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public Integer LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public Integer LJIILJJIL;
    public Integer LJIILLIIL;
    public String LJIIZILJ;
    public Integer LJIJ;
    public CaiFeatureTTMRule LJIJI;
    public Integer LJIJJ;
    public Integer LJIJJLI;
    public String LJIL;
    public String LJJ;
    public Long LJJIFFI;
    public Long LJJII;
    public CaiManager LJJIIJ;
    public List<CaiAppVersion> LJIIL = C1516540pZE.LJIIIIZZ();
    public List<CaiFeatureTemplateItem> LJIILIIL = C1516540pZE.LJIIIIZZ();
    public List<String> LJIILL = C1516540pZE.LJIIIIZZ();
    public List<CaiAppVersion> LJJI = C1516540pZE.LJIIIIZZ();
    public List<CaiTag> LJJIII = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureItem build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIILJJIL != null && this.LJIILLIIL != null && this.LJJIFFI != null && this.LJJII != null) {
            return new CaiFeatureItem(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, this.LJJI, this.LJJIFFI, this.LJJII, this.LJJIII, this.LJJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "feature_key", this.LJ, "feature_name", this.LJFF, "producer_key", this.LJI, "producer_name", this.LJII, "feature_type", this.LJIIIIZZ, "source_type", this.LJIIIZ, "feature_status", this.LJIIJ, "value_type", this.LJIIJJI, "feature_description", this.LJIILJJIL, "privacy_level", this.LJIILLIIL, "effective_crowd", this.LJJIFFI, "created_timestamp", this.LJJII, "updated_timestamp");
        throw null;
    }
}
