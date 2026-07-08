package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.NoticeboardContent;

/* JADX INFO: renamed from: X.01uo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C485601uo extends C2217421BqW implements Function2<NoticeboardContent, String, Unit> {
    public C485601uo(C953610avH c953610avH) {
        super(2, c953610avH, C953610avH.class, "handlerNoticeboardContent", "handlerNoticeboardContent(Lwebcast/data/multi_guest_play/NoticeboardContent;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(NoticeboardContent noticeboardContent, String str) {
        ((C953610avH) this.receiver).LJIILLIIL(noticeboardContent, str);
        return Unit.LIZ;
    }
}
