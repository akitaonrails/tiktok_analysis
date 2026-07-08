package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.AIMojiStickerConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;

/* JADX INFO: renamed from: X.0I9Y, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel", f = "MessageListFooterViewModel.kt", l = {218, 220}, m = "tryToMapAiStickersWithExpression")
public final class C0I9Y extends AbstractC23140094w {
    public AIMojiStickerConfig LL;
    public PreshownStickerItem LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ MessageListFooterViewModel LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I9Y(MessageListFooterViewModel messageListFooterViewModel, InterfaceC1364105Vn<? super C0I9Y> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = messageListFooterViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageListFooterViewModel@60fe.tryToMapAiStickersWithExpression$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLIZLLLIL.xQ2(null, null, null, this);
        C1C7U.LIZIZ("MessageListFooterViewModel@60fe.tryToMapAiStickersWithExpression$1");
        return objXQ2;
    }
}
