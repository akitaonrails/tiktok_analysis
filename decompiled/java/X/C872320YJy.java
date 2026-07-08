package X;

/* JADX INFO: renamed from: X.0YJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.combo.DefaultComboGetMsgByUserUseCase", f = "DefaultComboGetMsgByUserUseCase.kt", l = {116, 126, 132, 141}, m = "pullAndEnqueue")
public final class C872320YJy extends AbstractC23140094w {
    public InterfaceC1451105m9 LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C0YLE LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C872170YJj LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872320YJy(C872170YJj c872170YJj, InterfaceC1364105Vn<? super C872320YJy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c872170YJj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultComboGetMsgByUserUseCase@23a3.pullAndEnqueue$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZ = this.LLJ.LIZ(null, null, null, null, this);
        C1C7U.LIZIZ("DefaultComboGetMsgByUserUseCase@23a3.pullAndEnqueue$1");
        return objLIZ;
    }
}
