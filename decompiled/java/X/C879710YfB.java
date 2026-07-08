package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: X.0YfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879710YfB {
    public static final ArrayList<String> LIZ = C1697810uHb.LJ(FilterTabType.AD.getSerializedName(), FilterTabType.LEAD.getSerializedName(), FilterTabType.SERVICE_PLUS.getSerializedName(), FilterTabType.BUYER.getSerializedName());

    public static Set LIZ(C05RV c05rv) {
        int i = C877800Yc6.LIZ[c05rv.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            return C08CX.INSTANCE;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ArrayList<String> arrayList = LIZ;
        ArrayList<String> arrayList2 = (ArrayList) settingsManagerLIZLLL.LJIIIIZZ("tt_im_business_inbox_hideable_empty_tab_list", ArrayList.class, arrayList);
        if (arrayList2 != null) {
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList) {
            FilterTabType.Companion.getClass();
            FilterTabType filterTabTypeLIZ = C879720YfC.LIZ(str);
            if (filterTabTypeLIZ != null) {
                arrayList3.add(filterTabTypeLIZ);
            }
        }
        return C13LP.LLIIJI(arrayList3);
    }
}
