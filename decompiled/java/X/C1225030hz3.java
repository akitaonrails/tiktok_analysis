package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225030hz3 {
    public final AbstractC1225770i0F LIZ;

    public C1225030hz3(AbstractC1225770i0F abstractC1225770i0F) {
        this.LIZ = abstractC1225770i0F;
    }

    public final void LIZ(Integer num, String str) {
        int size;
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        AbstractC1225780i0G abstractC1225780i0GLJJJJLL = this.LIZ.LJJJJLL();
        InterfaceC1226510i1R interfaceC1226510i1R = this.LIZ.LLILLL;
        if (interfaceC1226510i1R != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
        if (iIMChatDetailAnalytics == null) {
            return;
        }
        iIMChatDetailAnalytics.LJFF("click_remove_pop", new Pair[]{new Pair("enter_from", abstractC1225780i0GLJJJJLL.LJIIIZ().LIZJ()), new Pair("enter_method", abstractC1225780i0GLJJJJLL.LJIIIZ().LIZLLL()), new Pair("group_role", String.valueOf(num)), new Pair("member_remove_cnt", String.valueOf(size)), new Pair("result", str)}, C0I0B.LJFF.LIZIZ());
    }
}
