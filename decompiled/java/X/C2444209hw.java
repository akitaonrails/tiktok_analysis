package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09hw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.observer.ChatListEffectsPreloadObserver$onAccountResult$1", f = "ChatListEffectsPreloadObserver.kt", l = {}, m = "invokeSuspend")
public final class C2444209hw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2444309hx LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2444209hw(C2444309hx c2444309hx, InterfaceC1364105Vn<? super C2444209hw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2444309hx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2444209hw(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListEffectsPreloadObserver@b4ff.onAccountResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2444309hx c2444309hx = this.LL;
        c2444309hx.LL = false;
        C09AE c09ae = c2444309hx.LLILLJJLI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LL.LLILLJJLI = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListEffectsPreloadObserver@b4ff.onAccountResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
