package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.RegionPickerDialogFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS88S0201000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744610vV5 {
    public static boolean LIZ(ClientConfig clientConfig, String str) {
        String str2;
        List listLJJLIIIJILLIZJL;
        if (clientConfig == null || (str2 = clientConfig.singleStageSelectorKeys) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) == null) {
            return false;
        }
        return C13LP.LJJJJ(str, listLJJLIIIJILLIZJL);
    }

    public static void LIZIZ(int i, String str, List list, int i2, FragmentManager fragmentManager, String str2, Function0 function0, Function2 function2, AwS88S0201000_1 awS88S0201000_1, Boolean bool, Boolean bool2, String str3, InterfaceC1748810vbr interfaceC1748810vbr, String str4, String str5, String str6, String str7, Integer num, boolean z, Integer num2, Integer num3, String str8, ArrayList arrayList, List list2, List list3, String str9, int i3) {
        boolean z2;
        int i4 = i2;
        Boolean bool3 = bool;
        Function1<? super List<Region>, Unit> function1 = awS88S0201000_1;
        List list4 = list;
        String str10 = str;
        String str11 = str2;
        int i5 = i;
        String str12 = str9;
        List list5 = list3;
        ArrayList arrayList2 = arrayList;
        String str13 = str8;
        Integer num4 = num3;
        boolean z3 = z;
        Integer num5 = num;
        String str14 = str7;
        String str15 = str6;
        List list6 = list2;
        Integer num6 = num2;
        String str16 = str5;
        String str17 = str4;
        InterfaceC1748810vbr interfaceC1748810vbr2 = interfaceC1748810vbr;
        String str18 = str3;
        Boolean bool4 = bool2;
        if ((i3 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i3 & 2) != 0) {
            i5 = 0;
        }
        if ((i3 & 4) != 0) {
            str10 = null;
        }
        if ((i3 & 8) != 0) {
            list4 = null;
        }
        if ((i3 & 64) != 0) {
            str11 = null;
        }
        if ((i3 & 512) != 0) {
            function1 = AFwS268S0000000_26.get$arr$(168);
        }
        if ((i3 & 1024) != 0) {
            bool3 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool4 = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str18 = null;
        }
        if ((i3 & 8192) != 0) {
            interfaceC1748810vbr2 = null;
        }
        if ((32768 & i3) != 0) {
            str17 = null;
        }
        if ((65536 & i3) != 0) {
            str16 = null;
        }
        if ((131072 & i3) != 0) {
            str15 = null;
        }
        if ((262144 & i3) != 0) {
            str14 = null;
        }
        if ((524288 & i3) != 0) {
            num5 = null;
        }
        if ((1048576 & i3) != 0) {
            z3 = false;
        }
        if ((2097152 & i3) != 0) {
            num6 = 0;
        }
        if ((4194304 & i3) != 0) {
            num4 = null;
        }
        if ((8388608 & i3) != 0) {
            str13 = null;
        }
        if ((16777216 & i3) != 0) {
            arrayList2 = null;
        }
        if ((33554432 & i3) != 0) {
            list6 = null;
        }
        if ((67108864 & i3) != 0) {
            list5 = null;
        }
        if ((i3 & 134217728) != 0) {
            str12 = null;
        }
        if (fragmentManager != null) {
            RegionPickerDialogFragment regionPickerDialogFragment = new RegionPickerDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("implement_type", i5);
            if (str10 != null) {
                C786410Ut5.LJJJI("geo_name_id", str10, bundle);
            }
            if (list4 != null) {
                ArrayList arrayList3 = new ArrayList();
                C19719612Di.LJJI(list4, arrayList3);
                C786410Ut5.LJJIL(bundle, "current_selected_region_list", arrayList3);
            }
            bundle.putBoolean("needs_dim", z2);
            if (i4 < 1) {
                i4 = Integer.MAX_VALUE;
            }
            bundle.putInt("level_count", i4);
            C786410Ut5.LJJJI("page_info", str11, bundle);
            if (str13 != null) {
                C786410Ut5.LJJJI("source_btm_token", str13, bundle);
            }
            if (Intrinsics.LJFF(bool3, Boolean.TRUE)) {
                bundle.putInt("height", C2132808Xe.LIZIZ(C7879035x.LIZ()));
                bundle.putBoolean("needs_dim", false);
            }
            if (interfaceC1748810vbr2 != null) {
                C960603pE.LJI(bundle, interfaceC1748810vbr2, null);
            } else if (str18 != null) {
                C960603pE.LJIIJ(bundle, str18);
            }
            regionPickerDialogFragment.LLJJIII = str16;
            regionPickerDialogFragment.LLJJIJI = str15;
            regionPickerDialogFragment.setArguments(bundle);
            regionPickerDialogFragment.LLJI = function2;
            regionPickerDialogFragment.LLJIJIL = function1;
            regionPickerDialogFragment.LLJILJIL = function0;
            regionPickerDialogFragment.LLJILJILJ = bool4;
            regionPickerDialogFragment.LLJILLL = bool3;
            regionPickerDialogFragment.LLJJ = false;
            regionPickerDialogFragment.LLJJI = str17;
            regionPickerDialogFragment.LLJJIJIIJIL = str14;
            regionPickerDialogFragment.LLJJIJIL = num5;
            regionPickerDialogFragment.LLJJJ = z3;
            regionPickerDialogFragment.LLJJJIL = num6;
            regionPickerDialogFragment.LLJJJJ = num4;
            regionPickerDialogFragment.LLJJJJJIL = arrayList2;
            regionPickerDialogFragment.LLJJJJLIIL = list6;
            regionPickerDialogFragment.LLJJL = list5;
            regionPickerDialogFragment.LLJJLIIIJLLLLLLLZ = str12;
            regionPickerDialogFragment.show(fragmentManager, "");
        }
    }
}
