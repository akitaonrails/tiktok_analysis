package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;

/* JADX INFO: renamed from: X.0I9Z, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel", f = "MessageListFooterViewModel.kt", l = {202}, m = "replaceLocalMappingStickers")
public final class C0I9Z extends AbstractC23140094w {
    public PreshownStickerSceneConfig LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public PreshownStickerItem LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ MessageListFooterViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I9Z(MessageListFooterViewModel messageListFooterViewModel, InterfaceC1364105Vn<? super C0I9Z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = messageListFooterViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageListFooterViewModel@60fe.replaceLocalMappingStickers$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZLL.wQ2(null, this);
        C1C7U.LIZIZ("MessageListFooterViewModel@60fe.replaceLocalMappingStickers$1");
        return objWQ2;
    }
}
