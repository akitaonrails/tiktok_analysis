package X;

import com.bytedance.goda.model.dto.GodaProtocol;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButtonAreaIdV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;

/* JADX INFO: renamed from: X.03ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C996103ux {
    public final String LIZ;
    public final Integer LIZIZ;
    public final PdpShipping LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final PDPShippingModule LJFF;
    public final List<String> LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final PDPReturnPolicyModule LJIIIZ;
    public final UserRight LJIIJ;
    public final GodaProtocol LJIIJJI;
    public final String LJIIL;
    public final LynxInfo LJIILIIL;
    public final List<PdpButtonAreaIdV2> LJIILJJIL;
    public final List<SellingPointLabel> LJIILL;
    public final ECRichText LJIILLIIL;
    public final GodaV2Protocol<?> LJIIZILJ;

    public C996103ux() {
        throw null;
    }

    public C996103ux(String str, Integer num, PdpShipping pdpShipping, String str2, Integer num2, PDPShippingModule pDPShippingModule, String str3, String str4, PDPReturnPolicyModule pDPReturnPolicyModule, UserRight userRight, GodaProtocol godaProtocol, LynxInfo lynxInfo, List list, List list2, ECRichText eCRichText, GodaV2Protocol godaV2Protocol) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = pdpShipping;
        this.LIZLLL = str2;
        this.LJ = num2;
        this.LJFF = pDPShippingModule;
        this.LJI = null;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = pDPReturnPolicyModule;
        this.LJIIJ = userRight;
        this.LJIIJJI = godaProtocol;
        this.LJIIL = null;
        this.LJIILIIL = lynxInfo;
        this.LJIILJJIL = list;
        this.LJIILL = list2;
        this.LJIILLIIL = eCRichText;
        this.LJIIZILJ = godaV2Protocol;
    }
}
