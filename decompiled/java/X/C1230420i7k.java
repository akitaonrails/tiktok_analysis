package X;

import android.view.View;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.ss.android.ugc.aweme.publicgroup.data.JoinApplyInfo;

/* JADX INFO: renamed from: X.0i7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230420i7k {
    public static final C1230520i7u LIZ(AbstractC1230540i7w abstractC1230540i7w, GroupInvitationVM groupInvitationVM, View view) {
        JoinApplyInfo joinApplyInfo = groupInvitationVM.getState().LLILZ;
        EnumC1230500i7s joinGroupSource = abstractC1230540i7w.getJoinGroupSource();
        C1229970i71 c1229970i71 = EnumC1229960i70.Companion;
        int i = groupInvitationVM.getState().LLILLJJLI;
        c1229970i71.getClass();
        C1230080i7C c1230080i7C = new C1230080i7C(joinGroupSource, C1229970i71.LIZ(i), abstractC1230540i7w.getJoinGroupEnterChatParams(), String.valueOf(groupInvitationVM.getState().LL.LIZ), abstractC1230540i7w.getGroupMetaData().LJ, true, view, false, null, 256);
        if (abstractC1230540i7w instanceof C1230550i7x) {
            return new C1230520i7u(EnumC1230590i81.JOIN_GROUP_SCENE_BY_ACTIVE_ENTRANCE, c1230080i7C, new C1230110i7F(joinApplyInfo, 7));
        }
        if (abstractC1230540i7w instanceof C1230560i7y) {
            EnumC1230590i81 enumC1230590i81 = EnumC1230590i81.JOIN_GROUP_SCENE_BY_INTERNAL_INVITATION;
            AbstractC1230690i8B abstractC1230690i8B = (AbstractC1230690i8B) abstractC1230540i7w;
            String inviteId = abstractC1230690i8B.getInviteId();
            abstractC1230690i8B.getInviteSource();
            return new C1230520i7u(enumC1230590i81, c1230080i7C, new C1230110i7F(inviteId, abstractC1230690i8B.getInviteEventInfo(), joinApplyInfo));
        }
        if (abstractC1230540i7w instanceof C1230570i7z) {
            EnumC1230590i81 enumC1230590i812 = EnumC1230590i81.JOIN_GROUP_SCENE_BY_EXTERNAL_INVITATION;
            AbstractC1230690i8B abstractC1230690i8B2 = (AbstractC1230690i8B) abstractC1230540i7w;
            String inviteId2 = abstractC1230690i8B2.getInviteId();
            abstractC1230690i8B2.getInviteSource();
            return new C1230520i7u(enumC1230590i812, c1230080i7C, new C1230110i7F(inviteId2, abstractC1230690i8B2.getInviteEventInfo(), joinApplyInfo));
        }
        throw new C1954807lC();
    }
}
