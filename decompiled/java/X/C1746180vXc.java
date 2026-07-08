package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressRightsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstruction;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import java.util.List;

/* JADX INFO: renamed from: X.0vXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746180vXc {
    public final List<C1745680vWo> LIZ;
    public final ClientConfig LIZIZ;
    public final LinkRichText LIZJ;
    public final AddressLocation LIZLLL;
    public final AddressRightsInfo LJ;
    public final DeliveryInstruction LJFF;
    public final AddressBase LJI;
    public final List<Region> LJII;

    public C1746180vXc(List<C1745680vWo> list, ClientConfig clientConfig, LinkRichText linkRichText, AddressLocation addressLocation, AddressRightsInfo addressRightsInfo, DeliveryInstruction deliveryInstruction, AddressBase addressBase, List<Region> list2) {
        this.LIZ = list;
        this.LIZIZ = clientConfig;
        this.LIZJ = linkRichText;
        this.LIZLLL = addressLocation;
        this.LJ = addressRightsInfo;
        this.LJFF = deliveryInstruction;
        this.LJI = addressBase;
        this.LJII = list2;
    }
}
