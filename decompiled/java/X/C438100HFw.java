package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptsListView$collectState$1", f = "AILivePhotoPromptsListView.kt", l = {136}, m = "invokeSuspend")
public final class C438100HFw extends C09AX implements Function2<C443120HZe<? extends InterfaceC434700H2u, ? extends Integer, ? extends Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C438070HFt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438100HFw(C438070HFt c438070HFt, InterfaceC1364105Vn<? super C438100HFw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c438070HFt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C438100HFw c438100HFw = new C438100HFw(this.LLILLL, interfaceC1364105Vn);
        c438100HFw.LLILLJJLI = obj;
        return c438100HFw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILivePhotoPromptsListView@41b4.collectState$1");
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
            C443120HZe c443120HZe = (C443120HZe) this.LLILLJJLI;
            InterfaceC434700H2u interfaceC434700H2u = (InterfaceC434700H2u) c443120HZe.getFirst();
            int iIntValue = ((Number) c443120HZe.getSecond()).intValue();
            if (((Boolean) c443120HZe.getThird()).booleanValue()) {
                Boolean.valueOf(this.LLILLL.LLJI.add(new C438110HFx(interfaceC434700H2u, iIntValue)));
            } else {
                C188800o2.LIZIZ(this.LLILLL.LLJI, new AwS585S0100000_6(interfaceC434700H2u, 283));
            }
            C2252331DDr c2252331DDr = this.LLILLL.LLJIJIL;
            Unit unit = Unit.LIZ;
            this.LL = 1;
            if (c2252331DDr.emit(unit, this) == objLJFF) {
                C1C7U.LIZIZ("AILivePhotoPromptsListView@41b4.collectState$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoPromptsListView@41b4.collectState$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C443120HZe<? extends InterfaceC434700H2u, ? extends Integer, ? extends Boolean> c443120HZe, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c443120HZe, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
