package X;

import com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05JI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage$initPollingMode$1$1", f = "ViewerWishesQueuePage.kt", l = {}, m = "invokeSuspend")
public final class C05JI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ViewerWishesQueuePage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05JI(ViewerWishesQueuePage viewerWishesQueuePage, InterfaceC1364105Vn<? super C05JI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = viewerWishesQueuePage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05JI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewerWishesQueuePage viewerWishesQueuePage;
        C2176871AHl c2176871AHl;
        C1C7U.LIZ("ViewerWishesQueuePage@a1a.initPollingMode$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.uS() && (c2176871AHl = (viewerWishesQueuePage = this.LL).LLJLLL) != null) {
            c2176871AHl.LIZ(EnumC20674115v9.POLL, new AwS581S0100000_2(viewerWishesQueuePage, 64), AFwS187S0000000_2.get$arr$(121), AFwS187S0000000_2.get$arr$(122));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ViewerWishesQueuePage@a1a.initPollingMode$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
