package X;

import android.os.Bundle;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.03wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1007103wj {
    public static DistrictFragment LIZ(String str, List list, int i, String str2, Boolean bool, Boolean bool2, Boolean bool3, InterfaceC1748810vbr interfaceC1748810vbr, boolean z, String str3, String str4, String str5, Integer num, boolean z2, boolean z3, Integer num2, Integer num3, String str6, ArrayList arrayList, List list2, int i2) {
        String str7;
        ArrayList arrayList2 = arrayList;
        String str8 = str6;
        Integer num4 = num2;
        Integer num5 = num3;
        String str9 = str2;
        boolean z4 = z2;
        String str10 = str5;
        String str11 = str4;
        String str12 = str3;
        boolean z5 = z3;
        boolean z6 = z;
        InterfaceC1748810vbr interfaceC1748810vbr2 = interfaceC1748810vbr;
        int i3 = i;
        String str13 = "";
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            list = null;
        }
        if ((i2 & 4) != 0) {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            str9 = null;
        }
        if ((i2 & 16) != 0) {
            bool = null;
        }
        if ((i2 & 32) != 0) {
            bool2 = null;
        }
        if ((i2 & 64) != 0) {
            bool3 = null;
        }
        if ((i2 & 128) != 0) {
            interfaceC1748810vbr2 = null;
        }
        if ((i2 & 256) != 0) {
            z6 = false;
        }
        if ((i2 & 512) != 0) {
            str12 = null;
        }
        if ((i2 & 1024) != 0) {
            str11 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str10 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num = null;
        }
        if ((i2 & 8192) != 0) {
            z4 = false;
        }
        if ((i2 & 16384) != 0) {
            z5 = false;
        }
        if ((32768 & i2) != 0) {
            num4 = 0;
        }
        if ((65536 & i2) != 0) {
            num5 = null;
        }
        if ((131072 & i2) != 0) {
            str8 = null;
        }
        if ((262144 & i2) != 0) {
            arrayList2 = null;
        }
        if ((i2 & 524288) != 0) {
            list2 = null;
        }
        ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIIZZ("select_region", null, null, null, null);
        Bundle bundle = new Bundle();
        if (arrayList2 != null) {
            C786410Ut5.LJJIL(bundle, "order_skus", arrayList2);
        }
        District[] districtArr = new District[1];
        if (str == null) {
            str7 = "";
        } else {
            str7 = str;
        }
        districtArr[0] = new District("", str7, null, "", null, null, null, null, null, null, null);
        ArrayList arrayListLJ = C1697810uHb.LJ(districtArr);
        if (list2 != null) {
            C786410Ut5.LJJJI("pre_selection_geoname_ids", C1741890vQh.LJIIIIZZ(list2), bundle);
        }
        if (list != null) {
            for (Region region : list) {
                arrayListLJ.add(new District(region.name, region.geoNameId, region.code, "", region.districtKey, null, null, null, null, null, null));
            }
        }
        C786410Ut5.LJJIL(bundle, "current_selected_region_list", arrayListLJ);
        if (i3 >= 1) {
            bundle.putInt("level_count", Math.max(i3, arrayListLJ.size() - 1) - 1);
        }
        if (bool != null) {
            bundle.putBoolean("needSearchBox", bool.booleanValue());
        }
        if (bool2 != null) {
            bundle.putBoolean("needStandaloneSearch", bool2.booleanValue());
        }
        if (bool3 != null) {
            bundle.putBoolean("needLocate", bool3.booleanValue());
        }
        if (interfaceC1748810vbr2 != null) {
            C960603pE.LJI(bundle, interfaceC1748810vbr2, null);
        }
        bundle.putBoolean("if_auto_locate", z6);
        if (str12 != null) {
            C786410Ut5.LJJJI("previous_page", str12, bundle);
        }
        if (str10 != null) {
            C786410Ut5.LJJJI("location", str10, bundle);
        }
        if (str9 != null) {
            C786410Ut5.LJJJI("page_info", str9, bundle);
        }
        if (num != null) {
            bundle.putInt("is_with_delivery_info", num.intValue());
        }
        if (str != null) {
            str13 = str;
        }
        C786410Ut5.LJJJI("country_geo_name_id", str13, bundle);
        if (str8 != null) {
            C786410Ut5.LJJJI("source_btm_token", str8, bundle);
        }
        DistrictFragment districtFragment = new DistrictFragment();
        districtFragment.setArguments(bundle);
        districtFragment.LLJJJIL = str11;
        districtFragment.LLJJJJ = z4;
        districtFragment.LLJJJJJIL = z5;
        districtFragment.LLJLLIL = num4;
        districtFragment.LLJLLL = num5;
        return districtFragment;
    }
}
