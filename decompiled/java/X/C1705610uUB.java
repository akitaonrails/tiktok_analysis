package X;

/* JADX INFO: renamed from: X.0uUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.StickerResProvider", f = "StickerResProvider.kt", l = {68, 73, 75}, m = "fetchStickerCategory")
public final class C1705610uUB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1705580uU8 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705610uUB(C1705580uU8 c1705580uU8, InterfaceC1364105Vn<? super C1705610uUB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1705580uU8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerResProvider@ef8d.fetchStickerCategory$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(false, this);
        C1C7U.LIZIZ("StickerResProvider@ef8d.fetchStickerCategory$1");
        return objLIZIZ;
    }
}
