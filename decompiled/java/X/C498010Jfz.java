package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.viewholder.creatorlabel.SubscribeCreatorTagDialog;
import java.util.ArrayList;
import java.util.List;
import webcast.api.sub.PrivilegeTag;

/* JADX INFO: renamed from: X.0Jfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498010Jfz {
    public static void LIZ(FragmentManager fragmentManager, List list) {
        SubscribeCreatorTagDialog subscribeCreatorTagDialog = new SubscribeCreatorTagDialog();
        List<PrivilegeTag> list2 = subscribeCreatorTagDialog.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PrivilegeTag) obj).category != 6) {
                arrayList.add(obj);
            }
        }
        ((ArrayList) list2).addAll(arrayList);
        subscribeCreatorTagDialog.show(fragmentManager, "SubscribeNoticeDialog");
    }
}
