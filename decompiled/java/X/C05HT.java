package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05HT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelColumnView$initInstantCloneManage$1$1", f = "TTSPanelColumnView.kt", l = {337}, m = "invokeSuspend")
public final class C05HT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C194329111b LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05HT(C194329111b c194329111b, InterfaceC1364105Vn<? super C05HT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c194329111b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05HT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelColumnView@49d6.initInstantCloneManage$1$1");
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
            C05HQ c05hq = new C05HQ(this.LLILLJJLI, null);
            this.LL = 1;
            if (C099A.LIZJ(10000L, c05hq, this) == objLJFF) {
                C1C7U.LIZIZ("TTSPanelColumnView@49d6.initInstantCloneManage$1$1");
                return objLJFF;
            }
        }
        C194329111b c194329111b = this.LLILLJJLI;
        c194329111b.getClass();
        C1524705y1.LIZJ(new AwS546S0100000_2(c194329111b, 881));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelColumnView@49d6.initInstantCloneManage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
