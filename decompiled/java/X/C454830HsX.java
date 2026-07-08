package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler;

/* JADX INFO: renamed from: X.0HsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler", f = "StoreStickerCardProtocol.kt", l = {1519}, m = "getCreatorNickName")
public final class C454830HsX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ DefaultStickerClickHandler LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454830HsX(DefaultStickerClickHandler defaultStickerClickHandler, InterfaceC1364105Vn<? super C454830HsX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = defaultStickerClickHandler;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerClickHandler@2047.getCreatorNickName$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("DefaultStickerClickHandler@2047.getCreatorNickName$1");
        return objLIZ;
    }
}
