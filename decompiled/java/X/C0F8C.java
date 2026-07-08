package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.service.NLETextStickerServiceImpl;

/* JADX INFO: renamed from: X.0F8C, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.NLETextStickerServiceImpl", f = "NLETextStickerServiceImpl.kt", l = {171}, m = "applyTextStickersFromNLE")
public final class C0F8C extends AbstractC23140094w {
    public CreativeModel LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ NLETextStickerServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F8C(NLETextStickerServiceImpl nLETextStickerServiceImpl, InterfaceC1364105Vn<? super C0F8C> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = nLETextStickerServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NLETextStickerServiceImpl@93f5.applyTextStickersFromNLE$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, 0, this);
        C1C7U.LIZIZ("NLETextStickerServiceImpl@93f5.applyTextStickersFromNLE$1");
        return objLIZ;
    }
}
