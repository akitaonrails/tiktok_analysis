package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.model.ActivitiesIconInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNoPermissionDisplaySwitch;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.EntranceConditionsPopup;

/* JADX INFO: renamed from: X.0ULf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770730ULf {
    public static final boolean LIZJ() {
        return LiveNoPermissionDisplaySwitch.INSTANCE.enable() && Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class), Boolean.TRUE);
    }

    public static final C0UJY LIZ(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (C0UJY) dataChannel.gg0(C770180UJc.class);
        }
        return null;
    }

    public static final boolean LIZIZ(DataChannel dataChannel) {
        RoomCreateInfo roomCreateInfo;
        ActivitiesIconInfo activitiesIconInfo;
        Long l;
        if (dataChannel == null || (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null || (activitiesIconInfo = roomCreateInfo.activitiesIconInfo) == null || (l = activitiesIconInfo.abGroup) == null || l.longValue() == 0) {
            return false;
        }
        return true;
    }

    public static final void LIZLLL(C474500IjA c474500IjA) {
        c474500IjA.LJJII(Integer.valueOf(!Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class), Boolean.TRUE) ? 1 : 0), "has_permission");
    }

    public static final boolean LJ(DataChannel dataChannel) {
        Integer num;
        if (dataChannel == null || (num = (Integer) dataChannel.gg0(C0ULJ.class)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(DataChannel dataChannel) {
        Integer num;
        if (dataChannel == null || (num = (Integer) dataChannel.gg0(C0ULJ.class)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(DataChannel dataChannel) {
        Integer num;
        if (dataChannel == null || (num = (Integer) dataChannel.gg0(C0ULJ.class)) == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(DataChannel dataChannel) {
        Integer num;
        if (dataChannel == null || (num = (Integer) dataChannel.gg0(C0ULJ.class)) == null) {
            return false;
        }
        if (num.intValue() != 1 && num.intValue() != 2 && num.intValue() != 3) {
            return false;
        }
        return true;
    }

    public static final void LJIIIIZZ(Context context, DataChannel dataChannel, EntranceConditionsPopup entranceConditionsPopup) {
        FragmentManager fragmentManager;
        if (dataChannel != null) {
            fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        } else {
            fragmentManager = null;
        }
        if (context != null) {
            C770750ULh c770750ULh = new C770750ULh();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.qe;
            c770750ULh.LIZ = c0hti.LIZ(context);
            c770750ULh.LIZLLL = 1;
            c770750ULh.LJ = entranceConditionsPopup.title;
            c770750ULh.LJIILLIIL = false;
            List<EntranceConditionsPopup.Condition> list = entranceConditionsPopup.conditions;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (EntranceConditionsPopup.Condition condition : list) {
                arrayList.add(new C770740ULg(condition.text, condition.match));
            }
            c770750ULh.LIZLLL(arrayList);
            C770770ULj c770770ULj = new C770770ULj();
            c770770ULj.LIZIZ(C497740JfY.LJIJI(2131842050));
            c770770ULj.LIZIZ = true;
            AwS373S0200000_7 awS373S0200000_7 = new AwS373S0200000_7(dataChannel, entranceConditionsPopup, 76);
            c770770ULj.LIZJ = awS373S0200000_7;
            c770750ULh.LJIIIIZZ = c770770ULj;
            c770750ULh.LJII = c770770ULj.LJFF;
            c770750ULh.LJIIIZ = awS373S0200000_7;
            C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
            DialogInterfaceOnCancelListenerC785950UsL dialogInterfaceOnCancelListenerC785950UsL = new DialogInterfaceOnCancelListenerC785950UsL(dataChannel, entranceConditionsPopup, 1);
            TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
            tuxSheet.LL = dialogInterfaceOnCancelListenerC785950UsL;
            if (fragmentManager != null) {
                tuxSheet.show(fragmentManager, "live_no_permission_guide");
                C0UQX.LJJII(dataChannel, entranceConditionsPopup, "show", null, null);
            }
        }
    }
}
