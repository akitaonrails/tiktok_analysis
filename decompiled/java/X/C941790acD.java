package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.model.FanTicketModel;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0acD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C941790acD extends C2217421BqW implements Function1<FanTicketRoomNoticeContent, Unit> {
    public C941790acD(Object obj) {
        super(1, obj, FanTicketModel.class, "onTicketContentUpdated", "onTicketContentUpdated(Lcom/bytedance/android/livesdk/model/message/FanTicketRoomNoticeContent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        ((FanTicketModel) this.receiver).LIZJ(fanTicketRoomNoticeContent);
        return Unit.LIZ;
    }
}
