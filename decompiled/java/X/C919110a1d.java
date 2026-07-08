package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestQuickConnectInviteSheetFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0a1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C919110a1d extends C2217421BqW implements Function1<LinkPlayerInfo, Unit> {
    public C919110a1d(Object obj) {
        super(1, obj, MultiGuestQuickConnectInviteSheetFragment.class, "reportUserShow", "reportUserShow(Lcom/bytedance/android/livesdk/chatroom/model/interact/LinkPlayerInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkPlayerInfo linkPlayerInfo) {
        String str;
        LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
        MultiGuestQuickConnectInviteSheetFragment multiGuestQuickConnectInviteSheetFragment = (MultiGuestQuickConnectInviteSheetFragment) this.receiver;
        multiGuestQuickConnectInviteSheetFragment.getClass();
        long id = linkPlayerInfo2.mUser.getId();
        if (id > 0 && multiGuestQuickConnectInviteSheetFragment.LLILZIL.add(Long.valueOf(id))) {
            int i = linkPlayerInfo2.userType;
            String str2 = "";
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "";
                    } else {
                        str = "outroom_recommend_user";
                    }
                } else {
                    str = "outroom_friend";
                }
            } else {
                str = "room_viewer";
            }
            String str3 = linkPlayerInfo2.mInteractIdStr;
            if (str3 != null) {
                str2 = str3;
            }
            C922810a7b.LIZIZ("show", str, str2, C920500a3s.LIZ);
        }
        return Unit.LIZ;
    }
}
