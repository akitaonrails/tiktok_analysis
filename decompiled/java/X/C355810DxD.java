package X;

import Y.AgS98S1100000_5;

/* JADX INFO: renamed from: X.0DxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.components.base.magicprocessor.handler.I2VHandler$observeAsyncStatus$1$2", f = "I2VHandler.kt", l = {84}, m = "emit")
public final class C355810DxD extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AgS98S1100000_5<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C355810DxD(AgS98S1100000_5<? super T> agS98S1100000_5, InterfaceC1364105Vn<? super C355810DxD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS98S1100000_5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VHandler@c922.observeAsyncStatus$1$2$emit$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ$2 = this.LLILLL.LIZ$2(null, this);
        C1C7U.LIZIZ("I2VHandler@c922.observeAsyncStatus$1$2$emit$1");
        return objLIZ$2;
    }
}
