package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06AT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.observer.ChatListInboxResourcePreloadObserver$3$1", f = "ChatListInboxResourcePreloadObserver.kt", l = {152}, m = "invokeSuspend")
public final class C06AT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C06AS LLILLJJLI;
    public final /* synthetic */ C885880Yp8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06AT(C06AS c06as, C885880Yp8 c885880Yp8, InterfaceC1364105Vn<? super C06AT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c06as;
        this.LLILLL = c885880Yp8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06AT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListInboxResourcePreloadObserver@ee7b.<init>$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C06AS c06as = this.LLILLJJLI;
            C885880Yp8 c885880Yp8 = this.LLILLL;
            this.LL = 1;
            if (c06as.LIZJ(c885880Yp8) == objLJFF) {
                C1C7U.LIZIZ("ChatListInboxResourcePreloadObserver@ee7b.<init>$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListInboxResourcePreloadObserver@ee7b.<init>$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
