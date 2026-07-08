package X;

import com.ss.android.ugc.aweme.slash.cell.arc.SlashCell;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS419S0200000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gn7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.slash.cell.arc.SlashCell$onViewCreated$1$2", f = "SlashCell.kt", l = {}, m = "invokeSuspend")
public final class C1179190gn7 extends C09AX implements Function2<SlashCellModel, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SlashCell<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1179190gn7(SlashCell<T> slashCell, InterfaceC1364105Vn<? super C1179190gn7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = slashCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1179190gn7 c1179190gn7 = new C1179190gn7(this.LLILLJJLI, interfaceC1364105Vn);
        c1179190gn7.LL = obj;
        return c1179190gn7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlashCell@d52.onViewCreated$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SlashCellModel slashCellModel = (SlashCellModel) this.LL;
        if (slashCellModel == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SlashCell@d52.onViewCreated$1$2");
            return unit;
        }
        SlashCell<T> slashCell = this.LLILLJJLI;
        AwS419S0200000_18 awS419S0200000_18 = new AwS419S0200000_18((SlashCell) slashCell, slashCellModel, (SlashCellModel) 106);
        slashCell.LLJJIII = null;
        AbstractC19486711Lt.LJIIJJI(new C1208880hZ0(slashCell, 0)).LJIJJLI(C11S5.LIZIZ).LJIILJJIL(C1701940uOG.LIZIZ()).LJIILL().LJII(new C1208880hZ0(awS419S0200000_18, 1)).LJIIZILJ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SlashCell@d52.onViewCreated$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SlashCellModel slashCellModel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(slashCellModel, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
