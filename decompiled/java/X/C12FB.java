package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.12FB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12FB {
    public static C12F5 LIZ;

    public static void LIZIZ(TakoMultipleSelectVM takoMultipleSelectVM) {
        Map<Long, Pair<Boolean, Bitmap>> map = takoMultipleSelectVM.LLILLL;
        if (map != null) {
            Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
            while (it2.hasNext()) {
                C786410Ut5.LJJJJ((Bitmap) ((Pair) ((Map.Entry) it2.next()).getValue()).getSecond());
            }
        }
        Map<Long, Pair<Boolean, Bitmap>> map2 = takoMultipleSelectVM.LLILLL;
        if (map2 != null) {
            ((LinkedHashMap) map2).clear();
        }
        ((LinkedHashMap) takoMultipleSelectVM.LLILLJJLI).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static String LIZ(TakoMultipleSelectVM takoMultipleSelectVM, String str) {
        ?? arrayList;
        List<C326880Cre> listDQ2;
        if (takoMultipleSelectVM != null && (listDQ2 = takoMultipleSelectVM.DQ2()) != null) {
            arrayList = new ArrayList();
            Iterator<C326880Cre> it2 = listDQ2.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().LLILLL.uuid;
                if (str2.length() > 0) {
                    arrayList.add(str2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (arrayList.size() > 1) {
            return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        return str;
    }

    public static void LIZJ(String str, Map map) {
        C1862330yYx.LJLJJL(C1862330yYx.LIZ, map, str, "conversation", "button_click", null, null, 112);
    }

    public static void LIZLLL(View view, boolean z, String str, String str2, long j, Long l, InterfaceC665370Q7z interfaceC665370Q7z, String str3, String str4, String str5, String str6, Integer num) {
        TakoMultipleSelectVM takoMultipleSelectVMV81;
        Map<String, String> mapLJ;
        String strNZ0;
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null);
        if (takoChatUIAbility != null) {
            takoMultipleSelectVMV81 = takoChatUIAbility.V81();
        } else {
            takoMultipleSelectVMV81 = null;
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        C12F5 c12f5 = LIZ;
        if (c12f5 != null) {
            c12f5.dismiss();
            if (takoMultipleSelectVMV81 != null) {
                LIZIZ(takoMultipleSelectVMV81);
            }
        }
        C12F5 c12f52 = new C12F5(view.getContext(), new C12F4(j, view, interfaceC665370Q7z, takoCardAbility, takoMultipleSelectVMV81, iMessageAbility, num, l, str, str2, str3, str4, str5, str6, strNZ0, mapLJ, z), z);
        LIZ = c12f52;
        c12f52.showAtLocation(view, 80, 0, 0);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJI(c12f52);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
    }
}
