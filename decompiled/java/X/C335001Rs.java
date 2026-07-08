package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.message.UsECLiveMessageCenter$onReceive$2", f = "UsECLiveMessageCenter.kt", l = {}, m = "invokeSuspend")
public final class C335001Rs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMessage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C335001Rs(IMessage iMessage, InterfaceC1364105Vn<? super C335001Rs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C335001Rs(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UsECLiveMessageCenter@91bf.onReceive$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C335101Rt.LIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsECLiveMessageCenter@91bf.onReceive$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
