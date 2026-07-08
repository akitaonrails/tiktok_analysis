package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05HR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelColumnView$startOverDialogShow$1$2$1$1", f = "TTSPanelColumnView.kt", l = {377}, m = "invokeSuspend")
public final class C05HR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C194329111b LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05HR(C194329111b c194329111b, InterfaceC1364105Vn<? super C05HR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c194329111b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05HR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TTSPanelColumnView@49d6.startOverDialogShow$1$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Unit unit = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1320105Ep c1320105Ep = new C1320105Ep(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1320105Ep);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TTSPanelColumnView@49d6.startOverDialogShow$1$2$1$1");
                return objLJFF;
            }
        }
        if (((Number) obj).intValue() == 0) {
            InterfaceC19407610wM interfaceC19407610wM = this.LLILLJJLI.LLJILJIL;
            if (interfaceC19407610wM != null) {
                interfaceC19407610wM.LLJLLIL();
            }
            C194329111b c194329111b = this.LLILLJJLI;
            c194329111b.getClass();
            C1524705y1.LIZJ(new AwS546S0100000_2(c194329111b, 881));
            InterfaceC19407610wM interfaceC19407610wM2 = this.LLILLJJLI.LLJILJIL;
            if (interfaceC19407610wM2 != null) {
                interfaceC19407610wM2.LLLFZ();
                unit = Unit.LIZ;
            }
        } else {
            this.LLILLJJLI.LIZJ();
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("TTSPanelColumnView@49d6.startOverDialogShow$1$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
