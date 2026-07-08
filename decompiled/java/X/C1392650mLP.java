package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0mLP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392650mLP {
    public static final String LIZ(C712510RxB c712510RxB) {
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        if (c1618440sDa.LJJIIJ().LJJIIJZLJL(c712510RxB.LJFF) && C729510SjV.LJJIJIL(c712510RxB.LIZ)) {
            return "story_immersive_anchor";
        }
        if (c1618440sDa.LJJIIJ().LJJIIJZLJL(c712510RxB.LJFF)) {
            return "post_immersive_anchor";
        }
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.t2(c712510RxB.LJFF) && C729510SjV.LJJIJIL(c712510RxB.LIZ)) {
            return "story_friends_feed_anchor";
        }
        if (c1589640rT8.t2(c712510RxB.LJFF)) {
            return "post_friends_feed_anchor";
        }
        return "";
    }

    public static final boolean LIZIZ(C712520RxC c712520RxC) {
        boolean z;
        boolean z2;
        List<InterfaceC1393560mMs> listLJIILL = c712520RxC.LJIILL();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1393560mMs interfaceC1393560mMs : listLJIILL) {
            if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLJJLL().contains(Integer.valueOf(interfaceC1393560mMs.type()))) {
                arrayList.add(interfaceC1393560mMs);
            }
        }
        if (arrayList.size() == c712520RxC.LJIILL().size()) {
            z = true;
        } else {
            z = false;
        }
        if (c712520RxC.LJIIJ() - c712520RxC.LJIILL().size() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return true;
        }
        return false;
    }
}
