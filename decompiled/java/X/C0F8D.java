package X;

import com.ss.android.ugc.aweme.service.NLETextStickerServiceImpl;

/* JADX INFO: renamed from: X.0F8D, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.NLETextStickerServiceImpl", f = "NLETextStickerServiceImpl.kt", l = {94, 99}, m = "awaitEffectFromEpUrs")
public final class C0F8D extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ NLETextStickerServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F8D(NLETextStickerServiceImpl nLETextStickerServiceImpl, InterfaceC1364105Vn<? super C0F8D> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = nLETextStickerServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NLETextStickerServiceImpl@93f5.awaitEffectFromEpUrs$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, this);
        C1C7U.LIZIZ("NLETextStickerServiceImpl@93f5.awaitEffectFromEpUrs$1");
        return objLIZIZ;
    }
}
