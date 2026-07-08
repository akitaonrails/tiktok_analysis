package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i1M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226460i1M {
    public final AbstractC1225780i0G LIZ;

    public C1226460i1M(AbstractC1225770i0F abstractC1225770i0F) {
        this.LIZ = abstractC1225770i0F.LJJJJLL();
    }

    public static int LIZ(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((C1224840hyk) obj).LLJILJILJ) {
                    arrayList.add(obj);
                }
            }
            return arrayList.size();
        }
        return 0;
    }

    public final void LIZIZ(List<C1224840hyk> list) {
        Integer numValueOf;
        IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
        if (iIMChatDetailAnalytics != null) {
            Pair[] pairArr = new Pair[3];
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            } else {
                numValueOf = null;
            }
            pairArr[0] = new Pair("pub_chat_list", String.valueOf(numValueOf));
            pairArr[1] = new Pair("avl_pub_chat_list", String.valueOf(LIZ(list)));
            pairArr[2] = new Pair("enter_from", this.LIZ.LJIIIZ().LIZJ());
            iIMChatDetailAnalytics.LJFF("group_choose_page_show", pairArr, C0I0B.LJFF.LIZIZ());
        }
    }
}
