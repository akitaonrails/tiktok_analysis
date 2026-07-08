package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.NoticeboardContent;

/* JADX INFO: renamed from: X.01un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C485501un extends C2217421BqW implements Function2<NoticeboardContent, String, Unit> {
    public C485501un(NoticeboardGuestController noticeboardGuestController) {
        super(2, noticeboardGuestController, NoticeboardGuestController.class, "handlerNoticeboardContent", "handlerNoticeboardContent(Lwebcast/data/multi_guest_play/NoticeboardContent;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(NoticeboardContent noticeboardContent, String str) {
        ((NoticeboardGuestController) this.receiver).LJIIJJI(noticeboardContent, str);
        return Unit.LIZ;
    }
}
