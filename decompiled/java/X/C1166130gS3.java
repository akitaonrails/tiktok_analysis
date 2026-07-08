package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import com.ss.android.ugc.aweme.publicgroup.fragment.WhoCanJoinPanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.0gS3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166130gS3 {
    public static void LIZ(Context context, List list, GroupAccessCriteriaCollection groupAccessCriteriaCollection, final Map map, InterfaceC1163280gNS interfaceC1163280gNS) {
        FragmentManager supportFragmentManager;
        if (list == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        WhoCanJoinPanelFragment.LLJ.put(strLIZIZ, new C1163270gNR(list, groupAccessCriteriaCollection, interfaceC1163280gNS, map));
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("panel_param_uuid", strLIZIZ, bundle);
            WhoCanJoinPanelFragment whoCanJoinPanelFragment = new WhoCanJoinPanelFragment();
            whoCanJoinPanelFragment.setArguments(bundle);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLLL = false;
            tuxSheet.LLJJIJI = whoCanJoinPanelFragment;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJI = numLIZJ;
            tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0gQ8
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    String str;
                    GroupAccessCriteria groupAccessCriteria;
                    String str2 = TuxSheet._pnsPageId;
                    AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(map);
                    if (abstractC343940De4LJIIJJI instanceof C1164950gQ9) {
                        str = "save";
                    } else {
                        str = "close";
                    }
                    linkedHashMap.put("action", str);
                    GroupAccessCriteriaCollection groupAccessCriteriaCollection2 = (GroupAccessCriteriaCollection) ((LinkedHashMap) WhoCanJoinPanelFragment.LLJI).get(strLIZIZ);
                    if (groupAccessCriteriaCollection2 != null && (groupAccessCriteria = groupAccessCriteriaCollection2.selectedAccessCriteria) != null) {
                        linkedHashMap.put("selected_access_criteria_type", String.valueOf(groupAccessCriteria.accessCriteriaType));
                        linkedHashMap.put("selected_access_criteria_key", groupAccessCriteria.key);
                    }
                    C0I0B.LJFF.LIZIZ();
                    C20684815ws.LJIILLIIL("group_access_criteria_selection_popup_click", linkedHashMap);
                }
            };
            tuxSheet2.show(supportFragmentManager, "WhoCanJoinPanelFragment");
        }
    }
}
