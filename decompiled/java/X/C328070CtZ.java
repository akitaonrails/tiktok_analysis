package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CtZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.CreateInfoCache$preRequestResult$2", f = "CreateInfoCache.kt", l = {108}, m = "invokeSuspend")
public final class C328070CtZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0UPM>, Object> {
    public int LL;

    public C328070CtZ(InterfaceC1364105Vn<? super C328070CtZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328070CtZ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean boolValueOf;
        C1C7U.LIZ("CreateInfoCache@cc22.preRequestResult$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C099G c099g = C0UON.LIZIZ;
            obj = null;
            if (c099g != null) {
                boolValueOf = Boolean.valueOf(c099g.isCompleted());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C099G c099g2 = C0UON.LIZIZ;
                if (c099g2 != null) {
                    obj = c099g2.LJJJIL();
                }
            } else {
                C099G c099g3 = C0UON.LIZIZ;
                if (c099g3 != null) {
                    this.LL = 1;
                    obj = c099g3.LJLIIIL(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("CreateInfoCache@cc22.preRequestResult$2");
                        return objLJFF;
                    }
                }
            }
        }
        C1C7U.LIZIZ("CreateInfoCache@cc22.preRequestResult$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0UPM> interfaceC1364105Vn) {
        return new C328070CtZ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
