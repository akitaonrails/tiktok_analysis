package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.send.service.IMSendMessageServiceImpl$SendMessageTransformStep$transform$2$execute$2", f = "IMSendMessageServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C874480YSg extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public C874480YSg(InterfaceC1364105Vn<? super C874480YSg> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C874480YSg(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C874480YSg(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSendMessageServiceImpl$SendMessageTransformStep@ae7d.transform$2$execute$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSendMessageServiceImpl$SendMessageTransformStep@ae7d.transform$2$execute$2");
        return unit;
    }
}
