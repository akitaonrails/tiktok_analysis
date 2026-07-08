package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.task.RepairEditPageNLEDataTask$run$4", f = "RepairEditPageNLEDataTask.kt", l = {}, m = "invokeSuspend")
public final class C362940EKu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends Unit>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C362910EKr LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C362940EKu(C362910EKr c362910EKr, InterfaceC1364105Vn<? super C362940EKu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c362910EKr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C362940EKu c362940EKu = new C362940EKu(this.LLILLJJLI, interfaceC1364105Vn);
        c362940EKu.LL = obj;
        return c362940EKu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepairEditPageNLEDataTask@15bb.run$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0957<Unit> anonymousClass0957LIZLLL = this.LLILLJJLI.LJIIIIZZ.LIZLLL((InterfaceC497601wk) this.LL);
        C1C7U.LIZIZ("RepairEditPageNLEDataTask@15bb.run$4");
        return anonymousClass0957LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
