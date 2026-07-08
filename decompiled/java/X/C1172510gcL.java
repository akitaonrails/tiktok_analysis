package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment;
import java.util.List;

/* JADX INFO: renamed from: X.0gcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172510gcL {
    public static Fragment LIZ(String str, String str2, String str3, boolean z, boolean z2, String str4, Boolean bool, InterfaceC1172550gcP interfaceC1172550gcP, String str5, String str6, String str7, List list) {
        if (C1171750gb7.LIZ()) {
            EditCollectionFragment editCollectionFragment = new EditCollectionFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("enableCollectionOptions", z2);
            C786410Ut5.LJJJI("title", str, bundle);
            C786410Ut5.LJJJI("btnName", str3, bundle);
            bundle.putBoolean("cancelStyle", z);
            C786410Ut5.LJJJI("defaultInput", str2, bundle);
            C786410Ut5.LJJJI("coverUrl", str5, bundle);
            C786410Ut5.LJJJI("enterFrom", str6, bundle);
            C786410Ut5.LJJJI("enterType", str7, bundle);
            C786410Ut5.LJJJI("awemeId", str4, bundle);
            if (bool != null) {
                bundle.putBoolean("isLSContent", bool.booleanValue());
            }
            editCollectionFragment.setArguments(bundle);
            editCollectionFragment.LLJIJIL = interfaceC1172550gcP;
            editCollectionFragment.LLJJIJIIJIL = list;
            return editCollectionFragment;
        }
        InputNameSheetFragment inputNameSheetFragment = new InputNameSheetFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("enablePrivacySetting", z2);
        C786410Ut5.LJJJI("title", str, bundle2);
        C786410Ut5.LJJJI("btnName", str3, bundle2);
        bundle2.putBoolean("cancelStyle", z);
        C786410Ut5.LJJJI("defaultInput", str2, bundle2);
        C786410Ut5.LJJJI("awemeId", str4, bundle2);
        if (bool != null) {
            bundle2.putBoolean("isLSContent", bool.booleanValue());
        }
        C786410Ut5.LJJJI("enterFrom", str6, bundle2);
        inputNameSheetFragment.setArguments(bundle2);
        inputNameSheetFragment.LLIZ = interfaceC1172550gcP;
        return inputNameSheetFragment;
    }

    public static void LIZJ(FragmentManager fragmentManager, String str, String str2, String str3, String str4, Boolean bool, InterfaceC1172550gcP interfaceC1172550gcP, String str5, String str6, String str7, List list, int i) {
        boolean z;
        String str8 = str7;
        String str9 = str6;
        InterfaceC1172550gcP interfaceC1172550gcP2 = interfaceC1172550gcP;
        Boolean bool2 = bool;
        String str10 = str4;
        String str11 = str5;
        String str12 = str2;
        List list2 = null;
        if ((i & 4) != 0) {
            str12 = null;
        }
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 64) != 0) {
            str10 = null;
        }
        if ((i & 128) != 0) {
            bool2 = null;
        }
        if ((i & 256) != 0) {
            interfaceC1172550gcP2 = null;
        }
        if ((i & 512) != 0) {
            str11 = null;
        }
        if ((i & 1024) != 0) {
            str9 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str8 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
            list2 = list;
        }
        Fragment fragmentLIZ = LIZ(str, str12, str3, true, z, str10, bool2, interfaceC1172550gcP2, str11, str9, str8, list2);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LJI(16);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = fragmentLIZ;
        C1391850mK7.LIZIZ(tuxSheet, "profile_collection_share_change_name_nscreen");
        tuxSheet.show(fragmentManager, "VideoCollectionChoose");
    }
}
