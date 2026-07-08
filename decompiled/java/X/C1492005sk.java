package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05sk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.IMChatListImpl$onInboxModeSwitched$1", f = "IMChatListImpl.kt", l = {}, m = "invokeSuspend")
public final class C1492005sk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1492005sk(InterfaceC1364105Vn<? super C1492005sk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1492005sk(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMChatListImpl@e5e7.onInboxModeSwitched$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        interfaceC876950YajLIZIZ.LJIIJ(!C881500Yi4.LJII());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMChatListImpl@e5e7.onInboxModeSwitched$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1492005sk(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
