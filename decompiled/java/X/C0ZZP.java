package X;

import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ZZP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel$trackOnBind$1", f = "LiveCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0ZZP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveCardViewModel LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ ShareLiveContent LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZZP(LiveCardViewModel liveCardViewModel, C869590Y9l c869590Y9l, ShareLiveContent shareLiveContent, String str, InterfaceC1364105Vn<? super C0ZZP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveCardViewModel;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = shareLiveContent;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZZP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String sharedEnterFrom;
        NewLiveRoomStruct newLiveRoomStruct;
        C1C7U.LIZ("LiveCardViewModel@1233.trackOnBind$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveCardViewModel liveCardViewModel = this.LL;
        C869590Y9l c869590Y9l = this.LLILLJJLI;
        ShareLiveContent shareLiveContent = this.LLILLL;
        String str2 = this.LLILZ;
        liveCardViewModel.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (liveCardViewModel.AQ2().containsKey(str2) && (newLiveRoomStruct = liveCardViewModel.AQ2().get(str2)) != null && newLiveRoomStruct.id != 0) {
            str = "live";
        } else {
            str = "end";
        }
        if (shareLiveContent != null) {
            sharedEnterFrom = shareLiveContent.getSharedEnterFrom();
        } else {
            sharedEnterFrom = null;
        }
        if (Intrinsics.LJFF(sharedEnterFrom, "stream_goal")) {
            str = "stream_goal";
        }
        linkedHashMap.put("show_type", str);
        linkedHashMap.put("from_user_id", String.valueOf(c869590Y9l.getSender()));
        LiveCardViewModel.vQ2(c869590Y9l.getConversationId(), linkedHashMap);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("livesdk_share_chat_show", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveCardViewModel@1233.trackOnBind$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
