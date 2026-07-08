package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.058R, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditVM$onSubmit$1$3", f = "InstructionEditVM.kt", l = {150}, m = "invokeSuspend")
public final class C058R extends C09AX implements Function2<InterfaceC1256804vu, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ InstructionEditVM LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058R(Function0<Unit> function0, View view, InstructionEditVM instructionEditVM, String str, InterfaceC1364105Vn<? super C058R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function0;
        this.LLILZ = view;
        this.LLILZIL = instructionEditVM;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C058R c058r = new C058R(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c058r.LLILLJJLI = obj;
        return c058r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstructionEditVM@96aa.onSubmit$1$3");
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
            InterfaceC1256804vu interfaceC1256804vu = (InterfaceC1256804vu) this.LLILLJJLI;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C058S c058s = new C058S(interfaceC1256804vu, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c058s) == objLJFF) {
                C1C7U.LIZIZ("InstructionEditVM@96aa.onSubmit$1$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InstructionEditVM@96aa.onSubmit$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1256804vu interfaceC1256804vu, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1256804vu, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
