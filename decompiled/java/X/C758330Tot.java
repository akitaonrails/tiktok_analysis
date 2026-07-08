package X;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Tot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758330Tot {
    public static void LIZ(C19EG c19eg, String str, ArrayList arrayList, String str2, String str3, ViewModelStoreOwner viewModelStoreOwner, InterfaceC1631620sYq interfaceC1631620sYq) {
        List listLLIIII;
        List listSingletonList;
        Long lLJIILIIL;
        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
        if (arrayList != null) {
            listLLIIII = C13LP.LLIIII(arrayList);
        } else {
            listLLIIII = null;
        }
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            listSingletonList = Collections.singletonList(Long.valueOf(lLJIILIIL.longValue()));
        } else {
            listSingletonList = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        C758220Toi c758220Toi = new C758220Toi(2, listLLIIII, listSingletonList, Collections.singletonList(new Pair(str3, str2)), 4);
        GroupChatGoLiveSettingSheet groupChatGoLiveSettingSheet = new GroupChatGoLiveSettingSheet();
        groupChatGoLiveSettingSheet.LLJZ = str;
        groupChatGoLiveSettingSheet.LLJZIJLIL = c758220Toi;
        groupChatGoLiveSettingSheet.LLL = viewModelStoreOwner;
        groupChatGoLiveSettingSheet.LLLF = interfaceC1631620sYq;
        C19322110iZ.LJFF(supportFragmentManager, groupChatGoLiveSettingSheet, "GroupChatGoLiveSettingSheet", null, 0);
    }
}
