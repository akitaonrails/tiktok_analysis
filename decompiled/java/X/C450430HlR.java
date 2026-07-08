package X;

import com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper;

/* JADX INFO: renamed from: X.0HlR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper", f = "BasicStickerStoreHelper.kt", l = {205}, m = "getSetStickerInfo")
public final class C450430HlR extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BasicStickerStoreHelper LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450430HlR(BasicStickerStoreHelper basicStickerStoreHelper, InterfaceC1364105Vn<? super C450430HlR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = basicStickerStoreHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasicStickerStoreHelper@bf0d.getSetStickerInfo$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, null, this);
        C1C7U.LIZIZ("BasicStickerStoreHelper@bf0d.getSetStickerInfo$1");
        return objLJ;
    }
}
