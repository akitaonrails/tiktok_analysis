package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13gY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", l = {908, 912}, m = "invokeSuspend")
public final class C20074013gY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C20073913gX LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20074013gY(C20073913gX c20073913gX, long j, InterfaceC1364105Vn<? super C20074013gY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c20073913gX;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20074013gY(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLJI;
        long j;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILZ.LLJJJIL.invoke();
                    return Unit.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jLJI = this.LLILLJJLI;
            j = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1374305Zl interfaceC1374305Zl = (InterfaceC1374305Zl) C20061513eX.LIZ(this.LLILZ, C20055113dV.LJIJ);
            interfaceC1374305Zl.LIZ();
            jLJI = interfaceC1374305Zl.LJI();
            j = 40;
            this.LL = 40L;
            this.LLILLJJLI = jLJI;
            this.LLILLL = 1;
            if (AnonymousClass0958.LIZIZ(40L, this) == objLJFF) {
                return objLJFF;
            }
        }
        C20076913h1 c20076913h1LIZIZ = this.LLILZ.LLLFFI.LIZIZ(this.LLILZIL);
        if (c20076913h1LIZIZ != null) {
            c20076913h1LIZIZ.LIZIZ = true;
        }
        this.LLILLL = 2;
        if (AnonymousClass0958.LIZIZ(jLJI - j, this) == objLJFF) {
            return objLJFF;
        }
        this.LLILZ.LLJJJIL.invoke();
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
