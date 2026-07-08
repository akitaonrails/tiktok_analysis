package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.ContinuationCompat", f = "CoroutineUtils.kt", l = {189}, m = "suspendToCompletion")
public final class C865140Xwm<T> extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public int LLILLL;

    public C865140Xwm(InterfaceC1364105Vn<? super C865140Xwm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContinuationCompat@24b5.suspendToCompletion$1");
        this.LLILLJJLI = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = C867000Xzm.LIZ(this, null);
        C1C7U.LIZIZ("ContinuationCompat@24b5.suspendToCompletion$1");
        return objLIZ;
    }
}
