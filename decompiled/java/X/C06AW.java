package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06AW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.observer.ChatListInboxResourcePreloadObserver$onUnreadCountUpdate$1", f = "ChatListInboxResourcePreloadObserver.kt", l = {314}, m = "invokeSuspend")
public final class C06AW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1729706pz LLILLJJLI;
    public final /* synthetic */ C1619080sEc LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06AW(C1729706pz c1729706pz, C1619080sEc c1619080sEc, InterfaceC1364105Vn<? super C06AW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1729706pz;
        this.LLILLL = c1619080sEc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06AW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListInboxResourcePreloadObserver@ee7b.onUnreadCountUpdate$1");
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
            C888600YtW c888600YtW = this.LLILLJJLI.LLILLL;
            C1619080sEc c1619080sEc = this.LLILLL;
            this.LL = 1;
            if (c888600YtW.LJFF(c1619080sEc) == objLJFF) {
                C1C7U.LIZIZ("ChatListInboxResourcePreloadObserver@ee7b.onUnreadCountUpdate$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListInboxResourcePreloadObserver@ee7b.onUnreadCountUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
