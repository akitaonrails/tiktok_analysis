package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.poplayer.core.PopupManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903850zdv {
    public static final C1903850zdv LIZ = new C1903850zdv();

    public static boolean LIZ(Fragment fragment, FragmentManager fragmentManager, String str, InterfaceC1887820zE4 interfaceC1887820zE4, InterfaceC20658015sY interfaceC20658015sY) {
        if (interfaceC20658015sY == null) {
            return false;
        }
        if (Intrinsics.LJFF(str, "suggested_friends_updated")) {
            PopupManager.LJIJI(new C1906300zhs(fragmentManager, str, interfaceC1887820zE4, interfaceC20658015sY), true);
            return true;
        }
        if (!Intrinsics.LJFF(str, "updates_to_direct_message_settings") || !C1336205Ku.LIZ(false).getImPrivacySettings().LJIILL()) {
            return false;
        }
        PopupManager.LJIIZILJ(new C1906290zhr(fragment, str, interfaceC1887820zE4, interfaceC20658015sY), new C1668306g5("social_dm_updates_to_direct_message_settings"));
        return true;
    }
}
