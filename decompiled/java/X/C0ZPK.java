package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.titlebar.viewmodel.GroupTitleBarViewModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZPK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZPK {
    public static C0Z6T LIZ() {
        return GroupTitleBarViewModel.LLJILLL.getValue();
    }

    public static void LIZIZ(C19EG c19eg, String str, C0Y8T c0y8t, C913140Zs0 c913140Zs0) {
        if (!LIZ().LJIIIZ(c0y8t) || c913140Zs0 == null) {
            return;
        }
        C913630Zsn.LJIIJJI.LJJIIJZLJL(c19eg, c913140Zs0, 16);
        IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
        if (iIMChatDetailAnalytics != null) {
            iIMChatDetailAnalytics.LJFF("enter_group_setting", new Pair[]{new Pair("enter_from", "chat"), new Pair("enter_method", str)}, C0I0B.LJFF.LIZIZ());
        }
    }
}
