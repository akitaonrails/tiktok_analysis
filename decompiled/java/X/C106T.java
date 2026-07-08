package X;

import android.text.Spanned;
import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.PrivacyUserSettingDataViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.106T, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C106T {
    public static final C106T LIZ = new C106T();

    public static boolean LIZ() {
        boolean z;
        boolean z2;
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService == null || !iPrivacySettingsDepService.LJJIJ()) {
            Iterator it2 = ((ArrayList) LIZLLL()).iterator();
            loop0: while (true) {
                while (it2.hasNext()) {
                    z = z || C191985108x.LIZLLL((PrivacySettingsRestrictionItem) it2.next()).LIZIZ;
                }
            }
            if (z) {
                return true;
            }
            Iterator it3 = ((ArrayList) LIZJ()).iterator();
            loop2: while (true) {
                while (it3.hasNext()) {
                    z2 = z2 || C191985108x.LIZLLL((PrivacySettingsRestrictionItem) it3.next()).LIZIZ;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static List LIZJ() {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("dm_setting_friends", "dm_setting_potential_connection", "dm_setting_others");
        ArrayList arrayList = new ArrayList();
        for (String str : listLJIIJJI) {
            C191880104w.LIZ.getClass();
            PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, str);
            if (privacySettingsRestrictionItemLJIIJJI != null) {
                arrayList.add(privacySettingsRestrictionItemLJIIJJI);
            }
        }
        return arrayList;
    }

    public static List LIZLLL() {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("chatsets", "filtered_message", "message_read_status", "tcm_message");
        ArrayList arrayList = new ArrayList();
        for (String str : listLJIIJJI) {
            C191880104w.LIZ.getClass();
            PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, str);
            if (privacySettingsRestrictionItemLJIIJJI != null) {
                arrayList.add(privacySettingsRestrictionItemLJIIJJI);
            }
        }
        return arrayList;
    }

    public static PrivacyUserSettingDataViewModel LIZIZ(ViewModelStoreOwner viewModelStoreOwner, String str, String str2) {
        C191880104w.LIZ.getClass();
        if (!C191985108x.LIZLLL(C191880104w.LJIIJJI(0, str2)).LIZIZ) {
            return null;
        }
        return AnonymousClass1093.LIZ(viewModelStoreOwner, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(View view, View view2, TuxTextView tuxTextView, View view3) {
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ(2131828188);
        c444940Hca.LIZLLL(5);
        c444940Hca.LIZIZ(51);
        c444940Hca.LIZIZ = false;
        c444940Hca.LJIIIIZZ = new AwS556S0100000_12(view, 855);
        Spanned spannedLIZ = C10KE.LIZ(view2.getContext(), 2131828187, c444940Hca.LIZ(view.getContext()));
        C786410Ut5.LJLLLLLL(0, view2);
        C786410Ut5.LJLLLLLL(8, view3);
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        tuxTextView.setText(spannedLIZ);
    }
}
