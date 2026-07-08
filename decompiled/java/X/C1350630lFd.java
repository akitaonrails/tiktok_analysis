package X;

import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AwS265S0300000_21;

/* JADX INFO: renamed from: X.0lFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350630lFd implements InterfaceC1350330lF9 {
    @Override // X.InterfaceC1350330lF9
    public final String H3() {
        return "ecom_cart";
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJFF(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJII(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJIIIZ(Aweme aweme) {
    }

    @Override // X.InterfaceC1350330lF9
    public final int zg() {
        return 12;
    }

    @Override // X.InterfaceC1350330lF9
    public final Integer LJIIIIZZ(Aweme aweme) {
        return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIILL(aweme);
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZJ(CommentContextSource commentContextSource, Aweme aweme) {
        String str;
        CommentCommonModel commonModel;
        C1350340lFA.LIZ(this, aweme, commentContextSource);
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            str = commonModel.eventType;
        } else {
            str = null;
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_anchor_open_comment", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new C1350640lFe(str)));
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LJI(CommentContextSource commentContextSource, Aweme aweme) {
        if (aweme == null || commentContextSource == null || !((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIIJ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LIZLLL(Aweme aweme, C2189821An6 c2189821An6, String str) {
        if (aweme != null) {
            if (AwemeExtKt.isPhotoMode(aweme) && !((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIII(aweme)) {
                return false;
            }
            return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIIJ(aweme);
        }
        return false;
    }

    @Override // X.InterfaceC1350330lF9
    public final View LJIIL(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        CommentCommonModel commonModel;
        if (context == null) {
            return null;
        }
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || (str = commonModel.eventType) == null) {
            str = "";
        }
        return iECommerceAnchorService.LJ(context, aweme, str, new AwS265S0300000_21(this, aweme, commentContextSource, 31));
    }
}
