package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.module.StorageModule$KevaBridge$exit$1", f = "StorageModule.kt", l = {159}, m = "invokeSuspend")
public final class C455401pw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<Boolean> LLILLJJLI;
    public final /* synthetic */ C1848940yDM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455401pw(AnonymousClass0957<Boolean> anonymousClass0957, C1848940yDM c1848940yDM, InterfaceC1364105Vn<? super C455401pw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = c1848940yDM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C455401pw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageModule$KevaBridge@12e4.exit$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<Boolean> anonymousClass0957 = this.LLILLJJLI;
            if (anonymousClass0957 != null) {
                this.LL = 1;
                obj = anonymousClass0957.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StorageModule$KevaBridge@12e4.exit$1");
                    return objLJFF;
                }
            }
            C2296808zG.LIZJ(this.LLILLL.LIZIZ, null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StorageModule$KevaBridge@12e4.exit$1");
            return unit;
        }
        ((Boolean) obj).booleanValue();
        C2296808zG.LIZJ(this.LLILLL.LIZIZ, null);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StorageModule$KevaBridge@12e4.exit$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
