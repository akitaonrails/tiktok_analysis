package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.quickchat.ui.assem.IMQuickMessageInputVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0Hus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.IMQuickMessageInputVM$onPrepared$3", f = "IMQuickMessageInputVM.kt", l = {}, m = "invokeSuspend")
public final class C456280Hus extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMQuickMessageInputVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456280Hus(IMQuickMessageInputVM iMQuickMessageInputVM, InterfaceC1364105Vn<? super C456280Hus> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMQuickMessageInputVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C456280Hus(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("IMQuickMessageInputVM@b1e6.onPrepared$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0HV6 c0hv6VQ2 = this.LL.vQ2();
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LL);
        C463000IDq c463000IDq = new C463000IDq(this.LL.LL.Kv(), 27);
        InterfaceC497601wk viewModelScope2 = ViewModelKt.getViewModelScope(this.LL);
        C05YW.LIZ.getClass();
        C1371305Yh c1371305Yh = C1370905Yd.LIZJ;
        String str = ((C1640006bW) this.LL.LL.Kv().getValue()).LIZIZ;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        c0hv6VQ2.LIZLLL(viewModelScope, C09IC.LJJIJIL(c463000IDq, viewModelScope2, c1371305Yh, Boolean.valueOf(z)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMQuickMessageInputVM@b1e6.onPrepared$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
