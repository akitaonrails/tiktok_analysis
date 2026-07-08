package X;

import com.ss.android.ugc.aweme.im.common.model.GroupLayoutDataResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mlw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.msg.qrcode.QRGroupCreationMessageVM$tryGetLayoutData$1$1", f = "QRGroupCreationMessageVM.kt", l = {}, m = "invokeSuspend")
public final class C1409100mlw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1409110mlx LL;
    public final /* synthetic */ GroupLayoutDataResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409100mlw(InterfaceC1409110mlx interfaceC1409110mlx, GroupLayoutDataResponse groupLayoutDataResponse, InterfaceC1364105Vn<? super C1409100mlw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1409110mlx;
        this.LLILLJJLI = groupLayoutDataResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409100mlw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QRGroupCreationMessageVM@baf9.tryGetLayoutData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1409110mlx interfaceC1409110mlx = this.LL;
        if (interfaceC1409110mlx != null) {
            interfaceC1409110mlx.LIZIZ(this.LLILLJJLI.layout);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QRGroupCreationMessageVM@baf9.tryGetLayoutData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
