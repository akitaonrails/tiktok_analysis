package X;

import Y.ARunnableS9S1100000_3;
import android.view.View;
import com.ss.android.ugc.aweme.publicgroup.data.GroupForInvitation;
import com.ss.android.ugc.aweme.publicgroup.data.GroupForPreview;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;

/* JADX INFO: renamed from: X.0i6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229780i6i {
    public static final C1229810i6l LIZIZ(GroupForInvitation groupForInvitation) {
        return new C1229810i6l(groupForInvitation.convShortId, groupForInvitation.groupName, groupForInvitation.avatarUrl, groupForInvitation.groupSize, groupForInvitation.groupMemberLimit, groupForInvitation.groupDesc, groupForInvitation.groupOwnerId, groupForInvitation.groupOwnerName, groupForInvitation.needApproval, groupForInvitation.auditQuestion, groupForInvitation.effectiveConfig);
    }

    public static final C1230090i7D LIZJ(GroupPreviewDisplayMeta groupPreviewDisplayMeta) {
        C1229810i6l c1229810i6l;
        GroupForPreview groupForPreview = groupPreviewDisplayMeta.groupInfo;
        if (groupForPreview == null) {
            c1229810i6l = new C1229810i6l(0);
        } else {
            c1229810i6l = new C1229810i6l(groupForPreview.convShortId, groupForPreview.groupName, groupForPreview.avatarUrl, groupForPreview.groupSize, groupForPreview.groupMemberLimit, groupForPreview.groupDesc, groupForPreview.groupOwnerId, groupForPreview.groupOwnerName, groupForPreview.needApproval, groupForPreview.auditQuestion, groupForPreview.effectiveConfig);
        }
        return new C1230090i7D(c1229810i6l, groupPreviewDisplayMeta.userGroupStatus, groupPreviewDisplayMeta.checkResults, null, groupPreviewDisplayMeta.eventTracking, groupPreviewDisplayMeta.popupDisplayMeta);
    }

    public static final C1230090i7D LIZLLL(PopupDisplayMeta popupDisplayMeta) {
        return new C1230090i7D(LIZIZ(popupDisplayMeta.groupInfo), popupDisplayMeta.userGroupStatus, popupDisplayMeta.checkResults, popupDisplayMeta.groupInvitation, popupDisplayMeta.eventTracking, popupDisplayMeta);
    }

    public static final void LIZ(View view, String str) {
        C1481605r4.LIZIZ(new ARunnableS9S1100000_3(view, str, 11));
    }
}
