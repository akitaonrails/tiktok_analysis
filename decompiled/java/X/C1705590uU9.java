package X;

/* JADX INFO: renamed from: X.0uU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.StickerResProvider", f = "StickerResProvider.kt", l = {90, 93, 95}, m = "fetchStickerList")
public final class C1705590uU9 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1705580uU8 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705590uU9(C1705580uU8 c1705580uU8, InterfaceC1364105Vn<? super C1705590uU9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1705580uU8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerResProvider@ef8d.fetchStickerList$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(0, null, null, this);
        C1C7U.LIZIZ("StickerResProvider@ef8d.fetchStickerList$1");
        return objLIZ;
    }
}
