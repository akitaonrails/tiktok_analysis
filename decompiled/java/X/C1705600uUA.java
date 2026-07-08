package X;

/* JADX INFO: renamed from: X.0uUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.StickerResProvider", f = "StickerResProvider.kt", l = {103, 108}, m = "handleFetchStickerList")
public final class C1705600uUA extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1705580uU8 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705600uUA(C1705580uU8 c1705580uU8, InterfaceC1364105Vn<? super C1705600uUA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1705580uU8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerResProvider@ef8d.handleFetchStickerList$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(0, null, null, this);
        C1C7U.LIZIZ("StickerResProvider@ef8d.handleFetchStickerList$1");
        return objLJ;
    }
}
