package X;

import com.ss.android.ugc.aweme.im.saas.host.impl.im.sticker.GroupChatStickerServiceImpl;

/* JADX INFO: renamed from: X.058D, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.im.sticker.GroupChatStickerServiceImpl", f = "GroupChatStickerServiceImpl.kt", l = {163}, m = "checkEnableGroupChatSticker")
public final class C058D extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GroupChatStickerServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058D(GroupChatStickerServiceImpl groupChatStickerServiceImpl, InterfaceC1364105Vn<? super C058D> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = groupChatStickerServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatStickerServiceImpl@e288.checkEnableGroupChatSticker$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(false, this);
        C1C7U.LIZIZ("GroupChatStickerServiceImpl@e288.checkEnableGroupChatSticker$1");
        return objLIZ;
    }
}
