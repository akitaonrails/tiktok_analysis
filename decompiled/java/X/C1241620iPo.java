package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchResultBaseFragment;
import com.ss.android.ugc.aweme.inbox.search.assem.InboxSearchResultContainer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241620iPo extends C09AY implements Function2<UIAssem, C915970ZwZ, Unit> {
    public final /* synthetic */ InboxSearchResultContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241620iPo(InboxSearchResultContainer inboxSearchResultContainer) {
        super(2);
        this.LL = inboxSearchResultContainer;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C915970ZwZ c915970ZwZ) {
        InboxSearchResultBaseFragment inboxSearchResultBaseFragment;
        UIAssem uIAssem2 = uIAssem;
        if (c915970ZwZ.LL.length() > 0) {
            C337180DJs.LIZJ(uIAssem2.LJJIJL());
            C1241460iPY.LIZ.getClass();
            C1241460iPY.LJIIIZ = true;
        } else {
            C337180DJs.LIZ(uIAssem2.LJJIJL());
            InboxSearchResultContainer inboxSearchResultContainer = this.LL;
            Iterator it2 = ((LinkedHashMap) inboxSearchResultContainer.LLJJJ).entrySet().iterator();
            while (it2.hasNext()) {
                Fragment fragmentLIZIZ = inboxSearchResultContainer.hp().getFragmentItemOperator().LIZIZ(((Number) ((Map.Entry) it2.next()).getValue()).intValue());
                if ((fragmentLIZIZ instanceof InboxSearchResultBaseFragment) && (inboxSearchResultBaseFragment = (InboxSearchResultBaseFragment) fragmentLIZIZ) != null) {
                    inboxSearchResultBaseFragment.LLILZ = true;
                    inboxSearchResultBaseFragment.NR(null, null, null, false);
                }
            }
            inboxSearchResultContainer.hp().setCurrentItem(0);
            C1241460iPY.LIZ.getClass();
            C1241460iPY.LJIIIZ = false;
        }
        return Unit.LIZ;
    }
}
