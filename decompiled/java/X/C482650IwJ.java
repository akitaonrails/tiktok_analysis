package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.toplive.cell.FollowWindowSkylightCell;
import com.ss.android.ugc.aweme.toplive.cell.HangoutSectionKTVorDrawingCell;
import com.ss.android.ugc.aweme.toplive.cell.HangoutSectionMultiGuestRoomCell;
import com.ss.android.ugc.aweme.toplive.cell.YouMayLikeDualCell;
import java.util.List;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: renamed from: X.0IwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482650IwJ extends C0DXR {
    public static final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        C21681819tI c21681819tI;
        C21681819tI c21681819tI2;
        List<ToplivePageItem> list;
        C21681819tI c21681819tI3;
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder instanceof YouMayLikeDualCell) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C21681819tI) && (c21681819tI3 = (C21681819tI) layoutParams) != null) {
                if (c21681819tI3.LIZ() == 0) {
                    int i = LL;
                    rect.set(i, i, i / 2, i);
                    return;
                } else {
                    int i2 = LL;
                    rect.set(i2 / 2, i2, i2, i2);
                    return;
                }
            }
            return;
        }
        if (childViewHolder instanceof FollowWindowSkylightCell) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (!(layoutParams2 instanceof C21681819tI) || (c21681819tI2 = (C21681819tI) layoutParams2) == null) {
                return;
            }
            if (((FollowWindowSkylightCell) childViewHolder).LLILZLL) {
                C482300Ivk.LIZ.getClass();
                ToplivePageItem toplivePageItem = C482300Ivk.LIZIZ;
                if (toplivePageItem == null || (list = toplivePageItem.subItems) == null || list.size() <= 0) {
                    int i3 = LLILLJJLI;
                    rect.left = i3;
                    rect.right = i3;
                    return;
                }
            }
            int iLIZ = c21681819tI2.LIZ();
            if (iLIZ != 0) {
                if (iLIZ != 1) {
                    return;
                }
                rect.left = LLILLL / 2;
                rect.right = LLILLJJLI;
                return;
            }
            rect.left = LLILLJJLI;
            rect.right = LLILLL / 2;
            return;
        }
        if (!(childViewHolder instanceof HangoutSectionMultiGuestRoomCell) && !(childViewHolder instanceof HangoutSectionKTVorDrawingCell)) {
            rect.set(0, 0, 0, 0);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (!(layoutParams3 instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams3) == null) {
            return;
        }
        int iLIZ2 = c21681819tI.LIZ();
        if (iLIZ2 != 0) {
            if (iLIZ2 != 1) {
                return;
            }
            rect.left = LLILLL / 2;
            rect.right = LLILLJJLI;
            return;
        }
        rect.left = LLILLJJLI;
        rect.right = LLILLL / 2;
    }
}
