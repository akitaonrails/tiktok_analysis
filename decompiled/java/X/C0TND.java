package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0TND, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TND {
    public static LiveBoardsPageDialogFragment LIZ(C0TND c0tnd, String str, String str2, DataChannel dataChannel, Bundle bundle, C1814370xJb c1814370xJb, int i) {
        if ((i & 8) != 0) {
            bundle = new Bundle();
        }
        if ((i & 16) != 0) {
            c1814370xJb = null;
        }
        c0tnd.getClass();
        LiveBoardsPageDialogFragment liveBoardsPageDialogFragment = new LiveBoardsPageDialogFragment();
        liveBoardsPageDialogFragment.LLILZIL = c1814370xJb;
        liveBoardsPageDialogFragment.dataChannel = dataChannel;
        liveBoardsPageDialogFragment.LLILLJJLI = str;
        C786410Ut5.LJJJI("show_entrance", str, bundle);
        if (str2 != null) {
            C786410Ut5.LJJJI("room_id", str2, bundle);
        }
        liveBoardsPageDialogFragment.setArguments(bundle);
        return liveBoardsPageDialogFragment;
    }
}
