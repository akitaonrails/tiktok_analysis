package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2InviteeCohostListRemoveMainInviter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0aye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955700aye extends C1117360fBO {
    public int LLILLL;

    public final int LLLIIIIL() {
        return CohostWithGuestPhase2InviteeCohostListRemoveMainInviter.INSTANCE.isEnabled() ? this.LLILLL : this.LL.size();
    }

    @Override // X.C1117360fBO
    public final void LLLII(List<?> list) {
        Object next;
        this.LLILLL = list.size();
        if (CohostWithGuestPhase2InviteeCohostListRemoveMainInviter.INSTANCE.isEnabled() && (!list.isEmpty())) {
            Iterator<?> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if ((next instanceof C955890ayx) && ((C955890ayx) next).LJII) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(next);
            C20441214yg.LJIIIZ("InviteePanelHostListAdapter", "setItems, remove_main_inviter=true");
            this.LL = arrayList;
            return;
        }
        this.LL = list;
    }
}
