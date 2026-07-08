package X;

import Y.AgS103S1100000_14;

/* JADX INFO: renamed from: X.0Z1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "detailpage.actions.MuteCallActionKt$bindIsCallMuted$1$invokeSuspend$$inlined$map$1$2", f = "MuteCallAction.kt", l = {224, 223}, m = "emit")
public final class C892970Z1j extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ AgS103S1100000_14 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C892970Z1j(AgS103S1100000_14 agS103S1100000_14, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS103S1100000_14;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        return this.LLILZ.emit(null, this);
    }
}
