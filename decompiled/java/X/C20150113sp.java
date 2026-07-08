package X;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13sp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.bytedance.ies.powerpreload.task.DataTask$internalRun$3", f = "DataTask.kt", l = {66}, m = "invokeSuspend")
public final class C20150113sp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC497601wk LL;
    public InterfaceC497601wk LLILLJJLI;
    public C20150213sq LLILLL;
    public int LLILZ;
    public final /* synthetic */ C20150513st LLILZIL;
    public final /* synthetic */ InterfaceC20150313sr LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20150113sp(C20150513st c20150513st, InterfaceC20150313sr interfaceC20150313sr, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c20150513st;
        this.LLILZLL = interfaceC20150313sr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20150113sp c20150113sp = new C20150113sp(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c20150113sp.LL = (InterfaceC497601wk) obj;
        return c20150113sp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C20150213sq<Object> c20150213sq;
        C1C7U.LIZ("DataTask@a9fc.internalRun$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                c20150213sq = this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = this.LL;
            C20150513st c20150513st = this.LLILZIL;
            c20150213sq = c20150513st.LLJ;
            if (c20150213sq != null) {
                InterfaceC20150313sr interfaceC20150313sr = this.LLILZLL;
                if (c20150513st.LLILZLL == null) {
                    new Bundle();
                }
                this.LLILLJJLI = interfaceC497601wk;
                this.LLILLL = c20150213sq;
                this.LLILZ = 1;
                obj = interfaceC20150313sr.preload();
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DataTask@a9fc.internalRun$3");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DataTask@a9fc.internalRun$3");
            return unit;
        }
        if (obj != null) {
            c20150213sq.LIZ.LIZ.postValue(obj);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("DataTask@a9fc.internalRun$3");
            return unit2;
        }
        throw new C2482109o3("null cannot be cast to non-null type kotlin.Any");
    }
}
