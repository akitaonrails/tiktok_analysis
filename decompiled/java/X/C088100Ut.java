package X;

import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTabs;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.00Ut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C088100Ut {
    public static final List<CustomTab> LIZ(Room room) {
        CustomTabs customTabs;
        List<CustomTab> list;
        CustomTabInfo customTabInfo = room.customTabInfo;
        if (customTabInfo != null && (customTabs = customTabInfo.customTabs) != null && (list = customTabs.customTabList) != null) {
            CustomTab customTab = new CustomTab();
            customTab.tabTitle = C497740JfY.LJIJI(2131855454);
            customTab.tabSchemaType = 0;
            customTab.tabBizName = "chat";
            ArrayList arrayList = new ArrayList();
            arrayList.add(customTab);
            arrayList.addAll(list);
            return arrayList;
        }
        return null;
    }
}
