package X;

/* JADX INFO: renamed from: X.0fVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.domain.usecase.gift.LoadGiftPagesUseCase", f = "LoadGiftPagesUseCase.kt", l = {71}, m = "invoke-yxL6bBk")
public final class C1130080fVu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1130070fVt LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1130080fVu(C1130070fVt c1130070fVt, InterfaceC1364105Vn<? super C1130080fVu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1130070fVt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadGiftPagesUseCase@556b.invoke$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0L, false, false, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("LoadGiftPagesUseCase@556b.invoke$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("LoadGiftPagesUseCase@556b.invoke$1");
        return c189200o6M1boximpl;
    }
}
