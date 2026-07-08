package X;

import Y.AkS490S0100000_29;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11T7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11T7 extends C11T3<Object, Object, Object, Object> {
    public final /* synthetic */ Function2<C11NZ<Object>, C11NZ<Object>, C11NZ<Object>> LIZ;
    public final /* synthetic */ C11T6<Object, Object, Object, Object, Object, Object> LIZIZ;

    @Override // X.C11T3, X.C11T4
    public final Object convertKeyActual(Object obj) {
        return this.LIZIZ.LIZ.convertKeyActual(obj);
    }

    @Override // X.C11T3
    public final C11NZ<Object> requestActual(Object obj) {
        Function2<C11NZ<Object>, C11NZ<Object>, C11NZ<Object>> function2 = this.LIZ;
        C11NZ<Object> c11nzRequest = this.LIZIZ.LIZ.request(obj);
        C11T6<Object, Object, Object, Object, Object, Object> c11t6 = this.LIZIZ;
        return function2.invoke(c11nzRequest, c11t6.LIZIZ.request(c11t6.LIZJ.LIZ.invoke(c11t6.LIZ.convertKeyActual(obj))).LJJIL(new C19774912Yp(AFwS273S0000000_29.get$arr$(445), 8)).LJJJJZI(new AkS490S0100000_29(new AwS608S0100000_29(this.LIZIZ, (C11T6<Object, Object, Object, Object, Object, Object>) 827), 29)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11T7(Function2<? super C11NZ<Object>, ? super C11NZ<Object>, ? extends C11NZ<Object>> function2, C11T6<Object, Object, Object, Object, Object, Object> c11t6) {
        this.LIZ = function2;
        this.LIZIZ = c11t6;
    }

    @Override // X.C11T3, X.C11T4
    public final Object convertValActual(Object obj, Object obj2) {
        return this.LIZIZ.LIZ.convertValActual(obj, obj2);
    }
}
