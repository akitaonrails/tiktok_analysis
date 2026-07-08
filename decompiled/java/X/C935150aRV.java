package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.guest.PlaybookGuestService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0aRV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935150aRV {
    public static InterfaceC927850aFj LIZIZ() {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("PLAYBOOK_GUEST_SERVICE");
        if (objLJIIIZ instanceof InterfaceC927850aFj) {
            return (InterfaceC927850aFj) objLJIIIZ;
        }
        return null;
    }

    public static void LIZ(DataChannel dataChannel, Fragment fragment, LifecycleOwner lifecycleOwner) {
        if (dataChannel != null && fragment != null) {
            C1AZW.LJIIJ(12, C01EI.LIZ(102, "PlaybookGuestServiceCompanion"), "PlaybookGuestService create instance", null, null);
            lifecycleOwner.getLifecycle().addObserver(new PlaybookGuestService(dataChannel, new WeakReference(fragment)));
            return;
        }
        String strLIZ = C01EI.LIZ(107, "PlaybookGuestServiceCompanion");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookGuestService create, but dataChannel=");
        sbLIZ.append(dataChannel);
        sbLIZ.append(", fragment=");
        sbLIZ.append(fragment);
        C1AZW.LJFF(strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }
}
