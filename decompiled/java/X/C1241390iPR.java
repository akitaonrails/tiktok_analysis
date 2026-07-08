package X;

import com.ss.android.ugc.aweme.inbox.search.ability.InboxSearchKeyWordAbility;
import com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0iPR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241390iPR implements InterfaceC336510DHd {
    public final InboxSearchKeyWordAbility LL;
    public final InboxSearchDefaultVM LLILLJJLI;

    public final void LIZIZ() {
        InboxSearchDefaultVM inboxSearchDefaultVM = this.LLILLJJLI;
        inboxSearchDefaultVM.getClass();
        C1241460iPY c1241460iPY = C1241460iPY.LIZ;
        int size = ((ArrayList) inboxSearchDefaultVM.LLILLL).size();
        c1241460iPY.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "dm_search_page");
        c2344009Gk.LIZJ(size, "clear_cnt");
        C20684815ws.LJIILLIIL("dm_search_clear_all_history", c2344009Gk.LIZ);
    }

    public final void LIZ(InboxSearchRecentStoreItem inboxSearchRecentStoreItem) {
        InboxSearchKeyWordAbility inboxSearchKeyWordAbility = this.LL;
        if (inboxSearchKeyWordAbility != null) {
            inboxSearchKeyWordAbility.Rq();
        }
        InboxSearchDefaultVM inboxSearchDefaultVM = this.LLILLJJLI;
        C23250099c.LIZLLL(inboxSearchDefaultVM.getLifecycleScope(), C0PEM.LIZJ, null, new C0PE6(inboxSearchDefaultVM, inboxSearchRecentStoreItem, null), 2);
    }

    public final void LIZJ(Map<String, String> map) {
        this.LLILLJJLI.getClass();
        C1241460iPY.LIZ.getClass();
        C1241460iPY.LIZJ(map);
    }

    public C1241390iPR(InboxSearchKeyWordAbility inboxSearchKeyWordAbility, InboxSearchDefaultVM inboxSearchDefaultVM) {
        this.LL = inboxSearchKeyWordAbility;
        this.LLILLJJLI = inboxSearchDefaultVM;
    }

    public final void LIZLLL(String str, EnumC1241340iPM enumC1241340iPM, Map<String, String> map) {
        Set<String> set = this.LLILLJJLI.LLJ.get(enumC1241340iPM);
        if (set != null && !set.contains(str)) {
            set.add(str);
            C1241460iPY.LIZ.getClass();
            C1241460iPY.LIZLLL(map);
        }
    }
}
