package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0Tee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C751980Tee {
    public static final boolean LIZIZ(List<GameTag> list) {
        int size = list.size();
        if (size != 1) {
            if (size == 2 && ((GameTag) ListProtector.get(list, 0)).isNonGameOrOtherGameItem() && ((GameTag) ListProtector.get(list, 1)).isNonGameOrOtherGameItem()) {
                return true;
            }
            return false;
        }
        return ((GameTag) ListProtector.get(list, 0)).isNonGameOrOtherGameItem();
    }

    public static final LiveMode LIZJ(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        }
        return null;
    }

    public static final boolean LIZLLL(DataChannel dataChannel) {
        RoomCreateInfo roomCreateInfo;
        boolean z;
        if (dataChannel != null) {
            roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class);
        } else {
            roomCreateInfo = null;
        }
        boolean z2 = false;
        if (roomCreateInfo != null) {
            z = roomCreateInfo.showGameTags;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShowGameCategoryEntry. result=");
        sbLIZ.append(z);
        sbLIZ.append(". dataChannelNull=");
        if (dataChannel == null) {
            z2 = true;
        }
        sbLIZ.append(z2);
        C20441214yg.LJIIIZ("GameCategoryExt", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public static final void LIZ(FragmentManager fragmentManager, String str) {
        Fragment fragmentLJJJJZI;
        if (fragmentManager != null) {
            fragmentLJJJJZI = fragmentManager.LJJJJZI(str);
        } else {
            fragmentLJJJJZI = null;
        }
        if (fragmentLJJJJZI instanceof DialogFragment) {
            ((DialogFragment) fragmentLJJJJZI).dismiss();
        }
    }
}
