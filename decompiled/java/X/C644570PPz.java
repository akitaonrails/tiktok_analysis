package X;

import android.content.Context;
import com.ss.android.ugc.aweme.search.SearchTabInfo;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabCommonConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0PPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644570PPz {
    public static CharSequence LIZ(int i, Context context) {
        List<SearchTabInfo> list;
        String str;
        SearchTabConfig searchTabConfig;
        SearchTabCommonConfig searchTabCommonConfig;
        if (context != null) {
            if (i == C644560PPy.LJIJJLI()) {
                return context.getString(2131837418);
            }
            C644560PPy.LIZ.getClass();
            if (i == C644560PPy.LJIL()) {
                return context.getString(2131858032);
            }
            if (i == C644560PPy.LJIJ()) {
                return context.getString(2131837786);
            }
            if (i == C644560PPy.LJIIZILJ()) {
                return context.getString(2131848105);
            }
            if (i == C644560PPy.LJIIIZ()) {
                return context.getString(2131828457);
            }
            if (i == C644560PPy.LJJ()) {
                return context.getString(2131847136);
            }
            if (i == C644560PPy.LJIJI(EnumC669620QOi.STORE)) {
                return context.getString(2131833032);
            }
            if (i == C644560PPy.LJIIL()) {
                return context.getString(2131843031);
            }
            if (i == C644560PPy.LJIILL()) {
                return context.getString(2131840492);
            }
            if (i == C644560PPy.LJIILJJIL()) {
                return context.getString(2131839828);
            }
            if (i == C644560PPy.LIZIZ(i)) {
                if (C0BRI.LIZ()) {
                    list = C644560PPy.LIZLLL;
                } else {
                    list = C644560PPy.LIZJ;
                }
                SearchTabInfo searchTabInfo = (SearchTabInfo) C13LP.LJJJLZIJ(i, list);
                if (searchTabInfo != null && (str = searchTabInfo.tabName) != null && (searchTabConfig = (SearchTabConfig) C0QD9.LIZ().get(str)) != null && (searchTabCommonConfig = searchTabConfig.tabCommonConfig) != null) {
                    return searchTabCommonConfig.tabName;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
