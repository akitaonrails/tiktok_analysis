package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.legoImp.task.PowerPreloadInitHelper$init$config$7$toShot$1", f = "PowerPreloadInitHelper.kt", l = {116}, m = "invokeSuspend")
public final class C1392205ce extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<?> LLILLJJLI;
    public final /* synthetic */ InterfaceC1726310v1Z LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392205ce(AnonymousClass0957<?> anonymousClass0957, InterfaceC1726310v1Z interfaceC1726310v1Z, InterfaceC1364105Vn<? super C1392205ce> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = interfaceC1726310v1Z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1392205ce(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PowerPreloadInitHelper@30e2.init$config$7$toShot$1");
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
            AnonymousClass0957<?> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PowerPreloadInitHelper@30e2.init$config$7$toShot$1");
                return objLJFF;
            }
        }
        InterfaceC1726310v1Z interfaceC1726310v1Z = this.LLILLL;
        if (interfaceC1726310v1Z != null) {
            interfaceC1726310v1Z.onSuccess(obj);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PowerPreloadInitHelper@30e2.init$config$7$toShot$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
