package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.task.RepairEditPageNLEDataTask$run$3", f = "RepairEditPageNLEDataTask.kt", l = {124, 125}, m = "invokeSuspend")
public final class C362930EKt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0EL0>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C362910EKr LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C362930EKt(C362910EKr c362910EKr, InterfaceC1364105Vn<? super C362930EKt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c362910EKr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C362930EKt c362930EKt = new C362930EKt(this.LLILLL, interfaceC1364105Vn);
        c362930EKt.LLILLJJLI = obj;
        return c362930EKt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        AnonymousClass0957<C358120E2g> anonymousClass0957LIZLLL;
        C1C7U.LIZ("RepairEditPageNLEDataTask@15bb.run$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("RepairEditPageNLEDataTask@15bb.run$3");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C358100E2e c358100E2e = this.LLILLL.LJII;
            if (c358100E2e != null && (anonymousClass0957LIZLLL = c358100E2e.LIZLLL(interfaceC497601wk)) != null) {
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                if (anonymousClass0957LIZLLL.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("RepairEditPageNLEDataTask@15bb.run$3");
                    return objLJFF;
                }
            }
        }
        AnonymousClass0957<C0EL0> anonymousClass0957LIZLLL2 = this.LLILLL.LJI.LIZLLL(interfaceC497601wk);
        this.LLILLJJLI = null;
        this.LL = 2;
        obj = anonymousClass0957LIZLLL2.LJLIIIL(this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("RepairEditPageNLEDataTask@15bb.run$3");
            return objLJFF;
        }
        C1C7U.LIZIZ("RepairEditPageNLEDataTask@15bb.run$3");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0EL0> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
