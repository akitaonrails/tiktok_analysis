package X;

import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ZZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel$onClick$4", f = "LiveCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0ZZQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveCardViewModel LL;
    public final /* synthetic */ C0ZZX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZZQ(LiveCardViewModel liveCardViewModel, C0ZZX c0zzx, InterfaceC1364105Vn<? super C0ZZQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveCardViewModel;
        this.LLILLJJLI = c0zzx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZZQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ShareLiveContent shareLiveContent;
        C1C7U.LIZ("LiveCardViewModel@1233.onClick$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveCardViewModel liveCardViewModel = this.LL;
        C869590Y9l message = this.LLILLJJLI.getMessage();
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(this.LLILLJJLI.getMessage(), ShareLiveContent.class);
        String sharedEnterFrom = null;
        if (orParseJsonContent instanceof ShareLiveContent) {
            shareLiveContent = (ShareLiveContent) orParseJsonContent;
        } else {
            shareLiveContent = null;
        }
        EnumC901750ZZd enumC901750ZZdLIZ = this.LLILLJJLI.LIZ();
        liveCardViewModel.getClass();
        String buttonTypeStr = enumC901750ZZdLIZ.getButtonTypeStr();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from_user_id", String.valueOf(message.getSender()));
        if (shareLiveContent != null) {
            sharedEnterFrom = shareLiveContent.getSharedEnterFrom();
        }
        if (Intrinsics.LJFF(sharedEnterFrom, "stream_goal")) {
            buttonTypeStr = "stream_goal";
        }
        linkedHashMap.put("button_type", buttonTypeStr);
        LiveCardViewModel.vQ2(message.getConversationId(), linkedHashMap);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("livesdk_share_chat_click", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveCardViewModel@1233.onClick$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
