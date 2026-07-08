package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTemplate;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import java.util.List;

/* JADX INFO: renamed from: X.1CiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237761CiE extends Message.Builder<CaiFeatureTemplate, C2237761CiE> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public List<CaiAppVersion> LJIIIIZZ = C1516540pZE.LJIIIIZZ();
    public Integer LJIIIZ;
    public CaiManager LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiFeatureTemplate build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIZ != null) {
            return new CaiFeatureTemplate(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "template_key", this.LJ, "template_name", this.LJFF, "template_description", this.LJI, "template_content", this.LJII, "template_example", this.LJIIIZ, "template_status");
        throw null;
    }
}
