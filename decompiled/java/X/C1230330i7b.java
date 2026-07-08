package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.invitation.newdesign.fragment.GroupInvitationFragment;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: renamed from: X.0i7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230330i7b {
    public static WeakReference LIZ(Context context, AbstractC1230540i7w abstractC1230540i7w) {
        C1229320i5y.LIZIZ(EnumC1227850i3b.READY_TO_CREATE_PANEL);
        PopupDisplayMeta popupDisplayMeta = abstractC1230540i7w.getGroupMetaData().LJFF;
        if (popupDisplayMeta != null) {
            long j = popupDisplayMeta.groupInfo.convShortId;
            if (popupDisplayMeta.previewEntry != null && j != 0) {
                C874100YQu.LIZ.getClass();
                C874100YQu.LIZJ(j);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        GroupInvitationFragment.LLJJIII.put(strLIZIZ, abstractC1230540i7w);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            return null;
        }
        FragmentManager fragmentManagerLJIILL = SAFExtensionKt.LJIILL(c19egLIZIZ);
        if (fragmentManagerLJIILL == null) {
            fragmentManagerLJIILL = c19egLIZIZ.getSupportFragmentManager();
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("param_uuid", strLIZIZ, bundle);
        GroupInvitationFragment groupInvitationFragment = new GroupInvitationFragment();
        groupInvitationFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = groupInvitationFragment;
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        c1390920mIc.LJI(48);
        c1390920mIc.LIZ.LLILLJJLI = new DialogInterfaceOnDismissListenerC1265960j34(abstractC1230540i7w, 2);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.show(fragmentManagerLJIILL, "GroupInvitationFragment");
        return new WeakReference(tuxSheet);
    }
}
