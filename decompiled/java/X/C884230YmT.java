package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.page.handle.ChatListPageHandle$onPageHide$3", f = "ChatListPageHandle.kt", l = {}, m = "invokeSuspend")
public final class C884230YmT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C884270YmX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884230YmT(C884270YmX c884270YmX, InterfaceC1364105Vn<? super C884230YmT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c884270YmX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884230YmT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListPageHandle@454a.onPageHide$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (Pair<InterfaceC884250YmV, InterfaceC878560YdK> pair : this.LL.LIZIZ) {
            pair.getFirst().LJIIJJI(pair.getSecond());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListPageHandle@454a.onPageHide$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
