package X;

import com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview.UpRightIconViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05OJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.GiftOnlySelectUtils$getUpRightIconView$1$1$1$1$1", f = "GiftOnlySelectUtils.kt", l = {}, m = "invokeSuspend")
public final class C05OJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UpRightIconViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05OJ(UpRightIconViewModel upRightIconViewModel, boolean z, InterfaceC1364105Vn<? super C05OJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = upRightIconViewModel;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05OJ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftOnlySelectUtils@aa22.getUpRightIconView$1$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.zQ2(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftOnlySelectUtils@aa22.getUpRightIconView$1$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
