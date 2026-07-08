package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.purchasepanel.fragment.PurchasePanelFragment;
import com.ss.android.ugc.aweme.purchasepanel.viewmodel.PurchasePanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.purchasepanel.fragment.PurchasePanelFragment$onViewCreated$2$1", f = "PurchasePanelFragment.kt", l = {113}, m = "invokeSuspend")
public final class C1616720sAo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PurchasePanelFragment LLILLJJLI;
    public final /* synthetic */ TuxSheet LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616720sAo(TuxSheet tuxSheet, PurchasePanelFragment purchasePanelFragment, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = purchasePanelFragment;
        this.LLILLL = tuxSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1616720sAo(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PurchasePanelFragment@fc7c.onViewCreated$2$1");
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
            C2252321DDq c2252321DDq = ((PurchasePanelViewModel) this.LLILLJJLI.LLILLL.getValue()).LLILLJJLI;
            C1616710sAn c1616710sAn = new C1616710sAn(this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            if (C09IC.LJII(c2252321DDq, this, c1616710sAn) == objLJFF) {
                C1C7U.LIZIZ("PurchasePanelFragment@fc7c.onViewCreated$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PurchasePanelFragment@fc7c.onViewCreated$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
