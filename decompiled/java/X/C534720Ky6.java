package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ky6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.EditRootScene$doCustomInSingleModeAction$1", f = "EditRootScene.kt", l = {5304}, m = "invokeSuspend")
public final class C534720Ky6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1455260nyO LLILLJJLI;
    public final /* synthetic */ Runnable LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Runnable LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534720Ky6(C1455260nyO c1455260nyO, Runnable runnable, boolean z, Runnable runnable2, String str, InterfaceC1364105Vn<? super C534720Ky6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1455260nyO;
        this.LLILLL = runnable;
        this.LLILZ = z;
        this.LLILZIL = runnable2;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534720Ky6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditRootScene@37d3.doCustomInSingleModeAction$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C563410M7v c563410M7v = new C563410M7v(this.LLILLJJLI, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c563410M7v) == objLJFF) {
                C1C7U.LIZIZ("EditRootScene@37d3.doCustomInSingleModeAction$1");
                return objLJFF;
            }
        }
        C1455260nyO c1455260nyO = this.LLILLJJLI;
        c1455260nyO.LLLZIL(c1455260nyO.LLLI, c1455260nyO.LLLII, this.LLILLL, this.LLILZ, this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditRootScene@37d3.doCustomInSingleModeAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
