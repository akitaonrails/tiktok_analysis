package Y;

import X.AbstractC1702506lb;
import X.C0IBF;
import X.C0Y8T;
import X.C1702406la;
import X.C1702706ld;
import X.C1703706ln;
import X.C1711306n1;
import X.C2272711DxV;
import X.C903170Zbv;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class AkS476S0100000_14 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS476S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS476S0100000_14 akS476S0100000_14, Object obj) {
        C0Y8T c0y8t;
        AbstractC1702506lb abstractC1702506lb = (AbstractC1702506lb) obj;
        ((ChatRoomCameraVM) akS476S0100000_14.l0).getClass();
        if (abstractC1702506lb instanceof C1703706ln) {
            return C903170Zbv.LIZ(((C1703706ln) abstractC1702506lb).LIZ);
        }
        if (abstractC1702506lb instanceof C1702706ld) {
            C1711306n1 c1711306n1 = ((C1702706ld) abstractC1702506lb).LIZ;
            if (c1711306n1 != null && (c0y8t = c1711306n1.LIZIZ) != null) {
                return C903170Zbv.LIZ(c0y8t);
            }
            C2272711DxV c2272711DxV = new C2272711DxV();
            c2272711DxV.LIZLLL = C0IBF.FEATURE_STATUS_HIDE;
            return c2272711DxV.build();
        }
        if (abstractC1702506lb instanceof C1702406la) {
            return C903170Zbv.LIZ(((C1702406la) abstractC1702506lb).LIZ);
        }
        C2272711DxV c2272711DxV2 = new C2272711DxV();
        c2272711DxV2.LIZLLL = C0IBF.FEATURE_STATUS_UNKNOWN;
        return c2272711DxV2.build();
    }

    public static final Object apply$1(AkS476S0100000_14 akS476S0100000_14, Object obj) {
        return ((InboxSocPubStatusViewModelImpl) akS476S0100000_14.l0).LL.LIZ((List) obj);
    }
}
