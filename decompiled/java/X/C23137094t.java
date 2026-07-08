package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.094t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", f = "RoomDatabase.kt", l = {124}, m = "invokeSuspend")
public final class C23137094t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC20236714Gf<InterfaceC23139094v> LLILLL;
    public final /* synthetic */ C09AE LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23137094t(InterfaceC20236714Gf<? super InterfaceC23139094v> interfaceC20236714Gf, C09AE c09ae, InterfaceC1364105Vn<? super C23137094t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC20236714Gf;
        this.LLILZ = c09ae;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23137094t c23137094t = new C23137094t(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c23137094t.LLILLJJLI = obj;
        return c23137094t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            InterfaceC20236714Gf<InterfaceC23139094v> interfaceC20236714Gf = this.LLILLL;
            CoroutineContext.Element element = interfaceC497601wk.getCoroutineContext().get(InterfaceC23139094v.LJJLIIJ);
            C189200o6.m2constructorimpl(element);
            interfaceC20236714Gf.resumeWith(element);
            C09AE c09ae = this.LLILZ;
            this.LL = 1;
            if (c09ae.LJJZ(this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
