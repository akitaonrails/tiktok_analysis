package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06AR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.observer.ChatListInboxResourcePreloadObserver$1", f = "ChatListInboxResourcePreloadObserver.kt", l = {127, 128}, m = "invokeSuspend")
public final class C06AR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C06AS LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06AR(C06AS c06as, InterfaceC1364105Vn<? super C06AR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c06as;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06AR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListInboxResourcePreloadObserver@ee7b.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ChatListInboxResourcePreloadObserver@ee7b.<init>$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C06AS c06as = this.LLILLJJLI;
            this.LL = 1;
            if (c06as.init() == objLJFF) {
                C1C7U.LIZIZ("ChatListInboxResourcePreloadObserver@ee7b.<init>$1");
                return objLJFF;
            }
        }
        C06AS c06as2 = this.LLILLJJLI;
        this.LL = 2;
        if (c06as2.LIZLLL() == objLJFF) {
            C1C7U.LIZIZ("ChatListInboxResourcePreloadObserver@ee7b.<init>$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListInboxResourcePreloadObserver@ee7b.<init>$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
