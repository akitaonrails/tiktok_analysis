package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05Ue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem$RenderUi$3$5$2$1", f = "TakoContentPreviewAssem.kt", l = {401}, m = "invokeSuspend")
public final class C1360605Ue extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05UN LLILLJJLI;
    public final /* synthetic */ TakoContentPreviewAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360605Ue(TakoContentPreviewAssem takoContentPreviewAssem, C05UN c05un, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c05un;
        this.LLILLL = takoContentPreviewAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1360605Ue(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$2$1");
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
            TakoContentPreviewItem takoContentPreviewItem = (TakoContentPreviewItem) C13LP.LJJJLZIJ(this.LLILLJJLI.LIZIZ(), this.LLILLJJLI.LIZLLL().LL);
            if (takoContentPreviewItem == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$2$1");
                return unit;
            }
            this.LLILLL.Lo().nG("save");
            C1DFB c1dfb = C0PEM.LIZJ;
            C1360705Uf c1360705Uf = new C1360705Uf(takoContentPreviewItem, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c1360705Uf) == objLJFF) {
                C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$2$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$2$1");
        return unit2;
    }
}
