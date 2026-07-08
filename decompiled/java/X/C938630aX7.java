package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;

/* JADX INFO: renamed from: X.0aX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938630aX7 implements InterfaceC922630a7J {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C938620aX6 LLILLJJLI;

    @Override // X.InterfaceC922630a7J
    public final void Ue(Throwable th) {
    }

    public C938630aX7(String str, C938620aX6 c938620aX6) {
        this.LL = str;
        this.LLILLJJLI = c938620aX6;
    }

    @Override // X.InterfaceC922630a7J
    public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
        User user;
        String str;
        LinkPlayerInfo linkPlayerInfoLJFF = interfaceC921200a50.LJFF(this.LL);
        if (linkPlayerInfoLJFF == null || (user = linkPlayerInfoLJFF.mUser) == null) {
            return;
        }
        MultiLiveGuestInfoList source = interfaceC921200a50.getSource();
        if (source != null && (str = source.fanTicketIconUrl) != null) {
            AbstractC938650aX9.LJIILJJIL(this.LLILLJJLI.LJIIIIZZ(), str);
        }
        AbstractC938650aX9.LJIILJJIL(this.LLILLJJLI.LJI(), new C939680aYo(user.getId(), this.LL, C0KVU.LIZ(user)));
        AbstractC938650aX9.LJIILJJIL(this.LLILLJJLI.LJFF(), user.getAvatarThumb());
    }

    @Override // X.InterfaceC922630a7J
    public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
        User user;
        LinkListUser linkListUserLJFF = interfaceC921200a50.LJFF(this.LL);
        if (linkListUserLJFF == null || (user = linkListUserLJFF.user) == null) {
            return;
        }
        AbstractC938650aX9.LJIILJJIL(this.LLILLJJLI.LJI(), new C939680aYo(user.getId(), this.LL, C0KVU.LIZ(user)));
        AbstractC938650aX9.LJIILJJIL(this.LLILLJJLI.LJFF(), user.getAvatarThumb());
    }
}
