package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CT2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bulletin.db.internal.task.BulletinTaskManager$executeReadTask$2", f = "BulletinTaskManager.kt", l = {76, 80}, m = "invokeSuspend")
public final class C0CT2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C0CT6 LLILLL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<Object>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CT2(boolean z, C0CT6 c0ct6, Function1<? super InterfaceC1364105Vn<Object>, ? extends Object> function1, InterfaceC1364105Vn<? super C0CT2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c0ct6;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CT2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("BulletinTaskManager@936c.executeReadTask$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                AbstractC2252651DEx abstractC2252651DExLIZJ = this.LLILLL.LIZ.LIZJ();
                C0CT3 c0ct3 = new C0CT3(this.LLILLL, this.LLILZ, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, abstractC2252651DExLIZJ, c0ct3);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BulletinTaskManager@936c.executeReadTask$2");
                    return objLJFF;
                }
            } else {
                AbstractC2252651DEx abstractC2252651DExLIZIZ = this.LLILLL.LIZ.LIZIZ();
                C0CT4 c0ct4 = new C0CT4(this.LLILLL, this.LLILZ, null);
                this.LL = 2;
                obj = C23250099c.LJI(this, abstractC2252651DExLIZIZ, c0ct4);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BulletinTaskManager@936c.executeReadTask$2");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("BulletinTaskManager@936c.executeReadTask$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
