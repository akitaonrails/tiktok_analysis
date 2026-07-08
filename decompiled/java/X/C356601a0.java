package X;

import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01a0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.impl.cell.TitleAreaCell$subscribeRecMoreAnimationFinished$1$1", f = "TitleAreaCell.kt", l = {199}, m = "invokeSuspend")
public final class C356601a0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C01S9<Unit> LLILLJJLI;
    public final /* synthetic */ TuxTextView LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C356601a0(C01S9<Unit> c01s9, TuxTextView tuxTextView, int i, InterfaceC1364105Vn<? super C356601a0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c01s9;
        this.LLILLL = tuxTextView;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C356601a0(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TitleAreaCell@3ae9.subscribeRecMoreAnimationFinished$1$1");
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
            C01S9<Unit> c01s9 = this.LLILLJJLI;
            this.LL = 1;
            if (C09IC.LJIIZILJ(c01s9, this) == objLJFF) {
                C1C7U.LIZIZ("TitleAreaCell@3ae9.subscribeRecMoreAnimationFinished$1$1");
                return objLJFF;
            }
        }
        this.LLILLL.setBackgroundColor(this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TitleAreaCell@3ae9.subscribeRecMoreAnimationFinished$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
