package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06oG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.bridge.CommonInboxChatListBridge$refreshLocalMessageRequestData$1", f = "CommonInboxChatListBridge.kt", l = {}, m = "invokeSuspend")
public final class C1719006oG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1719006oG(InterfaceC1364105Vn<? super C1719006oG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1719006oG(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonInboxChatListBridge@c9d.refreshLocalMessageRequestData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C876470YZx.LIZ().LJIILIIL(C1719206oI.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommonInboxChatListBridge@c9d.refreshLocalMessageRequestData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1719006oG(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
