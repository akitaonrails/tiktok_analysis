package X;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostContentComponent;
import java.util.List;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.15ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20571815ee {
    public final /* synthetic */ LiveSfvPostContentComponent LIZ;

    public C20571815ee(LiveSfvPostContentComponent liveSfvPostContentComponent) {
        this.LIZ = liveSfvPostContentComponent;
    }

    public final void LIZ(int i, RecyclerView recyclerView) {
        int i2;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C1838930xxD c1838930xxD;
        C1838930xxD c1838930xxD2;
        LiveSfvPostContentComponent liveSfvPostContentComponent;
        C1838900xxA c1838900xxA;
        List<T> list;
        LiveFragmentDetail liveFragmentDetail;
        Long lValueOf;
        String str;
        C1838900xxA c1838900xxA2 = this.LIZ.LLJZIJLIL;
        if (c1838900xxA2 != null) {
            i2 = c1838900xxA2.LLILZ;
        } else {
            i2 = 0;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = null;
        if (recyclerView != null) {
            viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i2);
        } else {
            viewHolderFindViewHolderForAdapterPosition = null;
        }
        if ((viewHolderFindViewHolderForAdapterPosition instanceof C1838930xxD) && (c1838930xxD2 = (C1838930xxD) viewHolderFindViewHolderForAdapterPosition) != null && (c1838900xxA = (liveSfvPostContentComponent = this.LIZ).LLJZIJLIL) != null && (list = c1838900xxA.mmItems) != 0 && (liveFragmentDetail = (LiveFragmentDetail) ListProtector.get(list, c1838900xxA.LLILZ)) != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - liveSfvPostContentComponent.LLLF;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_highlight_special_shaped_card_show");
            c474500IjALIZ.LJJII(122, "card_id");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII("show", "action_type");
            c474500IjALIZ.LJJII(liveSfvPostContentComponent.ip().getSubTitleStaringKey(), "card_info");
            c474500IjALIZ.LJJII(0, "is_video_play");
            c474500IjALIZ.LJJII(1, "is_uninsertion_card");
            C1838900xxA c1838900xxA3 = liveSfvPostContentComponent.LLJZIJLIL;
            if (c1838900xxA3 != null) {
                lValueOf = Long.valueOf(c1838900xxA3.LLLFZ());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "video_duration");
            c474500IjALIZ.LJJII(Long.valueOf(jElapsedRealtime), "card_duration");
            if (c1838930xxD2.LLJIJIL) {
                str = "auto_switch";
            } else {
                str = "manual_switch";
            }
            c474500IjALIZ.LJJII(str, "show_type");
            c474500IjALIZ.LJJII("homepage_hot", "enter_from");
            c474500IjALIZ.LJJII(String.valueOf(liveFragmentDetail.fragmentId), "fragment_id");
            c474500IjALIZ.LJJII(String.valueOf(liveFragmentDetail.fragmentTypeNew), "fragment_type");
            c474500IjALIZ.LJJII(Integer.valueOf(i2 + 1), "video_pos");
            c474500IjALIZ.LIZ();
        }
        if (recyclerView != null) {
            viewHolderFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(i);
        }
        if ((viewHolderFindViewHolderForAdapterPosition2 instanceof C1838930xxD) && (c1838930xxD = (C1838930xxD) viewHolderFindViewHolderForAdapterPosition2) != null) {
            LiveSfvPostContentComponent liveSfvPostContentComponent2 = this.LIZ;
            c1838930xxD.LLJIJIL = !liveSfvPostContentComponent2.LLLIIII;
            C1838900xxA c1838900xxA4 = liveSfvPostContentComponent2.LLJZIJLIL;
            if (c1838900xxA4 != null) {
                c1838900xxA4.LLLIIIIL(i, c1838930xxD);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onItemSelected - position: ");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("LiveSfvPostContentComponent", C2188811AlT.LIZIZ(sbLIZ));
            LiveFragmentDetail liveFragmentDetail2 = (LiveFragmentDetail) C13LP.LJJJLZIJ(i, liveSfvPostContentComponent2.ip().getFragments());
            if (liveFragmentDetail2 != null) {
                liveSfvPostContentComponent2.up(liveFragmentDetail2);
            }
        }
    }
}
