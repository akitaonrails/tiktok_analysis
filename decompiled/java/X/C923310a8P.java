package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0a8P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C923310a8P extends C2217421BqW implements Function1<Integer, Unit> {
    public C923310a8P(Object obj) {
        super(1, obj, MultiLiveAsAnchorListDialogV2.class, "logSeeAllItemShow", "logSeeAllItemShow(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        if (!((ArrayList) multiLiveAsAnchorListDialogV2.LLJJJJLIIL).contains(Integer.valueOf(iIntValue))) {
            ((ArrayList) multiLiveAsAnchorListDialogV2.LLJJJJLIIL).add(Integer.valueOf(iIntValue));
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    if (iIntValue != 4) {
                        if (iIntValue == 7) {
                            C922800a7a.LJII(multiLiveAsAnchorListDialogV2.LLLLLL.size(), multiLiveAsAnchorListDialogV2.LLJJJJJIL, "show", "outroom_live_event_register", null);
                        }
                    } else {
                        C922800a7a.LJII(multiLiveAsAnchorListDialogV2.LLLLLJLJLL.size(), multiLiveAsAnchorListDialogV2.LLJJJJ, "show", "outroom_friend", null);
                    }
                } else {
                    C922800a7a.LJII(multiLiveAsAnchorListDialogV2.LLLLLILLIL.size(), multiLiveAsAnchorListDialogV2.LLJJJIL, "show", "room_viewer", null);
                }
            } else {
                C922800a7a.LJII(multiLiveAsAnchorListDialogV2.LLLLL.size(), multiLiveAsAnchorListDialogV2.LLJJJ, "show", "room_viewer_apply", null);
            }
        }
        return Unit.LIZ;
    }
}
