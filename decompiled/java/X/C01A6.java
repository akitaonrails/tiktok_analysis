package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.moderator.ModeratorOpsListSheet;
import com.bytedance.android.livesdk.usercard.TryModeLiveProfileDialog;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import tikcast.api.anchor.AdminOperationRecordItem;
import tikcast.api.anchor.AdminOperationRecordListResponse;

/* JADX INFO: renamed from: X.01A6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01A6 extends BaseExpandableListAdapter {
    public static final BDDateFormat LIZJ = new BDDateFormat("lll");
    public static final BDDateFormat LIZLLL = new BDDateFormat("tdy, YYYY lt");
    public static final BDDateFormat LJ = new BDDateFormat("lt");
    public final List<AdminOperationRecordListResponse.Data.RoomRecord> LIZ;
    public final WeakReference<ModeratorOpsListSheet> LIZIZ;

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.LIZ.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        List<AdminOperationRecordItem> list;
        AdminOperationRecordListResponse.Data.RoomRecord roomRecord = (AdminOperationRecordListResponse.Data.RoomRecord) C13LP.LJJJLZIJ(i, this.LIZ);
        if (roomRecord != null && (list = roomRecord.records) != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return C13LP.LJJJLZIJ(i, this.LIZ);
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        AdminOperationRecordListResponse.Data.RoomRecord roomRecord = (AdminOperationRecordListResponse.Data.RoomRecord) C13LP.LJJJLZIJ(i, this.LIZ);
        if (roomRecord != null) {
            return roomRecord.roomId;
        }
        return -1L;
    }

    public C01A6(List<AdminOperationRecordListResponse.Data.RoomRecord> list, ModeratorOpsListSheet moderatorOpsListSheet) {
        this.LIZ = list;
        this.LIZIZ = new WeakReference<>(moderatorOpsListSheet);
    }

    public static void LIZ(DataChannel dataChannel, User user) {
        if (user == null) {
            return;
        }
        if (C500260Jjc.LJJJIL(dataChannel)) {
            TryModeLiveProfileDialog tryModeLiveProfileDialogHG1 = ((ILiveProfileService) C1161920gLG.LIZJ(ILiveProfileService.class)).HG1(user.getId(), null);
            FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            if (fragmentManager != null) {
                tryModeLiveProfileDialogHG1.NR(fragmentManager);
                return;
            }
            return;
        }
        if (!C500260Jjc.LJJIJLIJ() && !C500260Jjc.LJIJJLI(dataChannel) && !C500260Jjc.LJIJJ(dataChannel)) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId());
            userProfileEvent.mSource = "unknown";
            userProfileEvent.clickModule = "moderator_setting";
            userProfileEvent.mReportType = "report_user";
            C784440Upu.LIZ().LIZIZ(userProfileEvent);
            return;
        }
        HashMap map = new HashMap();
        map.put("sec_user_id", user.getSecUid());
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openUserProfilePage(user.getId(), map);
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        List<AdminOperationRecordItem> list;
        AdminOperationRecordListResponse.Data.RoomRecord roomRecord = (AdminOperationRecordListResponse.Data.RoomRecord) C13LP.LJJJLZIJ(i, this.LIZ);
        if (roomRecord != null && (list = roomRecord.records) != null) {
            return C13LP.LJJJLZIJ(i2, list);
        }
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        int iHashCode;
        Object child = getChild(i, i2);
        if ((child instanceof AdminOperationRecordItem) && child != null) {
            iHashCode = child.hashCode();
        } else {
            iHashCode = 0;
        }
        return iHashCode;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        AdminOperationRecordListResponse.Data.RoomRecord roomRecord;
        String strLIZIZ;
        boolean z2 = false;
        Context context = null;
        if (view == null) {
            if (viewGroup != null) {
                context = viewGroup.getContext();
            }
            view = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h8v, viewGroup, false);
        }
        Object group = getGroup(i);
        if ((group instanceof AdminOperationRecordListResponse.Data.RoomRecord) && (roomRecord = (AdminOperationRecordListResponse.Data.RoomRecord) group) != null) {
            TextView textView = (TextView) view.findViewById(R.id.nyn);
            if (textView != null) {
                long j = roomRecord.startTime;
                C01A7 c01a7LIZ = C332701Qv.LIZ();
                if (j > c01a7LIZ.LIZ && j < c01a7LIZ.LIZIZ) {
                    z2 = true;
                }
                if (z2) {
                    strLIZIZ = LIZLLL.LIZIZ(roomRecord.startTime * 1000, Locale.getDefault());
                } else {
                    strLIZIZ = LIZJ.LIZIZ(roomRecord.startTime * 1000, Locale.getDefault());
                }
                textView.setText(strLIZIZ);
            }
            LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.nym);
            if (liveIconView != null) {
                C500260Jjc.LJLJLJ(liveIconView, true ^ roomRecord.records.isEmpty());
                if (z) {
                    liveIconView.setIcon(C20736316Cj.LJ(R.attr.d3m, view.getContext()));
                } else {
                    liveIconView.setIcon(C20736316Cj.LJ(R.attr.d2k, view.getContext()));
                    return view;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    @Override // android.widget.ExpandableListAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getChildView(int r20, int r21, boolean r22, android.view.View r23, android.view.ViewGroup r24) {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01A6.getChildView(int, int, boolean, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
