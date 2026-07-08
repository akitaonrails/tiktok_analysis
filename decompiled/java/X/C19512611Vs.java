package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.11Vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19512611Vs implements InterfaceC1402500mbI {
    public final List<InterfaceC19512811Vu> LIZ = new ArrayList();

    public static final String LIZIZ() {
        StringBuilder sb = new StringBuilder();
        AnchorListManager.LIZ.getClass();
        if (AnchorListManager.LJII() != null) {
            Iterator it2 = ((ArrayList) AnchorListManager.LJI()).iterator();
            while (it2.hasNext()) {
                if (((AnchorPublishStruct) it2.next()).hadNew) {
                    sb.append("1");
                } else {
                    sb.append(CardStruct.IStatusCode.DEFAULT);
                }
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static final boolean LIZJ() {
        AnchorListManager.LIZ.getClass();
        return AnchorListManager.LJII > 0;
    }

    public C19512611Vs() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    public static final String LIZ(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        AnchorListManager.LIZ.getClass();
        if (AnchorListManager.LJII() != null) {
            for (AnchorPublishStruct anchorPublishStruct : (ArrayList) AnchorListManager.LJI()) {
                if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIL().contains(Integer.valueOf(anchorPublishStruct.type))) {
                    AnchorListManager.LIZ.getClass();
                    List<Integer> listLJJIL = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIL();
                    if (!(listLJJIL instanceof Collection) || !listLJJIL.isEmpty()) {
                        Iterator<Integer> it2 = listLJJIL.iterator();
                        while (it2.hasNext()) {
                            if (C13LQ.LJJIJ(it2.next().intValue(), iArr) >= 0) {
                            }
                        }
                    }
                }
                int i = anchorPublishStruct.type;
                EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.HYPIC_ANCHOR;
                if (i == enumC1430380nKG.getTYPE()) {
                    AnchorListManager.LIZ.getClass();
                    if (C13LQ.LJJIJ(enumC1430380nKG.getTYPE(), iArr) >= 0) {
                    }
                }
                AnchorListManager.LIZ.getClass();
                sb.append(AnchorListManager.LJIIIIZZ(anchorPublishStruct));
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onAsyncAnchor(C1799610wvn c1799610wvn) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC19512811Vu) it2.next()).LIZ(c1799610wvn.LIZ);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onWikiActivityClose(C19512711Vt c19512711Vt) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC19512811Vu) it2.next()).LIZ(null);
        }
    }

    public static final void LIZLLL(Context context, Map<String, String> map) {
        AnchorListManager.LIZ.getClass();
        List listLJI = AnchorListManager.LJI();
        for (int i = 0; i < ((ArrayList) listLJI).size(); i++) {
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ListProtector.get(listLJI, i);
            if (anchorPublishStruct.type == EnumC1430380nKG.WIKIPEDIA.getTYPE()) {
                String str = anchorPublishStruct.webUrl;
                if (str == null) {
                    str = "";
                }
                String str2 = AddWikiActivity._pnsPageId;
                C11W4.LIZ(context, str, map, C2097608Jq.LJ());
                return;
            }
        }
    }
}
