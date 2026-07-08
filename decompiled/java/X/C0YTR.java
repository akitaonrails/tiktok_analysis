package X;

import com.ss.android.ugc.aweme.im.sharepanel.impl.share.sendto.SendToViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.share.sendto.SendToViewModel$createRefactorSendListener$2$1", f = "SendToViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0YTR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SendToViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YTR(SendToViewModel sendToViewModel, InterfaceC1364105Vn<? super C0YTR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sendToViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YTR(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendToViewModel@e6c.createRefactorSendListener$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SendToViewModel sendToViewModel = this.LL;
        EnumC328300Ctw value = sendToViewModel.LLILLJJLI.getValue();
        EnumC328300Ctw enumC328300Ctw = EnumC328300Ctw.SENT;
        if (value != enumC328300Ctw) {
            sendToViewModel.LLILLJJLI.setValue(enumC328300Ctw);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendToViewModel@e6c.createRefactorSendListener$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
