package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.IsFromWatchFocusTray;
import com.bytedance.android.live.room.GameMomentChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114850f7L {
    public int LIZ;
    public boolean LIZIZ;
    public DataChannel LIZJ;
    public RecyclerView LIZLLL;
    public String LJ = "";
    public String LJFF = "";

    public final void LIZ(boolean z) {
        String str;
        boolean zLJFF;
        Object obj;
        C204543151x c204543151x;
        if (this.LIZIZ != z) {
            int iLIZIZ = 0;
            if (z) {
                this.LIZ = 0;
            } else {
                RecyclerView recyclerView = this.LIZLLL;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                boolean z2 = true;
                if (recyclerView.getLayoutDirection() != 1 ? this.LIZ > 0 : this.LIZ < 0) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_quick_comment_right_slide");
                    c474500IjALIZ.LJIJJLI(this.LIZJ);
                    if (C497740JfY.LJIL()) {
                        str = "portrait";
                    } else {
                        str = "landscape";
                    }
                    c474500IjALIZ.LJJII(str, "room_orientation");
                    DataChannel dataChannel = this.LIZJ;
                    if (dataChannel != null) {
                        zLJFF = Intrinsics.LJFF(dataChannel.gg0(IsFromWatchFocusTray.class), Boolean.TRUE);
                    } else {
                        zLJFF = false;
                    }
                    if (zLJFF) {
                        obj = "1";
                    } else {
                        obj = CardStruct.IStatusCode.DEFAULT;
                    }
                    c474500IjALIZ.LJJII(obj, "is_game_highlight_broadcast");
                    if (C13LQ.LJJIJIIJI(this.LJ, new String[]{"7", "9", "8"}) < 0) {
                        z2 = false;
                    }
                    if (z2) {
                        c474500IjALIZ.LJJII("1", "from_game_highlight_moment");
                        DataChannel dataChannel2 = this.LIZJ;
                        if (dataChannel2 != null && (c204543151x = (C204543151x) dataChannel2.gg0(GameMomentChannel.class)) != null) {
                            iLIZIZ = c204543151x.LIZIZ();
                        }
                        c474500IjALIZ.LJJII(C778700Uge.LIZ(iLIZIZ), "highlight_moment_type");
                    } else {
                        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "from_game_highlight_moment");
                    }
                    c474500IjALIZ.LJJII(this.LJFF, "show_type");
                    c474500IjALIZ.LIZ();
                }
            }
            this.LIZIZ = z;
        }
    }
}
