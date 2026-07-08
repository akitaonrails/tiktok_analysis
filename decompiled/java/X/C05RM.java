package X;

import Y.AgS162S0300000_2;

/* JADX INFO: renamed from: X.05RM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {1548}, m = "emit")
public final class C05RM extends AbstractC23140094w {
    public AgS162S0300000_2 LL;
    public Object LLILLJJLI;
    public C09AE LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AgS162S0300000_2<T> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05RM(AgS162S0300000_2<? super T> agS162S0300000_2, InterfaceC1364105Vn<? super C05RM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = agS162S0300000_2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        return this.LLILZIL.emit(null, this);
    }
}
